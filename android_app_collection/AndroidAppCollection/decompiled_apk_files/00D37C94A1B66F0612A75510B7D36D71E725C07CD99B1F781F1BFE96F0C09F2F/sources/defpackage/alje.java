package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: alje  reason: default package */
/* loaded from: classes.dex */
public final class alje extends amj {
    final /* synthetic */ BottomSheetBehavior a;

    public alje(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.amj
    public final int b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.q ? bottomSheetBehavior.w : bottomSheetBehavior.o;
    }

    @Override // defpackage.amj
    public final void d(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (!bottomSheetBehavior.s) {
                return;
            }
            bottomSheetBehavior.F(1);
        }
    }

    @Override // defpackage.amj
    public final void e(View view, float f, float f2) {
        BottomSheetBehavior bottomSheetBehavior;
        int i;
        int i2 = 4;
        if (f2 < 0.0f) {
            BottomSheetBehavior bottomSheetBehavior2 = this.a;
            if (bottomSheetBehavior2.a) {
                i = bottomSheetBehavior2.l;
            } else {
                int top = view.getTop();
                System.currentTimeMillis();
                BottomSheetBehavior bottomSheetBehavior3 = this.a;
                int i3 = bottomSheetBehavior3.m;
                if (top > i3) {
                    i = i3;
                    i2 = 6;
                } else {
                    i = bottomSheetBehavior3.t();
                }
            }
            i2 = 3;
        } else {
            BottomSheetBehavior bottomSheetBehavior4 = this.a;
            if (!bottomSheetBehavior4.q || !bottomSheetBehavior4.I(view, f2)) {
                if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior5 = this.a;
                    if (!bottomSheetBehavior5.a) {
                        int i4 = bottomSheetBehavior5.m;
                        if (top2 < i4) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior5.o)) {
                                i = this.a.t();
                            } else {
                                i = this.a.m;
                            }
                        } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.a.o)) {
                            i = this.a.m;
                        } else {
                            bottomSheetBehavior = this.a;
                            i = bottomSheetBehavior.o;
                        }
                        i2 = 6;
                    } else if (Math.abs(top2 - bottomSheetBehavior5.l) < Math.abs(top2 - this.a.o)) {
                        i = this.a.l;
                    } else {
                        i = this.a.o;
                    }
                    i2 = 3;
                } else {
                    bottomSheetBehavior = this.a;
                    if (!bottomSheetBehavior.a) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - this.a.m) < Math.abs(top3 - this.a.o)) {
                            i = this.a.m;
                            i2 = 6;
                        } else {
                            i = this.a.o;
                        }
                    }
                    i = bottomSheetBehavior.o;
                }
            } else {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                    int top4 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior6 = this.a;
                    if (top4 <= (bottomSheetBehavior6.w + bottomSheetBehavior6.t()) / 2) {
                        BottomSheetBehavior bottomSheetBehavior7 = this.a;
                        if (bottomSheetBehavior7.a) {
                            i = bottomSheetBehavior7.l;
                        } else if (Math.abs(view.getTop() - this.a.t()) < Math.abs(view.getTop() - this.a.m)) {
                            i = this.a.t();
                        } else {
                            i = this.a.m;
                            i2 = 6;
                        }
                        i2 = 3;
                    }
                }
                i = this.a.w;
                i2 = 5;
            }
        }
        this.a.H(view, i2, i, true);
    }

    @Override // defpackage.amj
    public final boolean f(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.t;
        if (i2 != 1 && !bottomSheetBehavior.B) {
            if (i2 == 3 && bottomSheetBehavior.A == i) {
                WeakReference weakReference = bottomSheetBehavior.y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference weakReference2 = this.a.x;
            return weakReference2 != null && weakReference2.get() == view;
        }
        return false;
    }

    @Override // defpackage.amj
    public final int g(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.amj
    public final int h(View view, int i) {
        int t = this.a.t();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return akf.c(i, t, bottomSheetBehavior.q ? bottomSheetBehavior.w : bottomSheetBehavior.o);
    }

    @Override // defpackage.amj
    public final void i(View view, int i, int i2, int i3) {
        this.a.x(i2);
    }
}
