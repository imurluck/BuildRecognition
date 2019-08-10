package com.example.buildingrecognition

import android.Manifest
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupAlbumTv()
    }

    private fun setupAlbumTv() {
        albumTv.setOnClickListener {
            PermissionFragment().apply {
                requestPermissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE)
                permissionCallback = { grantedPermissions, _ ->
                    if (grantedPermissions?.contains(Manifest.permission.READ_EXTERNAL_STORAGE)!!) {
                        getPhotoFromAlbum()
                    }
                }
                request(supportFragmentManager)
            }
        }
    }

    private fun getPhotoFromAlbum() {
        AlbumFragment().apply {
            onPhotoPickResult = {
                Log.e(TAG, "getPhotoFromAlbum -> $it")
            }
        }.startChoose(supportFragmentManager)
    }


    companion object {

        private const val TAG = "MainActivity"
    }

}
