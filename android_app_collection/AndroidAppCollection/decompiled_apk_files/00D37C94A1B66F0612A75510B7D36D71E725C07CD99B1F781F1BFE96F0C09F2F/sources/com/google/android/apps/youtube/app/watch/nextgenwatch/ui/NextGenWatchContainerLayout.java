package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NextGenWatchContainerLayout extends nzb {
    public View a;
    public View b;
    public View c;
    public nxh d;
    public final nze e;
    public final nzd f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final List k;
    private boolean l;

    public NextGenWatchContainerLayout(Context context) {
        this(context, null);
    }

    private final void f() {
        if (this.b == null) {
            return;
        }
        Rect a = this.f.a();
        this.b.measure(View.MeasureSpec.makeMeasureSpec(a.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.height(), 1073741824));
    }

    private static final void g(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view != null) {
            if (!z && view.getVisibility() == 8) {
                return;
            }
            view.layout(i, i2, i3, i4);
        }
    }

    public final void c() {
        boolean b = this.f.b();
        boolean g = this.d.g();
        jfw.l();
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            zag.o((View) this.k.get(i), b);
        }
        zag.o(this.a, g);
        View view = this.b;
        if (view != null) {
            zag.o(view, g);
        }
        zag.o(this.c, g);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (!this.l) {
            bringChildToFront(this.a);
            View view = this.b;
            if (view != null) {
                bringChildToFront(view);
            }
            bringChildToFront(this.c);
            this.l = true;
        }
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        boolean z2 = false;
        if (this.f.b()) {
            int size = this.k.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = (View) this.k.get(i8);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.topMargin + i2;
                    i6 = marginLayoutParams.leftMargin + i;
                } else {
                    i6 = i;
                    i7 = i2;
                }
                g(view, z, i6, i7, i6 + view.getMeasuredWidth(), i7 + view.getMeasuredHeight());
            }
        }
        if (this.d.g() || this.e.b()) {
            z2 = true;
        }
        if (z2) {
            View view2 = this.a;
            g(view2, z, i, i2, i + view2.getMeasuredWidth(), i2 + this.a.getMeasuredHeight());
        }
        if (!this.e.b()) {
            if (z2) {
                oai oaiVar = this.f.a;
                f = oaiVar != null ? ((nzy) oaiVar).c().p() : 0.0f;
            } else {
                f = 1.0f;
            }
            this.a.setAlpha(f);
            if (z2) {
                oai oaiVar2 = this.f.a;
                i5 = ((Integer) (oaiVar2 != null ? ((nzy) oaiVar2).c().I() : amon.a).e(Integer.valueOf(this.j))).intValue();
            } else {
                i5 = this.j;
            }
            this.a.setBackgroundColor(i5);
        }
        if (this.d.g()) {
            View view3 = this.c;
            g(view3, z, i, i2, i + view3.getMeasuredWidth(), i2 + this.c.getMeasuredHeight());
        }
        if (this.b == null || !this.d.g()) {
            return;
        }
        Rect a = this.f.a();
        if (this.b.getMeasuredWidth() != a.width() || this.b.getMeasuredHeight() != a.height()) {
            f();
        }
        g(this.b, z, a.left, a.top, a.left + this.b.getMeasuredWidth(), a.top + this.b.getMeasuredHeight());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        jfw.l();
        c();
        int size = this.k.size();
        for (int i3 = 0; i3 < size; i3++) {
            measureChildWithMargins((View) this.k.get(i3), i, 0, i2, 0);
        }
        if (this.d.g()) {
            measureChild(this.a, i, i2);
            measureChild(this.c, i, i2);
            f();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        nze nzeVar = this.e;
        Animator animator = nzeVar.b;
        if (animator == null) {
            return;
        }
        animator.cancel();
        nzeVar.a();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        jfw.k();
        super.onViewAdded(view);
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.g == id) {
            this.a = view;
        } else if (this.h == id) {
            this.b = view;
        } else if (this.i == id) {
            this.c = view;
        } else if (!this.k.contains(view)) {
            this.k.add(view);
        }
        this.l = false;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        jfw.k();
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        int id = view.getId();
        if (this.g != id) {
            if (this.h != id) {
                if (this.i == id) {
                    throw new IllegalStateException("Watch layout must not be removed.");
                }
                if (!this.k.contains(view)) {
                    return;
                }
                this.k.remove(view);
                return;
            }
            throw new IllegalStateException("Player view must not be removed.");
        }
        throw new IllegalStateException("Scrim view must not be removed.");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NextGenWatchContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oae.a);
        boolean z = true;
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.g = resourceId;
        this.h = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
        this.i = resourceId2;
        obtainStyledAttributes.recycle();
        aqxo.y(resourceId != 0);
        aqxo.y(resourceId2 == 0 ? false : z);
        nze nzeVar = new nze(this);
        this.e = nzeVar;
        nxh nxhVar = this.d;
        nxhVar.getClass();
        this.f = new nzd(nxhVar, nzeVar);
        this.j = ake.d(context, R.color.watch_layout_scrim_color);
    }
}
