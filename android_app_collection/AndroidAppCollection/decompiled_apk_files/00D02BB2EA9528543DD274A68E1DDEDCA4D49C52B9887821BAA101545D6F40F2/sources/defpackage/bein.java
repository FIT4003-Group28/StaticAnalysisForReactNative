package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bein  reason: default package */
/* loaded from: classes3.dex */
public final class bein implements btzi<dkay, dkba> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ dgac d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dbsg f;
    final /* synthetic */ beio g;

    public bein(beio beioVar, bwrs bwrsVar, String str, String str2, dgac dgacVar, boolean z, dbsg dbsgVar) {
        this.g = beioVar;
        this.a = bwrsVar;
        this.b = str;
        this.c = str2;
        this.d = dgacVar;
        this.e = z;
        this.f = dbsgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkay> btzrVar, btzy btzyVar) {
        int i = beio.c;
        if (!this.g.d(this.a, this.b, this.c) && !this.e) {
            this.g.b.a(this.b, this.c, 2, this.f);
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkay> btzrVar, dkba dkbaVar) {
        int i = beio.c;
        if (this.g.d(this.a, this.b, this.c)) {
            return;
        }
        dgac dgacVar = this.d;
        bwrs bwrsVar = this.a;
        ilo iloVar = (ilo) bwrsVar.c();
        if (iloVar != null) {
            dvxh bf = iloVar.bf();
            dvwi dvwiVar = bf.v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            dgde dgdeVar = dvwiVar.l;
            if (dgdeVar == null) {
                dgdeVar = dgde.f;
            }
            dvyw h = iloVar.h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            dvya dvyaVar = (dvya) dsqpVar;
            dsqp dsqpVar2 = (dsqp) bf.cu(5);
            dsqpVar2.bC(bf);
            dvxc dvxcVar = (dvxc) dsqpVar2;
            dsqp dsqpVar3 = (dsqp) dvwiVar.cu(5);
            dsqpVar3.bC(dvwiVar);
            dvwf dvwfVar = (dvwf) dsqpVar3;
            dsqp dsqpVar4 = (dsqp) dgdeVar.cu(5);
            dsqpVar4.bC(dgdeVar);
            dgdd dgddVar = (dgdd) dsqpVar4;
            dgcw dgcwVar = dgdeVar.d;
            if (dgcwVar == null) {
                dgcwVar = dgcw.c;
            }
            dsqp dsqpVar5 = (dsqp) dgcwVar.cu(5);
            dsqpVar5.bC(dgcwVar);
            dgcv dgcvVar = (dgcv) dsqpVar5;
            if (dgcvVar.c) {
                dgcvVar.bF();
                dgcvVar.c = false;
            }
            dgcw dgcwVar2 = (dgcw) dgcvVar.b;
            dgacVar.getClass();
            dgcwVar2.b = dgacVar;
            dgcwVar2.a |= 1;
            if (dgddVar.c) {
                dgddVar.bF();
                dgddVar.c = false;
            }
            dgde dgdeVar2 = (dgde) dgddVar.b;
            dgcw bK = dgcvVar.bK();
            bK.getClass();
            dgdeVar2.d = bK;
            dgdeVar2.a |= 4;
            if (dvwfVar.c) {
                dvwfVar.bF();
                dvwfVar.c = false;
            }
            dvwi dvwiVar2 = (dvwi) dvwfVar.b;
            dgde bK2 = dgddVar.bK();
            bK2.getClass();
            dvwiVar2.l = bK2;
            dvwiVar2.a |= 4096;
            if (dvxcVar.c) {
                dvxcVar.bF();
                dvxcVar.c = false;
            }
            dvxh dvxhVar = (dvxh) dvxcVar.b;
            dvwi bK3 = dvwfVar.bK();
            bK3.getClass();
            dvxhVar.v = bK3;
            dvxhVar.a |= 16777216;
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dvxh dvxhVar2 = (dvxh) dvxcVar.bK();
            dvyw dvywVar2 = dvyw.bv;
            dvxhVar2.getClass();
            dvywVar.z = dvxhVar2;
            dvywVar.a |= 2097152;
            ily g = iloVar.g();
            g.E(dvyaVar.bK());
            bwrsVar.d(g.d());
        }
        if (this.e) {
            return;
        }
        this.g.b.a(this.b, this.c, 3, dbsg.i(this.d));
    }
}
