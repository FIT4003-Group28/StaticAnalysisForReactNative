package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: gib  reason: default package */
/* loaded from: classes3.dex */
final class gib extends WebViewClient {
    private final gig a;
    private final FrameLayout b;
    private final WebView c;

    public gib(gig gigVar, FrameLayout frameLayout, WebView webView) {
        this.a = gigVar;
        this.b = frameLayout;
        this.c = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.c(webView, str);
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }
}
