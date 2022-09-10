package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: beim  reason: default package */
/* loaded from: classes3.dex */
public final class beim implements beic {
    public final crzo<apsi<dbsg<List<dfzw>>>> a = new crzo<>();
    private final btpc b;
    private final bvrb c;
    private final buoe d;

    public beim(btpc btpcVar, buoe buoeVar, bvrb bvrbVar) {
        this.b = btpcVar;
        this.d = buoeVar;
        this.c = bvrbVar;
    }

    @Override // defpackage.beic
    public final crzm<apsi<dbsg<List<dfzw>>>> a() {
        return this.a.a;
    }

    @Override // defpackage.beic
    public final void b(ilo iloVar, eapg eapgVar, eapg eapgVar2) {
        if (!this.b.i() || iloVar.cQ().isEmpty()) {
            this.a.a(apsi.c(2, dbpy.a));
            return;
        }
        dhzr bZ = dhzs.f.bZ();
        String cQ = iloVar.cQ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhzs dhzsVar = (dhzs) bZ.b;
        cQ.getClass();
        dhzsVar.a |= 1;
        dhzsVar.b = cQ;
        dpoi bZ2 = dpoj.e.bZ();
        int r = eapgVar.r();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpoj dpojVar = (dpoj) bZ2.b;
        dpojVar.a |= 1;
        dpojVar.b = r;
        int s = eapgVar.s();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpoj dpojVar2 = (dpoj) bZ2.b;
        dpojVar2.a |= 2;
        dpojVar2.c = s;
        dpoj bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhzs dhzsVar2 = (dhzs) bZ.b;
        bK.getClass();
        dhzsVar2.c = bK;
        dhzsVar2.a |= 2;
        dpoi bZ3 = dpoj.e.bZ();
        int r2 = eapgVar2.r();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpoj dpojVar3 = (dpoj) bZ3.b;
        dpojVar3.a |= 1;
        dpojVar3.b = r2;
        int s2 = eapgVar2.s();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpoj dpojVar4 = (dpoj) bZ3.b;
        dpojVar4.a = 2 | dpojVar4.a;
        dpojVar4.c = s2;
        dpoj bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhzs dhzsVar3 = (dhzs) bZ.b;
        bK2.getClass();
        dhzsVar3.d = bK2;
        dhzsVar3.a |= 4;
        dnqg bZ4 = dnqh.p.bZ();
        int i = ddda.ao.b;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ4.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        dnqh bK3 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhzs dhzsVar4 = (dhzs) bZ.b;
        bK3.getClass();
        dhzsVar4.e = bK3;
        dhzsVar4.a |= 8;
        this.d.b(bZ.bK(), new beil(this), this.c.h());
        this.a.a(apsi.c(1, dbpy.a));
    }
}
