package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: beir  reason: default package */
/* loaded from: classes3.dex */
public final class beir implements beie {
    public final crzo<apsi<dbsg<List<dqob>>>> a = new crzo<>();
    private final btpc b;
    private final bvrb c;
    private final butc d;

    public beir(btpc btpcVar, butc butcVar, bvrb bvrbVar) {
        this.b = btpcVar;
        this.d = butcVar;
        this.c = bvrbVar;
    }

    @Override // defpackage.beie
    public final crzm<apsi<dbsg<List<dqob>>>> a() {
        return this.a.a;
    }

    @Override // defpackage.beie
    public final void b(bwrs<bvrt<benb>> bwrsVar, ilo iloVar) {
        if (!this.b.i() || iloVar.cQ().isEmpty()) {
            this.a.a(apsi.c(2, dbpy.a));
            return;
        }
        dikl bZ = dikm.e.bZ();
        String cQ = iloVar.cQ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dikm dikmVar = (dikm) bZ.b;
        cQ.getClass();
        dikmVar.a |= 1;
        dikmVar.b = cQ;
        dqoc bZ2 = dqof.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dqof dqofVar = (dqof) bZ2.b;
        dqofVar.b = 1;
        dqofVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dikm dikmVar2 = (dikm) bZ.b;
        dqof bK = bZ2.bK();
        bK.getClass();
        dsrj<dqof> dsrjVar = dikmVar2.c;
        if (!dsrjVar.a()) {
            dikmVar2.c = dsqw.cl(dsrjVar);
        }
        dikmVar2.c.add(bK);
        dnqg bZ3 = dnqh.p.bZ();
        int i = ddda.av.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ3.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dikm dikmVar3 = (dikm) bZ.b;
        bK2.getClass();
        dikmVar3.d = bK2;
        dikmVar3.a |= 2;
        this.d.b(bZ.bK(), new beiq(this, bwrsVar), this.c.h());
        this.a.a(apsi.c(1, dbpy.a));
    }
}
