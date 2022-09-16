package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ex  reason: default package */
/* loaded from: classes3.dex */
public abstract class ex {
    int e;
    int f;
    int g;
    int h;
    public int i;
    public boolean j;
    public String l;
    public int m;
    public CharSequence n;
    public int o;
    public CharSequence p;
    public ArrayList q;
    public ArrayList r;
    ArrayList t;
    public final ArrayList d = new ArrayList();
    boolean k = true;
    public boolean s = false;

    public abstract int a();

    public abstract void d();

    public abstract void e();

    public void f(int i, dp dpVar, String str, int i2) {
        throw null;
    }

    public boolean j() {
        throw null;
    }

    public abstract void k();

    public void l(dp dpVar) {
        throw null;
    }

    public void m(dp dpVar) {
        throw null;
    }

    public void n(dp dpVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(ew ewVar) {
        this.d.add(ewVar);
        ewVar.d = this.e;
        ewVar.e = this.f;
        ewVar.f = this.g;
        ewVar.g = this.h;
    }

    public final void p(int i, dp dpVar) {
        f(i, dpVar, null, 1);
    }

    public final void q(int i, dp dpVar, String str) {
        f(i, dpVar, str, 1);
    }

    public final void r(dp dpVar, String str) {
        f(0, dpVar, str, 1);
    }

    public final void s() {
        if (this.k) {
            this.j = true;
            this.l = null;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public final void t() {
        if (!this.j) {
            this.k = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void v(Runnable runnable) {
        t();
        if (this.t == null) {
            this.t = new ArrayList();
        }
        this.t.add(runnable);
    }

    public final void w(int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final void x() {
        this.s = true;
    }

    public final void y(int i, dp dpVar) {
        u(i, dpVar, null);
    }

    public final void z(int i, int i2) {
        w(i, i2, 0, 0);
    }

    public final void u(int i, dp dpVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, dpVar, str, 2);
    }
}
