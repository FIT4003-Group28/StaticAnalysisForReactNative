package com.google.android.material.snackbar;

import a.g.m.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.e.a.c.k;
import com.google.android.material.internal.g;
/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    private static final View.OnTouchListener f8158g = new a();

    /* renamed from: b  reason: collision with root package name */
    private c f8159b;

    /* renamed from: c  reason: collision with root package name */
    private b f8160c;

    /* renamed from: d  reason: collision with root package name */
    private int f8161d;

    /* renamed from: e  reason: collision with root package name */
    private final float f8162e;

    /* renamed from: f  reason: collision with root package name */
    private final float f8163f;

    /* loaded from: classes.dex */
    static class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, AttributeSet attributeSet) {
        super(g.b(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
            v.a(this, obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
        }
        this.f8161d = obtainStyledAttributes.getInt(k.SnackbarLayout_animationMode, 0);
        this.f8162e = obtainStyledAttributes.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f8163f = obtainStyledAttributes.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f8158g);
        setFocusable(true);
    }

    float getActionTextColorAlpha() {
        return this.f8163f;
    }

    int getAnimationMode() {
        return this.f8161d;
    }

    float getBackgroundOverlayColorAlpha() {
        return this.f8162e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f8160c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        v.N(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f8160c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.f8159b;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    void setAnimationMode(int i) {
        this.f8161d = i;
    }

    void setOnAttachStateChangeListener(b bVar) {
        this.f8160c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f8158g);
        super.setOnClickListener(onClickListener);
    }

    void setOnLayoutChangeListener(c cVar) {
        this.f8159b = cVar;
    }
}
