package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexyBehavior extends ajc {
    public boolean a = true;
    public boolean b = false;
    private final int c;
    private final nun d;
    private final nuk e;
    private final nuh f;

    public FlexyBehavior(Context context, nun nunVar, nuk nukVar) {
        this.d = nunVar;
        this.e = nukVar;
        this.f = new nuh(this, nunVar);
        this.c = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    private final int t() {
        return this.e.a();
    }

    private final int u() {
        return this.e.b();
    }

    private final int v() {
        return this.e.c();
    }

    private final RecyclerView w(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof kh) || !(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return null;
        }
        return w(viewGroup.getChildAt(0));
    }

    private final void x(boolean z) {
        boolean z2 = this.b;
        boolean z3 = true;
        if (!z && !y()) {
            z3 = false;
        }
        this.b = z2 | z3;
    }

    private final boolean y() {
        return v() < t();
    }

    private final boolean z() {
        return v() > u();
    }

    @Override // defpackage.ajc
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean z = i2 > 0;
        if (z && z()) {
            int min = Math.min(Math.max(0, v() - u()), i2);
            iArr[1] = min;
            this.e.d(v() - min);
            if (coordinatorLayout.getParent() != null) {
                coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        x(z);
    }

    @Override // defpackage.ajc
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 >= 0 || !y()) {
            return;
        }
        this.e.d(v() + Math.min(Math.max(0, t() - v()), Math.abs(i4)));
        if (coordinatorLayout.getParent() != null) {
            coordinatorLayout.getParent().requestDisallowInterceptTouchEvent(true);
        }
        iArr[1] = iArr[1] + i4;
    }

    @Override // defpackage.ajc
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        this.a = true;
    }

    @Override // defpackage.ajc
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (Math.abs(f2) >= this.c && f2 > 0.0f && z()) {
            this.d.g(1, true);
            return true;
        }
        return false;
    }

    @Override // defpackage.ajc
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        x(f2 < 0.0f);
        return false;
    }

    @Override // defpackage.ajc
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        RecyclerView w = w(view3);
        if (w != null) {
            xw xwVar = w.n;
            if (xwVar instanceof OverScrollLinearLayoutManager) {
                nuh nuhVar = this.f;
                Set set = ((OverScrollLinearLayoutManager) xwVar).a;
                nuhVar.getClass();
                set.add(nuhVar);
            }
        }
        this.a = false;
        return !this.e.e() && (i & 2) == 2;
    }
}
