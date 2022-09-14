package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sds  reason: default package */
/* loaded from: classes7.dex */
public class sds implements sai, sao, sdb {
    static final akqq a = new akqq(dcyn.a, dcyn.a);
    private final Executor A;
    private final she B;
    private final btvo C;
    private final sdu D;
    private rzr E;
    @dzsi
    private dspd F;
    private boolean G;
    public final Context b;
    public final sal c;
    public final sal d;
    public final ros e;
    public final gfw f;
    public final boolean g;
    public final sed h;
    public final sdc i;
    public final scr j;
    @dzsi
    public dehn<dspd> k;
    @dzsi
    public azva l;
    @dzsi
    public azva m;
    public int r;
    private final sfc s;
    private final sic t;
    private final ahjq u;
    private final seg v;
    private final sgm w;
    private final gft x;
    private final sgt y;
    private final rzv z;
    public boolean n = true;
    public boolean o = false;
    private boolean H = false;
    public boolean p = true;
    public boolean q = true;
    private Boolean I = false;

    public sds(Application application, cqhn cqhnVar, sfd sfdVar, sec secVar, see seeVar, seg segVar, sgm sgmVar, sic sicVar, ros rosVar, ahjq ahjqVar, sgt sgtVar, rzv rzvVar, Executor executor, sdc sdcVar, she sheVar, rzs rzsVar, scr scrVar, btvo btvoVar, rzp rzpVar, dndr dndrVar, dndr dndrVar2, gfw gfwVar, gft gftVar, sdu sduVar) {
        ddho ddhoVar;
        boolean z = false;
        this.b = application;
        this.t = sicVar;
        this.v = segVar;
        this.w = sgmVar;
        this.e = rosVar;
        this.u = ahjqVar;
        this.y = sgtVar;
        this.f = gfwVar;
        this.z = rzvVar;
        this.A = executor;
        this.i = sdcVar;
        this.B = sheVar;
        this.j = scrVar;
        this.x = gftVar;
        this.C = btvoVar;
        this.D = sduVar;
        if (dndrVar == dndr.HOME && dndrVar2 == dndr.WORK) {
            z = true;
        }
        this.g = z;
        String string = application.getString(true != z ? R.string.COMMUTE_MULTIMODAL_ROUTE_PAGE_TO_HOME_TITLE : R.string.COMMUTE_MULTIMODAL_ROUTE_PAGE_TO_WORK_TITLE);
        ddho ddhoVar2 = z ? dtxl.cY : dtxl.cW;
        if (z) {
            ddhoVar = dtxl.cZ;
        } else {
            ddhoVar = dtxl.cX;
        }
        this.s = sfdVar.b(string, ddhoVar2, ddhoVar, rzpVar);
        cqtd R = z ? R() : S();
        int i = R.string.COMMUTE_MULTIMODAL_WORK;
        this.c = sec.a(R, application.getString(true != z ? R.string.COMMUTE_MULTIMODAL_WORK : R.string.COMMUTE_MULTIMODAL_HOME));
        this.d = sec.a(!z ? R() : S(), application.getString(true != z ? R.string.COMMUTE_MULTIMODAL_HOME : i));
        this.h = new sed();
    }

    private final cqkn<sap> O() {
        return new cqkn(this) { // from class: sdd
            private final sds a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                sds sdsVar = this.a;
                sgl u = sdsVar.u(true, true);
                sdsVar.h.e(sdsVar.h.a().indexOf((sap) cqkpVar) + 1, u);
                sdsVar.v();
                sdsVar.I(u);
            }
        };
    }

    private final String P() {
        return this.b.getString(R.string.COMMUTE_MULTIMODAL_ADD_STEP);
    }

    private final void Q(dopk dopkVar, int i, boolean z) {
        List<sap> a2 = this.h.a();
        if (i < 0 || i >= a2.size() || !(a2.get(i) instanceof saz)) {
            return;
        }
        sgl sglVar = (sgl) a2.get(i);
        if (z) {
            sglVar.K(dopkVar);
        } else {
            sglVar.L(dopkVar);
        }
        cqkx.p(sglVar);
    }

    private static cqtd R() {
        return iut.a(cqrt.f(2131232293));
    }

    private static cqtd S() {
        return iut.a(cqrt.f(2131232468));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(boolean z) {
        this.I = Boolean.valueOf(z);
        L();
    }

    public final void A(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        L();
    }

    public final void C() {
        dnld dnldVar;
        dehn<sdv> b;
        if (this.g) {
            b = this.i.a(this.D);
        } else {
            sdc sdcVar = this.i;
            sdu sduVar = this.D;
            dbsg<dnlg> s = sdcVar.b.s();
            if (!s.a()) {
                if (sdcVar.b.p().a()) {
                    b = deew.h(sdcVar.a(sduVar), scx.a, dege.a);
                } else {
                    b = deha.a(sdv.e(sduVar, 2));
                }
            } else {
                dnlg b2 = s.b();
                if (b2.a == 3) {
                    dnldVar = (dnld) b2.b;
                } else {
                    dnldVar = dnld.e;
                }
                b = sdcVar.b(sduVar, 2, dnldVar.c);
            }
        }
        deha.q(b, new sdr(this), dege.a);
    }

    public void D() {
        for (sap sapVar : this.h.a()) {
            if (sapVar instanceof san) {
                ((san) sapVar).b();
            }
        }
    }

    public void E(dopk dopkVar, int i) {
        Q(dopkVar, i, true);
    }

    public void F(dopk dopkVar, int i) {
        Q(dopkVar, i, false);
    }

    public void G(sbe sbeVar, int i) {
        ((sgl) this.h.a().get(i)).E(sbeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.saz r8, boolean r9) {
        /*
            r7 = this;
            ros r0 = r7.e
            defpackage.dbsk.s(r0)
            ahjq r0 = r7.u
            defpackage.dbsk.s(r0)
            sed r0 = r7.h
            java.util.List r0 = r0.a()
            int r5 = r0.indexOf(r8)
            r0 = 0
            if (r9 == 0) goto L4c
            sed r1 = r7.h
            java.util.List r1 = r1.a()
            int r2 = r5 + (-1)
        L1f:
            if (r2 < 0) goto L3d
            java.lang.Object r3 = r1.get(r2)
            boolean r3 = r3 instanceof defpackage.sgl
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.get(r2)
            sgl r3 = (defpackage.sgl) r3
            say r3 = r3.s()
            dopk r3 = r3.g()
            if (r3 == 0) goto L3a
            goto L3e
        L3a:
            int r2 = r2 + (-1)
            goto L1f
        L3d:
            r3 = r0
        L3e:
            if (r3 == 0) goto L4c
            dnoh r1 = r3.g
            if (r1 != 0) goto L46
            dnoh r1 = defpackage.dnoh.d
        L46:
            akqq r1 = defpackage.akqq.e(r1)
        L4a:
            r2 = r1
            goto L78
        L4c:
            boolean r1 = r7.g
            if (r1 == 0) goto L53
            azva r2 = r7.l
            goto L55
        L53:
            azva r2 = r7.m
        L55:
            if (r1 == 0) goto L5a
            azva r1 = r7.m
            goto L5c
        L5a:
            azva r1 = r7.l
        L5c:
            r3 = 1
            if (r3 == r9) goto L60
            r2 = r1
        L60:
            if (r2 == 0) goto L65
            akqq r1 = r2.e
            goto L66
        L65:
            r1 = r0
        L66:
            if (r1 != 0) goto L4a
            ahjq r1 = r7.u
            com.google.android.apps.gmm.map.model.location.GmmLocation r1 = r1.a()
            if (r1 == 0) goto L75
            akqq r1 = r1.B()
            goto L4a
        L75:
            akqq r1 = defpackage.sds.a
            goto L4a
        L78:
            if (r9 == 0) goto L7f
            say r8 = r8.r()
            goto L83
        L7f:
            say r8 = r8.s()
        L83:
            if (r8 != 0) goto L87
            r3 = r0
            goto L8c
        L87:
            dopk r8 = r8.g()
            r3 = r8
        L8c:
            ros r1 = r7.e
            gfw r6 = r7.f
            r4 = r9
            r1.p(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sds.H(saz, boolean):void");
    }

    public final void I(sap sapVar) {
        if (!this.x.bb() || !(sapVar instanceof san)) {
            return;
        }
        ((san) sapVar).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void J(@dzsi dspd dspdVar) {
        this.F = dspdVar;
        L();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void K(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        L();
    }

    public final void L() {
        bvrj.UI_THREAD.c();
        if (this.r > 0) {
            return;
        }
        cqkx.p(this);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jib b = this.s.e().b();
        if (this.H) {
            jhz e = b.e();
            e.b = "";
            e.a = "";
            return e.b();
        } else if (!this.G) {
            return b;
        } else {
            jhz e2 = b.e();
            int b2 = ibm.D().b(this.b);
            Drawable b3 = ks.b(this.b.getResources().getDrawable(2131232461));
            b3.setBounds(0, 0, b3.getIntrinsicWidth(), b3.getIntrinsicHeight());
            b3.setTint(b2);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new bvst(b3), 0, 1, 0);
            bvsu c = new bvsx(this.b.getResources()).c(R.string.COMMUTE_MULTIMODAL_ROUTE_GENERIC_VALIDATION_ERROR);
            c.l(b2);
            Spannable c2 = c.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (bvox.b(this.b)) {
                spannableStringBuilder.append((CharSequence) c2);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) spannableString);
            } else {
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) c2);
            }
            e2.b = new SpannableString(spannableStringBuilder);
            e2.D = 2;
            return e2.b();
        }
    }

    @Override // defpackage.sai
    public sal b() {
        return this.c;
    }

    @Override // defpackage.sai
    public sal c() {
        return this.d;
    }

    @Override // defpackage.sai
    public Boolean d() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.sai
    public Boolean e() {
        return Boolean.valueOf(this.H);
    }

    @Override // defpackage.sai
    public cqkl f() {
        B(false);
        y().c();
        return cqkl.a;
    }

    @Override // defpackage.sai
    public sam g() {
        return this.h;
    }

    @Override // defpackage.sai
    public cjtd h() {
        return cjtd.a(dtxl.cT);
    }

    @Override // defpackage.sai
    public cjtd i() {
        return cjtd.a(dtxl.cU);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    @Override // defpackage.sao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r13 = this;
            r0 = 0
            r13.J(r0)
            sed r1 = r13.h
            java.util.List r1 = r1.a()
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 1
        Le:
            int r6 = r1.size()
            if (r4 >= r6) goto Lc2
            java.lang.Object r6 = r1.get(r4)
            sap r6 = (defpackage.sap) r6
            boolean r7 = r6 instanceof defpackage.sgl
            if (r7 == 0) goto Lbe
            r7 = r6
            sgl r7 = (defpackage.sgl) r7
            int r8 = r4 + 1
            int r9 = r1.size()
            if (r8 >= r9) goto L30
            java.lang.Object r8 = r1.get(r8)
            sap r8 = (defpackage.sap) r8
            goto L31
        L30:
            r8 = r0
        L31:
            java.lang.Boolean r9 = r7.k()
            boolean r9 = r9.booleanValue()
            boolean r10 = r8 instanceof defpackage.sgl
            if (r10 == 0) goto Lae
            sgl r8 = (defpackage.sgl) r8
            say r10 = r7.s()
            java.lang.Boolean r10 = r10.d()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Laa
            say r10 = r8.r()
            java.lang.Boolean r10 = r10.d()
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Laa
            say r10 = r7.s()
            dopk r10 = r10.g()
            defpackage.dbsk.s(r10)
            say r8 = r8.r()
            dopk r8 = r8.g()
            defpackage.dbsk.s(r8)
            java.lang.String r11 = r10.d
            java.lang.String r12 = r8.d
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L7d
        L7b:
            r8 = 1
            goto La1
        L7d:
            dsrj<dopj> r10 = r10.u
            java.util.Iterator r10 = r10.iterator()
        L83:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La0
            java.lang.Object r11 = r10.next()
            dopj r11 = (defpackage.dopj) r11
            int r12 = r11.a
            if (r12 != r3) goto L83
            java.lang.Object r11 = r11.b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r8.d
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L83
            goto L7b
        La0:
            r8 = 0
        La1:
            r10 = r8 ^ 1
            r7.H(r10)
            if (r8 != 0) goto Lb1
            r5 = 0
            goto Lb1
        Laa:
            r7.H(r2)
            goto Lb1
        Lae:
            r7.H(r2)
        Lb1:
            java.lang.Boolean r7 = r6.k()
            boolean r7 = r7.booleanValue()
            if (r7 == r9) goto Lbe
            defpackage.cqkx.p(r6)
        Lbe:
            int r4 = r4 + 1
            goto Le
        Lc2:
            if (r5 != 0) goto Lc5
            goto Ld4
        Lc5:
            sed r0 = r13.h
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld4
            r13.w()
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sds.j():void");
    }

    @Override // defpackage.sdb
    public sap k(boolean z, boolean z2) {
        seg segVar = this.v;
        domy domyVar = domy.DRIVE;
        String q = sht.q(this.b, this.C, domy.DRIVE);
        cqtd n = sht.n(domy.DRIVE);
        String P = P();
        cqkn<sap> O = O();
        Application a2 = segVar.a.a();
        seg.a(a2, 1);
        cqhn a3 = segVar.b.a();
        seg.a(a3, 2);
        seg.a(domyVar, 3);
        seg.a(q, 4);
        seg.a(P, 8);
        return new sef(a2, a3, domyVar, q, n, null, false, P, false, O);
    }

    @Override // defpackage.sav
    public Boolean l() {
        return Boolean.valueOf(!this.s.c());
    }

    @Override // defpackage.sav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.sav
    public Boolean n() {
        return Boolean.valueOf(this.F != null);
    }

    @Override // defpackage.sav
    public cqkl o() {
        int i = true != this.g ? 2 : 1;
        dspd dspdVar = this.F;
        dbsk.s(dspdVar);
        dnku bZ = dnlg.c.bZ();
        dnkx bZ2 = dnld.e.bZ();
        dnlc b = qqh.b(3);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnld dnldVar = (dnld) bZ2.b;
        b.getClass();
        dnldVar.b = b;
        int i2 = 1 | dnldVar.a;
        dnldVar.a = i2;
        dspdVar.getClass();
        dnldVar.a = 2 | i2;
        dnldVar.c = dspdVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnlg dnlgVar = (dnlg) bZ.b;
        dnld bK = bZ2.bK();
        bK.getClass();
        dnlgVar.b = bK;
        dnlgVar.a = 3;
        dnlg bK2 = bZ.bK();
        sgt sgtVar = this.y;
        sfc sfcVar = this.s;
        dbsk.s(this.F);
        dccx F = dcdc.F();
        for (sap sapVar : this.h.a()) {
            if (sapVar instanceof sgl) {
                amub M = ((sgl) sapVar).M();
                dbsk.s(M);
                F.g(M);
            }
        }
        sgtVar.a(i, sfcVar, bK2, F.f());
        sfc sfcVar2 = this.s;
        sfcVar2.a(sfcVar2.b());
        return cqkl.a;
    }

    @Override // defpackage.sav
    public cjtd p() {
        return this.s.b;
    }

    @Override // defpackage.sav
    public cqkl q() {
        return this.s.d();
    }

    @Override // defpackage.sav
    public cjtd r() {
        return this.s.a;
    }

    @Override // defpackage.sav
    public Boolean s() {
        return this.I;
    }

    @Override // defpackage.sav
    public rzp t() {
        return this.s.c;
    }

    @Override // defpackage.sdb
    public sgl u(boolean z, boolean z2) {
        cqkn cqknVar = new cqkn(this) { // from class: sdg
            private final sds a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                this.a.H((saz) cqkpVar, true);
            }
        };
        cqkn cqknVar2 = new cqkn(this) { // from class: sdh
            private final sds a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                this.a.H((saz) cqkpVar, false);
            }
        };
        cqkn cqknVar3 = new cqkn(this) { // from class: sdi
            private final sds a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                sds sdsVar = this.a;
                sgl sglVar = (sgl) cqkpVar;
                sbe u = sglVar.u();
                sdsVar.e.q(sglVar.G(), sglVar.F(), u != null ? u.g() : -1, sdsVar.h.a().indexOf(sglVar), sdsVar.f);
            }
        };
        cqkn cqknVar4 = new cqkn(this) { // from class: sdj
            private final sds a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                sds sdsVar = this.a;
                sap sapVar = (sap) cqkpVar;
                sed sedVar = sdsVar.h;
                dbsk.m(sapVar.g().booleanValue(), "Trying to remove a non removable leg.");
                if (sedVar.a.contains(sapVar)) {
                    sapVar.i(null);
                    sedVar.a.remove(sapVar);
                    sedVar.h();
                    sedVar.j();
                }
                sdsVar.v();
            }
        };
        sgm sgmVar = this.w;
        boolean z3 = this.g;
        String q = sht.q(this.b, this.C, domy.TRANSIT);
        cqtd n = sht.n(domy.TRANSIT);
        String P = P();
        cqkn<sap> O = O();
        rzr y = y();
        Application a2 = sgmVar.a.a();
        sgm.a(a2, 1);
        cqhn a3 = sgmVar.b.a();
        sgm.a(a3, 2);
        qjk a4 = sgmVar.c.a();
        sgm.a(a4, 3);
        shu a5 = sgmVar.d.a();
        sgm.a(a5, 4);
        qsm a6 = sgmVar.e.a();
        sgm.a(a6, 5);
        sdz a7 = sgmVar.f.a();
        sgm.a(a7, 6);
        sgm.a(q, 8);
        sgm.a(P, 15);
        sgm.a(y, 18);
        return new sgl(a2, a3, a4, a5, a6, a7, z3, q, n, cqknVar4, z, cqknVar, cqknVar2, cqknVar3, P, z2, O, y);
    }

    public final void v() {
        int size = this.h.a().size();
        int i = (!this.D.equals(sdu.PARK_AND_RIDE) || this.g) ? size - 1 : size - 2;
        int i2 = 0;
        while (i2 < size) {
            sbw sbwVar = (sbw) this.h.a().get(i2);
            boolean z = i2 == i;
            if (z != sbwVar.j().booleanValue()) {
                sbwVar.A(Boolean.valueOf(z));
                cqkx.p(sbwVar);
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        dcdc<rzk> z = dcbg.b(this.h.a()).s(sdk.a).o(sdl.a).s(sdm.a).z();
        rzv rzvVar = this.z;
        deig d = deig.d();
        drhy bZ = drih.b.bZ();
        for (rzk rzkVar : z) {
            int c = rzkVar.c();
            if (c == 0) {
                throw null;
            }
            if (c == 1) {
                drhz bZ2 = drig.c.bZ();
                drib dribVar = drib.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drig drigVar = (drig) bZ2.b;
                dribVar.getClass();
                drigVar.b = dribVar;
                drigVar.a = 2;
                bZ.a(bZ2);
            } else {
                int c2 = rzkVar.c();
                if (c2 == 0) {
                    throw null;
                }
                if (c2 == 2) {
                    drhz bZ3 = drig.c.bZ();
                    drif drifVar = drif.a;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    drig drigVar2 = (drig) bZ3.b;
                    drifVar.getClass();
                    drigVar2.b = drifVar;
                    drigVar2.a = 3;
                    bZ.a(bZ3);
                } else {
                    int c3 = rzkVar.c();
                    if (c3 == 0) {
                        throw null;
                    }
                    if (c3 == 3) {
                        dbsk.n(rzkVar.b().size() == 2, "Expecting transit leg to have 2 stations, got %s", rzkVar.b().size());
                        drhz bZ4 = drig.c.bZ();
                        dric bZ5 = drid.e.bZ();
                        String o = rzkVar.b().get(0).a().o();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        drid dridVar = (drid) bZ5.b;
                        o.getClass();
                        dridVar.a |= 1;
                        dridVar.b = o;
                        String o2 = rzkVar.b().get(1).a().o();
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        drid dridVar2 = (drid) bZ5.b;
                        o2.getClass();
                        dridVar2.a = 2 | dridVar2.a;
                        dridVar2.c = o2;
                        dspd a2 = rzkVar.a();
                        dbsk.s(a2);
                        if (bZ5.c) {
                            bZ5.bF();
                            bZ5.c = false;
                        }
                        drid dridVar3 = (drid) bZ5.b;
                        a2.getClass();
                        dridVar3.a |= 4;
                        dridVar3.d = a2;
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        drig drigVar3 = (drig) bZ4.b;
                        drid bK = bZ5.bK();
                        bK.getClass();
                        drigVar3.b = bK;
                        drigVar3.a = 1;
                        bZ.a(bZ4);
                    } else {
                        rzkVar.c();
                    }
                }
            }
        }
        drih bK2 = bZ.bK();
        qdo qdoVar = rzvVar.a;
        qay qayVar = new qay();
        if (bK2 != null) {
            qayVar.a = bK2;
            dnqh dnqhVar = dnqh.p;
            if (dnqhVar != null) {
                qayVar.b = dnqhVar;
                String str = qayVar.a == null ? " patternDescription" : "";
                if (qayVar.b == null) {
                    str = str.concat(" loggingParams");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                }
                qdoVar.a(new qaz(qayVar.a, qayVar.b), new rzt(d));
                dehn<dspd> dehnVar = this.k;
                this.k = d;
                if (dehnVar != null) {
                    dehnVar.cancel(true);
                }
                T(true);
                deha.q(d, new sdp(this, d), this.A);
                return;
            }
            throw new NullPointerException("Null loggingParams");
        }
        throw new NullPointerException("Null patternDescription");
    }

    public void x() {
        this.h.c(this);
        z();
        if (!this.n) {
            return;
        }
        if (this.p) {
            this.t.c(new sib(this) { // from class: sdf
                private final sds a;

                {
                    this.a = this;
                }

                @Override // defpackage.sib
                public final void a(qjn qjnVar) {
                    sds sdsVar = this.a;
                    boolean z = sdsVar.g;
                    sal salVar = z ? sdsVar.c : sdsVar.d;
                    sal salVar2 = z ? sdsVar.d : sdsVar.c;
                    sdsVar.l = qjnVar.a();
                    azva azvaVar = sdsVar.l;
                    if (azvaVar != null) {
                        salVar.d(sht.k(sdsVar.b, azvaVar));
                    }
                    sdsVar.m = qjnVar.b();
                    azva azvaVar2 = sdsVar.m;
                    if (azvaVar2 != null) {
                        salVar2.d(sht.k(sdsVar.b, azvaVar2));
                    }
                    sdsVar.p = false;
                    sdsVar.A(sdsVar.q);
                }
            });
        }
        if (!this.q) {
            return;
        }
        C();
    }

    public final rzr y() {
        if (this.E == null) {
            this.E = rzs.a(new rzq(this) { // from class: sde
                private final sds a;

                {
                    this.a = this;
                }

                @Override // defpackage.rzq
                public final void a() {
                    sds sdsVar = this.a;
                    if (sdsVar.n) {
                        sdsVar.B(true);
                        return;
                    }
                    scr scrVar = sdsVar.j;
                    rzr y = sdsVar.y();
                    gdf gdfVar = new gdf(scrVar.a, 2132018221);
                    scw scwVar = scrVar.c;
                    scu scuVar = new scu(gdfVar) { // from class: scq
                        private final gdf a;

                        {
                            this.a = gdfVar;
                        }

                        @Override // defpackage.scu
                        public final void a() {
                            this.a.dismiss();
                        }
                    };
                    Application a2 = scwVar.a.a();
                    scw.a(a2, 1);
                    scw.a(y, 2);
                    scw.a(scuVar, 3);
                    scv scvVar = new scv(a2, y, scuVar);
                    cqkf e = scrVar.b.e(new rvo());
                    e.e(scvVar);
                    gdfVar.setContentView(e.c());
                    gdfVar.show();
                }
            });
        }
        return this.E;
    }

    public final void z() {
        for (sap sapVar : this.h.a()) {
            I(sapVar);
        }
    }
}
