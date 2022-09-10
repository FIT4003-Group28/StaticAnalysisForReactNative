package defpackage;
/* compiled from: PG */
/* renamed from: bpap  reason: default package */
/* loaded from: classes3.dex */
public final class bpap extends bpbl {
    public gfq aq;

    @Override // defpackage.ges
    public final void Nv() {
        ((bpaq) btsx.b(bpaq.class, this)).dc(this);
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        Nw(obj);
        gfq.l(this);
    }

    @Override // defpackage.bpbl
    public final void bE() {
        bpub bZ = bpue.m.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar = (bpue) bZ.b;
        bpueVar.b = 3;
        bpueVar.a |= 1;
        akqq akqqVar = this.aV;
        dbsk.s(akqqVar);
        dhjz i = akqqVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar2 = (bpue) bZ.b;
        i.getClass();
        bpueVar2.f = i;
        bpueVar2.a |= 16;
        dnps bZ2 = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.RAP_FEATURE_PICKER_CARD;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ2.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar3 = (bpue) bZ.b;
        bK.getClass();
        bpueVar3.c = bK;
        bpueVar3.a |= 2;
        Nw(bZ.bK());
        gfq.l(this);
    }

    @Override // defpackage.bpbl
    public final void bF(ilo iloVar) {
        dnqe dnqeVar = this.aU;
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqe dnqeVar3 = dnqe.i;
        dnqeVar2.c = 2;
        dnqeVar2.a |= 2;
        dnqe a = bpun.a(dnpsVar.bK(), dnpv.ROAD_RAP_EXTENT_PICKER, "No");
        dhjz dhjzVar = dhjz.e;
        if (iloVar.aj() != null) {
            dhjzVar = iloVar.aj().i();
        }
        bpub bZ = bpue.m.bZ();
        int i = doay.TYPE_ROAD.equals(iloVar.ce()) ? 2 : 3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar = (bpue) bZ.b;
        bpueVar.b = i - 1;
        int i2 = bpueVar.a | 1;
        bpueVar.a = i2;
        a.getClass();
        bpueVar.c = a;
        bpueVar.a = i2 | 2;
        akqq akqqVar = this.aV;
        dbsk.s(akqqVar);
        dhjz i3 = akqqVar.i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar2 = (bpue) bZ.b;
        i3.getClass();
        bpueVar2.f = i3;
        bpueVar2.a |= 16;
        dpsn i4 = iloVar.ai().i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar3 = (bpue) bZ.b;
        i4.getClass();
        bpueVar3.d = i4;
        bpueVar3.a |= 4;
        doay ce = iloVar.ce();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpue bpueVar4 = (bpue) bZ.b;
        bpueVar4.g = ce.j;
        int i5 = bpueVar4.a | 32;
        bpueVar4.a = i5;
        dhjzVar.getClass();
        bpueVar4.e = dhjzVar;
        bpueVar4.a = i5 | 8;
        Nw(bZ.bK());
        gfq.m(this);
    }

    @Override // defpackage.ggo
    public final void bn() {
        if (!this.aD) {
            return;
        }
        e();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        Nw(bpue.m);
        gfq.m(this);
        return true;
    }
}
