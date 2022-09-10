package defpackage;
/* compiled from: PG */
/* renamed from: dvzm  reason: default package */
/* loaded from: classes6.dex */
public final class dvzm extends dsqp<dvzn, dvzm> implements dssk {
    public dvzm() {
        super(dvzn.e);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzn dvznVar = (dvzn) this.b;
        dvzn dvznVar2 = dvzn.e;
        dvznVar.c();
        dsod.bv(iterable, dvznVar.b);
    }

    public final void b(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzn dvznVar = (dvzn) this.b;
        dvzn dvznVar2 = dvzn.e;
        dvznVar.e();
        dsod.bv(iterable, dvznVar.c);
    }

    public final void c(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzn dvznVar = (dvzn) this.b;
        dvzn dvznVar2 = dvzn.e;
        dvznVar.c();
        dvznVar.b.h(i);
    }

    public final void d(int i) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvzn dvznVar = (dvzn) this.b;
        dvzn dvznVar2 = dvzn.e;
        dvznVar.e();
        dvznVar.c.h(i);
    }
}
