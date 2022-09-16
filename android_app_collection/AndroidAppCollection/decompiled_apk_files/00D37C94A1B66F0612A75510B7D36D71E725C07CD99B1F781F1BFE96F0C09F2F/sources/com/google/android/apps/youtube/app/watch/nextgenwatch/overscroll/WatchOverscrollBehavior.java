package com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchOverscrollBehavior extends ajc {
    private final nml a;
    private final FlexyBehavior b;
    private boolean c;
    private boolean d;

    public WatchOverscrollBehavior(nml nmlVar, FlexyBehavior flexyBehavior) {
        this.a = nmlVar;
        this.b = flexyBehavior;
    }

    private final boolean t() {
        return this.c && !this.a.h().p && this.a.h().o != nsr.FULL_BLEED;
    }

    @Override // defpackage.ajc
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (this.d) {
            this.a.h().b.c(coordinatorLayout, view, view2, i - iArr[0], i2 - iArr[1], iArr, i3);
        }
        if (t()) {
            this.b.c(coordinatorLayout, view, view2, i - iArr[0], i2 - iArr[1], iArr, i3);
        }
    }

    @Override // defpackage.ajc
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (t()) {
            this.b.d(coordinatorLayout, view, view2, i, i2, i3 - iArr[0], i4 - iArr[1], i5, iArr);
        }
        if (this.d) {
            this.a.h().b.d(coordinatorLayout, view, view2, i, i2, i3 - iArr[0], i4 - iArr[1], i5, iArr);
        }
    }

    @Override // defpackage.ajc
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.c) {
            this.b.e(coordinatorLayout, view, view2, i);
            this.c = false;
        }
        if (this.d) {
            this.a.h().b.y();
            this.d = false;
        }
    }

    @Override // defpackage.ajc
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (!t() || !this.b.i(coordinatorLayout, view, view2, f, f2, z)) {
            return this.d && this.a.h().b.i(coordinatorLayout, view, view2, f, f2, z);
        }
        return true;
    }

    @Override // defpackage.ajc
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        if (t()) {
            this.b.j(coordinatorLayout, view, view2, f, f2);
            return false;
        }
        return false;
    }

    @Override // defpackage.ajc
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.c = this.b.l(coordinatorLayout, view, view2, view3, i, i2);
        boolean l = this.a.h().b.l(coordinatorLayout, view, view2, view3, i, i2);
        this.d = l;
        return this.c || l;
    }
}
