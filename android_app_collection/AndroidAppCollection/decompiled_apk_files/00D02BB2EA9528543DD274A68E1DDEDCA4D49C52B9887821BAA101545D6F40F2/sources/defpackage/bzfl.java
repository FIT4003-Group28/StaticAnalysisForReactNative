package defpackage;
/* compiled from: PG */
/* renamed from: bzfl  reason: default package */
/* loaded from: classes4.dex */
public final class bzfl extends bzek {
    private final bzgj d;
    private final bzdv e;
    private final byzk f;
    private final bzfw g;
    private final bzfj h;
    private final dgsn i;

    public bzfl(bzfw bzfwVar, bzdv bzdvVar, byzk byzkVar, bzfj bzfjVar, cqat cqatVar, dbsz<bzek> dbszVar, bzdg bzdgVar) {
        super(dbszVar, bzdgVar, cqatVar);
        this.d = new bzgj();
        this.e = bzdvVar;
        this.f = byzkVar;
        this.g = bzfwVar;
        this.h = bzfjVar;
        this.i = dgsn.b(bzdgVar.d().h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final int a(amuo amuoVar) {
        int G = this.b.G(amuoVar);
        return G == 0 ? this.b.H(amuoVar) ? 0 : -1 : G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final /* bridge */ /* synthetic */ bzdh b() {
        bzdg bzdgVar = this.b;
        return new bzcu(bzdgVar, bzdgVar.e(), f());
    }

    @Override // defpackage.bzek
    public final void c() {
        this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final bzek d() {
        bzdv bzdvVar = this.e;
        dbsz<bzek> dbszVar = this.a;
        bzdg bzdgVar = this.b;
        bzfw a = bzdvVar.a.a();
        bzdv.a(a, 1);
        bzfm a2 = bzdvVar.b.a();
        bzdv.a(a2, 2);
        bzej a3 = bzdvVar.c.a();
        bzdv.a(a3, 3);
        bzdn a4 = bzdvVar.d.a();
        bzdv.a(a4, 4);
        byzk a5 = bzdvVar.e.a();
        bzdv.a(a5, 5);
        bzfj a6 = bzdvVar.f.a();
        bzdv.a(a6, 6);
        cqat a7 = bzdvVar.g.a();
        bzdv.a(a7, 7);
        bzdv.a(bzdvVar.h.a(), 8);
        btvo a8 = bzdvVar.i.a();
        bzdv.a(a8, 9);
        bzdv.a(dbszVar, 10);
        bzdv.a(bzdgVar, 11);
        return new bzdu(a, a2, a3, a4, a5, a6, a7, a8, dbszVar, bzdgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean e(cray crayVar) {
        try {
            amuo amuoVar = crayVar.b;
            dbsk.s(amuoVar);
            dbsk.l(this.b.c() == dqvj.TRANSIT);
            dbsk.l(this.b.c == 2);
            if (this.b.G(amuoVar) == 0) {
                if (this.b.H(amuoVar)) {
                    return false;
                }
                r(d(), 2);
            } else {
                this.h.a(this, crayVar);
            }
        } catch (Exception e) {
            o(e);
        }
        return true;
    }

    @Override // defpackage.bzek
    public final eaow f() {
        cqat cqatVar = this.c;
        dbsk.s(cqatVar);
        eapd eapdVar = new eapd(cqatVar.b());
        eapd l = this.b.l(eapdVar);
        if (l == null) {
            return eaow.a;
        }
        return new eaow(eapdVar, l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final void g() {
        dbsk.l(this.d.c());
        this.g.b(new bzfq(this) { // from class: bzfk
            private final bzfl a;

            {
                this.a = this;
            }

            @Override // defpackage.bzfq
            public final void a(Object obj) {
                this.a.e((cray) obj);
            }
        }, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzek
    public final boolean i() {
        return true;
    }

    @Override // defpackage.bzek
    protected final void j(int i) {
        ddsd bZ = ddsg.q.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddsg ddsgVar = (ddsg) bZ.b;
        ddsgVar.c = i - 1;
        ddsgVar.a |= 2;
        ddsg ddsgVar2 = (ddsg) bZ.b;
        ddsgVar2.b = 3;
        int i2 = ddsgVar2.a | 1;
        ddsgVar2.a = i2;
        ddsgVar2.m = this.i.v;
        ddsgVar2.a = i2 | 4096;
        n(bZ);
        this.f.a(bZ.bK());
    }
}
