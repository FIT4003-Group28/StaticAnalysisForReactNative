package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: yfy  reason: default package */
/* loaded from: classes4.dex */
final class yfy extends WebViewClient {
    final /* synthetic */ yfz a;

    public yfy(yfz yfzVar) {
        this.a = yfzVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        nx nxVar;
        super.onPageFinished(webView, str);
        if (!str.equals("about:blank") && (nxVar = this.a.a) != null && !nxVar.isShowing()) {
            this.a.a.show();
        }
    }
}
