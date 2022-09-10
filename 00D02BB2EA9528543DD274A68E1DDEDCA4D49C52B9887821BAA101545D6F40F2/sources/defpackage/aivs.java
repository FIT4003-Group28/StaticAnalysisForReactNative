package defpackage;

import android.view.animation.OvershootInterpolator;
/* compiled from: PG */
/* renamed from: aivs  reason: default package */
/* loaded from: classes2.dex */
public final class aivs extends cqiw<aivr> {
    private static final cqgq a;
    private static final cqgq b;

    static {
        cqgq n = cqgr.n();
        n.d = 250;
        Float valueOf = Float.valueOf(1.0f);
        n.a = valueOf;
        n.f = valueOf;
        n.g = valueOf;
        n.c = new OvershootInterpolator();
        n.e = 125L;
        a = n;
        cqgq n2 = cqgr.n();
        n2.d = 250;
        n2.a = Float.valueOf(0.0f);
        n2.c = new OvershootInterpolator();
        Float valueOf2 = Float.valueOf(0.45f);
        n2.f = valueOf2;
        n2.g = valueOf2;
        b = n2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aivr> a() {
        cqmp[] cqmpVarArr = {hxc.b(aivl.a)};
        cqmp[] cqmpVarArr2 = {cqgr.aF(cqjv.x(aivm.a))};
        Float valueOf = Float.valueOf(0.45f);
        cqmj fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.ek(valueOf), cqgr.el(valueOf), cqgr.i(0), cqgr.fR(new aiwe(), aivo.a, new cqmp[0]));
        fY.f(new cqmp[0]);
        fY.f(cqjv.l(cqjv.x(aivp.a), b.b(), a.b()));
        cqmj d = ise.d();
        d.f(cqgr.aI(aivq.a), cqgr.p(true));
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.p(true), hxc.a(cqmpVarArr), ict.n(false, cqmpVarArr2), fY, d, ict.n(false, cqgr.aI(aivn.a)));
    }
}
