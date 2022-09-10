package defpackage;
/* compiled from: PG */
/* renamed from: bwnn  reason: default package */
/* loaded from: classes4.dex */
public final class bwnn {
    @dzsi
    public btlu b;
    public boolean c;
    public boolean d;
    @dzsi
    public dtjs e;
    public bwnk f = bwnk.a;
    public final dvtn a = dvto.k.bZ();

    private final void e(dtmp dtmpVar) {
        dtnd dtndVar = ((dvto) this.a.b).b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dsqp dsqpVar = (dsqp) dtndVar.cu(5);
        dsqpVar.bC(dtndVar);
        dtnc dtncVar = (dtnc) dsqpVar;
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar2 = (dtnd) dtncVar.b;
        dtmpVar.getClass();
        dtndVar2.d = dtmpVar;
        dtndVar2.a |= 4;
        dvtn dvtnVar = this.a;
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar = (dvto) dvtnVar.b;
        dtnd dtndVar3 = (dtnd) dtncVar.bK();
        dtndVar3.getClass();
        dvtoVar.b = dtndVar3;
        dvtoVar.a |= 1;
    }

    public final bwno a() {
        return new bwno(this.a.bK(), this.b, this.c, this.d, this.e);
    }

    public final void b(@dzsi dtjt dtjtVar) {
        if (dtjtVar == null) {
            return;
        }
        dtnd dtndVar = ((dvto) this.a.b).b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dsqp dsqpVar = (dsqp) dtndVar.cu(5);
        dsqpVar.bC(dtndVar);
        dtnc dtncVar = (dtnc) dsqpVar;
        if (dtncVar.c) {
            dtncVar.bF();
            dtncVar.c = false;
        }
        dtnd dtndVar2 = (dtnd) dtncVar.b;
        dtjtVar.getClass();
        dtndVar2.f = dtjtVar;
        dtndVar2.a |= 32;
        dvtn dvtnVar = this.a;
        if (dvtnVar.c) {
            dvtnVar.bF();
            dvtnVar.c = false;
        }
        dvto dvtoVar = (dvto) dvtnVar.b;
        dtnd dtndVar3 = (dtnd) dtncVar.bK();
        dtndVar3.getClass();
        dvtoVar.b = dtndVar3;
        dvtoVar.a |= 1;
    }

    public final void c(@dzsi dtaq dtaqVar) {
        if (dtaqVar == null) {
            return;
        }
        dtnd dtndVar = ((dvto) this.a.b).b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dtmp dtmpVar = dtndVar.d;
        if (dtmpVar == null) {
            dtmpVar = dtmp.e;
        }
        dsqp dsqpVar = (dsqp) dtmpVar.cu(5);
        dsqpVar.bC(dtmpVar);
        dtmo dtmoVar = (dtmo) dsqpVar;
        if (dtmoVar.c) {
            dtmoVar.bF();
            dtmoVar.c = false;
        }
        dtmp dtmpVar2 = (dtmp) dtmoVar.b;
        dgrn dgrnVar = null;
        dtmpVar2.c = null;
        int i = dtmpVar2.a & (-5);
        dtmpVar2.a = i;
        dtmpVar2.a = i & (-9);
        dtmpVar2.d = 0;
        if ((dtaqVar.a & 16) != 0) {
            dtak dtakVar = dtaqVar.e;
            if (dtakVar == null) {
                dtakVar = dtak.d;
            }
            akqq l = akqq.l(dtakVar);
            if (l != null) {
                dgrnVar = l.n();
            }
            if (dgrnVar != null) {
                if (dtmoVar.c) {
                    dtmoVar.bF();
                    dtmoVar.c = false;
                }
                dtmp dtmpVar3 = (dtmp) dtmoVar.b;
                dgrnVar.getClass();
                dtmpVar3.c = dgrnVar;
                dtmpVar3.a |= 4;
            }
        }
        if ((dtaqVar.a & 128) != 0) {
            int i2 = (int) (dtaqVar.g / 1000.0f);
            if (dtmoVar.c) {
                dtmoVar.bF();
                dtmoVar.c = false;
            }
            dtmp dtmpVar4 = (dtmp) dtmoVar.b;
            dtmpVar4.a |= 8;
            dtmpVar4.d = i2;
        }
        e(dtmoVar.bK());
    }

    public final void d(@dzsi akqs akqsVar) {
        if (akqsVar == null) {
            return;
        }
        dtnd dtndVar = ((dvto) this.a.b).b;
        if (dtndVar == null) {
            dtndVar = dtnd.l;
        }
        dtmp dtmpVar = dtndVar.d;
        if (dtmpVar == null) {
            dtmpVar = dtmp.e;
        }
        dsqp dsqpVar = (dsqp) dtmpVar.cu(5);
        dsqpVar.bC(dtmpVar);
        dtmo dtmoVar = (dtmo) dsqpVar;
        dgrs bZ = dgrt.d.bZ();
        dgrm bZ2 = dgrn.d.bZ();
        int b = anae.b(akqsVar.a.a);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgrn dgrnVar = (dgrn) bZ2.b;
        dgrnVar.a |= 1;
        dgrnVar.b = b;
        int b2 = anae.b(akqsVar.a.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgrn dgrnVar2 = (dgrn) bZ2.b;
        dgrnVar2.a |= 2;
        dgrnVar2.c = b2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrt dgrtVar = (dgrt) bZ.b;
        dgrn bK = bZ2.bK();
        bK.getClass();
        dgrtVar.b = bK;
        dgrtVar.a |= 1;
        dgrm bZ3 = dgrn.d.bZ();
        int b3 = anae.b(akqsVar.b.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dgrn dgrnVar3 = (dgrn) bZ3.b;
        dgrnVar3.a |= 1;
        dgrnVar3.b = b3;
        int b4 = anae.b(akqsVar.b.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dgrn dgrnVar4 = (dgrn) bZ3.b;
        dgrnVar4.a |= 2;
        dgrnVar4.c = b4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgrt dgrtVar2 = (dgrt) bZ.b;
        dgrn bK2 = bZ3.bK();
        bK2.getClass();
        dgrtVar2.c = bK2;
        dgrtVar2.a |= 2;
        if (dtmoVar.c) {
            dtmoVar.bF();
            dtmoVar.c = false;
        }
        dtmp dtmpVar2 = (dtmp) dtmoVar.b;
        dgrt bK3 = bZ.bK();
        bK3.getClass();
        dtmpVar2.b = bK3;
        dtmpVar2.a |= 1;
        e(dtmoVar.bK());
    }
}
