package defpackage;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: cxnf  reason: default package */
/* loaded from: classes5.dex */
public class cxnf extends WebViewClient {
    private final cxnh a;
    private final cxnh b;
    private boolean c = false;

    static {
        dcrc.b("SaferWebViewClient");
    }

    public cxnf(cxnh cxnhVar, cxnh cxnhVar2) {
        dbsk.s(cxnhVar);
        this.a = cxnhVar;
        dbsk.s(cxnhVar2);
        this.b = cxnhVar2;
    }

    private static WebResourceResponse c(boolean z) {
        if (z) {
            return null;
        }
        return new WebResourceResponse("text/plain", "UTF-8", 403, "Resource not allowlisted", null, null);
    }

    private static boolean d(WebView webView, boolean z, boolean z2) {
        if (z2) {
            return true;
        }
        if (z) {
            return false;
        }
        webView.loadUrl("about:invalid#zSaferWebViewz");
        return true;
    }

    private final boolean e(Uri uri) {
        boolean z = true;
        if (!cxng.a.matcher(uri.toString()).find() && !this.b.b(uri)) {
            z = false;
        }
        if (!z) {
            cxng.b(uri);
        }
        return z;
    }

    @Deprecated
    public boolean a(String str) {
        return false;
    }

    public final void b(cxnd cxndVar) {
        dbsk.s(cxndVar);
        this.c = true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z = true;
        if (!this.c && !e(webResourceRequest.getUrl())) {
            z = false;
        }
        return c(z);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean a;
        boolean b = this.a.b(webResourceRequest.getUrl());
        if (b) {
            webResourceRequest.getUrl().toString();
            a = false;
        } else {
            a = a(webResourceRequest.getUrl().toString());
        }
        return d(webView, b, a);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        boolean z = true;
        if (!this.c && !e(Uri.parse(str))) {
            z = false;
        }
        return c(z);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean b = this.a.b(Uri.parse(str));
        return d(webView, b, b ? false : a(str));
    }
}
