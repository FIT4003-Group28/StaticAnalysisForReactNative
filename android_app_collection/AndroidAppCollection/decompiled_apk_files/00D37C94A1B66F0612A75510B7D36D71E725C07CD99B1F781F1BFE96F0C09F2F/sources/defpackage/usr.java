package defpackage;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: usr  reason: default package */
/* loaded from: classes4.dex */
final class usr extends WebViewClient {
    final /* synthetic */ uss a;

    public usr(uss ussVar) {
        this.a = ussVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.a.a.am(new Intent("android.intent.action.VIEW").setData(webResourceRequest.getUrl()));
        return true;
    }
}
