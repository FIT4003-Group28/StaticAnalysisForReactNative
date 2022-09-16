package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: hsj  reason: default package */
/* loaded from: classes3.dex */
final class hsj extends WebChromeClient {
    final /* synthetic */ hsl a;

    public hsj(hsl hslVar) {
        this.a = hslVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        this.a.b = bitmap;
    }
}
