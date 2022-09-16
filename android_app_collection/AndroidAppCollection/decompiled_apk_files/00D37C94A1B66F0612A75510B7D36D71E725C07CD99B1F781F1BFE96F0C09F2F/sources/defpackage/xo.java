package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: xo  reason: default package */
/* loaded from: classes4.dex */
public abstract class xo {
    public final xp a = new xp();
    public boolean b = false;
    public final int c = 1;

    public abstract int b();

    public int c(int i) {
        return 0;
    }

    public abstract yo f(ViewGroup viewGroup, int i);

    public int jT(xo xoVar, yo yoVar, int i) {
        if (xoVar == this) {
            return i;
        }
        return -1;
    }

    public final void l(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void m(int i, int i2) {
        this.a.f(i, i2);
    }

    public long mp(int i) {
        return -1L;
    }

    public final yo mq(ViewGroup viewGroup, int i) {
        yo f = f(viewGroup, i);
        if (f.a.getParent() == null) {
            f.f = i;
            return f;
        }
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
    }

    public final void mr() {
        this.a.a();
    }

    public final void n(int i) {
        this.a.f(i, 1);
    }

    public abstract void o(yo yoVar, int i);

    public final void ok(int i) {
        this.a.c(i, 1);
    }

    public final void ol(int i) {
        this.a.e(i, 1);
    }

    public final void om(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void oo(int i, int i2) {
        this.a.c(i, i2);
    }

    public void p(yo yoVar) {
    }

    public final void q(boolean z) {
        if (!this.a.g()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void r() {
    }

    public void s(yo yoVar, int i) {
        o(yoVar, i);
    }

    public void t() {
    }

    public void u(lg lgVar) {
        this.a.registerObserver(lgVar);
    }

    public void v(lg lgVar) {
        this.a.unregisterObserver(lgVar);
    }
}
