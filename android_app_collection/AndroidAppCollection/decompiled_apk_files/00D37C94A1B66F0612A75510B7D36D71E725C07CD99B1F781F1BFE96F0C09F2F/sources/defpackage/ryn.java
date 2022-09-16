package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: ryn  reason: default package */
/* loaded from: classes4.dex */
final class ryn extends WebViewClient {
    final /* synthetic */ ryo a;

    public ryn(ryo ryoVar) {
        this.a = ryoVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.d(str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String uri = webResourceRequest.getUrl().toString();
        if (!ryo.c.matcher(uri).matches()) {
            this.a.n(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.a.d(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null || ryo.c.matcher(str).matches()) {
            return null;
        }
        amzs it = ryo.b.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return null;
            }
        }
        return new WebResourceResponse("text/plain", "UTF-8", null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        amzs it = ryo.a.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return false;
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.a.am(intent);
        return true;
    }
}
