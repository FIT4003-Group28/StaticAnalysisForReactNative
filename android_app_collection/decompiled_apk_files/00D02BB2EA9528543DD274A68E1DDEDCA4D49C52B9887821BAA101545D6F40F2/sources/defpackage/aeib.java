package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: aeib  reason: default package */
/* loaded from: classes2.dex */
public final class aeib implements aeic, bsks {
    public static final /* synthetic */ int a = 0;
    private static final dspd b;
    private static final dspd c;
    private final gn d;
    private final dxio<aehr> e;
    private final dxio<aeht> f;
    private final dxio<akox> g;
    private final Resources h;
    private final dxio<brba> i;
    private final djnk j;
    private dbsg<acwt> k = dbpy.a;
    private dbsg<dnnn> l = dbpy.a;
    private dbsg<dspd> m = dbpy.a;
    private dbsg<gfw> n = dbpy.a;
    private dbsg<aeiy> o = dbpy.a;
    private bsjm p = new bsjm();

    static {
        djmu bZ = djmv.c.bZ();
        djnp bZ2 = djnr.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnr djnrVar = (djnr) bZ2.b;
        djnrVar.b = 3;
        djnrVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djnr bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 10;
        b = bZ.bK().bR();
        djmu bZ3 = djmv.c.bZ();
        djns bZ4 = djny.c.bZ();
        djnx djnxVar = djnx.TOP_RATED;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djny djnyVar = (djny) bZ4.b;
        djnyVar.b = Integer.valueOf(djnxVar.c);
        djnyVar.a = 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djmv djmvVar2 = (djmv) bZ3.b;
        djny bK2 = bZ4.bK();
        bK2.getClass();
        djmvVar2.b = bK2;
        djmvVar2.a = 2;
        c = bZ3.bK().bR();
    }

    public aeib(gga ggaVar, dxio<aehr> dxioVar, dxio<aeht> dxioVar2, dxio<akox> dxioVar3, dxio<brba> dxioVar4) {
        this.d = ggaVar.g();
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
        this.h = ggaVar.getResources();
        this.i = dxioVar4;
        Resources resources = ggaVar.getResources();
        djnj bZ = djnk.f.bZ();
        bZ.b(k(resources));
        bZ.c(l(resources));
        bZ.c(m(resources));
        dspd dspdVar = dspd.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djnk djnkVar = (djnk) bZ.b;
        dspdVar.getClass();
        djnkVar.a |= 1;
        djnkVar.e = dspdVar;
        djnk bK = bZ.bK();
        this.j = bK;
        this.p.a(bK);
    }

    private static djkq k(Resources resources) {
        djkq bZ = djkr.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkr djkrVar = (djkr) bZ.b;
        djkrVar.b = 17;
        djkrVar.a |= 1;
        djks bZ2 = djkt.e.bZ();
        String string = resources.getString(R.string.SEARCH_SORT_HOTEL_LOWEST_PRICE);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djkt djktVar = (djkt) bZ2.b;
        string.getClass();
        djktVar.a |= 1;
        djktVar.b = string;
        dspd dspdVar = b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djkt djktVar2 = (djkt) bZ2.b;
        dspdVar.getClass();
        djktVar2.a |= 2;
        djktVar2.c = dspdVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djkr djkrVar2 = (djkr) bZ.b;
        djkt bK = bZ2.bK();
        bK.getClass();
        dsrj<djkt> dsrjVar = djkrVar2.c;
        if (!dsrjVar.a()) {
            djkrVar2.c = dsqw.cl(dsrjVar);
        }
        djkrVar2.c.add(bK);
        return bZ;
    }

    private static djmg l(Resources resources) {
        djmg bZ = djml.j.bZ();
        dspd dspdVar = b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar = (djml) bZ.b;
        dspdVar.getClass();
        int i = djmlVar.a | 1;
        djmlVar.a = i;
        djmlVar.b = dspdVar;
        djmlVar.a = i | 2;
        djmlVar.c = 17;
        djml djmlVar2 = (djml) bZ.b;
        djmlVar2.d = 1;
        djmlVar2.a |= 4;
        String string = resources.getString(R.string.SEARCH_SORT_HOTEL_LOWEST_PRICE);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar3 = (djml) bZ.b;
        string.getClass();
        djmlVar3.a |= 8;
        djmlVar3.e = string;
        djmk djmkVar = djmk.SHOW_AS_VALUE_SELECTOR;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar4 = (djml) bZ.b;
        djmlVar4.g = djmkVar.e;
        djmlVar4.a |= 32;
        return bZ;
    }

    private static djmg m(Resources resources) {
        djmg bZ = djml.j.bZ();
        dspd dspdVar = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar = (djml) bZ.b;
        dspdVar.getClass();
        int i = djmlVar.a | 1;
        djmlVar.a = i;
        djmlVar.b = dspdVar;
        djmlVar.a = i | 2;
        djmlVar.c = 2;
        djml djmlVar2 = (djml) bZ.b;
        djmlVar2.d = 1;
        djmlVar2.a |= 4;
        String string = resources.getString(R.string.RESTRICTION_USER_RATING_TOP_RATED);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar3 = (djml) bZ.b;
        string.getClass();
        djmlVar3.a |= 8;
        djmlVar3.e = string;
        djmk djmkVar = djmk.ALWAYS_SHOW;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djml djmlVar4 = (djml) bZ.b;
        djmlVar4.g = djmkVar.e;
        djmlVar4.a |= 32;
        return bZ;
    }

    private static djni n(int i, dspd dspdVar) {
        djnf bZ = djni.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djni djniVar = (djni) bZ.b;
        djniVar.a |= 1;
        djniVar.b = i;
        djng bZ2 = djnh.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djnh djnhVar = (djnh) bZ2.b;
        dspdVar.getClass();
        djnhVar.a |= 1;
        djnhVar.b = dspdVar;
        bZ.a(bZ2);
        return bZ.bK();
    }

    @Override // defpackage.aeic
    public final void a(djrm djrmVar) {
        this.p.o(null);
        this.l = dbpy.a;
        this.m = dbsg.i(djrmVar.s);
        if (!djrmVar.e.isEmpty() && (djrmVar.e.get(0).b & 1024) != 0) {
            dnng dnngVar = djrmVar.e.get(0).X;
            if (dnngVar == null) {
                dnngVar = dnng.r;
            }
            if (aehr.b(dnngVar)) {
                dnnn dnnnVar = dnngVar.b;
                if (dnnnVar == null) {
                    dnnnVar = dnnn.l;
                }
                dbsg<dnnn> i = dbsg.i(dnnnVar);
                this.l = i;
                this.p.o(i.b());
            }
        }
        if (this.o.a()) {
            this.o.b().a(this.p);
        }
    }

    @Override // defpackage.aeic
    public final void b(gfw gfwVar) {
        this.n = dbsg.i(gfwVar);
    }

    @Override // defpackage.aeic
    public final void c(dbsg<aeiy> dbsgVar) {
        this.o = dbsgVar;
    }

    @Override // defpackage.aeic
    public final void d(@dzsi acwt acwtVar) {
        this.k = dbsg.j(acwtVar);
    }

    @Override // defpackage.aeic
    public final void e(cjqm cjqmVar, bsjm bsjmVar) {
        this.p = bsjmVar;
        f(cjqmVar, dbpy.a, true);
    }

    @Override // defpackage.aeic
    public final void f(cjqm cjqmVar, dbsg<ilo> dbsgVar, boolean z) {
        if (this.k.a()) {
            this.k.b().a();
        }
        dwim bZ = dwir.R.bZ();
        String string = this.h.getString(R.string.EXPLORE_NEARBY_HOTELS_QUERY);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        string.getClass();
        dwirVar.a |= 1;
        dwirVar.c = string;
        dhjx aa = this.g.a().aa();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        aa.getClass();
        dwirVar2.d = aa;
        dwirVar2.a |= 2;
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
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ2.b;
            b2.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b2;
            doeh bZ3 = doei.d.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            doei doeiVar = (doei) bZ3.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
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
        dwir dwirVar3 = (dwir) bZ.b;
        bK2.getClass();
        dwirVar3.s = bK2;
        dwirVar3.a |= 33554432;
        if (this.m.a()) {
            dspd b3 = this.m.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwir dwirVar4 = (dwir) bZ.b;
            b3.getClass();
            dwirVar4.b |= 16777216;
            dwirVar4.P = b3;
        }
        if (z) {
            dnnn n = this.p.n();
            dwix m = this.p.m();
            if (n != null && m != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwir dwirVar5 = (dwir) bZ.b;
                m.getClass();
                dwirVar5.w = m;
                dwirVar5.a |= 536870912;
                if (this.e.a().i()) {
                    dnyc bZ4 = dnzj.Z.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dnzj dnzjVar = (dnzj) bZ4.b;
                    n.getClass();
                    dnzjVar.d = n;
                    dnzjVar.a |= 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwir dwirVar6 = (dwir) bZ.b;
                    dnzj bK3 = bZ4.bK();
                    bK3.getClass();
                    dwirVar6.t = bK3;
                    dwirVar6.a |= 67108864;
                } else {
                    this.f.a().b(n);
                }
                djnk b4 = this.p.b();
                djnk djnkVar = null;
                if (!b4.equals(djnk.f) && !b4.equals(this.j)) {
                    dbsg r = dcbg.b(b4.c).r(aeia.a);
                    if (r.a()) {
                        int i2 = ((djni) r.b()).b;
                        dspd dspdVar = ((djni) r.b()).c.get(0).b;
                        dspd dspdVar2 = b;
                        if (!dspdVar.equals(dspdVar2) || i2 != 17) {
                            dspd dspdVar3 = c;
                            if (dspdVar.equals(dspdVar3) && i2 == 2) {
                                djnj bZ5 = djnk.f.bZ();
                                bZ5.c(m(this.h));
                                bZ5.a(n(2, dspdVar3));
                                djnkVar = bZ5.bK();
                            }
                        } else {
                            djnj bZ6 = djnk.f.bZ();
                            bZ6.b(k(this.h));
                            bZ6.c(l(this.h));
                            bZ6.a(n(17, dspdVar2));
                            djnkVar = bZ6.bK();
                        }
                    }
                }
                if (djnkVar != null) {
                    djmw bZ7 = djmy.e.bZ();
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    djmy djmyVar = (djmy) bZ7.b;
                    djmyVar.c = 2;
                    int i3 = djmyVar.a | 2;
                    djmyVar.a = i3;
                    djnkVar.getClass();
                    djmyVar.b = djnkVar;
                    djmyVar.a = i3 | 1;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dwir dwirVar7 = (dwir) bZ.b;
                    djmy bK4 = bZ7.bK();
                    bK4.getClass();
                    dwirVar7.K = bK4;
                    dwirVar7.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                }
            }
            this.p.o(this.l.f());
            this.p.a(this.j);
            if (this.o.a()) {
                this.o.b().a(this.p);
            }
        }
        iqy iqyVar = new iqy();
        iqyVar.d = iqx.TRAVERSAL;
        if (dbsgVar.a()) {
            iqyVar.c(dbsgVar.b());
        }
        this.i.a().r(bZ);
        this.i.a().s(bZ.bK(), iqyVar);
    }

    @Override // defpackage.aeic
    public final void g() {
        this.n = dbpy.a;
    }

    @Override // defpackage.bsks
    public final void h(bsjm bsjmVar, cjqm cjqmVar) {
        e(cjqmVar, bsjmVar);
    }

    @Override // defpackage.bsks
    public final void i(int i) {
        if (!this.n.a()) {
            return;
        }
        bsaa.aJ(this.p, i).aP(this.d, this.n.b());
    }

    @Override // defpackage.aeic
    public final bsks j() {
        return this;
    }
}
