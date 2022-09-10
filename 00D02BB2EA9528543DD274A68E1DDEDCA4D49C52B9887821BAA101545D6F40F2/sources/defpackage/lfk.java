package defpackage;

import android.content.Context;
import android.view.View;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lfk  reason: default package */
/* loaded from: classes7.dex */
public final class lfk extends nor implements btph {
    private static final cjtg i = new cjsz(dtxm.aL);
    private static final cjtg j = new cjsz(dtxm.bs);
    private static final cjtg k = new cjsz(dtxm.bu);
    public final Executor a;
    public final liq b;
    public final lxh c;
    public final cqkf<lig> d;
    public final lil e;
    public final boolean f;
    public boolean g;
    public final lec h;
    private final Context l;
    private final not m;
    private final btrm n;
    private final kdg o;
    private final lfh p;
    private final kxs q;
    @dzsi
    private nlz r;
    private final lio s;

    public lfk(cqkj cqkjVar, not notVar, btrm btrmVar, asxw asxwVar, bvsl bvslVar, jzp jzpVar, asxu asxuVar, kxu kxuVar, kdg kdgVar, lec lecVar, cjqy cjqyVar, cjqq cjqqVar, lxh lxhVar, btvo btvoVar, ahjq ahjqVar, axwq axwqVar, akfa akfaVar, Executor executor, btrm btrmVar2, bvjj bvjjVar, cqat cqatVar, ksr ksrVar, bvrb bvrbVar, dzsj dzsjVar, crfr crfrVar, aufc aufcVar, npz npzVar, kcv kcvVar) {
        super(cjqyVar, cjqqVar);
        lil limVar;
        cqiw lgxVar;
        this.p = new lfh(this);
        lfg lfgVar = new lfg(this);
        this.s = lfgVar;
        this.m = notVar;
        this.n = btrmVar;
        this.o = kdgVar;
        this.h = lecVar;
        this.c = lxhVar;
        this.a = executor;
        boolean o = kdgVar.o();
        this.f = o;
        if (o) {
            limVar = new lir(bvjjVar);
        } else {
            limVar = new lim();
        }
        lil lilVar = limVar;
        this.e = lilVar;
        Context context = cqkjVar.d;
        this.l = context;
        this.b = new liq(context, asxuVar, asxwVar, executor, akfaVar, context.getResources(), bvslVar, jzpVar.h(), lfgVar, aufcVar, npzVar, bvjjVar, kcvVar, lilVar);
        if (o) {
            lgxVar = new lid();
        } else {
            lgxVar = new lgx();
        }
        cqkf<lig> d = cqkjVar.d(lgxVar, ((npb) notVar).b, false);
        this.d = d;
        kxn k2 = kxo.k();
        k2.k();
        this.q = new kxs(d.c(), k2, kxuVar);
        if (btvoVar.getCarParameters().g) {
            nln nlnVar = new nln(context);
            nlm nlmVar = new nlm(dzsjVar, bvrbVar, nlnVar, context);
            boolean z = btvoVar.getCarParameters().b;
            boolean z2 = btvoVar.getCarParameters().c;
            if (nky.a(bvjjVar)) {
                this.r = new nky(bvjjVar, nlmVar);
            } else {
                this.r = new nle(ahjqVar, axwqVar, akfaVar, executor, btrmVar2, cqatVar, ksrVar, nlnVar, nlmVar, new nkz(lfe.a), bvrbVar, crfrVar, z, z2, vul.FREE_NAV, 2);
            }
        }
    }

    @Override // defpackage.nor, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.d.e(this.b);
        nlz nlzVar = this.r;
        if (nlzVar != null) {
            final liq liqVar = this.b;
            liqVar.getClass();
            nlzVar.b(new nly(liqVar) { // from class: lff
                private final liq a;

                {
                    this.a = liqVar;
                }

                @Override // defpackage.nly
                public final void a(dcdc dcdcVar) {
                    this.a.x(dcdcVar);
                }
            });
        }
    }

    @Override // defpackage.non
    public final noq b() {
        if (this.f) {
            l(false);
            m(false);
            k();
        } else {
            s(i);
        }
        this.o.m(kdd.FREE_NAV);
        this.g = false;
        this.c.a();
        btrm btrmVar = this.n;
        lfh lfhVar = this.p;
        dceq a = dcet.a();
        a.b(alhl.class, new lfl(0, alhl.class, lfhVar, bvrj.UI_THREAD));
        a.b(alhw.class, new lfl(1, alhw.class, lfhVar, bvrj.UI_THREAD));
        btrmVar.g(lfhVar, a.a());
        nlz nlzVar = this.r;
        if (nlzVar != null) {
            nlzVar.e();
        }
        this.q.a();
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.d.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.q.b();
        this.n.a(this.p);
        if (!this.g) {
            this.c.b();
        }
        if (this.f) {
            this.o.h(this, false);
            this.o.l(this, false);
        }
        this.o.n(kdd.FREE_NAV);
        nlz nlzVar = this.r;
        if (nlzVar != null) {
            nlzVar.f();
        }
        this.b.w();
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        nlz nlzVar = this.r;
        if (nlzVar != null) {
            nlzVar.d();
        }
        this.d.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "SuggestedDestinationsOverlay";
    }

    @Override // defpackage.nor, defpackage.non
    public final boolean h() {
        return true;
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.d.c().getViewTreeObserver().addOnPreDrawListener(new lfj(this));
        this.m.b(noeVar, this.d.c());
    }

    public final void k() {
        if (this.e.a()) {
            s(j);
        } else {
            s(k);
        }
    }

    public final void l(boolean z) {
        if (this.e.b()) {
            this.o.g(this, z);
        } else if (!this.e.a()) {
        } else {
            this.o.h(this, z);
        }
    }

    public final void m(boolean z) {
        if (this.e.b()) {
            this.o.k(this, z);
        } else if (!this.e.a()) {
        } else {
            this.o.l(this, z);
        }
    }
}
