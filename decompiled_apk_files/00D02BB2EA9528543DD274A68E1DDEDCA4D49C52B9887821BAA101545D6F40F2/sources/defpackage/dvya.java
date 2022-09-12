package defpackage;
/* compiled from: PG */
/* renamed from: dvya  reason: default package */
/* loaded from: classes.dex */
public final class dvya extends dsqp<dvyw, dvya> implements dssk {
    public dvya() {
        super(dvyw.bv);
    }

    public final void a(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvyw dvywVar = (dvyw) this.b;
        dvyw dvywVar2 = dvyw.bv;
        str.getClass();
        dvywVar.c();
        dvywVar.o.add(str);
    }

    public final void b(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvyw dvywVar = (dvyw) this.b;
        dvyw dvywVar2 = dvyw.bv;
        dvywVar.e();
        dsod.bv(iterable, dvywVar.A);
    }

    public final void c(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvyw dvywVar = (dvyw) this.b;
        dvyw dvywVar2 = dvyw.bv;
        str.getClass();
        dvywVar.e();
        dvywVar.A.add(str);
    }

    public final void d(dhxw dhxwVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvyw dvywVar = (dvyw) this.b;
        dvyw dvywVar2 = dvyw.bv;
        dhxwVar.getClass();
        dsrj<dhxw> dsrjVar = dvywVar.ag;
        if (!dsrjVar.a()) {
            dvywVar.ag = dsqw.cl(dsrjVar);
        }
        dvywVar.ag.add(dhxwVar);
    }
}
