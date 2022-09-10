package defpackage;

import android.webkit.JavascriptInterface;
import com.google.android.libraries.messaging.lighter.ui.lighterwebview.LighterWebView;
/* compiled from: PG */
/* renamed from: cvca  reason: default package */
/* loaded from: classes5.dex */
public final class cvca {
    private final LighterWebView a;
    private final Runnable b;

    public cvca(LighterWebView lighterWebView, Runnable runnable) {
        this.a = lighterWebView;
        this.b = runnable;
    }

    @JavascriptInterface
    public void dismissWebView(String str) {
        this.a.post(this.b);
    }
}
