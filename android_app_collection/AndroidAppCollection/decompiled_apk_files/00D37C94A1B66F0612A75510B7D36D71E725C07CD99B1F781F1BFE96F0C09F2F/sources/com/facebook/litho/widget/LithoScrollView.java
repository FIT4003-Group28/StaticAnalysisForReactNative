package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LithoScrollView extends NestedScrollView implements dbc {
    public final dci d;
    public dmm e;
    public ViewTreeObserver.OnPreDrawListener f;
    public boolean g;
    public djb h;
    private dah i;

    public LithoScrollView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dbc
    public final void a(List list) {
        list.add(this.d);
    }

    @Override // defpackage.dba
    public final dah b() {
        return this.i;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return super.dispatchNestedFling(f, f2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dah dahVar = this.i;
        if (dahVar != null) {
            dahVar.a(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        djb djbVar = this.h;
        if (djbVar != null) {
            djbVar.a(this);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView
    public final void i(int i) {
        super.i(i);
        djb djbVar = this.h;
        if (djbVar != null) {
            djbVar.d();
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.g) {
            this.d.A();
        }
        dmm dmmVar = this.e;
        if (dmmVar != null) {
            dmmVar.a = getScrollY();
        }
        djb djbVar = this.h;
        if (djbVar != null) {
            djbVar.b(this);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        djb djbVar = this.h;
        if (djbVar != null) {
            djbVar.c(this, motionEvent);
        }
        return onTouchEvent;
    }

    @Override // defpackage.dba
    public final void r(dah dahVar) {
        this.i = dahVar;
    }

    public LithoScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LithoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        dci dciVar = new dci(context);
        this.d = dciVar;
        addView(dciVar);
    }
}
