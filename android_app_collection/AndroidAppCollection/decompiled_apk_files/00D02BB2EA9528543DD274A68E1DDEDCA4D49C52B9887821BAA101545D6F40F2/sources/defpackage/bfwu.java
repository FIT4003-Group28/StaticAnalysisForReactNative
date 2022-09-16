package defpackage;
/* compiled from: PG */
/* renamed from: bfwu  reason: default package */
/* loaded from: classes3.dex */
public class bfwu implements bfwt, bega {
    private final boxa a;
    @dzsi
    private bwrs<ilo> b = null;

    public bfwu(boxa boxaVar) {
        this.a = boxaVar;
    }

    @Override // defpackage.bfwt
    public Boolean a() {
        bwrs<ilo> bwrsVar = this.b;
        boolean z = false;
        if (bwrsVar != null && this.a.G(bwrsVar)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfwt
    public cqkl b() {
        if (bwrs.b(this.b) == null) {
            return cqkl.a;
        }
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.PLACE_CARD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnpy bZ2 = dnpz.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnpz dnpzVar = (dnpz) bZ2.b;
        dnpzVar.a |= 1;
        dnpzVar.b = 76911;
        deaf deafVar = deaf.TAP;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnpz dnpzVar2 = (dnpz) bZ2.b;
        dnpzVar2.c = deafVar.Q;
        dnpzVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnpz bK = bZ2.bK();
        bK.getClass();
        dnqeVar2.f = bK;
        dnqeVar2.a |= 32;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar3 = (dnqe) bZ.b;
        dnqeVar3.c = 1;
        dnqeVar3.a |= 2;
        boxa boxaVar = this.a;
        bwrs<ilo> bwrsVar = this.b;
        dbsk.s(bwrsVar);
        boxaVar.H(bwrsVar, bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.b = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = (ilo) bwrs.b(this.b);
        boolean z = false;
        if (iloVar != null && iloVar.ap()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
