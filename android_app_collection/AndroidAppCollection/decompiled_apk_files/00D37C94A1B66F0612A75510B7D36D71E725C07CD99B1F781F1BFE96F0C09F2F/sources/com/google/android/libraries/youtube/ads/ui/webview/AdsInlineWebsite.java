package com.google.android.libraries.youtube.ads.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdsInlineWebsite extends WebView {
    public xjr a;

    public AdsInlineWebsite(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWebViewClient(new xjq(this));
        getSettings().setJavaScriptEnabled(true);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        xjr xjrVar = this.a;
        if (xjrVar != null && motionEvent.getActionMasked() == 0) {
            ncy ncyVar = (ncy) xjrVar;
            ncyVar.e.a.H(3, ncyVar.g, null);
        }
        if (parent != null) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
