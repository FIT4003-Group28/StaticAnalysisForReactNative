package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Date;
/* compiled from: PG */
/* renamed from: cvch  reason: default package */
/* loaded from: classes5.dex */
public class cvch extends WebViewClient {
    private long a = 0;
    private final dbsg<cuvx> b;

    public cvch(dbsg<cuvx> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.b.a()) {
            this.b.b().e(true, new Date().getTime() - this.a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a = new Date().getTime();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.b.a()) {
            this.b.b().e(false, 0L);
        }
    }
}
