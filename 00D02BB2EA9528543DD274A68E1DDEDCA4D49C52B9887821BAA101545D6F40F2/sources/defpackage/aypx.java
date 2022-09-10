package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
/* compiled from: PG */
/* renamed from: aypx  reason: default package */
/* loaded from: classes3.dex */
public class aypx implements aymt, ayfi {
    public final ayfk a;
    public final aybl b;
    public final dzsj<ayfn> c;
    public final axwg d;
    public dcdc<baal> e;
    private final gga f;
    private final ayqb g;
    private final jkf h;
    private final batm i;
    private final axwi j;
    private final btvo k;
    private final bwrs<baad> l;
    private final ayng m;
    private final ayms n;
    private final ayqg o;
    @dzsi
    private jmk p;

    public aypx(gga ggaVar, ayfl ayflVar, aynh aynhVar, aybl ayblVar, ayqc ayqcVar, jkf jkfVar, aypp ayppVar, dzsj<ayfn> dzsjVar, batm batmVar, axwi axwiVar, ayqh ayqhVar, btvo btvoVar, axwg axwgVar, bwrs<baad> bwrsVar) {
        this.e = dcdc.e();
        this.f = ggaVar;
        this.m = aynhVar.a(this);
        this.b = ayblVar;
        this.h = jkfVar;
        this.c = dzsjVar;
        this.i = batmVar;
        this.j = axwiVar;
        this.l = bwrsVar;
        this.k = btvoVar;
        this.d = axwgVar;
        baad c = bwrsVar.c();
        if (c != null) {
            this.e = dcbg.b(ayblVar.a(c)).o(aypq.a).z();
        }
        ayfk a = ayflVar.a(c, this);
        this.a = a;
        a.i(this.e);
        this.g = ayqcVar.a(c, a);
        gga a2 = ayppVar.a.a();
        aypp.a(a2, 1);
        aymh a3 = ayppVar.b.a();
        aypp.a(a3, 2);
        dxio a4 = ((dxjh) ayppVar.c).a();
        aypp.a(a4, 3);
        axwi a5 = ayppVar.d.a();
        aypp.a(a5, 4);
        axwq a6 = ayppVar.e.a();
        aypp.a(a6, 5);
        akfa a7 = ayppVar.f.a();
        aypp.a(a7, 6);
        akfc a8 = ayppVar.g.a();
        aypp.a(a8, 7);
        bvrb a9 = ayppVar.h.a();
        aypp.a(a9, 8);
        ayay a10 = ayppVar.i.a();
        aypp.a(a10, 9);
        aypp.a(ayppVar.j.a(), 10);
        ayrf a11 = ayppVar.k.a();
        aypp.a(a11, 11);
        ayak a12 = ayppVar.l.a();
        aypp.a(a12, 12);
        ayor a13 = ayppVar.m.a();
        aypp.a(a13, 13);
        aypp.a(ayppVar.n.a(), 14);
        axwg a14 = ayppVar.o.a();
        aypp.a(a14, 15);
        dxio a15 = ((dxjh) ayppVar.p).a();
        aypp.a(a15, 16);
        aydl a16 = ayppVar.q.a();
        aypp.a(a16, 17);
        bwqv a17 = ayppVar.r.a();
        aypp.a(a17, 18);
        axze a18 = ayppVar.s.a();
        aypp.a(a18, 19);
        cqkj a19 = ayppVar.t.a();
        aypp.a(a19, 20);
        ceet a20 = ayppVar.u.a();
        aypp.a(a20, 21);
        btvo a21 = ayppVar.v.a();
        aypp.a(a21, 22);
        aypp.a(bwrsVar, 23);
        this.n = new aypo(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, bwrsVar);
        gga a22 = ayqhVar.a.a();
        ayqh.a(a22, 1);
        ckcw a23 = ayqhVar.b.a();
        ayqh.a(a23, 2);
        ayrm a24 = ayqhVar.c.a();
        ayqh.a(a24, 3);
        btvo a25 = ayqhVar.d.a();
        ayqh.a(a25, 4);
        ayqh.a(ayqhVar.e.a(), 5);
        ayqg ayqgVar = new ayqg(a22, a23, a24, a25, bwrsVar);
        this.o = ayqgVar;
        ayqgVar.d();
        if (axwgVar.c()) {
            dzsjVar.a().d(this);
        }
        w();
    }

    private final void w() {
        this.g.t(dcbg.b(this.e).s(aypr.a).z());
    }

    @Override // defpackage.aymt
    public String a() {
        return v().E(this.f.getApplicationContext());
    }

    @Override // defpackage.aymt
    public List<aymp> b() {
        dcdc<baal> dcdcVar = this.e;
        final ayfk ayfkVar = this.a;
        final ayng ayngVar = this.m;
        dcbg b = dcbg.b(dcdcVar);
        ayfkVar.getClass();
        return b.o(new dbsl(ayfkVar) { // from class: aypt
            private final ayfk a;

            {
                this.a = ayfkVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.d((baal) obj);
            }
        }).s(new dbrn(ayngVar, ayfkVar) { // from class: aypu
            private final ayng a;
            private final ayfk b;

            {
                this.a = ayngVar;
                this.b = ayfkVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ayfb f;
                akqq akqqVar;
                ayng ayngVar2 = this.a;
                ayfk ayfkVar2 = this.b;
                baal baalVar = (baal) obj;
                baalVar.getClass();
                baaj baajVar = baaj.PLACE;
                int ordinal = baalVar.x().ordinal();
                if (ordinal == 0) {
                    baak z = baalVar.z();
                    dbsk.s(z);
                    f = ayfkVar2.f(z.a());
                } else if (ordinal == 1) {
                    baai A = baalVar.A();
                    dbsk.s(A);
                    f = ayfkVar2.g(A.a());
                } else {
                    String valueOf = String.valueOf(baalVar.x());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("Unsupported item type: ");
                    sb.append(valueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                ayfb ayfbVar = f;
                int ordinal2 = baalVar.x().ordinal();
                if (ordinal2 == 0) {
                    baak z2 = baalVar.z();
                    dbsk.s(z2);
                    akqi a = z2.a();
                    akqq b2 = z2.b();
                    azxb f2 = azxb.f(a, b2);
                    ayoi ayoiVar = ayngVar2.a.get(f2);
                    if (ayoiVar == null) {
                        ayoi a2 = ayngVar2.d.a(baalVar, ayngVar2.c.a(), ayngVar2.c.h(), ayngVar2.c.d().intValue(), ayfbVar, batx.a(ayngVar2.f, b2), ayfkVar2);
                        ayngVar2.a.put(f2, a2);
                        return a2;
                    }
                    ayoiVar.y(baalVar);
                    ayoiVar.m = ayfkVar2;
                    return ayoiVar;
                } else if (ordinal2 == 1) {
                    azxb a3 = baalVar.a();
                    ayoi ayoiVar2 = ayngVar2.a.get(a3);
                    if (ayoiVar2 != null) {
                        return ayoiVar2;
                    }
                    ayoj ayojVar = ayngVar2.d;
                    String a4 = ayngVar2.c.a();
                    drcs h = ayngVar2.c.h();
                    int intValue = ayngVar2.c.d().intValue();
                    GmmLocation gmmLocation = ayngVar2.f;
                    if (baalVar.z() != null) {
                        baak z3 = baalVar.z();
                        dbsk.s(z3);
                        akqqVar = z3.b();
                    } else {
                        akqqVar = null;
                    }
                    ayoi a5 = ayojVar.a(baalVar, a4, h, intValue, ayfbVar, batx.a(gmmLocation, akqqVar), null);
                    ayngVar2.a.put(a3, a5);
                    return a5;
                } else {
                    String valueOf2 = String.valueOf(baalVar.x());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
                    sb2.append("Cannot create PlaceListDetailsItemViewModel for unsupported item type: ");
                    sb2.append(valueOf2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }).o(aypv.a).z();
    }

    @Override // defpackage.aymt
    public Boolean c() {
        return this.a.c();
    }

    @Override // defpackage.aymt
    public Integer d() {
        return Integer.valueOf(v().k());
    }

    @Override // defpackage.ayfi
    public void e(ayfk ayfkVar) {
        n();
    }

    @Override // defpackage.ayfi
    public void f(ayfk ayfkVar) {
        this.i.a(new Runnable(this) { // from class: ayps
            private final aypx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aypx aypxVar = this.a;
                if (aypxVar.e.size() <= 25) {
                    dcdc<baal> dcdcVar = aypxVar.e;
                    final ayfk ayfkVar2 = aypxVar.a;
                    ayfkVar2.getClass();
                    if (dcft.k(dcdcVar, new dbsl(ayfkVar2) { // from class: aypw
                        private final ayfk a;

                        {
                            this.a = ayfkVar2;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.d((baal) obj);
                        }
                    })) {
                        aypxVar.e = dcdc.r(aypxVar.b.a(aypxVar.v()));
                    }
                }
                aypxVar.n();
                if (aypxVar.d.c()) {
                    aypxVar.c.a().d(aypxVar);
                }
            }
        });
    }

    @Override // defpackage.ayfi
    public void g(ayfk ayfkVar) {
    }

    @Override // defpackage.aymt
    public drcs h() {
        return baae.a(v().t());
    }

    @Override // defpackage.aymt
    public cqqw i() {
        if (!this.d.c()) {
            return this.a;
        }
        if (this.p == null) {
            this.p = new jmk(this.a, this.c.a());
        }
        return this.p;
    }

    @Override // defpackage.aymt
    public void j() {
        this.e = dcdc.r(this.b.a(v()));
        if (this.d.c()) {
            this.c.a().d(this);
        }
        k();
        w();
    }

    @Override // defpackage.aymt
    public void k() {
        this.a.i(this.e);
    }

    @Override // defpackage.aymt
    public void l() {
        bnju h;
        ayfk ayfkVar = this.a;
        List<baal> list = ayfkVar.l;
        if (list != null) {
            for (baal baalVar : list) {
                baak z = baalVar.z();
                if (z != null && (h = ayfkVar.h(z.a())) != null) {
                    bnjs aK = h.aK();
                    aK.j = baalVar.e();
                    aK.k = baalVar.g();
                    ayfkVar.d.d(azxb.f(z.a(), z.b()), aK.a());
                }
            }
        }
    }

    @Override // defpackage.aymt
    public void m() {
        this.a.j();
    }

    @Override // defpackage.aymt
    public void n() {
        cqkx.p(this);
    }

    @Override // defpackage.aymt
    public bfkk o() {
        return this.g;
    }

    @Override // defpackage.aymt
    public cqkl p() {
        if (this.d.c()) {
            this.c.a().e();
        } else {
            this.h.setExpandingStateTransition(jkc.d, jkc.d, true);
            this.h.B(jjn.HIDDEN);
        }
        return cqkl.a;
    }

    @Override // defpackage.aymt
    public ayms q() {
        return this.n;
    }

    @Override // defpackage.aymt
    public void r(bdhk bdhkVar) {
        if (this.f.z(bdgy.class) != null) {
            this.f.g().f();
        }
        bdhg b = bdhkVar.b();
        dbsk.s(b);
        azxb f = azxb.f(akqi.b(b.a()), null);
        baad v = v();
        baal d = v.d(f);
        if (d != null) {
            d.i((dwfl) dcft.r(bdhkVar.d(), null));
            this.j.j(v);
            n();
        }
    }

    @Override // defpackage.aymt
    public Boolean s() {
        boolean z = false;
        if (!this.k.getPlaceListsParameters().d || c().booleanValue()) {
            return false;
        }
        if (d().intValue() >= 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aymt
    public aymv t() {
        return this.o;
    }

    @Override // defpackage.aymt
    public Boolean u() {
        btpf c = btpf.c(this.f);
        boolean z = false;
        if (this.d.c() && !c.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final baad v() {
        baad c = this.l.c();
        dbsk.s(c);
        return c;
    }
}
