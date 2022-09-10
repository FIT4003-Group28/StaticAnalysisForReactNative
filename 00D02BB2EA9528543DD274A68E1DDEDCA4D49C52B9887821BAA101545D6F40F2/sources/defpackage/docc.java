package defpackage;
/* compiled from: PG */
/* renamed from: docc  reason: default package */
/* loaded from: classes.dex */
public final class docc extends dsqp<docg, docc> implements dssk {
    public docc() {
        super(docg.M);
    }

    public final void a(Iterable<? extends dreq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        docg docgVar = (docg) this.b;
        docg docgVar2 = docg.M;
        dsrj<dreq> dsrjVar = docgVar.J;
        if (!dsrjVar.a()) {
            docgVar.J = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, docgVar.J);
    }

    public final void b(Iterable<? extends dnwl> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        docg docgVar = (docg) this.b;
        docg docgVar2 = docg.M;
        dsrj<dnwl> dsrjVar = docgVar.B;
        if (!dsrjVar.a()) {
            docgVar.B = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, docgVar.B);
    }

    public final void c(Iterable<? extends drfo> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        docg docgVar = (docg) this.b;
        docg docgVar2 = docg.M;
        dsrj<drfo> dsrjVar = docgVar.K;
        if (!dsrjVar.a()) {
            docgVar.K = dsqw.cl(dsrjVar);
        }
        dsod.bv(iterable, docgVar.K);
    }
}
