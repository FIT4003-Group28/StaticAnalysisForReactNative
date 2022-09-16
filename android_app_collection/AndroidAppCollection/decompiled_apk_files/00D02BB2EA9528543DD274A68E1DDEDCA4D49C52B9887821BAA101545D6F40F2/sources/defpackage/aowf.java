package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aowf  reason: default package */
/* loaded from: classes2.dex */
public final class aowf extends ges implements aoyk {
    private static final dcqe an = dcqe.c("aowf");
    public bwqv a;
    public aphg ad;
    public cqhu ae;
    public gek af;
    apgb ag;
    bwrs<aoxt> ah;
    bwrs<aoyg> ai;
    public bwrs<aoyg> aj;
    public bwrs<aoyg> ak;
    private cqkf<aowi> ao;
    private cqkf<jam> ap;
    private cqkf<jbk> aq;
    private cqkf<cqkp> ar;
    private aphh at;
    private apkj au;
    @dzsi
    private Parcelable av;
    public cqkj b;
    public aowl c;
    public aowy d;
    public apgc e;
    public aoxv f;
    public gga g;
    private boolean as = true;
    public Boolean al = false;
    public aoxr am = aoxr.LAST_VISIT_TIME;

    private final void aJ(cqkf<? extends cqkp> cqkfVar, @dzsi egq egqVar) {
        this.ad.a(this, cqkfVar, this.aq, egqVar, jjk.a(this.at, this.au), aozr.l(this.aq, this.ae), this.af.a(jjn.EXPANDED));
    }

    public static aowf g(bwqv bwqvVar, bwrs<aoxt> bwrsVar, bwrs<aoyg> bwrsVar2, bwrs<aoyg> bwrsVar3) {
        aowf aowfVar = new aowf();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "current_visited_country_details_ref", bwrsVar);
        bwqvVar.c(bundle, "all_visited_places_list_ref", bwrsVar2);
        bwqvVar.c(bundle, "all_visited_cities_list_ref", bwrsVar3);
        aowfVar.B(bundle);
        return aowfVar;
    }

    private final bwrs<aoyg> w(@dzsi Bundle bundle, String str) {
        try {
            bwrs<aoyg> bwrsVar = (bwrs) this.a.d(bwrs.class, bundle, str);
            if (bwrsVar != null) {
                return bwrsVar;
            }
        } catch (IOException unused) {
        }
        throw new RuntimeException("Exception during visited places list restoration");
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        aoxr aoxrVar;
        if (!(obj instanceof aoxr) || (aoxrVar = (aoxr) obj) == this.am) {
            return;
        }
        this.al = true;
        this.am = aoxrVar;
        q(true);
    }

    @Override // defpackage.aoyk
    public final void aR() {
        aZ(apew.w(this.am, dcdc.g(aoxr.LAST_VISIT_TIME, aoxr.ALPHABETICALLY)));
    }

    @Override // defpackage.aoyk
    public final Boolean aS() {
        return this.al;
    }

    @Override // defpackage.aoyk
    public final aoxr aT() {
        return this.am;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ar = this.b.c(new aowh(), viewGroup);
        this.ao = this.b.c(new aowg(), viewGroup);
        this.aq = this.b.c(new apey(), viewGroup);
        this.ap = this.b.c(new aozp(), viewGroup);
        return null;
    }

    public final dcdc<aoxt> i() {
        aoyg c = this.aj.c();
        dbsk.s(c);
        return dcdc.r(dcbg.b(c.d()).o(new dbsl(this) { // from class: aowc
            private final aowf a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aowf aowfVar = this.a;
                dqdt dqdtVar = ((aoxt) obj).f().a;
                if (dqdtVar == null) {
                    dqdtVar = dqdt.b;
                }
                String str = dqdtVar.a;
                aoxt c2 = aowfVar.ah.c();
                dbsk.s(c2);
                return str.equals(bkkc.c(c2.a().ai()));
            }
        }).z());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r5) {
        /*
            r4 = this;
            super.l(r5)
            if (r5 != 0) goto L7
            android.os.Bundle r5 = r4.o
        L7:
            if (r5 != 0) goto L11
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "No state available in onCreate"
            defpackage.bvoo.h(r1, r0)
        L11:
            r0 = 0
            if (r5 == 0) goto L27
            java.lang.String r1 = "show_current_sort_by"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L27
            bwqv r2 = r4.a     // Catch: java.io.IOException -> L27
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.io.Serializable r1 = r2.d(r3, r5, r1)     // Catch: java.io.IOException -> L27
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.io.IOException -> L27
            goto L28
        L27:
            r1 = r0
        L28:
            if (r1 == 0) goto L2c
            r4.al = r1
        L2c:
            if (r5 == 0) goto L43
            java.lang.String r1 = "sort_by"
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L43
            bwqv r2 = r4.a     // Catch: java.io.IOException -> L42
            java.lang.Class<aoxr> r3 = defpackage.aoxr.class
            java.io.Serializable r1 = r2.d(r3, r5, r1)     // Catch: java.io.IOException -> L42
            aoxr r1 = (defpackage.aoxr) r1     // Catch: java.io.IOException -> L42
            r0 = r1
            goto L43
        L42:
        L43:
            if (r0 == 0) goto L47
            r4.am = r0
        L47:
            if (r5 == 0) goto Lbe
            bwqv r0 = r4.a     // Catch: java.io.IOException -> Lb5
            java.lang.Class<bwrs> r1 = defpackage.bwrs.class
            java.lang.String r2 = "current_visited_country_details_ref"
            java.io.Serializable r0 = r0.d(r1, r5, r2)     // Catch: java.io.IOException -> Lb5
            bwrs r0 = (defpackage.bwrs) r0     // Catch: java.io.IOException -> Lb5
            if (r0 == 0) goto Lbe
            r4.ah = r0
            java.lang.String r0 = "all_visited_places_list_ref"
            bwrs r0 = r4.w(r5, r0)
            r4.ai = r0
            java.lang.String r0 = "all_visited_cities_list_ref"
            bwrs r0 = r4.w(r5, r0)
            r4.aj = r0
            bwqv r0 = r4.a     // Catch: java.io.IOException -> L78
            java.lang.Class<bwrs> r1 = defpackage.bwrs.class
            java.lang.String r2 = "all_visited_places_in_country_list_ref"
            java.io.Serializable r0 = r0.d(r1, r5, r2)     // Catch: java.io.IOException -> L78
            bwrs r0 = (defpackage.bwrs) r0     // Catch: java.io.IOException -> L78
            if (r0 != 0) goto L9a
            goto L81
        L78:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            defpackage.bvoo.f(r1)
        L81:
            aoxv r0 = r4.f
            bwrs<aoxt> r1 = r4.ah
            java.io.Serializable r1 = r1.c()
            aoxt r1 = (defpackage.aoxt) r1
            defpackage.dbsk.s(r1)
            ilo r1 = r1.a()
            aoyj r1 = defpackage.aoyj.g(r1)
            bwrs r0 = r0.a(r1)
        L9a:
            r4.ak = r0
            aphh r0 = new aphh
            gga r1 = r4.g
            r0.<init>(r1)
            r4.at = r0
            apkj r0 = new apkj
            r0.<init>()
            r4.au = r0
            java.lang.String r0 = "recycler_view_scroll_state"
            android.os.Parcelable r5 = r5.getParcelable(r0)
            r4.av = r5
            return
        Lb5:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            defpackage.bvoo.f(r0)
        Lbe:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Exception during country restoration"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aowf.l(android.os.Bundle):void");
    }

    public final void q(boolean z) {
        bwrs<aoyg> bwrsVar;
        if (this.aD) {
            bwrs<aoyg> bwrsVar2 = this.ai;
            boolean z2 = false;
            if (bwrsVar2 != null) {
                aoyg c = bwrsVar2.c();
                dbsk.s(c);
                if (c.b() != aoyf.INITIAL_LOADING && (bwrsVar = this.aj) != null) {
                    aoyg c2 = bwrsVar.c();
                    dbsk.s(c2);
                    if (c2.b() != aoyf.INITIAL_LOADING) {
                        aoyg c3 = this.ak.c();
                        dbsk.s(c3);
                        if (c3.b() != aoyf.INITIAL_LOADING) {
                            z2 = true;
                        }
                    }
                }
            }
            boolean z3 = !z2;
            boolean z4 = this.as;
            if (z3 != z4) {
                this.as = z3;
            } else if (!z) {
                return;
            } else {
                z3 = z4;
            }
            if (z3) {
                this.ar.e(cqkp.T);
                this.d.c(dcdc.e(), this.d.p);
                aJ(this.ar, null);
            } else if (!aphf.b(dcdc.g(this.ai, this.aj)).a()) {
                aowl aowlVar = this.c;
                bwrs<aoyg> bwrsVar3 = this.ak;
                dcdc<aoxt> i = i();
                Resources a = aowlVar.a.a();
                aowl.a(a, 1);
                apii a2 = aowlVar.b.a();
                aowl.a(a2, 2);
                aphy a3 = aowlVar.c.a();
                aowl.a(a3, 3);
                aphj a4 = aowlVar.d.a();
                aowl.a(a4, 4);
                aowl.a(bwrsVar3, 5);
                aowl.a(i, 6);
                aowl.a(this, 7);
                this.ao.e(new aowk(a, a2, a3, a4, bwrsVar3, i, this));
                aJ(this.ao, new egq(this) { // from class: aowd
                    private final aowf a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.egq
                    public final void Qs(egu eguVar) {
                        aowf aowfVar = this.a;
                        if (aowfVar.aj != null) {
                            dcdc<aoxt> i2 = aowfVar.i();
                            if (i2.isEmpty()) {
                                aowy aowyVar = aowfVar.d;
                                aoxt c4 = aowfVar.ah.c();
                                dbsk.s(c4);
                                aowyVar.c(dcdc.f(c4), aowfVar.d.p);
                                aowy aowyVar2 = aowfVar.d;
                                aowo aowoVar = aowo.COUNTRIES;
                                aoxt c5 = aowfVar.ah.c();
                                dbsk.s(c5);
                                aowyVar2.e(aowoVar, dcdc.f(c5));
                                return;
                            }
                            aowfVar.d.j(i2, 3, new aowx(aowfVar) { // from class: aowb
                                private final aowf a;

                                {
                                    this.a = aowfVar;
                                }

                                @Override // defpackage.aowx
                                public final void a(aoxt aoxtVar) {
                                    aowf aowfVar2 = this.a;
                                    aowfVar2.g.D(apdh.g(aowfVar2.a, aowfVar2.f.a(aoyj.g(aoxtVar.a()))));
                                }
                            });
                            aowfVar.d.e(aowo.CITIES, i2);
                        }
                    }
                });
            } else {
                dbsg<aowm> b = aphf.b(dcdc.g(this.ai, this.aj));
                dbsk.l(b.a());
                gga ggaVar = this.g;
                this.ap.e(aphf.a(b.b(), ggaVar, ggaVar.getString(R.string.TROUBLE_LOADING_PLACES), this.g.getString(R.string.GENERIC_TRY_AGAIN), new aphe(this) { // from class: aowe
                    private final aowf a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.aphe
                    public final void a() {
                        aowf aowfVar = this.a;
                        aoyg c4 = aowfVar.ai.c();
                        dbsk.s(c4);
                        if (c4.b().a()) {
                            aowfVar.f.c(aowfVar.ai);
                            aowfVar.a.g(aowfVar.ai, new bwrr(aowfVar) { // from class: aovy
                                private final aowf a;

                                {
                                    this.a = aowfVar;
                                }

                                @Override // defpackage.bwrr
                                public final void PV(Object obj) {
                                    aoyg aoygVar = (aoyg) obj;
                                    this.a.q(false);
                                }
                            });
                        }
                        aoyg c5 = aowfVar.aj.c();
                        dbsk.s(c5);
                        if (c5.b().a()) {
                            aowfVar.f.c(aowfVar.aj);
                            aowfVar.a.g(aowfVar.aj, new bwrr(aowfVar) { // from class: aovz
                                private final aowf a;

                                {
                                    this.a = aowfVar;
                                }

                                @Override // defpackage.bwrr
                                public final void PV(Object obj) {
                                    aoyg aoygVar = (aoyg) obj;
                                    this.a.q(false);
                                }
                            });
                        }
                        aoyg c6 = aowfVar.ak.c();
                        dbsk.s(c6);
                        if (c6.b().a()) {
                            aowfVar.f.c(aowfVar.ak);
                            aowfVar.a.g(aowfVar.ak, new bwrr(aowfVar) { // from class: aowa
                                private final aowf a;

                                {
                                    this.a = aowfVar;
                                }

                                @Override // defpackage.bwrr
                                public final void PV(Object obj) {
                                    aoyg aoygVar = (aoyg) obj;
                                    this.a.q(false);
                                }
                            });
                        }
                        aowfVar.q(false);
                    }
                }));
                aJ(this.ap, null);
            }
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        GmmRecyclerView gmmRecyclerView;
        super.s();
        if (this.av != null && (gmmRecyclerView = (GmmRecyclerView) cqhu.a(this.ao.c(), apkj.a)) != null) {
            abs absVar = gmmRecyclerView.l;
            dbsk.s(absVar);
            Parcelable parcelable = this.av;
            dbsk.s(parcelable);
            absVar.C(parcelable);
        }
        this.d.a();
        apgc apgcVar = this.e;
        aoxt c = this.ah.c();
        dbsk.s(c);
        ilo a = c.a();
        gga a2 = apgcVar.a.a();
        apgc.a(a2, 1);
        apgc.a(a, 2);
        apgb apgbVar = new apgb(a2, a);
        this.ag = apgbVar;
        this.aq.e(apgbVar);
        bwrs<aoyg> bwrsVar = this.ai;
        if (bwrsVar == null || this.f.g(bwrsVar)) {
            bwrs<aoyg> a3 = this.f.a(aoyj.f());
            this.ai = a3;
            this.a.g(a3, new bwrr(this) { // from class: aovv
                private final aowf a;

                {
                    this.a = this;
                }

                @Override // defpackage.bwrr
                public final void PV(Object obj) {
                    aoyg aoygVar = (aoyg) obj;
                    this.a.q(false);
                }
            });
        }
        bwrs<aoyg> bwrsVar2 = this.aj;
        if (bwrsVar2 == null || this.f.g(bwrsVar2)) {
            bwrs<aoyg> a4 = this.f.b().a();
            this.aj = a4;
            this.a.g(a4, new bwrr(this) { // from class: aovw
                private final aowf a;

                {
                    this.a = this;
                }

                @Override // defpackage.bwrr
                public final void PV(Object obj) {
                    aoyg aoygVar = (aoyg) obj;
                    this.a.q(false);
                }
            });
        }
        bwrs<aoyg> bwrsVar3 = this.ak;
        if (bwrsVar3 == null || this.f.g(bwrsVar3)) {
            aoxv aoxvVar = this.f;
            aoxt c2 = this.ah.c();
            dbsk.s(c2);
            this.ak = aoxvVar.a(aoyj.g(c2.a()));
        }
        this.a.g(this.ak, new bwrr(this) { // from class: aovx
            private final aowf a;

            {
                this.a = this;
            }

            @Override // defpackage.bwrr
            public final void PV(Object obj) {
                aoyg aoygVar = (aoyg) obj;
                this.a.q(false);
            }
        });
        q(true);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "sort_by", this.am);
        this.a.c(bundle, "show_current_sort_by", this.al);
        this.a.c(bundle, "current_visited_country_details_ref", this.ah);
        this.a.c(bundle, "all_visited_places_list_ref", this.ai);
        this.a.c(bundle, "all_visited_cities_list_ref", this.aj);
        this.a.c(bundle, "all_visited_places_in_country_list_ref", this.ak);
        bundle.putParcelable("recycler_view_scroll_state", this.av);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        Parcelable parcelable;
        this.d.b();
        GmmRecyclerView gmmRecyclerView = (GmmRecyclerView) cqhu.a(this.ao.c(), apkj.a);
        if (gmmRecyclerView != null) {
            abs absVar = gmmRecyclerView.l;
            dbsk.s(absVar);
            parcelable = absVar.B();
        } else {
            parcelable = null;
        }
        this.av = parcelable;
        super.u();
    }
}
