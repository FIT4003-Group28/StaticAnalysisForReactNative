package com.google.android.apps.gmm.shared.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* loaded from: classes.dex */
public class DarkModeAwareWebView extends WebView {
    static final AtomicBoolean c = new AtomicBoolean(true);
    public gcm d;

    public DarkModeAwareWebView(Context context) {
        super(context);
        ((bvtj) bttc.a(bvtj.class, this)).xA(this);
        a(this.d);
    }

    private static void a(gcm gcmVar) {
        if (c.compareAndSet(true, false)) {
            gcmVar.a();
        }
    }

    public DarkModeAwareWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((bvtj) bttc.a(bvtj.class, this)).xA(this);
        a(this.d);
    }

    public DarkModeAwareWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((bvtj) bttc.a(bvtj.class, this)).xA(this);
        a(this.d);
    }
}
