package defpackage;

import android.webkit.WebView;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
/* compiled from: PG */
/* renamed from: cvcg  reason: default package */
/* loaded from: classes5.dex */
public final class cvcg extends cvch {
    final /* synthetic */ LighterWebView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvcg(LighterWebView lighterWebView, dbsg dbsgVar) {
        super(dbsgVar);
        this.a = lighterWebView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.a.e(webView, str).booleanValue();
    }
}
