package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: aplo  reason: default package */
/* loaded from: classes2.dex */
final class aplo extends cxnf {
    private final apmc a;

    public aplo(cxnh cxnhVar, apmc apmcVar) {
        super(cxnhVar, cxnhVar);
        b(cxnd.a);
        this.a = apmcVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webResourceError.getErrorCode();
        webResourceError.getDescription().toString();
        webResourceRequest.getUrl().toString();
        if (webResourceRequest.isForMainFrame()) {
            this.a.a(webResourceError.getErrorCode());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webResourceRequest.getUrl();
        if (webResourceRequest.isForMainFrame()) {
            this.a.a(webResourceResponse.getStatusCode());
        }
    }
}
