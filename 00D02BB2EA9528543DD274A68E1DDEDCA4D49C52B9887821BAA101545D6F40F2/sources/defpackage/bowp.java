package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bowp  reason: default package */
/* loaded from: classes3.dex */
public final class bowp extends itb implements boxa {
    public static final /* synthetic */ int b = 0;
    private static final dcdc<doay> c = dcdc.i(doay.TYPE_ROAD, doay.TYPE_GEOCODED_ADDRESS, doay.TYPE_COMPOUND_BUILDING, doay.TYPE_POLITICAL);
    public final gga a;
    private final akfc d;
    private final bwqv e;
    private final bpto f;
    private final bpsl g;
    private final bpsw h;
    private final chhr i;
    private final chhs j;
    private final bnyo k;
    private final dzsj<begg> o;
    private final btvo p;
    private final bvvw q;
    private final bovv r;
    private final bpuu s;
    private final Set<String> t = new HashSet();
    private final cklf u;
    @dzsi
    private CharSequence v;

    public bowp(gga ggaVar, akfc akfcVar, bwqv bwqvVar, chhr chhrVar, chht chhtVar, bpto bptoVar, bpsl bpslVar, bpsw bpswVar, bnyo bnyoVar, cklf cklfVar, dzsj<begg> dzsjVar, btvo btvoVar, bvvw bvvwVar, bovv bovvVar, bpuu bpuuVar) {
        this.a = ggaVar;
        this.d = akfcVar;
        this.e = bwqvVar;
        this.f = bptoVar;
        this.i = chhrVar;
        this.j = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.g = bpslVar;
        this.h = bpswVar;
        this.u = cklfVar;
        this.s = bpuuVar;
        this.k = bnyoVar;
        this.o = dzsjVar;
        this.p = btvoVar;
        this.q = bvvwVar;
        this.r = bovvVar;
    }

    private final void W(aket aketVar) {
        aker i = akeu.i(aketVar);
        aken a = i.a();
        a.i(R.string.RAP_AAP_LOGIN_SCREEN_TITLE);
        a.h(R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE);
        a.c(R.string.DISABLE_INCOGNITO_BODY_TEXT);
        this.d.b(i.b());
    }

    private final boolean X(int i, gn gnVar) {
        return this.t.contains(gnVar.k(i).p());
    }

    private static dbsg<String> Y(ilo iloVar, final int i) {
        dobr cy = iloVar.cy();
        return cy == null ? dbpy.a : dcft.m(cy.f, new dbsl(i) { // from class: bowf
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                int i3 = bowp.b;
                int a = dobj.a(((dobk) obj).c);
                if (a == 0) {
                    a = 1;
                }
                return a == i2;
            }
        }).h(bowg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0 == defpackage.dnqb.PLACE_CARD_ACTION_BAR) goto L14;
     */
    @Override // defpackage.boxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.bwrs<defpackage.ilo> r8, defpackage.dnqe r9, @defpackage.dzsi defpackage.bomu r10) {
        /*
            r7 = this;
            int r0 = r9.b
            dnqb r0 = defpackage.dnqb.b(r0)
            if (r0 != 0) goto La
            dnqb r0 = defpackage.dnqb.UNKNOWN_ENTRY_POINT
        La:
            dnqb r1 = defpackage.dnqb.PLACE_CARD
            if (r0 == r1) goto L1c
            int r0 = r9.b
            dnqb r0 = defpackage.dnqb.b(r0)
            if (r0 != 0) goto L18
            dnqb r0 = defpackage.dnqb.UNKNOWN_ENTRY_POINT
        L18:
            dnqb r1 = defpackage.dnqb.PLACE_CARD_ACTION_BAR
            if (r0 != r1) goto L35
        L1c:
            dcdc<doay> r0 = defpackage.bowp.c
            java.io.Serializable r1 = r8.c()
            ilo r1 = (defpackage.ilo) r1
            defpackage.dbsk.s(r1)
            doay r1 = r1.ce()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L35
            r7.I(r8, r9)
            return
        L35:
            r5 = 0
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.i(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bowp.B(bwrs, dnqe, bomu):void");
    }

    @Override // defpackage.boxa
    public final void C(bwrs<ilo> bwrsVar, dnqe dnqeVar, String str) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        W(bowc.c(new bowv(iloVar, dnqeVar), bwrsVar, null, str));
    }

    @Override // defpackage.boxa
    public final void D(bwrs<ilo> bwrsVar, @dzsi bomu bomuVar, @dzsi Integer num, boolean z) {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.URL;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        i(bwrsVar, bZ.bK(), bomuVar, num, z);
    }

    @Override // defpackage.boxa
    public final void E(bwrs<ilo> bwrsVar, @dzsi bomu bomuVar, int i) {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.NOTIFICATION;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        i(bwrsVar, bZ.bK(), bomuVar, Integer.valueOf(i), true);
    }

    @Override // defpackage.boxa
    public final void F(bwrs<ilo> bwrsVar) {
        dnps bZ = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.UGC_TASK_SETS;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        dnqe dnqeVar2 = (dnqe) bZ.b;
        dnqeVar2.c = 1;
        dnqeVar2.a |= 2;
        i(bwrsVar, bZ.bK(), null, null, false);
    }

    @Override // defpackage.boxa
    public final boolean G(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        return iloVar != null && Y(iloVar, 10).a();
    }

    @Override // defpackage.boxa
    public final void H(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        dbsg<String> Y = Y(c2, 10);
        if (Y.a()) {
            W(new bowo(bwrsVar, Y.b(), dnqeVar, dtxo.a));
        }
    }

    @Override // defpackage.boxa
    public final void I(@dzsi bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        bovx bovxVar = new bovx(bwrsVar, dnqeVar);
        if (this.p.getUgcParameters().Z()) {
            bovxVar.c(this.a);
        } else {
            W(bovxVar);
        }
    }

    @Override // defpackage.boxa
    public final void J(dcdc<ilo> dcdcVar, @dzsi final dodb dodbVar, final dnqe dnqeVar, @dzsi final ditt dittVar) {
        bpuj bZ = bpuk.c.bZ();
        bZ.a(dchl.k(dcdcVar, bowh.a));
        final bpuk bK = bZ.bK();
        bpuu bpuuVar = this.s;
        dpsn dpsnVar = bK.a.get(0).b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        bpuuVar.a(akqi.j(dpsnVar)).d(new bpus(this, bK, dodbVar, dnqeVar, dittVar) { // from class: bowi
            private final bowp a;
            private final bpuk b;
            private final dodb c;
            private final dnqe d;
            private final ditt e;

            {
                this.a = this;
                this.b = bK;
                this.c = dodbVar;
                this.d = dnqeVar;
                this.e = dittVar;
            }

            @Override // defpackage.bpus
            public final void a(digi digiVar) {
                bowp bowpVar = this.a;
                bpuk bpukVar = this.b;
                dodb dodbVar2 = this.c;
                bowpVar.a.D(bpdc.g(new boxb(bpvi.f(bpukVar, digiVar), this.d, dodbVar2, this.e)));
            }
        });
    }

    @Override // defpackage.boxa
    public final void K(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        boolean z = true;
        if (!c2.an() && !c2.ao()) {
            z = false;
        }
        dbsk.a(z);
        if (c2.an()) {
            bowv bowvVar = new bowv(c2, dnqeVar);
            bowvVar.l.c = false;
            L(bowvVar, bwrsVar, cjqm.a);
            return;
        }
        bowv bowvVar2 = new bowv(c2, dnqeVar);
        bowvVar2.m.c = false;
        L(bowvVar2, bwrsVar, cjqm.a);
    }

    @Override // defpackage.boxa
    public final void L(bowv bowvVar, bwrs<ilo> bwrsVar, cjqm cjqmVar) {
        bpsl bpslVar = this.g;
        bpsl.a(bowvVar, 1);
        bpsl.a(bwrsVar, 2);
        boxa a = bpslVar.a.a();
        bpsl.a(a, 3);
        akfa a2 = bpslVar.b.a();
        bpsl.a(a2, 4);
        bbtk a3 = bpslVar.c.a();
        bpsl.a(a3, 5);
        bbul a4 = bpslVar.d.a();
        bpsl.a(a4, 6);
        this.f.a(new bpsk(bowvVar, bwrsVar, a, a2, a3, a4)).a(this.h.c(bowvVar, cjqmVar), bowvVar.l());
    }

    @Override // defpackage.boxa
    public final void M(@dzsi djgl djglVar) {
        gga ggaVar = this.a;
        if (!ggaVar.aZ) {
            return;
        }
        jmw.d(ggaVar, null);
        gn g = this.a.g();
        int j = g.j() - 1;
        do {
            g.e();
            j--;
            if (j < 0) {
                break;
            }
        } while (X(j, g));
        if (djglVar == null) {
            return;
        }
        O(djglVar);
    }

    @Override // defpackage.boxa
    public final void N() {
        gga ggaVar = this.a;
        if (!ggaVar.aZ) {
            return;
        }
        jmw.d(ggaVar, null);
        gn g = this.a.g();
        int j = g.j();
        while (true) {
            j--;
            if (j <= 1 || !X(j, g)) {
                return;
            }
            g.e();
        }
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        e(bvtq.class);
        e(aaoj.class);
        e(bpax.class);
        e(anca.class);
        e(bpbl.class);
        e(boys.class);
        e(bpbw.class);
        e(bpez.class);
        e(bpfw.class);
        e(bphi.class);
        e(andv.class);
        e(bpyx.class);
        e(bqam.class);
    }

    @Override // defpackage.boxa
    public final void O(djgl djglVar) {
        this.i.a(djglVar, dtya.l, dtya.m);
    }

    @Override // defpackage.boxa
    public final CharSequence P() {
        if (this.v == null) {
            String string = this.a.getString(R.string.LEARN_MORE);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.getString(R.string.LEGAL_DISCLAIMER, new Object[]{string}));
            ClickableSpan g = this.u.g("android_rap", ibm.w().b(this.a));
            int indexOf = spannableStringBuilder.toString().indexOf(string);
            spannableStringBuilder.setSpan(g, indexOf, string.length() + indexOf, 33);
            this.v = spannableStringBuilder;
        }
        return this.v;
    }

    @Override // defpackage.boxa
    public final void Q(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        dbsk.s(iloVar);
        doav cx = iloVar.cx();
        if (cx != null) {
            dsqp dsqpVar = (dsqp) cx.cu(5);
            dsqpVar.bC(cx);
            doas doasVar = (doas) dsqpVar;
            if (doasVar.c) {
                doasVar.bF();
                doasVar.c = false;
            }
            doav doavVar = (doav) doasVar.b;
            doavVar.a |= 4;
            doavVar.d = true;
            ily g = iloVar.g();
            g.y(doasVar.bK());
            bwrsVar.d(g.d());
            duoy bZ = duoz.c.bZ();
            String str = cx.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duoz duozVar = (duoz) bZ.b;
            str.getClass();
            duozVar.a |= 1;
            duozVar.b = str;
            this.k.a(bZ.bK(), new bowj());
        }
    }

    @Override // defpackage.boxa
    public final djgl R(dwhd dwhdVar) {
        if ((dwhdVar.a & 16) != 0) {
            djgl djglVar = dwhdVar.f;
            return djglVar == null ? djgl.g : djglVar;
        }
        return this.j.c();
    }

    @Override // defpackage.boxa
    public final djgl S(dwjx dwjxVar) {
        if ((dwjxVar.a & 2) != 0) {
            djgl djglVar = dwjxVar.c;
            return djglVar == null ? djgl.g : djglVar;
        }
        return this.j.c();
    }

    @Override // defpackage.boxa
    public final void T(bwrs<ilo> bwrsVar, dqgh dqghVar) {
        bwqv bwqvVar = this.e;
        Bundle bundle = new Bundle();
        bpbt bpbtVar = new bpbt();
        bwqvVar.c(bundle, "PLACEMARK_KEY", bwrsVar);
        bundle.putInt("ATTRIBUTE_TYPE_KEY", dqghVar.af);
        bundle.putBoolean("IS_FROM_FACTUAL_MODERATION_NOTIFICATION_KEY", false);
        bpbtVar.B(bundle);
        bpbtVar.aJ(this.a);
    }

    @Override // defpackage.boxa
    public final void U(bosj bosjVar, ges gesVar, dwyd dwydVar) {
        gesVar.aZ(boqv.g(this.e, bosjVar, null, dwydVar, null, null, false));
    }

    @Override // defpackage.boxa
    @dzsi
    public final bvxh V(bwrs<ilo> bwrsVar, dnqe dnqeVar, int i) {
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        ReportAProblemWebViewCallbacks reportAProblemWebViewCallbacks = new ReportAProblemWebViewCallbacks(bwrsVar, new bowv(c2, dnqeVar));
        dbsg<String> Y = Y(c2, i);
        if (!Y.a()) {
            return null;
        }
        bvvw bvvwVar = this.q;
        bovv bovvVar = this.r;
        String b2 = Y.b();
        dnqb b3 = dnqb.b(dnqeVar.b);
        if (b3 == null) {
            b3 = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return bvvwVar.l(bovvVar.a(b2, "aGmm.RAP.Prefetch", b3), reportAProblemWebViewCallbacks, true);
    }

    @Override // defpackage.boxa
    public final void e(Class<? extends fd> cls) {
        this.t.add(gfu.b(cls, gfu.ACTIVITY_FRAGMENT, new gfs[0]));
    }

    @Override // defpackage.boxa
    public final void f(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        i(bwrsVar, dnqeVar, null, null, false);
    }

    final void i(bwrs<ilo> bwrsVar, dnqe dnqeVar, @dzsi bomu bomuVar, @dzsi Integer num, boolean z) {
        if (bwrsVar != null) {
            ilo iloVar = (ilo) bwrs.b(bwrsVar);
            dbsk.s(iloVar);
            if (iloVar.aY()) {
                if (bomuVar == bomu.BUSINESS_HOURS) {
                    W(new bowl(num, z, bwrsVar, dnqeVar, this.q, this.r, this.p));
                    return;
                }
                ilo iloVar2 = (ilo) bwrs.b(bwrsVar);
                dbsk.s(iloVar2);
                W(bowc.c(new bowv(iloVar2, dnqeVar), bwrsVar, bomuVar, null));
                return;
            }
        }
        I(null, dnqeVar);
    }

    @Override // defpackage.boxa
    public final void j(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        i(bwrsVar, dnqeVar, bomu.ADDRESS, null, false);
    }

    @Override // defpackage.boxa
    public final void k(final List<ilo> list, @dzsi final dodb dodbVar, final dnqe dnqeVar) {
        boolean z = true;
        dbsk.a(!list.isEmpty());
        if (list.get(0).ce() != doay.TYPE_ROAD) {
            z = false;
        }
        dbsk.a(z);
        this.d.a(akeu.j(new akeo(list, dodbVar, dnqeVar) { // from class: bowe
            private final List a;
            private final dodb b;
            private final dnqe c;

            {
                this.a = list;
                this.b = dodbVar;
                this.c = dnqeVar;
            }

            @Override // defpackage.akeo
            public final void a(gga ggaVar, btlu btluVar) {
                List list2 = this.a;
                dodb dodbVar2 = this.b;
                dnqe dnqeVar2 = this.c;
                int i = bowp.b;
                ilo iloVar = (ilo) list2.get(0);
                List<ilo> subList = list2.subList(1, list2.size());
                boww bowwVar = new boww(iloVar, subList, dodbVar2, dnqeVar2);
                String o = boww.o(iloVar);
                for (ilo iloVar2 : subList) {
                    if (!boww.o(iloVar2).equals(o)) {
                        bowwVar.b.d = false;
                    }
                }
                ggaVar.D(bpez.aR(bowwVar));
            }

            @Override // defpackage.akeo
            public final void b(gga ggaVar, btlu btluVar) {
            }
        }).b());
    }

    @Override // defpackage.boxa
    public final void l(List<dodb> list, ges gesVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_routes", new ProtoBufUtil$ParcelableProtoList(list));
        boxz boxzVar = new boxz();
        boxzVar.B(bundle);
        boxzVar.Nz(gesVar);
        boxzVar.aJ(gesVar.J());
    }

    @Override // defpackage.boxa
    public final void m(dnzx dnzxVar) {
        ily ilyVar = new ily();
        ilyVar.k(dnzxVar.a);
        begj begjVar = new begj();
        begjVar.b(ilyVar.d());
        begjVar.K = true;
        this.o.a().o(begjVar, false, null);
    }

    @Override // defpackage.boxa
    public final boolean n() {
        return this.p.getUgcParameters().ad() && !this.p.getUgcParameters().V().isEmpty();
    }

    @Override // defpackage.boxa
    public final boolean o(bwrs<ilo> bwrsVar) {
        ilo c2 = bwrsVar.c();
        return c2 != null && Y(c2, 9).a();
    }

    @Override // defpackage.boxa
    @dzsi
    public final bvxh p(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        if (o(bwrsVar)) {
            return V(bwrsVar, dnqeVar, 9);
        }
        if (!n()) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(this.p.getUgcParameters().V()).buildUpon().appendQueryParameter("embedHost", "ANDROID_GMM");
        ilo c2 = bwrsVar.c();
        dbsk.s(c2);
        ReportAProblemWebViewCallbacks reportAProblemWebViewCallbacks = new ReportAProblemWebViewCallbacks(bwrsVar, new bowv(c2, dnqeVar));
        bvvw bvvwVar = this.q;
        bovv bovvVar = this.r;
        String uri = appendQueryParameter.build().toString();
        dnqb b2 = dnqb.b(dnqeVar.b);
        if (b2 == null) {
            b2 = dnqb.UNKNOWN_ENTRY_POINT;
        }
        return bvvwVar.l(bovvVar.a(uri, "aGmm.RAP.Prefetch", b2), reportAProblemWebViewCallbacks, true);
    }

    @Override // defpackage.boxa
    public final void q(bvxh bvxhVar, akqq akqqVar, @dzsi dqnv dqnvVar) {
        bvxi k = bvxhVar.k();
        HashMap d = dcjz.d();
        d.put("lat", Double.valueOf(akqqVar.a));
        d.put("lng", Double.valueOf(akqqVar.b));
        if (dqnvVar != null) {
            d.put("base64_encoded_address_data", ddae.e.i(dqnvVar.bS()));
        }
        k.b("rap.sml", d);
        this.q.q(bvxhVar, dtxp.am);
    }

    @Override // defpackage.boxa
    public final boolean r(bwrs<ilo> bwrsVar) {
        ilo c2 = bwrsVar.c();
        return c2 != null && Y(c2, 11).a();
    }

    @Override // defpackage.boxa
    public final void s(bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        dnqb b2 = dnqb.b(dnqeVar.b);
        if (b2 == null) {
            b2 = dnqb.UNKNOWN_ENTRY_POINT;
        }
        W(new bown(bwrsVar, b2));
    }

    @Override // defpackage.boxa
    public final void t(@dzsi bwrs<ilo> bwrsVar, dnqe dnqeVar) {
        W(new bowm(bwrsVar, dnqeVar));
    }
}
