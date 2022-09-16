package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainRtlAwareViewPager extends lol {
    public ayom i;

    public MainRtlAwareViewPager(Context context) {
        super(context);
    }

    @Override // defpackage.zba, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && canScrollHorizontally(-1)) {
            this.i.c(new nfj());
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public MainRtlAwareViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
