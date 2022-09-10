package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: anj  reason: default package */
/* loaded from: classes.dex */
final class anj extends amx {
    public final int a;
    public amy b;
    final /* synthetic */ ank c;
    private final Runnable d = new ani(this);

    public anj(ank ankVar, int i) {
        this.c = ankVar;
        this.a = i;
    }

    @Override // defpackage.amx
    public final void a(int i) {
        View rootView;
        ank ankVar = this.c;
        View view = this.b.k;
        int i2 = ankVar.b.a;
        int i3 = ankVar.c.a;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (i2 != 2 && i3 != 2) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((anf) view.getLayoutParams()).b;
            if (f == 0.0f) {
                anf anfVar = (anf) view.getLayoutParams();
                if ((anfVar.d & 1) == 1) {
                    anfVar.d = 0;
                    List<ane> list = ankVar.f;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ankVar.f.get(size).b(view);
                        }
                    }
                    ankVar.b(view, false);
                    ankVar.c(view);
                    if (ankVar.hasWindowFocus() && (rootView = ankVar.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                anf anfVar2 = (anf) view.getLayoutParams();
                if ((anfVar2.d & 1) == 0) {
                    anfVar2.d = 1;
                    List<ane> list2 = ankVar.f;
                    if (list2 != null) {
                        int size2 = list2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            ankVar.f.get(size2).a(view);
                        }
                    }
                    ankVar.b(view, true);
                    ankVar.c(view);
                    if (ankVar.hasWindowFocus()) {
                        ankVar.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != ankVar.d) {
            ankVar.d = i4;
            List<ane> list3 = ankVar.f;
            if (list3 == null) {
                return;
            }
            int size3 = list3.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                ankVar.f.get(size3).c(i4);
            }
        }
    }

    @Override // defpackage.amx
    public final void b(View view, int i) {
        ((anf) view.getLayoutParams()).c = false;
        n();
    }

    @Override // defpackage.amx
    public final void c(View view, float f, float f2) {
        float f3 = ((anf) view.getLayoutParams()).b;
        int width = view.getWidth();
        int i = 0;
        if (!this.c.f(view, 3)) {
            i = this.c.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                i -= width;
            }
        } else if (f <= 0.0f && (f != 0.0f || f3 <= 0.5f)) {
            i = -width;
        }
        this.b.e(i, view.getTop());
        this.c.invalidate();
    }

    @Override // defpackage.amx
    public final void d(int i, int i2) {
        View h;
        if ((i & 1) == 1) {
            h = this.c.h(3);
        } else {
            h = this.c.h(5);
        }
        if (h == null || this.c.a(h) != 0) {
            return;
        }
        this.b.b(h, i2);
    }

    @Override // defpackage.amx
    public final int e(View view) {
        if (ank.n(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.amx
    public final boolean f(View view, int i) {
        return ank.n(view) && this.c.f(view, this.a) && this.c.a(view) == 0;
    }

    @Override // defpackage.amx
    public final int g(View view, int i) {
        if (this.c.f(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.amx
    public final int h(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.amx
    public final boolean j() {
        return false;
    }

    @Override // defpackage.amx
    public final void k() {
        this.c.postDelayed(this.d, 160L);
    }

    @Override // defpackage.amx
    public final void l(View view, int i, int i2) {
        int width = view.getWidth();
        float width2 = (this.c.f(view, 3) ? i + width : this.c.getWidth() - i) / width;
        this.c.d(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        this.c.invalidate();
    }

    public final void m() {
        this.c.removeCallbacks(this.d);
    }

    public final void n() {
        int i = 3;
        if (this.a == 3) {
            i = 5;
        }
        View h = this.c.h(i);
        if (h != null) {
            this.c.l(h);
        }
    }
}
