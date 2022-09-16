package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: mb  reason: default package */
/* loaded from: classes3.dex */
public class mb {
    public static final mb a;
    private final ma b;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            a = lz.c;
        } else {
            a = ma.d;
        }
    }

    public mb(mb mbVar) {
        this.b = new ma(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gz j(gz gzVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, gzVar.b - i);
        int max2 = Math.max(0, gzVar.c - i2);
        int max3 = Math.max(0, gzVar.d - i3);
        int max4 = Math.max(0, gzVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? gzVar : gz.d(max, max2, max3, max4);
    }

    public static mb q(WindowInsets windowInsets) {
        return r(windowInsets, null);
    }

    public static mb r(WindowInsets windowInsets, View view) {
        hz.g(windowInsets);
        mb mbVar = new mb(windowInsets);
        if (view != null && lj.aj(view)) {
            mbVar.v(lj.s(view));
            mbVar.t(view.getRootView());
        }
        return mbVar;
    }

    @Deprecated
    public int a() {
        return this.b.j().e;
    }

    @Deprecated
    public int b() {
        return this.b.j().d;
    }

    @Deprecated
    public int c() {
        return this.b.a().e;
    }

    @Deprecated
    public int d() {
        return this.b.a().b;
    }

    @Deprecated
    public int e() {
        return this.b.a().d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mb) {
            return Objects.equals(this.b, ((mb) obj).b);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.b.a().c;
    }

    public gz g(int i) {
        return this.b.i();
    }

    @Deprecated
    public gz h() {
        return this.b.q();
    }

    public int hashCode() {
        ma maVar = this.b;
        if (maVar == null) {
            return 0;
        }
        return maVar.hashCode();
    }

    @Deprecated
    public gz i() {
        return this.b.j();
    }

    public jx k() {
        return this.b.o();
    }

    @Deprecated
    public mb l() {
        return this.b.p();
    }

    @Deprecated
    public mb m() {
        return this.b.k();
    }

    @Deprecated
    public mb n() {
        return this.b.l();
    }

    public mb o(int i, int i2, int i3, int i4) {
        return this.b.b(i, i2, i3, i4);
    }

    @Deprecated
    public mb p(int i, int i2, int i3, int i4) {
        lr lrVar = new lr(this);
        lrVar.c(gz.d(i, i2, i3, i4));
        return lrVar.a();
    }

    public WindowInsets s() {
        ma maVar = this.b;
        if (maVar instanceof lv) {
            return ((lv) maVar).a;
        }
        return null;
    }

    public void t(View view) {
        this.b.c(view);
    }

    public void u(gz[] gzVarArr) {
        this.b.h();
    }

    public void v(mb mbVar) {
        this.b.d(mbVar);
    }

    public void w(gz gzVar) {
        this.b.m(gzVar);
    }

    public boolean x() {
        return this.b.n();
    }

    public boolean y(int i) {
        return this.b.g();
    }

    private mb(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new lz(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new ly(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new lx(this, windowInsets);
        } else {
            this.b = new lw(this, windowInsets);
        }
    }
}
