package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfth  reason: default package */
/* loaded from: classes3.dex */
public class bfth implements bftb, bega {
    public static final iif a;
    public static final igu b;
    private static final cqtv c;
    private final aehr d;
    private final aeiu e;
    @dzsi
    private bwrs<ilo> f;

    static {
        cqsv c2 = cqsv.c(ibn.o(), ibn.o(), cqrp.d(48.0d), ibn.o());
        c = c2;
        iie q = iif.t().q();
        q.f(cqrp.d(dcyn.a));
        q.c(cqrp.d(3.0d));
        q.e(c2);
        q.d(c2);
        q.i(cqrp.d(dcyn.a));
        q.h(ibm.Z());
        a = q.a();
        igt i = igu.i();
        i.c(c2);
        i.b(c2);
        b = i.a();
    }

    public bfth(final btvo btvoVar, final gga ggaVar, aehr aehrVar, final Resources resources, aeiv aeivVar, final dxio<begg> dxioVar, final dxio<brba> dxioVar2) {
        aeir aeirVar;
        this.d = aehrVar;
        bftg bftgVar = new bftg(resources, new aeim(this, dxioVar2, resources, btvoVar) { // from class: bftc
            private final bfth a;
            private final dxio b;
            private final Resources c;
            private final btvo d;

            {
                this.a = this;
                this.b = dxioVar2;
                this.c = resources;
                this.d = btvoVar;
            }

            @Override // defpackage.aeim
            public final void a(cjqm cjqmVar) {
                this.a.b(this.b, this.c, cjqmVar, dbpy.a, this.d);
            }
        });
        igr h = igs.h();
        ife ifeVar = (ife) h;
        ifeVar.a = resources.getString(R.string.ALTERNATIVE_HOTELS_HEADER);
        ifeVar.b = b;
        igq b2 = h.b();
        aeim aeimVar = new aeim(this, dxioVar2, resources, btvoVar) { // from class: bftd
            private final bfth a;
            private final dxio b;
            private final Resources c;
            private final btvo d;

            {
                this.a = this;
                this.b = dxioVar2;
                this.c = resources;
                this.d = btvoVar;
            }

            @Override // defpackage.aeim
            public final void a(cjqm cjqmVar) {
                this.a.b(this.b, this.c, cjqmVar, dbpy.a, this.d);
            }
        };
        if (c(btvoVar)) {
            aeirVar = new aeir(this, dxioVar2, resources, btvoVar) { // from class: bfte
                private final bfth a;
                private final dxio b;
                private final Resources c;
                private final btvo d;

                {
                    this.a = this;
                    this.b = dxioVar2;
                    this.c = resources;
                    this.d = btvoVar;
                }

                @Override // defpackage.aeir
                public final void a(ilo iloVar, cjqm cjqmVar) {
                    this.a.b(this.b, this.c, cjqmVar, dbsg.i(iloVar), this.d);
                }
            };
        } else {
            aeirVar = new aeir(dxioVar, ggaVar, dxioVar2, btvoVar) { // from class: bftf
                private final dxio a;
                private final gga b;
                private final dxio c;
                private final btvo d;

                {
                    this.a = dxioVar;
                    this.b = ggaVar;
                    this.c = dxioVar2;
                    this.d = btvoVar;
                }

                @Override // defpackage.aeir
                public final void a(ilo iloVar, cjqm cjqmVar) {
                    dxio dxioVar3 = this.a;
                    gga ggaVar2 = this.b;
                    dxio dxioVar4 = this.c;
                    btvo btvoVar2 = this.d;
                    begj begjVar = new begj();
                    begjVar.b(iloVar);
                    begjVar.c = jjn.EXPANDED;
                    begjVar.n = true;
                    begg beggVar = (begg) dxioVar3.a();
                    gfw gfwVar = null;
                    if (ggaVar2.K() instanceof ges) {
                        boolean i = btvoVar2.getHotelBookingModuleParameters().i();
                        ges gesVar = (ges) ggaVar2.K();
                        brlk G = ((brba) dxioVar4.a()).G();
                        if (G != null && G.e() != null) {
                            brlu e = G.e();
                            dbsk.s(e);
                            if (e.n(iloVar) >= 0) {
                                dbsk.s(gesVar);
                                gfwVar = gesVar.ba();
                            }
                        }
                        if (i) {
                            gfwVar = gesVar;
                        }
                    }
                    beggVar.o(begjVar, false, gfwVar);
                }
            };
        }
        iif iifVar = a;
        dbsg<igq> j = dbsg.j(b2);
        aeis d = aeit.d();
        aeik aeikVar = (aeik) d;
        aeikVar.a = dtxj.aV;
        aeikVar.b = c(btvoVar) ? dtxj.aY : dtxj.aW;
        aeikVar.c = dtxj.aX;
        this.e = aeivVar.a(aeimVar, aeirVar, iifVar, j, bftgVar, 5, d.a(), false);
    }

    private static boolean c(btvo btvoVar) {
        return btvoVar.getHotelBookingModuleParameters().f();
    }

    @Override // defpackage.bftb
    public aeii a() {
        return this.e;
    }

    public final void b(dxio<brba> dxioVar, Resources resources, cjqm cjqmVar, dbsg<ilo> dbsgVar, btvo btvoVar) {
        iqy iqyVar;
        dbsk.s(this.f);
        ilo c2 = this.f.c();
        if (c2 != null && c2.bS().a()) {
            dnng b2 = c2.bS().b();
            dwim bZ = dwir.R.bZ();
            String string = resources.getString(R.string.CATEGORICAL_HOTEL_QUERY);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar = (dwir) bZ.b;
            string.getClass();
            dwirVar.a |= 1;
            dwirVar.c = string;
            dnqg bZ2 = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            if (cjqmVar.a().a()) {
                String b3 = cjqmVar.a().b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ2.b;
                b3.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b3;
                doeh bZ3 = doei.d.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                doei doeiVar = (doei) bZ3.b;
                b3.getClass();
                doeiVar.a |= 4;
                doeiVar.c = b3;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dnqh dnqhVar3 = (dnqh) bZ2.b;
                doei bK = bZ3.bK();
                bK.getClass();
                dnqhVar3.m = bK;
                dnqhVar3.a |= 262144;
            }
            dnqh bK2 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar2 = (dwir) bZ.b;
            bK2.getClass();
            dwirVar2.s = bK2;
            dwirVar2.a |= 33554432;
            if (c2.ak() != null) {
                dhjx ak = c2.ak();
                dbsk.s(ak);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar3 = (dwir) bZ.b;
                ak.getClass();
                dwirVar3.d = ak;
                dwirVar3.a |= 2;
            }
            if (this.d.i()) {
                dnyc bZ4 = dnzj.Z.bZ();
                dnnn dnnnVar = b2.b;
                if (dnnnVar == null) {
                    dnnnVar = dnnn.l;
                }
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dnzj dnzjVar = (dnzj) bZ4.b;
                dnnnVar.getClass();
                dnzjVar.d = dnnnVar;
                dnzjVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar4 = (dwir) bZ.b;
                dnzj bK3 = bZ4.bK();
                bK3.getClass();
                dwirVar4.t = bK3;
                dwirVar4.a |= 67108864;
            }
            dndv dndvVar = b2.o;
            if (dndvVar == null) {
                dndvVar = dndv.d;
            }
            if ((dndvVar.a & 1) != 0) {
                dndv dndvVar2 = b2.o;
                if (dndvVar2 == null) {
                    dndvVar2 = dndv.d;
                }
                dspd dspdVar = dndvVar2.c;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar5 = (dwir) bZ.b;
                dspdVar.getClass();
                dwirVar5.b |= 16777216;
                dwirVar5.P = dspdVar;
            }
            if (c(btvoVar)) {
                iqyVar = new iqy();
                iqyVar.d = iqx.TRAVERSAL;
                if (dbsgVar.a()) {
                    iqyVar.c(dbsgVar.b());
                }
            } else {
                iqyVar = null;
            }
            dxioVar.a().r(bZ);
            dxioVar.a().s(bZ.bK(), iqyVar);
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.f = bwrsVar;
        ilo c2 = bwrsVar.c();
        if (c2 == null) {
            u();
            return;
        }
        this.e.f(c2.cS(this.d.i()));
    }

    @Override // defpackage.bega
    public void u() {
        this.f = null;
        this.e.g();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return this.e.a();
    }
}
