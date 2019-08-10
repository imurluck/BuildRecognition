package com.example.buildingrecognition.main

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.buildingrecognition.AlbumFragment
import com.example.buildingrecognition.BaseActivity
import com.example.buildingrecognition.PermissionFragment
import com.example.buildingrecognition.R
import com.example.buildingrecognition.recognition.RecognitionActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blurringView.setBlurredView(bgImg)

        setupAlbumTv()

        setupRecognitionTv()
    }

    private fun setupRecognitionTv() {
        recognitionTv.setOnClickListener {
            PermissionFragment().apply {
                requestPermissions = arrayOf(Manifest.permission.CAMERA)
                permissionCallback = { grantedPermissions, _ ->
                    if (grantedPermissions?.contains(Manifest.permission.CAMERA)!!) {
                        startActivity(Intent(this@MainActivity, RecognitionActivity::class.java))
                    }
                }
            }.request(supportFragmentManager)
        }
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
            }.request(supportFragmentManager)

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
