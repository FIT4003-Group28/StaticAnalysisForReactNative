package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bfcs  reason: default package */
/* loaded from: classes3.dex */
public class bfcs implements bfce, bzml {
    public final gga a;
    public final Executor b;
    public final bexz c;
    public final bfaq d;
    public final bfbb e;
    public final dxio<bzmm> f;
    public bfdf g;
    public bwrs<ilo> h;
    public bfbj i;
    private final cafi j;
    private final beyb k;
    private final bvjj l;
    private final dxio<cjqq> m;
    private final cqkj n;
    private Runnable o;
    private jic p;
    private cjtd q;
    private cjtd r;
    private cjtd s;
    private cjtd t;
    private cjtd u;
    private cjtd v;
    private final degu<dpri> w = new bfcr(this);

    public bfcs(gga ggaVar, cafi cafiVar, Executor executor, beyb beybVar, bfaq bfaqVar, bvjj bvjjVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, cqkj cqkjVar, bfbb bfbbVar, bexz bexzVar) {
        this.q = cjtd.b;
        this.r = cjtd.b;
        this.s = cjtd.b;
        this.t = cjtd.b;
        this.u = cjtd.b;
        this.v = cjtd.b;
        this.a = ggaVar;
        this.j = cafiVar;
        this.b = executor;
        this.c = bexzVar;
        this.k = beybVar;
        this.l = bvjjVar;
        this.d = bfaqVar;
        this.f = dxioVar;
        this.m = dxioVar2;
        this.n = cqkjVar;
        this.e = bfbbVar;
        this.h = bfbbVar.v();
        this.i = bfbbVar.x();
        bfby w = bfbbVar.w();
        this.q = bfbz.a(w, bfbx.OPT_OUT);
        this.r = bfbz.a(w, bfbx.OPT_OUT_ACCEPT);
        this.s = bfbz.a(w, bfbx.OPT_OUT_DISMISS);
        this.t = bfbz.a(w, bfbx.OPT_OUT_PROFILE);
        this.u = bfbz.a(w, bfbx.OPT_OUT_PRIVATE_OPT_IN);
        this.v = bfbz.a(w, bfbx.OPT_OUT_LEARN_MORE);
    }

    private final void v(boolean z) {
        this.c.i(z, this.w);
    }

    @Override // defpackage.bzml
    public dqkc a() {
        return dqkc.LOCAL_FOLLOW_PERSONALIZED_OFFERS_DIALOG;
    }

    @Override // defpackage.bzml
    public bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public boolean d() {
        if (!this.c.a()) {
            return false;
        }
        if (!this.l.i(bvjk.ap)) {
            this.l.S(bvjk.ap, this.f.a().c(dqkc.LOCAL_FOLLOW_PERSONALIZED_OFFERS_DIALOG) != -1);
        }
        if (!this.l.m(bvjk.ap, false)) {
            cjqp g = this.m.a().g();
            cjta c = cjtd.c(this.q);
            c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(c.a());
        }
        return this.f.a().d(a()) <= 0;
    }

    @Override // defpackage.bzml
    public bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        bzmk bzmkVar2 = bzmk.UNKNOWN_VISIBILITY;
        if (bzmkVar.ordinal() != 3) {
            return false;
        }
        final jeo jeoVar = new jeo(this.a, 16973840, new bewy(), this, this.n);
        this.o = new Runnable(jeoVar) { // from class: bfcp
            private final jeo a;

            {
                this.a = jeoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.dismiss();
            }
        };
        jeoVar.show();
        this.m.a().g().d(this.q);
        return true;
    }

    @Override // defpackage.bfce
    public cjtd g() {
        return this.q;
    }

    @Override // defpackage.bfce
    public CharSequence h() {
        return this.k.a(R.string.LOCAL_FOLLOW_PRIVACY_BODY_TEXT, this.v);
    }

    @Override // defpackage.bfce
    public cqkl i() {
        bfbj bfbjVar;
        bwrs<ilo> bwrsVar = this.h;
        if (bwrsVar != null && this.d.b(bwrsVar) && (bfbjVar = this.i) != null) {
            bfbjVar.m(true);
            this.i.n();
        }
        u();
        this.f.a().f(a());
        return cqkl.a;
    }

    @Override // defpackage.bfce
    public cjtd j() {
        return this.s;
    }

    @Override // defpackage.bfce
    public jic k() {
        bwrs<ilo> bwrsVar = this.h;
        if (bwrsVar == null) {
            return null;
        }
        if (this.p == null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            this.p = new jic(c.cC().e, ckqc.FIFE_MERGE, 2131232998);
        }
        return this.p;
    }

    @Override // defpackage.bfce
    public String l() {
        bwrs<ilo> bwrsVar = this.h;
        if (bwrsVar == null) {
            return "";
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        return c.cC().f;
    }

    @Override // defpackage.bfce
    public cjtd m() {
        return this.t;
    }

    @Override // defpackage.bfce
    public cqkl n() {
        u();
        try {
            this.j.f();
        } catch (RuntimeException e) {
            bvoo.i(e);
        }
        return cqkl.a;
    }

    @Override // defpackage.bfce
    public cqkl o() {
        v(true);
        return cqkl.a;
    }

    @Override // defpackage.bfce
    public cjtd p() {
        return this.r;
    }

    @Override // defpackage.bfce
    public cqkl q() {
        v(false);
        return cqkl.a;
    }

    @Override // defpackage.bfce
    public cjtd r() {
        return this.u;
    }

    public void s(bfdf bfdfVar) {
        this.g = bfdfVar;
    }

    public void t() {
        this.h = null;
        this.p = null;
        this.i = null;
    }

    public void u() {
        Runnable runnable = this.o;
        if (runnable != null) {
            runnable.run();
        }
    }
}
