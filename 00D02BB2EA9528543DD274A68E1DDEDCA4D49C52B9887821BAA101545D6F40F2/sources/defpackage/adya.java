package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: adya  reason: default package */
/* loaded from: classes2.dex */
public class adya extends adyp {
    private static final dcqe e = dcqe.c("adya");
    private final CharSequence A;
    private final cjta B;
    private final cjtd C;
    private final cjtd D;
    private final jic E;
    private final adxe F;
    private final ilo G;
    private final dqhj H;
    private final String I;
    private final m J;
    private iyi K;
    private final aou L;
    public final btrm a;
    public final bkpi b;
    public cdjd c;
    public boolean d;
    private final dxio<cafi> f;
    private final Resources q;
    private final bnos r;
    private final iyj s;
    private final advr t;
    private final String u;
    private final cjtd v;
    private final CharSequence w;
    private final jic x;
    private final CharSequence y;
    private final String z;

    public adya(abfa abfaVar, dxio<cafi> dxioVar, btrm btrmVar, Resources resources, adxf adxfVar, iyj iyjVar, axjh axjhVar, final adwv adwvVar, bkpi bkpiVar, bnos bnosVar, adyo adyoVar, fd fdVar, absg absgVar, String str, dlds dldsVar, dlcx dlcxVar, dlcz dlczVar, cjtd cjtdVar, View.OnAttachStateChangeListener onAttachStateChangeListener, btlu btluVar, dqhj dqhjVar, dspd dspdVar, String str2) {
        super(adyoVar, onAttachStateChangeListener, str, dspdVar, btluVar);
        dwfl dwflVar;
        this.d = false;
        e eVar = new e() { // from class: com.google.android.apps.gmm.home.cards.yourexplore.viewmodelimpl.UgcReviewFeedHomeCardViewModelImpl$1
            @Override // defpackage.f
            public final void a(m mVar) {
                adya adyaVar = adya.this;
                if (!adyaVar.d) {
                    btrm btrmVar2 = adyaVar.a;
                    dceq a = dcet.a();
                    a.b(bkpe.class, new adyc(bkpe.class, adyaVar, bvrj.UI_THREAD));
                    btrmVar2.g(adyaVar, a.a());
                    adyaVar.d = true;
                }
            }

            @Override // defpackage.f
            public final void b(m mVar) {
            }

            @Override // defpackage.f
            public final void c(m mVar) {
            }

            @Override // defpackage.f
            public final void d(m mVar) {
            }

            @Override // defpackage.f
            public final void e(m mVar) {
            }

            @Override // defpackage.f
            public final void f(m mVar) {
                adya.this.U();
            }
        };
        this.L = eVar;
        this.f = dxioVar;
        this.a = btrmVar;
        this.q = resources;
        this.b = bkpiVar;
        this.r = bnosVar;
        this.s = iyjVar;
        String str3 = dlczVar.a;
        this.u = str3;
        this.v = cjtdVar;
        this.H = dqhjVar;
        docg docgVar = dldsVar.b;
        dnfg dnfgVar = (docgVar == null ? docg.M : docgVar).n;
        dnna dnnaVar = (dnfgVar == null ? dnfg.c : dnfgVar).b;
        dnnaVar = dnnaVar == null ? dnna.m : dnnaVar;
        this.w = dnnaVar.b;
        advr advrVar = null;
        this.x = (dnnaVar.a & 8) != 0 ? new jic(dnnaVar.e, ckqc.FIFE_MERGE, 2131232998, 0) : null;
        dreg dregVar = dnnaVar.d;
        this.y = (dregVar == null ? dreg.c : dregVar).a;
        dreg dregVar2 = dnnaVar.d;
        this.z = (dregVar2 == null ? dreg.c : dregVar2).b;
        cjta b = cjtd.b();
        b.d = dtxr.bP;
        drei dreiVar = dlczVar.c;
        b.g((dreiVar == null ? drei.b : dreiVar).a);
        this.C = b.a();
        docg docgVar2 = dldsVar.b;
        this.A = (docgVar2 == null ? docg.M : docgVar2).r;
        cjta b2 = cjtd.b();
        b2.g(str2);
        this.B = b2;
        cjta b3 = cjtd.b();
        docg docgVar3 = dldsVar.b;
        b3.g((docgVar3 == null ? docg.M : docgVar3).k);
        this.D = b3.b(dtxr.bU);
        this.E = (dldsVar.c.isEmpty() || (dwflVar = dldsVar.c.get(0)) == null || dwflVar.h.isEmpty()) ? null : adyg.c(dwflVar.h, jfv.b(dwflVar), null);
        dvyw dvywVar = dlcxVar.c;
        dvywVar = dvywVar == null ? dvyw.bv : dvywVar;
        cjta b4 = cjtd.b();
        b4.d = absgVar == absg.AREA_EXPLORE ? dtxj.di : dtxr.bL;
        b4.g(dlcxVar.b);
        this.F = adxfVar.a(dvywVar, b4.a(), abfaVar.x());
        ily ilyVar = new ily();
        dvyw dvywVar2 = dlcxVar.c;
        ilyVar.E(dvywVar2 == null ? dvyw.bv : dvywVar2);
        ilo d = ilyVar.d();
        docg docgVar4 = dldsVar.b;
        cdrr r = cdrr.r(docgVar4 == null ? docg.M : docgVar4, cdja.PUBLISHED);
        dqjh b5 = r.b().b();
        bnor c = bnor.c(btluVar, r.a().g());
        dqjh a = bnosVar.a.a(c);
        if (a == null) {
            bnosVar.a.Pz(c, b5);
            a = b5;
        }
        this.c = r.g((r.b().a() - (b5.equals(dqjh.THUMBS_UP) ? 1 : 0)) + (a.equals(dqjh.THUMBS_UP) ? 1 : 0), a);
        this.K = abfaVar.y() ? iyjVar.b(bwrs.a(d), r, dtxr.bV) : null;
        if (dlczVar.b) {
            dbsg<axne> q = axjhVar.q(str3, dnnaVar.b, dfqc.YOUR_EXPLORE_CONTENT, str2);
            adwvVar.getClass();
            advrVar = (advr) q.h(new dbrn(adwvVar) { // from class: adxx
                private final adwv a;

                {
                    this.a = adwvVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return this.a.a((axne) obj);
                }
            }).f();
        }
        this.t = advrVar;
        if (dlczVar.b && advrVar == null) {
            bvoo.h("User is followable and should not have a null follow button.", new Object[0]);
        }
        this.G = d;
        docg docgVar5 = dldsVar.b;
        this.I = (docgVar5 == null ? docg.M : docgVar5).I;
        this.J = fdVar;
        fdVar.Nh().a(eVar);
    }

    @Override // defpackage.adyp, defpackage.advs
    public String A() {
        if (super.A().isEmpty() || this.I.isEmpty()) {
            return !this.I.isEmpty() ? this.I : super.A();
        }
        String A = super.A();
        String str = this.I;
        StringBuilder sb = new StringBuilder(String.valueOf(A).length() + 5 + String.valueOf(str).length());
        sb.append(A);
        sb.append("  •  ");
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.adyp, defpackage.advs
    public jbj B() {
        return this.K;
    }

    @Override // defpackage.adyp, defpackage.advs
    public void D() {
        this.J.Nh().b(this.L);
        U();
    }

    @Override // defpackage.adyp
    protected final jic O() {
        return this.x;
    }

    @Override // defpackage.adyp
    protected final jic P() {
        return this.E;
    }

    @Override // defpackage.adyp
    public String Pe() {
        if (super.A().isEmpty() || this.I.isEmpty()) {
            return !this.I.isEmpty() ? this.I : super.Pe();
        }
        String string = this.q.getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_POSTED_TIMESTAMP, super.A());
        String str = this.I;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(str).length());
        sb.append(string);
        sb.append(", ");
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.adyp
    public dqhj Q() {
        return this.H;
    }

    @Override // defpackage.adyp
    protected final List<jho> R() {
        ArrayList arrayList = new ArrayList();
        jhm a = jhm.a();
        a.a = this.q.getString(R.string.REPORT_A_PROBLEM);
        a.b = this.q.getString(R.string.REPORT_A_PROBLEM);
        a.f = cjtd.b;
        a.d(new View.OnClickListener(this) { // from class: adxy
            private final adya a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adya adyaVar = this.a;
                adyaVar.b.i(adyaVar.c, bkph.c(1));
            }
        });
        arrayList.add(a.c());
        return arrayList;
    }

    public void T(bkpe bkpeVar) {
        cdjd c = bkpeVar.c(this.c, bwrs.a(this.G));
        if (this.c.equals(c)) {
            return;
        }
        this.c = c;
        bnos bnosVar = this.r;
        btlu btluVar = this.n;
        String g = this.c.a().g();
        bnosVar.a.Pz(bnor.c(btluVar, g), this.c.b().b());
        if (this.K != null) {
            this.K = this.s.b(bwrs.a(this.G), this.c, null);
        }
        cqkx.p(this);
    }

    public final void U() {
        if (this.d) {
            this.a.a(this);
            this.d = false;
        }
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence a() {
        return this.w;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence b() {
        return this.y;
    }

    @Override // defpackage.adyp, defpackage.advs
    public String c() {
        return this.z;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.v;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl f() {
        try {
            this.f.a().k(this.u, null);
        } catch (RuntimeException e2) {
            bvoo.i(e2);
        }
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd g() {
        return this.B.b(dtxr.bQ);
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd h() {
        return this.C;
    }

    @Override // defpackage.adyp, defpackage.advs
    public advr n() {
        return this.t;
    }

    @Override // defpackage.adyp, defpackage.advs
    public CharSequence p() {
        return this.A;
    }

    @Override // defpackage.adyp, defpackage.advs
    public String s() {
        return this.q.getString(R.string.YOUR_EXPLORE_ACCESSIBILITY_PHOTO_OF_PLACE, this.F.a());
    }

    @Override // defpackage.adyp, defpackage.advs
    public cqkl v() {
        this.b.f(bwrs.a(this.G), bwrs.a(this.c), bkpg.f(cdjk.COMMUNITY_FEED));
        return cqkl.a;
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd w() {
        return this.B.b(dtxr.bT);
    }

    @Override // defpackage.adyp, defpackage.advs
    public cjtd x() {
        return this.D;
    }

    @Override // defpackage.adyp, defpackage.advs
    public advi z() {
        return this.F;
    }
}
