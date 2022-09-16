package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: yfx  reason: default package */
/* loaded from: classes4.dex */
final class yfx extends WebChromeClient {
    final /* synthetic */ yfz a;

    public yfx(yfz yfzVar) {
        this.a = yfzVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        super.onCloseWindow(webView);
        nx nxVar = this.a.a;
        if (nxVar != null) {
            nxVar.dismiss();
        }
    }
}
