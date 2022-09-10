package defpackage;
/* compiled from: PG */
/* renamed from: chvx  reason: default package */
/* loaded from: classes4.dex */
public final class chvx extends dsqp<chvy, chvx> implements dssk {
    public chvx() {
        super(chvy.b);
    }

    public final void a(Iterable<? extends djao> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        chvy chvyVar = (chvy) this.b;
        chvy chvyVar2 = chvy.b;
        dsrj<djao> dsrjVar = chvyVar.a;
        if (!dsrjVar.a()) {
            chvyVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, chvyVar.a);
    }
}
