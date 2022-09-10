package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import com.google.android.libraries.curvular.value.ForegroundColorViewPropertyValueSpan;
import defpackage.aryn;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atsh  reason: default package */
/* loaded from: classes2.dex */
public abstract class atsh<T extends aryn> extends atth<crqr<T>> {
    private final bvsx C;
    @dzsi
    private astg D;
    private final vtn E;
    private final ddho F;
    private final ddho G;
    private final ddho H;
    private final ddho I;
    private final ddho J;
    private final ddho K;
    private final boolean L;
    private List<zdn> M;
    private final atsn N;
    private final atsg O;
    public final T b;
    public final dbsg<atcw> c;
    public final Context d;
    static final alfa a = alfa.SHOW_NONE;
    private static final cqss A = iva.b(ire.q(), ire.c());
    private static final cqrp B = cqrp.d(19.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    public atsh(crqr<T> crqrVar, dbsg<atcw> dbsgVar, btrm btrmVar, btvo btvoVar, cref crefVar, Context context, Resources resources, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, vtn vtnVar, ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5, ddho ddhoVar6, boolean z, boolean z2, long j) {
        super(crqrVar, context, btrmVar, btvoVar, crefVar, resources, cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, j);
        this.D = null;
        this.N = new atsf(this);
        this.O = new atsg(this);
        this.b = crqrVar.a;
        this.c = dbsgVar;
        this.d = context;
        this.L = z2;
        this.F = ddhoVar;
        this.G = ddhoVar2;
        this.H = ddhoVar3;
        this.I = ddhoVar4;
        this.J = ddhoVar5;
        this.K = ddhoVar6;
        this.C = new bvsx(resources);
        this.M = new ArrayList();
        this.E = vtnVar;
    }

    @dzsi
    private final String G() {
        if (ap()) {
            return this.b.d();
        }
        return null;
    }

    private final atxv ao(int i) {
        if (i >= 10) {
            return atxv.REPLACE_STOP;
        }
        if (ap()) {
            return atxv.ADD_STOP;
        }
        return atxv.REROUTE;
    }

    private final boolean ap() {
        T t = this.e;
        return (t instanceof crqq) || (t instanceof crqp);
    }

    private final cjtd aq(@dzsi String str, ddho ddhoVar) {
        cjta c = cjtd.c(this.b.h());
        c.d = ddhoVar;
        c.b = str;
        return c.a();
    }

    private final void ar(String str, ddho ddhoVar) {
        N();
        this.p = null;
        this.q = null;
        B(new CharSequence[0]);
        cjta c = cjtd.c(this.b.h());
        c.d = ddhoVar;
        this.v = c.a();
        atsm S = S(true);
        S.h = cjtd.a(this.I);
        M(S.a());
        this.p = str;
        H(iva.g(2131232649, 2131232651));
        an();
        if (!r()) {
            q();
        }
        cqkx.p(this);
    }

    private final CharSequence l(int i, bvsw bvswVar) {
        return bvtb.f(this.d.getResources(), i, bvsz.ABBREVIATED, bvswVar);
    }

    private final cqsn m(int i) {
        if (i >= 10) {
            return atso.d(i - 9);
        }
        if (ap()) {
            return atso.f;
        }
        return atso.d;
    }

    private final cqsn s(int i) {
        if (i >= 10) {
            return atso.e(i - 9);
        }
        if (ap()) {
            return atso.g;
        }
        return atso.e;
    }

    @Override // defpackage.atss, defpackage.atxz
    public synchronized void Oa() {
        super.Oa();
        if (((crqr) this.e).j()) {
            g();
            return;
        }
        btrm btrmVar = this.g;
        atsg atsgVar = this.O;
        dceq a2 = dcet.a();
        a2.b(crht.class, new atsi(crht.class, atsgVar, bvrj.UI_THREAD));
        btrmVar.g(atsgVar, a2.a());
    }

    @Override // defpackage.atss, defpackage.atxz
    public synchronized void Ob() {
        if (this.c.a() && this.D != null) {
            this.D = null;
            this.c.b().D(null);
        }
        if (!((crqr) this.e).j()) {
            atsi.b(this.g, this.O);
        }
        super.Ob();
    }

    @Override // defpackage.atss, defpackage.atxz
    public Boolean c() {
        return Boolean.valueOf(!((crqr) this.e).j());
    }

    protected abstract void d();

    protected abstract boolean e();

    public final CharSequence f(int i, int i2) {
        bvsw bvswVar = new bvsw();
        bvswVar.c();
        Object l = l(i, bvswVar);
        dpej dpejVar = dpej.DELAY_NODATA;
        amuh amuhVar = ((crqr) this.e).e;
        dbsk.t(amuhVar, "routeList");
        amve amveVar = amuhVar.k().d;
        if (amveVar.e() > 0) {
            doxd doxdVar = amveVar.d(0).a().k;
            if (doxdVar == null) {
                doxdVar = doxd.l;
            }
            dpejVar = dpej.b(doxdVar.c);
            if (dpejVar == null) {
                dpejVar = dpej.DELAY_NODATA;
            }
        }
        if (dpejVar != dpej.DELAY_NODATA) {
            bvsv a2 = this.C.a(l);
            a2.j(new ForegroundColorViewPropertyValueSpan(this.d, yyq.a(dpejVar)));
            l = a2.c();
        }
        bvsv a3 = this.C.a(l);
        float e = B.e(this.d);
        for (zdn zdnVar : this.M) {
            a3.g(" ");
            cqtd a4 = zdnVar.a();
            if (a4 != null) {
                a3.g(this.C.f(a4.a(this.d), e, e));
            }
        }
        if (i2 > 0) {
            a3.g("  •  ");
            bvsv a5 = this.C.a(this.d.getString(R.string.POI_PROMPT_DETOUR, l(i2, new bvsw())));
            a5.j(new ForegroundColorViewPropertyValueSpan(this.d, A));
            a3.g(a5.c());
        }
        return a3.c();
    }

    public final void g() {
        crqr crqrVar = (crqr) this.e;
        boolean z = false;
        if (crqrVar.d) {
            N();
            cjta c = cjtd.c(this.b.h());
            c.d = this.J;
            this.v = c.a();
            atsm S = S(true);
            S.h = cjtd.a(this.K);
            M(S.a());
            B(this.d.getString(R.string.POI_PROMPT_EXISTING_DESTINATION));
            if (!r()) {
                q();
            }
            cqkx.p(this);
        } else if (crqrVar.i()) {
            ((crqr) this.e).m();
            ar(this.d.getString(R.string.CANT_REACH_GOOGLE_MAPS, dtxw.ap), this.H);
        } else if (!((crqr) this.e).d()) {
            amuh amuhVar = ((crqr) this.e).e;
            dbsk.t(amuhVar, "routeList");
            amub k = amuhVar.k();
            dgas x = vyb.x(k.d);
            dbsk.s(x);
            int a2 = x.b - ((crqr) this.e).c.a();
            int E = k.E();
            dcdc<dovn> dcdcVar = k.e;
            if (dcdcVar != null) {
                this.M = zry.c(this.E, dcdcVar, new atse(this, E, a2));
            }
            this.q = f(E, a2);
            if (!r()) {
                q();
            }
            i(k);
            String f = k.f();
            int ai = ((crqr) this.e).c.a.ai();
            if (I().isEmpty()) {
                atsm S2 = S(!this.L);
                S2.h = aq(f, this.F);
                S2.c = atso.b;
                M(S2.a());
                atsm R = R(this.L);
                R.b();
                R.f = ao(ai);
                R.c = m(ai);
                R.d = s(ai);
                R.e = G();
                R.g = this.N;
                R.h = aq(f, this.G);
                j(R.a());
            } else {
                if (I().size() == 2) {
                    z = true;
                }
                dbsk.n(z, "A Navigation POI prompt should have exactly 2 buttons, but found %s instead.", I().size());
                atxw T = T();
                atxw k2 = k();
                if ((T instanceof atso) && (k2 instanceof atso)) {
                    N();
                    atsm atsmVar = new atsm((atso) T);
                    atsmVar.h = aq(f, this.F);
                    M(atsmVar.a());
                    atsm atsmVar2 = new atsm((atso) k2);
                    atsmVar2.b();
                    atsmVar2.c = m(ai);
                    atsmVar2.d = s(ai);
                    atsmVar2.e = G();
                    atsmVar2.f = ao(ai);
                    atsmVar2.h = aq(f, this.G);
                    j(atsmVar2.a());
                }
            }
            cqkx.p(this);
            d();
        } else {
            ((crqr) this.e).l(null);
            ar(this.d.getString(R.string.CANT_FIND_A_WAY_THERE), dtxw.ao);
        }
    }

    protected amuh h(amub amubVar, amub amubVar2) {
        return amuh.e(0, amubVar, amubVar2);
    }

    public void i(@dzsi amub amubVar) {
        if (this.c.a() && amubVar != null) {
            amuh h = h(((crqr) this.e).c.a, amubVar);
            astf f = astg.f();
            f.e(h);
            f.d(a);
            f.c(true);
            this.D = f.a();
            this.c.b().D(this.D);
            if (!e()) {
                return;
            }
            this.c.b().A(false, new aslo(amubVar, 0, amubVar.G()));
        }
    }
}
