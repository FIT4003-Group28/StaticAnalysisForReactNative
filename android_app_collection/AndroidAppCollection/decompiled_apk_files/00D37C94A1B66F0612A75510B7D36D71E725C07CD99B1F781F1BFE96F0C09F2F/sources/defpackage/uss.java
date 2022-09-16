package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: uss  reason: default package */
/* loaded from: classes4.dex */
final class uss extends WebChromeClient {
    final /* synthetic */ usu a;

    public uss(usu usuVar) {
        this.a = usuVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z) {
            return false;
        }
        WebView webView2 = new WebView(this.a.rb());
        webView.addView(webView2);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        webView2.setWebViewClient(new usr(this));
        return true;
    }
}
