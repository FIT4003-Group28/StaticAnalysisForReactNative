package defpackage;
/* compiled from: PG */
/* renamed from: dvhp  reason: default package */
/* loaded from: classes6.dex */
public final class dvhp extends dsqp<dvhq, dvhp> implements dssk {
    public dvhp() {
        super(dvhq.d);
    }

    public final void a(dpte dpteVar) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dvhq dvhqVar = (dvhq) this.b;
        dvhq dvhqVar2 = dvhq.d;
        dpteVar.getClass();
        dsrj<dpte> dsrjVar = dvhqVar.b;
        if (!dsrjVar.a()) {
            dvhqVar.b = dsqw.cl(dsrjVar);
        }
        dvhqVar.b.add(dpteVar);
    }
}
