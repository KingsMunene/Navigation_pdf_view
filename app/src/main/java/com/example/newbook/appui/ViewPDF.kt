package com.example.newbook.appui

import android.view.View
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.newbook.R
import com.github.barteksc.pdfviewer.PDFView


@Composable
fun PdfViewer() {
    AndroidView(
        factory = {
            View.inflate(it, R.layout.main_layout, null)
        },
        modifier = Modifier.fillMaxSize(),
        update = {
            val pdfViewer = it.findViewById<PDFView>(R.id.pdfviewer)
            pdfViewer.fromAsset("C++.pdf").enableSwipe(true).load()
        }

    )
}

@Preview(showBackground = true)
@Composable
fun pdfPrev() {
    PdfViewer()
}