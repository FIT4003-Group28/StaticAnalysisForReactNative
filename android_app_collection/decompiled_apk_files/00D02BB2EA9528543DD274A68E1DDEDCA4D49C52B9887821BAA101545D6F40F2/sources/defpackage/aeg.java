package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aeg  reason: default package */
/* loaded from: classes2.dex */
public final class aeg {
    public final ArrayList<View> a = new ArrayList<>();
    int b = Integer.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    int d = 0;
    final int e;
    public final /* synthetic */ aeh f;

    public aeg(aeh aehVar, int i) {
        this.f = aehVar;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aec t(View view) {
        return (aec) view.getLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        b();
        return this.b;
    }

    final void b() {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = this.a.get(0);
        aec t = t(view);
        this.b = this.f.c.h(view);
        if (!t.b || (f = this.f.i.f(t.RW())) == null || f.b != -1) {
            return;
        }
        this.b -= f.a(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        b();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        e();
        return this.c;
    }

    final void e() {
        ArrayList<View> arrayList;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f;
        View view = this.a.get(arrayList.size() - 1);
        aec t = t(view);
        this.c = this.f.c.g(view);
        if (!t.b || (f = this.f.i.f(t.RW())) == null || f.b != 1) {
            return;
        }
        this.c += f.a(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        e();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(View view) {
        aec t = t(view);
        t.a = this;
        this.a.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (t.RU() || t.RV()) {
            this.d += this.f.c.e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(View view) {
        aec t = t(view);
        t.a = this;
        this.a.add(view);
        this.c = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (t.RU() || t.RV()) {
            this.d += this.f.c.e(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        this.b = i;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        int size = this.a.size();
        View remove = this.a.remove(size - 1);
        aec t = t(remove);
        t.a = null;
        if (t.RU() || t.RV()) {
            this.d -= this.f.c.e(remove);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        View remove = this.a.remove(0);
        aec t = t(remove);
        t.a = null;
        if (this.a.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (t.RU() || t.RV()) {
            this.d -= this.f.c.e(remove);
        }
        this.b = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final int n() {
        if (this.f.e) {
            return r(this.a.size() - 1, -1);
        }
        return r(0, this.a.size());
    }

    public final int o() {
        if (this.f.e) {
            return r(0, this.a.size());
        }
        return r(this.a.size() - 1, -1);
    }

    public final View p(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.a.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = this.a.get(i3);
                if ((this.f.e && aeh.bm(view2) <= i) || ((!this.f.e && aeh.bm(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.a.size() - 1;
            while (size2 >= 0) {
                View view3 = this.a.get(size2);
                if ((this.f.e && aeh.bm(view3) >= i) || ((!this.f.e && aeh.bm(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    final int q(int i, int i2, boolean z, boolean z2) {
        int d = this.f.c.d();
        int a = this.f.c.a();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = this.a.get(i);
            int h = this.f.c.h(view);
            int g = this.f.c.g(view);
            boolean z3 = false;
            boolean z4 = !z2 ? h < a : h <= a;
            if (!z2 ? g > d : g >= d) {
                z3 = true;
            }
            if (z4 && z3) {
                if (z) {
                    return aeh.bm(view);
                }
                if (h < d || g > a) {
                    return aeh.bm(view);
                }
            }
            i += i3;
        }
        return -1;
    }

    final int r(int i, int i2) {
        return q(i, i2, false, true);
    }

    public final int s(int i, int i2) {
        return q(i, i2, true, false);
    }
}
