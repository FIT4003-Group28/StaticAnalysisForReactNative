package defpackage;
/* compiled from: PG */
/* renamed from: dryq  reason: default package */
/* loaded from: classes6.dex */
public final class dryq extends dsqp<dryr, dryq> implements dssk {
    public dryq() {
        super(dryr.e);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dryr dryrVar = (dryr) this.b;
        dryr dryrVar2 = dryr.e;
        dsrj<String> dsrjVar = dryrVar.c;
        if (!dsrjVar.a()) {
            dryrVar.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, dryrVar.c);
    }

    public final void b(dsay dsayVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dryr dryrVar = (dryr) this.b;
        dryr dryrVar2 = dryr.e;
        dsayVar.getClass();
        dsrj<dsay> dsrjVar = dryrVar.d;
        if (!dsrjVar.a()) {
            dryrVar.d = dsqw.cl(dsrjVar);
        }
        dryrVar.d.add(dsayVar);
    }
}
