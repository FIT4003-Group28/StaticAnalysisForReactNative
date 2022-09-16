package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bkgt  reason: default package */
/* loaded from: classes3.dex */
public class bkgt implements bkgn {
    public final gga a;
    public final ilo b;
    public final bkfq c;
    public final cjqy d;
    public final cjqq e;
    public final dxio<apyz> f;
    public dafk h;
    private final String i;
    private final String j;
    private final cjtd k;
    private final jic l;
    private final Executor m;
    private final boolean n;
    private final dxio<apzh> o;
    private jiy p;
    private View.OnLayoutChangeListener q;
    private boolean s;
    private CharSequence t = "";
    private CharSequence u = "";
    public boolean g = false;
    private boolean r = false;

    public bkgt(ilo iloVar, bkfq bkfqVar, gga ggaVar, akfa akfaVar, cchz cchzVar, cqhn cqhnVar, Executor executor, dxio<apzh> dxioVar, dxio<apyz> dxioVar2, btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar) {
        this.a = ggaVar;
        this.c = bkfqVar;
        this.m = executor;
        this.o = dxioVar;
        this.f = dxioVar2;
        this.d = cjqyVar;
        this.e = cjqqVar;
        boolean z = false;
        btlu j = akfaVar.j();
        String v = j.v();
        this.i = dbsj.d(v) ? ggaVar.getString(R.string.PLACE_QA_FALLBACK_USER_NAME) : v;
        this.j = j.t();
        this.b = iloVar;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.lB;
        this.k = c.a();
        String str = null;
        if (j.l() && !iloVar.bf().r) {
            str = cchzVar.c(j);
        }
        this.l = new jic(str, ckqc.FIFE_MERGE, true != iloVar.bf().r ? 2131232998 : 2131231770);
        int a = dkhq.a(btvoVar.getBusinessMessagingParameters().s);
        a = a == 0 ? 1 : a;
        this.n = (a == 2 || a == 3) ? true : z;
    }

    @Override // defpackage.bkgn
    public void A(CharSequence charSequence) {
        this.t = charSequence;
        cqkx.p(this);
    }

    @Override // defpackage.bkgn
    public CharSequence B() {
        if (!this.r || !this.t.toString().trim().isEmpty()) {
            return null;
        }
        return "";
    }

    @Override // defpackage.bkgn
    public cqkl C() {
        M(dbpy.a);
        return cqkl.a;
    }

    @Override // defpackage.bkgn
    public cjtd D() {
        return this.k;
    }

    @Override // defpackage.bkgn
    public Boolean E() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.bkgn
    public Boolean F() {
        boolean z = true;
        if (this.n) {
            if (this.g || this.u.toString().trim().isEmpty() || !this.u.toString().trim().matches("^\\d{5}(?:-\\d{4})?$")) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (this.g || this.t.toString().trim().isEmpty()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bkgn
    public Boolean G() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.bkgn
    public void H(CharSequence charSequence) {
        this.u = charSequence;
        cqkx.p(this);
    }

    @Override // defpackage.bkgn
    public CharSequence I() {
        return this.u;
    }

    @Override // defpackage.bkgn
    public jiy J() {
        if (this.p == null) {
            this.p = new jiy(this) { // from class: bkgr
                private final bkgt a;

                {
                    this.a = this;
                }

                @Override // defpackage.jiy
                public final void a(View view) {
                    this.a.N(view);
                }
            };
        }
        return this.p;
    }

    @Override // defpackage.bkgn
    public View.OnLayoutChangeListener K() {
        if (this.q == null) {
            this.q = new View.OnLayoutChangeListener(this) { // from class: bkgs
                private final bkgt a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    this.a.N(view);
                }
            };
        }
        return this.q;
    }

    @Override // defpackage.bkgn
    public Boolean L() {
        return Boolean.valueOf(this.s);
    }

    public final void M(dbsg<apyw> dbsgVar) {
        final dehn<dbsg<apyw>> a;
        if (this.g) {
            return;
        }
        this.r = true;
        this.g = F().booleanValue();
        cqkx.p(this);
        if (!this.g) {
            return;
        }
        if (dbsgVar.a()) {
            a = deha.a(dbsgVar);
        } else {
            dcdg dcdgVar = new dcdg();
            if (this.n) {
                dcdgVar.f(this.a.getString(R.string.BUSINESS_MESSAGING_QUOTE_FORM_ZIPCODE), this.u.toString());
            }
            if (!this.t.toString().isEmpty()) {
                dcdgVar.f(this.a.getString(R.string.BUSINESS_MESSAGING_QUOTE_FORM_DETAILS), this.t.toString());
            }
            a = this.o.a().a(this.b, dcdgVar.b(), this.a.getString(R.string.BUSINESS_MESSAGING_QUOTE_REQUEST_TITLE));
        }
        deew.h(deew.g(a, new defg(this) { // from class: bkgo
            private final bkgt a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                bkgt bkgtVar = this.a;
                dbsg dbsgVar2 = (dbsg) obj;
                if (dbsgVar2 == null || !dbsgVar2.a()) {
                    return deha.a(false);
                }
                return bkgtVar.f.a().B((apyw) dbsgVar2.b());
            }
        }, dege.a), new dbrn(this, a) { // from class: bkgp
            private final bkgt a;
            private final dehn b;

            {
                this.a = this;
                this.b = a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v9, types: [dbsg] */
            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bkgt bkgtVar = this.a;
                dehn dehnVar = this.b;
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    final dbpy<Object> dbpyVar = dbpy.a;
                    try {
                        dbpyVar = (dbsg) dehnVar.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                    if (bkgtVar.h == null) {
                        dafk b = ckos.b(bkgtVar.a.findViewById(16908290), R.string.GENERIC_ERROR_MESSAGE, 0);
                        b.t(R.string.GENERIC_TRY_AGAIN_BUTTON, new View.OnClickListener(bkgtVar, dbpyVar) { // from class: bkgq
                            private final bkgt a;
                            private final dbsg b;

                            {
                                this.a = bkgtVar;
                                this.b = dbpyVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bkgt bkgtVar2 = this.a;
                                bkgtVar2.M(this.b);
                                bkgtVar2.d.i(cjtd.a(dtxy.lG));
                            }
                        });
                        bkgtVar.h = b;
                    }
                    if (!bkgtVar.h.f()) {
                        bkgtVar.h.c();
                        bkgtVar.e.g().d(cjtd.a(dtxy.lA));
                    }
                    bkgtVar.g = false;
                    cqkx.p(bkgtVar);
                    return null;
                } else if (bkgtVar.a.g() == null) {
                    return null;
                } else {
                    gn g = bkgtVar.a.g();
                    dbsk.s(g);
                    if (g.J()) {
                        return null;
                    }
                    if (bkgtVar.a.K() instanceof bkfq) {
                        bkgtVar.a.g().e();
                    }
                    bkgtVar.c.Nw(new bkgm(bkgtVar.b));
                    return null;
                }
            }
        }, this.m);
    }

    public final void N(View view) {
        boolean canScrollVertically = view.canScrollVertically(1);
        if (this.s != canScrollVertically) {
            this.s = canScrollVertically;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bkgn
    public String a() {
        return this.a.getString(R.string.BUSINESS_MESSAGING_SENDING_AS, new Object[]{this.i});
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
        return jaw.a();
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

    @Override // defpackage.bkgn
    public String x() {
        return this.j;
    }

    @Override // defpackage.bkgn
    public jic y() {
        return this.l;
    }

    @Override // defpackage.bkgn
    public CharSequence z() {
        return this.t;
    }
}
