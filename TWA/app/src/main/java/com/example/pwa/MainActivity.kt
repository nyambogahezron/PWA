
package com.example.pwa

import androidx.appcompat.app.AppCompatActivity;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import android.net.Uri
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TwaLauncher(this).launchUri(Uri.parse("https://pwa-mocha.vercel.app"))
    }
}