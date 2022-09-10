package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cfyo  reason: default package */
/* loaded from: classes4.dex */
public class cfyo implements cfyi {
    public final anhk a;
    public final Executor b;
    public final ges c;
    private final dxio<angp> d;
    private final dxio<afha> e;
    private final bunc f;
    private final gga g;
    private final cgak h;
    private final cfza i;
    private final cklq j;
    private final cftd k;
    private final cfzw l;
    private final cfzw m;
    private final cfta n;
    private dcdc<dwmk> o = dcdc.e();
    private boolean p = false;
    private boolean q = false;
    private String r = null;

    public cfyo(cgaf cgafVar, cftd cftdVar, cqhn cqhnVar, dxio<angp> dxioVar, dxio<afha> dxioVar2, bunc buncVar, anhk anhkVar, cklq cklqVar, gga ggaVar, Executor executor, cgak cgakVar, cfza cfzaVar, ges gesVar, cfta cftaVar) {
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = buncVar;
        this.a = anhkVar;
        this.j = cklqVar;
        this.g = ggaVar;
        this.b = executor;
        this.h = cgakVar;
        this.i = cfzaVar;
        this.c = gesVar;
        this.k = cftdVar;
        this.l = cgafVar.a(cfzaVar, gesVar);
        this.m = cgafVar.a(cfzaVar, gesVar);
        this.n = cftaVar;
    }

    public static String i(dwmk dwmkVar) {
        dwlh dwlhVar = dwmkVar.c;
        if (dwlhVar == null) {
            dwlhVar = dwlh.n;
        }
        dniu dniuVar = dwlhVar.b;
        if (dniuVar == null) {
            dniuVar = dniu.i;
        }
        return dniuVar.b;
    }

    private final cfzw l() {
        return a().booleanValue() ? this.m : this.l;
    }

    private final void m(String str) {
        dwmk n = n(str);
        if (n != null) {
            bunc buncVar = this.f;
            dwcn bZ = dwco.f.bZ();
            dwlh dwlhVar = n.c;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            dniu dniuVar = dwlhVar.b;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwco dwcoVar = (dwco) bZ.b;
            dniuVar.getClass();
            dwcoVar.b = dniuVar;
            dwcoVar.a |= 1;
            dpkx bZ2 = dpky.b.bZ();
            bZ2.a(dpla.REVIEW);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwco dwcoVar2 = (dwco) bZ.b;
            dpky bK = bZ2.bK();
            bK.getClass();
            dwcoVar2.c = bK;
            dwcoVar2.a |= 2;
            String str2 = this.a.a().d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwco dwcoVar3 = (dwco) bZ.b;
            str2.getClass();
            dwcoVar3.a |= 4;
            dwcoVar3.d = str2;
            buncVar.b(bZ.bK(), new cfyn(this), this.b);
        }
        this.h.b(str);
    }

    private final dwmk n(final String str) {
        return (dwmk) dcbg.b(this.o).r(new dbsl(str) { // from class: cfyj
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return cfyo.i((dwmk) obj).equals(this.a);
            }
        }).f();
    }

    private final void o(String str, cdhl cdhlVar) {
        akqi a = cdhlVar.a();
        if (a.equals(akqi.a) || cdhlVar.b() == null) {
            cjxu.h(this.b, this.c.H(), this.c.Rp(R.string.UGC_PLACE_PICKER_SELECT_POI));
        } else if (str.equals(a.o())) {
        } else {
            cfza cfzaVar = this.i;
            String o = a.o();
            bqjf r = bqjh.r();
            r.n(chbv.NEVER_SHOW);
            r.c(dhpj.TODO_LIST);
            bqjh o2 = r.o();
            bqji a2 = cfzaVar.b.a();
            ily ilyVar = new ily();
            ilyVar.k(o);
            ilyVar.F(cdhlVar.c());
            akqq b = cdhlVar.b();
            if (b != null) {
                ilyVar.q(b);
            }
            a2.b(bwrs.a(ilyVar.d()), o2);
            m(str);
        }
    }

    @Override // defpackage.cfyi
    public Boolean a() {
        return Boolean.valueOf(!this.p);
    }

    @Override // defpackage.cfyi
    public cfzw b() {
        return this.l;
    }

    @Override // defpackage.cfyi
    public cfzw c() {
        return this.m;
    }

    @Override // defpackage.cfyi
    public Boolean d() {
        boolean z = false;
        if (this.q && this.o.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cfyi
    public Boolean e() {
        return true;
    }

    @Override // defpackage.cfyi
    public cfyy f() {
        return new cfyz(this.c.H().getString(R.string.CREATOR_ZONE_UPSELL_CARD_TEXT), iut.a(iva.e(iup.e(R.raw.cz_upsell_card_light), iup.e(R.raw.cz_upsell_card_dark))), j(R.string.CREATOR_ZONE_UPSELL_CARD_LINK, dtxl.ea));
    }

    @Override // defpackage.cfyi
    public cfta g() {
        return this.n;
    }

    public void h(List<dwmk> list) {
        this.q = true;
        dwmk dwmkVar = null;
        dwmk dwmkVar2 = (dwmk) dcft.r(list, null);
        boolean z = false;
        if (!this.o.isEmpty() && !this.o.get(0).equals(dwmkVar2)) {
            z = true;
        }
        this.o = dcdc.r(list);
        list.isEmpty();
        if (!z) {
            (a().booleanValue() ? this.l : this.m).a(dwmkVar2);
            if (list.size() >= 2) {
                dwmkVar = list.get(1);
            }
            l().a(dwmkVar);
        } else {
            l().a(dwmkVar2);
            this.p = !this.p;
        }
        cqkx.p(this);
        this.j.c(cklt.UGC_TAB_LAYOUT);
    }

    public cfta j(int i, ddho ddhoVar) {
        return this.k.a(R.string.CREATOR_ZONE_UPSELL_CARD_LINK, ddhoVar);
    }

    public boolean k(Object obj) {
        if (obj instanceof chve) {
            chve chveVar = (chve) obj;
            chxr chxrVar = chveVar.c;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            final String str = chxrVar.b == 1 ? (String) chxrVar.c : "";
            chvd chvdVar = chvd.UNKNOWN;
            chvd b = chvd.b(chveVar.b);
            if (b == null) {
                b = chvd.UNKNOWN;
            }
            int ordinal = b.ordinal();
            if (ordinal == 1) {
                m(str);
            } else if (ordinal == 2) {
                dwjb dwjbVar = chveVar.d;
                if (dwjbVar == null) {
                    dwjbVar = dwjb.f;
                }
                dbsg<cdhl> d = cdhl.d(dwjbVar);
                if (!d.a()) {
                    dwmk n = n(str);
                    if (n != null) {
                        this.r = str;
                        ges gesVar = this.c;
                        dwlh dwlhVar = n.c;
                        if (dwlhVar == null) {
                            dwlhVar = dwlh.n;
                        }
                        dpum dpumVar = dwlhVar.d;
                        if (dpumVar == null) {
                            dpumVar = dpum.d;
                        }
                        gesVar.aZ(cdhp.g(akqq.f(dpumVar), dbpy.a));
                    }
                } else {
                    o(str, d.b());
                }
            } else if (ordinal == 3) {
                dbsg h = dcbg.b(this.o).r(new dbsl(str) { // from class: cfyk
                    private final String a;

                    {
                        this.a = str;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        return this.a.equals(cfyo.i((dwmk) obj2));
                    }
                }).h(cfyl.a);
                if (h.a()) {
                    dniu dniuVar = (dniu) h.b();
                    dvya bZ = dvyw.bv.bZ();
                    String str2 = dniuVar.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvyw dvywVar = (dvyw) bZ.b;
                    str2.getClass();
                    int i = 4 | dvywVar.a;
                    dvywVar.a = i;
                    dvywVar.g = str2;
                    String str3 = dniuVar.f;
                    str3.getClass();
                    dvywVar.a = i | 8;
                    dvywVar.h = str3;
                    dhjy bZ2 = dhjz.e.bZ();
                    dnoh dnohVar = dniuVar.g;
                    if (dnohVar == null) {
                        dnohVar = dnoh.d;
                    }
                    double d2 = dnohVar.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dhjz dhjzVar = (dhjz) bZ2.b;
                    dhjzVar.a = 2 | dhjzVar.a;
                    dhjzVar.c = d2;
                    dnoh dnohVar2 = dniuVar.g;
                    if (dnohVar2 == null) {
                        dnohVar2 = dnoh.d;
                    }
                    double d3 = dnohVar2.c;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dhjz dhjzVar2 = (dhjz) bZ2.b;
                    dhjzVar2.a |= 1;
                    dhjzVar2.b = d3;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dvyw dvywVar2 = (dvyw) bZ.b;
                    dhjz bK = bZ2.bK();
                    bK.getClass();
                    dvywVar2.e = bK;
                    dvywVar2.a |= 1;
                    this.d.a().g(dbpy.a, dbpy.a, bZ.bK(), dbpy.a, dnqh.p, dbpy.a, dbsg.i(new cfym(this)));
                    m(str);
                }
            } else if (ordinal == 4) {
                this.e.a().k(this.g, cjxr.w("https://support.google.com/maps/?p=suggested_places"), 1);
            }
            return true;
        } else if (obj instanceof cdil) {
            cdil cdilVar = (cdil) obj;
            String str4 = this.r;
            if (str4 != null) {
                o(str4, cdilVar.a());
                this.r = null;
            }
            return true;
        } else if (!(obj instanceof aeuf)) {
            return false;
        } else {
            aeuf aeufVar = (aeuf) obj;
            String str5 = this.r;
            if (str5 != null) {
                o(str5, cdhl.e(aeufVar));
                this.r = null;
            }
            return true;
        }
    }
}
