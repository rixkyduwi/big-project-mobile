package com.garbage.ckassification

import android.view.KeyEvent
import android.webkit.WebView
class coba {
    fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Ketika disentuh tombol back pada Android
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            // method goback() ini berguna untuk kembali ke halaman sebelumnya
            return true
        }

        // Jika tidak ada halaman yang pernah dibuka
        // Maka akan keluar dari activity (tutup aplikasi)
        return onKeyDown(keyCode, event)
    }
}