package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: yga  reason: default package */
/* loaded from: classes4.dex */
public final class yga extends WebViewClient {
    public final List a = new ArrayList();

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        for (ygc ygcVar : this.a) {
            if (!ygcVar.a) {
                ygcVar.b.a();
            }
            if (str.equals(ygcVar.c)) {
                ygcVar.d.c("stcw_ld");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        for (ygc ygcVar : this.a) {
            if (!ygcVar.a) {
                ygcVar.b.c();
            }
            if (str.equals(ygcVar.c)) {
                ygcVar.d.c("stcw_as");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        for (ygc ygcVar : this.a) {
            if (webView.getUrl().equals(ygcVar.c)) {
                ygcVar.d.c("stcw_e");
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
