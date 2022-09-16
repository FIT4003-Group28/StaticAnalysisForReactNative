package com.google.android.libraries.youtube.mdx;

import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FeatureFlagsImpl implements acwn, ynl {
    private aypg A;
    private aypg B;
    private ankt C;
    private ankt D;
    public final afvn a;
    public final acwu b;
    public final whp c;
    private final yni n;
    private final Executor o;
    private final Executor p;
    private final aaqd q;
    private final axwq r;
    private aypg w;
    private aypg x;
    private aypg y;
    private ayoi z;
    public final azpm d = azpm.e();
    public final azpm e = azpm.e();
    public final azpm f = azpm.e();
    public final azpm g = azpm.e();
    public final azpm h = azpm.e();
    public final azpm i = azpm.e();
    private final azpm s = azpm.e();
    private final azpm t = azpm.e();
    public final azpm l = azpm.e();
    public final azpm m = azpm.e();
    public final azpm j = azpm.e();
    private final azpm u = azpm.e();
    public final azpm k = azpm.e();
    private final azpm v = azpm.e();

    public FeatureFlagsImpl(yni yniVar, Executor executor, Executor executor2, afvn afvnVar, aaqd aaqdVar, acwu acwuVar, axwq axwqVar, whp whpVar) {
        this.n = yniVar;
        this.o = executor;
        this.p = executor2;
        this.a = afvnVar;
        this.q = aaqdVar;
        this.b = acwuVar;
        this.r = axwqVar;
        this.c = whpVar;
    }

    @Override // defpackage.acwn
    public final ayoi g() {
        return this.e;
    }

    @Override // defpackage.acwn
    public final ayoi h() {
        return this.i;
    }

    @Override // defpackage.acwn
    public final ayoi i() {
        return this.d;
    }

    @Override // defpackage.acwn
    public final ayoi j() {
        return this.g;
    }

    @Override // defpackage.acwn
    public final ayoi k() {
        return this.f;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                p();
                o();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }

    @Override // defpackage.acwn
    public final ayoi l() {
        return this.h;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.acwn
    public final ayoi m() {
        return this.t;
    }

    @Override // defpackage.acwn
    public final ayoi n() {
        return this.s;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.n.m(this);
        ankt anktVar = this.C;
        if (anktVar != null && !anktVar.isDone()) {
            this.C.cancel(true);
        }
        ankt anktVar2 = this.D;
        if (anktVar2 != null && !anktVar2.isDone()) {
            this.D.cancel(true);
        }
        aypg aypgVar = this.w;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        aypg aypgVar2 = this.x;
        if (aypgVar2 != null) {
            ayqi.c((AtomicReference) aypgVar2);
        }
        aypg aypgVar3 = this.y;
        if (aypgVar3 != null) {
            ayqi.c((AtomicReference) aypgVar3);
        }
        aypg aypgVar4 = this.A;
        if (aypgVar4 != null) {
            ayqi.c((AtomicReference) aypgVar4);
        }
        aypg aypgVar5 = this.B;
        if (aypgVar5 != null) {
            ayqi.c((AtomicReference) aypgVar5);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.n.g(this);
        p();
        o();
        aypg aypgVar = this.w;
        aypg aypgVar2 = null;
        if (aypgVar == null || aypgVar.e()) {
            azpm azpmVar = this.q.a;
            this.w = azpmVar == null ? null : azpmVar.as(new acwr(this, 1));
        }
        aypg aypgVar3 = this.x;
        if (aypgVar3 == null || aypgVar3.e()) {
            axwq axwqVar = this.r;
            if (axwqVar != null) {
                aypgVar2 = axwqVar.a.a.V(ajcg.q).B().as(new acwr(this));
            }
            this.x = aypgVar2;
        }
        aypg aypgVar4 = this.y;
        if (aypgVar4 == null || aypgVar4.e()) {
            ayoi p = ayoi.p(this.u, this.j, this.v, this.k, ojc.c);
            this.z = p;
            this.y = p.as(new acwr(this, 2));
        }
        this.A = ayoi.m(this.z, this.l, nti.m).as(new acws(this.s));
        this.B = ayoi.m(this.z, this.m, new aypx() { // from class: acwq
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                FeatureFlagsImpl featureFlagsImpl = FeatureFlagsImpl.this;
                Boolean bool = (Boolean) obj2;
                boolean z = false;
                if ((((Boolean) obj).booleanValue() || bool.booleanValue()) && featureFlagsImpl.b.y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).as(new acws(this.t));
    }

    public final void o() {
        ankt u = anlz.u(new acwo(this), this.o);
        this.D = u;
        ylx.k(u, this.p, acsn.d, new acwp(this.v));
    }

    public final void p() {
        ankt u = anlz.u(new acwo(this, 1), this.o);
        this.C = u;
        ylx.k(u, this.p, acsn.e, new acwp(this.u));
    }
}
