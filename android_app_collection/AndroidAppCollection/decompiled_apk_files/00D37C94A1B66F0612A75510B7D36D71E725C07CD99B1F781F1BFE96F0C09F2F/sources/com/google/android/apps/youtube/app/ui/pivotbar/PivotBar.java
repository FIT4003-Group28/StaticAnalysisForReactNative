package com.google.android.apps.youtube.app.ui.pivotbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PivotBar extends yyd {
    public Resources a;
    public yzh b;
    public boolean c;
    public int d;
    jz e;
    GestureDetector.OnGestureListener f;
    public mer g;
    private final List m;
    private int n;

    public PivotBar(Context context) {
        super(context);
        this.m = new ArrayList();
        o(context);
    }

    private final void o(Context context) {
        setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.b = new yzh(context);
        this.a = context.getResources();
        h(2132083275);
        setFillViewport(!zew.y(context));
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f = new mdw(this);
        jz jzVar = new jz(context, this.f);
        this.e = jzVar;
        jzVar.a.a.setIsLongpressEnabled(false);
    }

    public final ColorStateList a(int i, int i2) {
        return this.b.a(i, i2, i, i2, i2, i);
    }

    public final View b(Drawable drawable, CharSequence charSequence, boolean z, int i, Map map, atxl atxlVar, Optional optional) {
        return c(new mee(this, R.layout.image_with_text_tab, this.h, drawable, charSequence, map, optional), z, i, atxlVar);
    }

    public final View c(mee meeVar, boolean z, int i, atxl atxlVar) {
        meeVar.b(z, i);
        boolean z2 = false;
        TypedArray obtainStyledAttributes = meeVar.d.getContext().obtainStyledAttributes(null, met.a, 0, this.n);
        meeVar.c(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        this.m.add(meeVar);
        View view = meeVar.a;
        if (atxlVar != atxl.PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB) {
            z2 = true;
        }
        n(view, z2);
        return view;
    }

    final mee d(int i) {
        View view = null;
        mee meeVar = (i < 0 || i >= this.m.size()) ? null : (mee) this.m.get(i);
        if (meeVar != null) {
            view = meeVar.a;
        }
        if (view == k(i)) {
            return meeVar;
        }
        throw new IllegalStateException("Internal pivot bar tab state does not match view hierarchy");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (zdg.e(getContext()) || !this.c) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.e.a(motionEvent);
        return true;
    }

    public final void f(MotionEvent motionEvent) {
        View view;
        mer merVar = this.g;
        if (merVar != null) {
            int height = getHeight();
            gbd e = merVar.a.e();
            if (e == null || (view = e.O) == null || view.getParent() == null) {
                return;
            }
            ViewParent parent = e.O.getParent();
            if (!(parent instanceof View)) {
                return;
            }
            View view2 = (View) parent;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = new Point();
            point.set((int) motionEvent.getRawX(), ((int) motionEvent.getRawY()) - height);
            ezv.n(point, view2);
            obtain.setLocation(point.x, point.y);
            view2.dispatchTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void g(int i, boolean z, int i2) {
        mee d = d(i);
        if (d != null) {
            d.b(z, i2);
        }
    }

    @Override // defpackage.yyd, android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams mo160generateDefaultLayoutParams() {
        return mo160generateDefaultLayoutParams();
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, met.a, 0, i);
        if (obtainStyledAttributes != null) {
            if (obtainStyledAttributes.hasValue(5)) {
                Drawable drawable = obtainStyledAttributes.getDrawable(5);
                if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(6)) {
                    frf frfVar = new frf(drawable, obtainStyledAttributes.getColor(6, 0), obtainStyledAttributes.getDimensionPixelSize(0, 0));
                    frfVar.c(48);
                    drawable = frfVar;
                }
                setBackground(drawable);
            }
            for (mee meeVar : this.m) {
                meeVar.c(obtainStyledAttributes);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.yyd
    protected final void i(int i, boolean z) {
        mee d = d(i);
        if (d != null) {
            View view = d.a;
            view.setSelected(z);
            view.setActivated(z);
            d.b(false, 0);
            if (!d.b.isPresent()) {
                return;
            }
            if (z) {
                ((mdx) d.b.get()).d();
            } else {
                ((mdx) d.b.get()).e();
            }
        }
    }

    @Override // defpackage.yyd
    public final void lb() {
        for (mee meeVar : this.m) {
            meeVar.c.qr();
        }
        this.m.clear();
        super.lb();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        setFillViewport(!zew.y(getContext()));
    }

    @Override // defpackage.yyd, android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final FrameLayout.LayoutParams mo160generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -1, 17);
    }

    public PivotBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = new ArrayList();
        o(context);
    }

    public PivotBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new ArrayList();
        o(context);
    }
}
