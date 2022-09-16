package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bewf  reason: default package */
/* loaded from: classes3.dex */
public class bewf implements bewc, dbsz {
    private final abhl a;
    private final aczx b;
    private final adac c;
    private final awvy d;
    @dzsi
    private awwb f;
    @dzsi
    private bvpj<awwb> g;
    private List<dxio<? extends aczy<? extends aczr>>> h = new ArrayList();
    private cjtd e = cjtd.b;

    public bewf(abhl abhlVar, aczx aczxVar, cqhn cqhnVar, adac adacVar, awvy awvyVar) {
        this.b = aczxVar;
        this.a = abhlVar;
        this.c = adacVar;
        this.d = awvyVar;
    }

    @Override // defpackage.bewc
    public List<cqix<?>> b() {
        return this.b.a(dchl.k(this.h, bewe.a), this.f, ckdg.a);
    }

    @Override // defpackage.bewc
    public cjtd c() {
        return this.e;
    }

    @Override // defpackage.dbsz
    /* renamed from: d */
    public void NU(awwb awwbVar) {
        this.f = awwbVar;
        this.c.b(awwbVar, adaa.a(dchl.k(this.h, bewd.a)), true);
        bvrj.UI_THREAD.c();
        cqkx.p(this);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        cjtd cjtdVar;
        ilo c = bwrsVar.c();
        dhjx ak = c != null ? c.ak() : null;
        if (c != null && ak != null) {
            this.g = bvpj.b(this);
            final abhl abhlVar = this.a;
            abhlVar.j = c;
            ArrayList arrayList = new ArrayList();
            Map<dkss, dxio<? extends aczy<? extends aczr>>> a = abhlVar.a.a();
            a.put(dkss.GEO_VERTICALS, btsp.b(new dbty(abhlVar) { // from class: abhg
                private final abhl a;

                {
                    this.a = abhlVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    abhl abhlVar2 = this.a;
                    return abhlVar2.d.a(abhlVar2.a());
                }
            }));
            a.put(dkss.NEARBY_PLACE_SETS, btsp.b(new dbty(abhlVar) { // from class: abhh
                private final abhl a;

                {
                    this.a = abhlVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    abhl abhlVar2 = this.a;
                    return abhlVar2.e.a(abhlVar2.a());
                }
            }));
            if (abhlVar.b.h() && abhlVar.j != null) {
                a.put(dkss.NEARBY_HOTELS, btsp.b(new dbty(abhlVar) { // from class: abhi
                    private final abhl a;

                    {
                        this.a = abhlVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        abhl abhlVar2 = this.a;
                        adca adcaVar = abhlVar2.f;
                        ilo iloVar = abhlVar2.j;
                        dbsk.s(iloVar);
                        abfa a2 = adcaVar.a.a();
                        adca.a(a2, 1);
                        adgs a3 = adcaVar.b.a();
                        adca.a(a3, 2);
                        adca.a(iloVar, 3);
                        return new adbz(a2, a3, iloVar);
                    }
                }));
            }
            if (abhlVar.b.n() && abhlVar.j != null) {
                a.put(dkss.PERSONAL_INTEREST_PLACES, btsp.b(new dbty(abhlVar) { // from class: abhj
                    private final abhl a;

                    {
                        this.a = abhlVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        abhl abhlVar2 = this.a;
                        adit aditVar = abhlVar2.h;
                        abse a2 = abhlVar2.a();
                        ilo iloVar = abhlVar2.j;
                        dbsk.s(iloVar);
                        abfa a3 = aditVar.a.a();
                        adit.a(a3, 1);
                        acyr a4 = aditVar.b.a();
                        adit.a(a4, 2);
                        adiz a5 = aditVar.c.a();
                        adit.a(a5, 3);
                        akfa a6 = aditVar.d.a();
                        adit.a(a6, 4);
                        adit.a(a2, 5);
                        adit.a(iloVar, 6);
                        return new adis(a3, a4, a5, a6, a2, iloVar);
                    }
                }));
            }
            if (abhlVar.j != null) {
                a.put(dkss.AREA_QUESTIONS_AND_ANSWERS, btsp.b(new dbty(abhlVar) { // from class: abhk
                    private final abhl a;

                    {
                        this.a = abhlVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        abhl abhlVar2 = this.a;
                        adkd adkdVar = abhlVar2.g;
                        ilo iloVar = abhlVar2.j;
                        dbsk.s(iloVar);
                        acyr a2 = adkdVar.a.a();
                        adkd.a(a2, 1);
                        adjy a3 = adkdVar.b.a();
                        adkd.a(a3, 2);
                        adkd.a(iloVar, 3);
                        return new adkc(a2, a3, iloVar);
                    }
                }));
            }
            if (abhlVar.b.p()) {
                a.put(dkss.CRISIS, abhlVar.i);
            }
            arrayList.addAll(abil.c(a, ((adza) abhlVar.c).b.a().d.a()));
            this.h = arrayList;
            awvy awvyVar = this.d;
            awvw f = awvx.f();
            f.b(ak);
            awws u = awwt.u();
            u.t(dcdc.f("area_explore"));
            u.d(adaa.b(this.h));
            u.g(c.ai());
            f.e(u.a());
            awvx a2 = f.a();
            bvpj<awwb> bvpjVar = this.g;
            dbsk.s(bvpjVar);
            awvyVar.c(a2, bvpjVar, bvrj.UI_THREAD);
        }
        if (c != null) {
            cjta c2 = cjtd.c(c.bZ());
            c2.d = dtxy.hq;
            cjtdVar = c2.a();
        } else {
            cjtdVar = cjtd.b;
        }
        this.e = cjtdVar;
    }

    @Override // defpackage.bega
    public void u() {
        bvpj<awwb> bvpjVar = this.g;
        if (bvpjVar != null) {
            bvpjVar.c();
            this.g = null;
            this.h = new ArrayList();
        }
        this.f = null;
        this.e = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
