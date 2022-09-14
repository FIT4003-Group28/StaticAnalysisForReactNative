package com.google.android.material.appbar;

import a.g.m.d0;
import a.g.m.v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b extends c<View> {

    /* renamed from: d  reason: collision with root package name */
    final Rect f7873d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f7874e;

    /* renamed from: f  reason: collision with root package name */
    private int f7875f;

    /* renamed from: g  reason: collision with root package name */
    private int f7876g;

    public b() {
        this.f7873d = new Rect();
        this.f7874e = new Rect();
        this.f7875f = 0;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7873d = new Rect();
        this.f7874e = new Rect();
        this.f7875f = 0;
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(View view) {
        if (this.f7876g == 0) {
            return 0;
        }
        float b2 = b(view);
        int i = this.f7876g;
        return a.g.h.a.a((int) (b2 * i), 0, i);
    }

    /* renamed from: a */
    abstract View mo264a(List<View> list);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View mo264a;
        d0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (mo264a = mo264a(coordinatorLayout.b(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (v.m(mo264a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.g() + lastWindowInsets.d();
            }
            int c2 = size + c(mo264a);
            int measuredHeight = mo264a.getMeasuredHeight();
            if (e()) {
                view.setTranslationY(-measuredHeight);
            } else {
                c2 -= measuredHeight;
            }
            coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c2, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
            return true;
        }
        return false;
    }

    abstract float b(View view);

    public final void b(int i) {
        this.f7876g = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.c
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View mo264a = mo264a(coordinatorLayout.b(view));
        if (mo264a != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f7873d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, mo264a.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + mo264a.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && v.m(coordinatorLayout) && !v.m(view)) {
                rect.left += lastWindowInsets.e();
                rect.right -= lastWindowInsets.f();
            }
            Rect rect2 = this.f7874e;
            a.g.m.d.a(c(fVar.f1463c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = a(mo264a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            i2 = rect2.top - mo264a.getBottom();
        } else {
            super.b(coordinatorLayout, (CoordinatorLayout) view, i);
            i2 = 0;
        }
        this.f7875f = i2;
    }

    public final int c() {
        return this.f7876g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        return this.f7875f;
    }

    protected boolean e() {
        return false;
    }
}
