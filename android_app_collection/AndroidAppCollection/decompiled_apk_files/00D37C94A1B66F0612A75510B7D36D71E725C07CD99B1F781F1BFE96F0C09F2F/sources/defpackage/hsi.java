package defpackage;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: hsi  reason: default package */
/* loaded from: classes3.dex */
final class hsi extends WebViewClient {
    final /* synthetic */ hsl a;

    public hsi(hsl hslVar) {
        this.a = hslVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.a = webView.getTitle();
    }
}
