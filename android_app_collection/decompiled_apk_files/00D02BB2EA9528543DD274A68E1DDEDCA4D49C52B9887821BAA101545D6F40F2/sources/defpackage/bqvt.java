package defpackage;

import android.view.View;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import com.google.android.apps.maps.R;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: bqvt  reason: default package */
/* loaded from: classes4.dex */
public class bqvt implements bqtb {
    private final boolean A;
    private akqi D;
    private dbsg<String> E;
    private bqta F;
    private bqks G;
    private String H;
    private boolean I;
    private boolean J;
    private final blkt K;
    private final cqqw L;
    private final cqqw M;
    public final bqua b;
    public final bqvw c;
    public final ff d;
    public final ges e;
    public final bqvs f;
    public final bwrs<ilo> g;
    public final cjqy h;
    public final boolean j;
    private final bqvi m;
    private final bqus n;
    private final bquj o;
    private final bqtv p;
    private final bqwc q;
    private bqur r;
    private bqui s;
    private final btvo t;
    private final begg u;
    private final bqkt v;
    private final bqrv w;
    private final bqsq x;
    private final PublicDisclosureLayout$PublicDisclosureViewModelImpl y;
    private final boolean z;
    public final AtomicBoolean i = new AtomicBoolean(false);
    private CharSequence B = "";
    private jic C = bqxk.a(null);
    public boolean k = true;
    public ddhv l = ddhv.UNKNOWN;

    public bqvt(final bqvs bqvsVar, ff ffVar, ges gesVar, boolean z, boolean z2, bwrs<ilo> bwrsVar, begg beggVar, cqkj cqkjVar, cqhn cqhnVar, btvo btvoVar, ccie ccieVar, bqkt bqktVar, bqub bqubVar, bqus bqusVar, bquj bqujVar, cjqy cjqyVar, bqvi bqviVar, bqtv bqtvVar, cjmt cjmtVar, dehq dehqVar, bqvv bqvvVar, bqrv bqrvVar, bqsq bqsqVar, PublicDisclosureLayout$PublicDisclosureViewModelImpl publicDisclosureLayout$PublicDisclosureViewModelImpl) {
        boolean z3 = false;
        bqvq bqvqVar = new bqvq(this);
        this.K = bqvqVar;
        bqvr bqvrVar = new bqvr(this);
        this.L = bqvrVar;
        this.M = new jmk(bqvqVar, bqvrVar);
        dbsk.a(bwrsVar.c() != null);
        this.g = bwrsVar;
        this.f = bqvsVar;
        this.d = ffVar;
        this.e = gesVar;
        this.z = z;
        this.A = z2;
        this.u = beggVar;
        this.t = btvoVar;
        this.h = cjqyVar;
        this.v = bqktVar;
        this.m = bqviVar;
        this.n = bqusVar;
        this.o = bqujVar;
        bqwc bqwcVar = new bqwc(btvoVar);
        this.q = bqwcVar;
        bqvsVar.getClass();
        this.c = new bqvw(ffVar, bqwcVar, new Runnable(bqvsVar) { // from class: bqvj
            private final bqvs a;

            {
                this.a = bqvsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        });
        this.w = bqrvVar;
        this.x = bqsqVar;
        int a = dkxy.a(btvoVar.getUgcParameters().M().a);
        a = a == 0 ? 1 : a;
        this.j = (a == 3 || a == 4) ? true : z3;
        bqvsVar.getClass();
        Runnable runnable = new Runnable(bqvsVar) { // from class: bqvk
            private final bqvs a;

            {
                this.a = bqvsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        };
        bqub.a(gesVar, 1);
        bqub.a(runnable, 2);
        ff ffVar2 = (ff) ((dxjd) bqubVar.a).a;
        bqub.a(ffVar2, 3);
        cqhn a2 = bqubVar.b.a();
        bqub.a(a2, 4);
        cpv a3 = bqubVar.c.a();
        bqub.a(a3, 5);
        this.b = new bqua(gesVar, runnable, ffVar2, a2, a3);
        this.p = bqtvVar;
        publicDisclosureLayout$PublicDisclosureViewModelImpl.o(cayd.TOOLTIP);
        this.y = publicDisclosureLayout$PublicDisclosureViewModelImpl;
        ad();
    }

    private static void ap(cjta cjtaVar, bwrs<ilo> bwrsVar) {
        if (bwrsVar.c() == null) {
            return;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        boolean z = c.u;
        ddes bZ = ddet.D.bZ();
        ddhs bZ2 = ddhw.d.bZ();
        int i = z ? 3 : 2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddhw ddhwVar = (ddhw) bZ2.b;
        ddhwVar.c = i - 1;
        ddhwVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddhw bK = bZ2.bK();
        bK.getClass();
        ddetVar.x = bK;
        ddetVar.a |= 1073741824;
        cjtaVar.s(bZ.bK());
    }

    @Override // defpackage.bqtb
    public CharSequence A() {
        return this.B;
    }

    @Override // defpackage.bqtb
    public CharSequence B() {
        return this.d.getString(R.string.POSTING_PUBLICLY);
    }

    @Override // defpackage.bqtb
    public bqsy C() {
        return this.q;
    }

    @Override // defpackage.bqtb
    public jaj D() {
        return this.c;
    }

    @Override // defpackage.bqtb
    public bqsv E() {
        return this.s;
    }

    @Override // defpackage.bqtb
    public bqsw F() {
        return this.r;
    }

    @Override // defpackage.bqtb
    public String H() {
        return this.I ? this.x.a(this.p.g()) : "";
    }

    @Override // defpackage.bqtb
    public cqkl I() {
        this.w.d(this.D, this.p, new Runnable(this) { // from class: bqvl
            private final bqvt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a);
            }
        });
        return cqkl.a;
    }

    @Override // defpackage.bqtb
    public cqkl J() {
        ao();
        return cqkl.a;
    }

    @Override // defpackage.bqtb
    public cqkl K() {
        this.f.c();
        return cqkl.a;
    }

    @Override // defpackage.bqtb
    public cqkl L() {
        this.f.j();
        return cqkl.a;
    }

    @Override // defpackage.bqtb
    public Boolean M() {
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.bqtb
    public Boolean N() {
        return Boolean.valueOf(this.i.get());
    }

    @Override // defpackage.jbk
    public jib NC() {
        String string;
        jhz jhzVar = new jhz();
        jhzVar.x = false;
        jhzVar.f(new bqvo(this));
        jhzVar.a = this.H;
        if (this.z) {
            string = this.d.getString(R.string.POST_BUTTON);
        } else {
            string = this.d.getString(R.string.NEXT_BUTTON);
        }
        cjtd Y = Y();
        jhm jhmVar = new jhm();
        jhmVar.a = string;
        jhmVar.b = string;
        jhmVar.h = 2;
        jhmVar.d(new View.OnClickListener(this) { // from class: bqvm
            private final bqvt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.K();
            }
        });
        jhmVar.n = W().booleanValue();
        jhmVar.f = Y;
        jhmVar.d = ibm.x();
        jhmVar.m = 16;
        jhzVar.c(jhmVar.c());
        jhzVar.o = ab();
        jhzVar.q = ibm.b();
        jhzVar.u = ibm.p();
        jhzVar.i = cqrt.g(2131231591, ibm.p());
        return jhzVar.b();
    }

    @Override // defpackage.bqtb
    public CharSequence O() {
        return this.d.getString(R.string.REVIEW_PLACE_PICKER_TEXT);
    }

    @Override // defpackage.bqtb
    public CharSequence P() {
        return this.d.getString(R.string.REVIEW_PLACE_PICKER_DESCRIPTION_FOR_ACCESSIBILITY);
    }

    @Override // defpackage.bqtb
    public dcdc<bqsz> Q() {
        return this.F.a();
    }

    @Override // defpackage.bqtb
    public cqkl R() {
        this.f.k();
        return cqkl.a;
    }

    @Override // defpackage.bqtb
    public cqqw S() {
        return this.M;
    }

    @Override // defpackage.bqtb
    public Boolean T() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.bqtb
    public CharSequence U() {
        return this.H;
    }

    @Override // defpackage.bqtb
    public Integer V() {
        return Integer.valueOf(true != this.z ? R.string.NEXT_BUTTON : R.string.POST_BUTTON);
    }

    @Override // defpackage.bqtb
    public Boolean W() {
        int bj = this.t.getUgcParameters().bj();
        int i = bj - 1;
        if (bj == 0) {
            throw null;
        }
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Unhandled ReviewUploadButtonDisplayMode: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
            }
        }
        if (this.q.a().floatValue() <= 0.0f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bqtb
    public Integer X() {
        if (!this.J) {
            return 0;
        }
        int bn = this.t.getUgcParameters().bn();
        int i = bn - 1;
        if (bn == 0) {
            throw null;
        }
        if (i == 1) {
            return 1;
        }
        return i != 2 ? 0 : 2;
    }

    @Override // defpackage.bqtb
    public cjtd Y() {
        cjta b = cjtd.b();
        b.d = dtyf.I;
        ddhs bZ = ddhw.d.bZ();
        ddhv ddhvVar = this.l;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddhw ddhwVar = (ddhw) bZ.b;
        ddhwVar.b = ddhvVar.d;
        ddhwVar.a |= 1;
        if (this.g.c() != null) {
            ilo c = this.g.c();
            dbsk.s(c);
            int i = c.u ? 3 : 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddhw ddhwVar2 = (ddhw) bZ.b;
            ddhwVar2.c = i - 1;
            ddhwVar2.a |= 2;
        }
        ddes bZ2 = ddet.D.bZ();
        ddhw bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddet ddetVar = (ddet) bZ2.b;
        bK.getClass();
        ddetVar.x = bK;
        ddetVar.a |= 1073741824;
        b.s(bZ2.bK());
        if (this.E.a()) {
            ddji bZ3 = ddjj.c.bZ();
            String b2 = this.E.b();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ3.b;
            b2.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = b2;
            b.k(bZ3.bK());
        }
        return b.a();
    }

    @Override // defpackage.bqtb
    public Integer Z() {
        return Integer.valueOf(this.t.getUgcParameters().a());
    }

    @Override // defpackage.bqtb
    public cjtd aa() {
        cjta b = cjtd.b();
        b.d = dtyf.G;
        ap(b, this.g);
        return b.a();
    }

    @Override // defpackage.bqtb
    public cjtd ab() {
        cjta b = cjtd.b();
        b.d = dtyf.x;
        ap(b, this.g);
        return b.a();
    }

    public void ac(m mVar) {
        mVar.Nh().a(this.y);
    }

    public final void ad() {
        ilo c = this.g.c();
        dbsk.s(c);
        this.D = c.ai();
        this.E = dbsg.j(c.bK());
        this.H = c.n();
        this.I = bqsq.c(c.bo());
        bqks a = this.v.a(c);
        this.G = a;
        bqvi bqviVar = this.m;
        bqvs bqvsVar = this.f;
        ges gesVar = this.e;
        bqvi.a(a, 1);
        bqvi.a(bqvsVar, 2);
        bqvi.a(this, 3);
        bqvi.a(gesVar, 4);
        cqhn a2 = bqviVar.a.a();
        bqvi.a(a2, 5);
        bqvd a3 = bqviVar.b.a();
        bqvi.a(a3, 6);
        this.F = new bqvh(a, bqvsVar, this, gesVar, a2, a3);
        this.c.j(c);
        this.q.j(c);
        bqua bquaVar = this.b;
        bquaVar.h(c.bs());
        cjta c2 = cjtd.c(c.a());
        c2.d = dtxn.eM;
        bquaVar.d = c2.a();
        ff ffVar = bquaVar.a;
        cjta c3 = cjtd.c(c.a());
        c3.d = dtxn.eL;
        bquaVar.c = bqua.i(ffVar, c3.a());
        if (!bquaVar.a().booleanValue()) {
            bquaVar.g(bqtz.NO_DRAFT);
        }
        this.p.h(bqsq.d(c.bq(), c.bs(), this.p.g()));
        if (!c.u || !this.t.getUgcParameters().aJ()) {
            this.J = false;
            this.r = null;
            this.s = null;
            return;
        }
        this.J = true;
        bqxj a4 = this.n.a.a();
        bqus.a(a4, 1);
        bqus.a(c, 2);
        this.r = new bqur(a4, c);
        bqto a5 = this.o.a.a();
        bquj.a(a5, 1);
        bquj.a(c, 2);
        this.s = new bqui(a5, c);
    }

    public void ae(String str) {
        this.C = bqxk.a(str);
    }

    public void af(String str) {
        this.B = str;
    }

    @Override // defpackage.bqtb
    /* renamed from: ag */
    public bqua G() {
        return this.b;
    }

    public void ah(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            return;
        }
        this.i.set(true);
        cqkx.p(this);
        begg beggVar = this.u;
        cjsb cjsbVar = new cjsb();
        cjsbVar.h(ddda.fw.b);
        cjsbVar.d();
        beggVar.p(c, cjsbVar.a(), new bqvp(this));
    }

    public bqkx ai(dqgr dqgrVar) {
        bqkw k = bqkx.k();
        k.c(this.D);
        k.f(this.q.k().intValue());
        k.e(this.c.k());
        k.d(dqgrVar);
        if (this.I) {
            k.g(this.p.g());
        }
        if (this.J) {
            dqwt bZ = dqwy.c.bZ();
            bqui bquiVar = this.s;
            if (bquiVar != null) {
                dcdc z = dcbg.b(bquiVar.a).o(bqud.a).s(bque.a).z();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqwy dqwyVar = (dqwy) bZ.b;
                dsrj<dqwo> dsrjVar = dqwyVar.b;
                if (!dsrjVar.a()) {
                    dqwyVar.b = dsqw.cl(dsrjVar);
                }
                dsod.bv(z, dqwyVar.b);
                bZ.bK();
            }
            bqur bqurVar = this.r;
            if (bqurVar != null) {
                dcdc z2 = dcbg.b(bqurVar.a).o(bqul.a).s(bqum.a).z();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqwy dqwyVar2 = (dqwy) bZ.b;
                dsrj<dqwv> dsrjVar2 = dqwyVar2.a;
                if (!dsrjVar2.a()) {
                    dqwyVar2.a = dsqw.cl(dsrjVar2);
                }
                dsod.bv(z2, dqwyVar2.a);
                bZ.bK();
            }
            ((bqix) k).a = dbsg.i(bZ.bK());
        }
        return k.h();
    }

    @Deprecated
    public void aj(String str) {
        this.c.b(str);
    }

    @Deprecated
    public void ak(int i) {
        this.q.o(Integer.valueOf(i));
    }

    public bqks al() {
        return this.G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (r3 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean am() {
        /*
            r5 = this;
            bqvw r0 = r5.c
            boolean r0 = r0.m()
            r1 = 1
            if (r0 != 0) goto L94
            bqwc r0 = r5.q
            boolean r0 = r0.m()
            if (r0 != 0) goto L94
            boolean r0 = r5.J
            r2 = 0
            if (r0 != 0) goto L17
            goto L3e
        L17:
            bqur r0 = r5.r
            if (r0 == 0) goto L27
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            bqui r3 = r5.s
            if (r3 == 0) goto L38
            java.lang.Boolean r3 = r3.b()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            if (r0 != 0) goto L94
            if (r3 == 0) goto L3e
            goto L94
        L3e:
            bqks r0 = r5.al()
            dcdc<bqkl> r3 = r0.k
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L94
            dcep<bqkl> r3 = r0.i
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L94
            dcep<bqkl> r0 = r0.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            goto L94
        L5b:
            boolean r0 = r5.I
            if (r0 != 0) goto L60
            goto L93
        L60:
            bqtv r0 = r5.p
            eapy r0 = r0.g()
            bwrs<ilo> r3 = r5.g
            java.io.Serializable r3 = r3.c()
            ilo r3 = (defpackage.ilo) r3
            defpackage.dbsk.s(r3)
            docg r3 = r3.bq()
            dbsg r3 = defpackage.bqsq.e(r3)
            bqvn r4 = new bqvn
            r4.<init>(r0)
            dbsg r0 = r3.h(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r0.c(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L93
            goto L94
        L93:
            return r2
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqvt.am():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean an() {
        boolean z = !this.c.k().isEmpty();
        boolean z2 = this.c.m() && this.c.n();
        boolean z3 = this.q.m() && this.q.n();
        if (z) {
            if (z2 || z3) {
                return true;
            }
            if (this.J) {
                bqur bqurVar = this.r;
                boolean z4 = bqurVar != null && bqurVar.b().booleanValue() && this.r.c().booleanValue();
                bqui bquiVar = this.s;
                boolean z5 = bquiVar != null && bquiVar.b().booleanValue() && this.s.c().booleanValue();
                if (z4 || z5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ao() {
        this.f.g();
    }

    @Override // defpackage.jax
    public CharSequence b() {
        return "";
    }

    @Override // defpackage.jax
    public CharSequence c() {
        return null;
    }

    @Override // defpackage.jax
    public cqss d() {
        return irg.H();
    }

    @Override // defpackage.jax
    public cqtv e() {
        return cqrp.f(12.0d);
    }

    @Override // defpackage.jax
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jax
    public CharSequence g() {
        return null;
    }

    @Override // defpackage.jax
    public jht h() {
        return null;
    }

    @Override // defpackage.jax
    public CharSequence i() {
        return null;
    }

    @Override // defpackage.jax
    public Boolean j() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jax
    public jic k() {
        return null;
    }

    @Override // defpackage.jax
    public Boolean l() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean n() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl o(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean p() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl q(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public cjtd r() {
        return null;
    }

    @Override // defpackage.jax
    public cjtd s() {
        return null;
    }

    @Override // defpackage.jax
    public jic t() {
        throw null;
    }

    @Override // defpackage.jax
    public cqss u() {
        throw null;
    }

    @Override // defpackage.jax
    public jic v() {
        return null;
    }

    @Override // defpackage.jax
    public String w() {
        return null;
    }

    @Override // defpackage.bqtb, defpackage.caye
    public cayf x() {
        return this.y;
    }

    @Override // defpackage.bqtb
    public Boolean y() {
        return Boolean.valueOf(!dbsj.d(this.H));
    }

    @Override // defpackage.bqtb
    public jic z() {
        return this.C;
    }
}
