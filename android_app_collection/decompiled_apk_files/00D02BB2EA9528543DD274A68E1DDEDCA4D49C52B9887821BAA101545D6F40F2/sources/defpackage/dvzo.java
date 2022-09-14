package defpackage;
/* compiled from: PG */
/* renamed from: dvzo  reason: default package */
/* loaded from: classes6.dex */
public final class dvzo extends dsqp<dvzu, dvzo> implements dssk {
    public dvzo() {
        super(dvzu.F);
    }

    public final dpie a(int i) {
        return ((dvzu) this.b).e.get(i);
    }

    public final dvzn b(int i) {
        return ((dvzu) this.b).p.get(i);
    }

    public final void c(dvzn dvznVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dvzu dvzuVar2 = dvzu.F;
        dvznVar.getClass();
        dvzuVar.g();
        dvzuVar.p.add(dvznVar);
    }

    public final void d(dphr dphrVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dpie dpieVar = (dpie) dphrVar.bK();
        dvzu dvzuVar2 = dvzu.F;
        dpieVar.getClass();
        dvzuVar.f();
        dvzuVar.e.add(dpieVar);
    }

    public final void e(dpie dpieVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dvzu dvzuVar2 = dvzu.F;
        dpieVar.getClass();
        dvzuVar.f();
        dvzuVar.e.add(dpieVar);
    }

    public final void f(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dvzu dvzuVar2 = dvzu.F;
        dvzuVar.c();
        dvzuVar.b.remove(i);
    }

    public final void g(int i, dphr dphrVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dpie dpieVar = (dpie) dphrVar.bK();
        dvzu dvzuVar2 = dvzu.F;
        dpieVar.getClass();
        dvzuVar.f();
        dvzuVar.e.set(i, dpieVar);
    }

    public final void h(int i, dpie dpieVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzu dvzuVar = (dvzu) this.b;
        dvzu dvzuVar2 = dvzu.F;
        dpieVar.getClass();
        dvzuVar.f();
        dvzuVar.e.set(i, dpieVar);
    }
}
