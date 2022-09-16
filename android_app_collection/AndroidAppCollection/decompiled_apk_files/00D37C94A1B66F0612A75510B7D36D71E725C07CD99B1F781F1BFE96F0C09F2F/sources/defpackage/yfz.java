package defpackage;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: yfz  reason: default package */
/* loaded from: classes4.dex */
public final class yfz extends WebChromeClient {
    protected nx a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        if (z2 || z) {
            nw nwVar = new nw(webView.getContext());
            yfw yfwVar = new yfw(webView.getContext());
            yfwVar.getSettings().setJavaScriptEnabled(true);
            yfwVar.setWebChromeClient(new yfx(this));
            yfwVar.setWebViewClient(new yfy(this));
            nwVar.p(yfwVar);
            ((WebView.WebViewTransport) message.obj).setWebView(yfwVar);
            message.sendToTarget();
            this.a = nwVar.b();
            return true;
        }
        return false;
    }
}
