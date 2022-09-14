package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bizi  reason: default package */
/* loaded from: classes3.dex */
public final class bizi extends bjfk<bizn> {
    public bizv a;
    public bjgu b;
    public btrm c;
    private bjfd d;

    @Override // defpackage.ges
    public final void Nv() {
        ((bizj) btsx.b(bizj.class, this)).cP(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        bizn biznVar = (bizn) this.ag;
        dbsk.s(biznVar);
        biznVar.QW();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        btrm btrmVar = this.c;
        dbsk.s(btrmVar);
        bjfd bjfdVar = this.d;
        dbsk.s(bjfdVar);
        bjfe.b(btrmVar, bjfdVar);
        super.am();
    }

    @Override // defpackage.bjfi
    protected final cqiw<bizn> g() {
        dbsk.s(this.b);
        return new bizm();
    }

    @Override // defpackage.bjfk
    protected final /* bridge */ /* synthetic */ bizn i(ilo iloVar) {
        bizv bizvVar = this.a;
        dbsk.s(bizvVar);
        bwrs a = bwrs.a(iloVar);
        gga a2 = bizvVar.a.a();
        bizv.a(a2, 1);
        bizv.a(bizvVar.b.a(), 2);
        bizv.a(bizvVar.c.a(), 3);
        bjcj a3 = bizvVar.d.a();
        bizv.a(a3, 4);
        bizv.a(bizvVar.e.a(), 5);
        bjau a4 = bizvVar.f.a();
        bizv.a(a4, 6);
        bizv.a(bizvVar.g.a(), 7);
        bjbh a5 = bizvVar.h.a();
        bizv.a(a5, 8);
        bjbr a6 = bizvVar.i.a();
        bizv.a(a6, 9);
        bjhs a7 = bizvVar.j.a();
        bizv.a(a7, 10);
        bjgi a8 = bizvVar.k.a();
        bizv.a(a8, 11);
        bizv.a(bizvVar.l.a(), 12);
        bjgu a9 = bizvVar.m.a();
        bizv.a(a9, 13);
        bizv.a(a, 14);
        return new bizu(a2, a3, a4, a5, a6, a7, a8, a9, a);
    }

    @Override // defpackage.bjfk, defpackage.bjfi, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        bizn biznVar = (bizn) this.ag;
        dbsk.s(biznVar);
        this.d = new bjfd(biznVar);
        btrm btrmVar = this.c;
        dbsk.s(btrmVar);
        bjfd bjfdVar = this.d;
        dbsk.s(bjfdVar);
        bjfe.c(btrmVar, bjfdVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        ilo iloVar = this.ai;
        dbsk.s(iloVar);
        djai djaiVar = iloVar.h().bd;
        if (djaiVar == null) {
            djaiVar = djai.g;
        }
        dqcu dqcuVar = djaiVar.f;
        if (dqcuVar == null) {
            dqcuVar = dqcu.c;
        }
        int a = dqct.a(dqcuVar.b);
        return (a != 0 && a == 3) ? dtxl.I : dtxy.fH;
    }
}
