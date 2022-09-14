package com.baidu.mapapi.map;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private int f1674a;

    /* renamed from: b  reason: collision with root package name */
    private int f1675b;

    /* renamed from: c  reason: collision with root package name */
    private int f1676c;

    /* renamed from: d  reason: collision with root package name */
    private long f1677d;
    private View e;
    private DismissCallbacks f;
    private int g = 1;
    private float h;
    private float i;
    private boolean j;
    private int k;
    private Object l;
    private VelocityTracker m;
    private float n;
    private boolean o;
    private boolean p;

    /* loaded from: classes.dex */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);

        void onNotify();
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f1674a = viewConfiguration.getScaledTouchSlop();
        this.f1675b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1676c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1677d = view.getContext().getResources().getInteger(17694720);
        this.e = view;
        this.e.getContext();
        this.l = obj;
        this.f = dismissCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    public void a() {
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        int height = this.e.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.f1677d);
        duration.addListener(new n(this, layoutParams, height));
        duration.addUpdateListener(new o(this, layoutParams));
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (r8.m.getXVelocity() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0183, code lost:
        if (r8.j != false) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.TargetApi(12)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.SwipeDismissTouchListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
