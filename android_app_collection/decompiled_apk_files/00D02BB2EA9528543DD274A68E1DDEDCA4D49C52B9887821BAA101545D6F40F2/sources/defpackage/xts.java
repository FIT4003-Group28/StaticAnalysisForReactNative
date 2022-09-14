package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xts  reason: default package */
/* loaded from: classes7.dex */
public final class xts extends cqiw<xzp> {
    private static final cqkp c = new xsp();
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final cqiw<cqkp> d = new xsr();

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(cqrp.d(15.5d)), cqgr.dB(cqrp.d(15.5d)), irn.R(), cqgr.x(irm.d), ibq.r(), cqgr.eU(ibm.x()));
        gq.f(cqmpVarArr);
        return gq;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, xzp xzpVar, Context context, cqiv cqivVar) {
        cqiw xxfVar;
        xyv xyvVar;
        xzp xzpVar2 = xzpVar;
        xgv x = xzpVar2.x();
        if (x != null && x.b().booleanValue()) {
            cqivVar.a(new xgr(), x);
            cqivVar.c(uxl.a);
        }
        int i2 = 0;
        while (i2 < xzpVar2.f().size()) {
            xyv xyvVar2 = xzpVar2.f().get(i2);
            if (xyvVar2 instanceof xzo) {
                xyvVar = (xzo) xyvVar2;
                xxfVar = new xwz();
            } else if (xyvVar2 instanceof xzt) {
                xxfVar = new xyg();
                xyvVar = (xzt) xyvVar2;
            } else if (xyvVar2 instanceof xzu) {
                xxfVar = new xyl();
                xyvVar = (xzu) xyvVar2;
            } else if (xyvVar2 instanceof xza) {
                xxfVar = new xpk();
                xyvVar = (xza) xyvVar2;
            } else if (xyvVar2 instanceof xzc) {
                xxfVar = new xqw();
                xyvVar = (xzc) xyvVar2;
            } else if (xyvVar2 instanceof xzr) {
                if (i2 > 0 && (xzpVar2.f().get(i2 - 1) instanceof xzo)) {
                    cqivVar.a(d, c);
                }
                xxfVar = new xxf();
                xyvVar = (xzr) xyvVar2;
            } else {
                if (xyvVar2 instanceof xzs) {
                    boolean z = i2 < xzpVar2.f().size() + (-1) && (xzpVar2.f().get(i2 + 1) instanceof xzo);
                    cqivVar.a(new xxm(), (xzs) xyvVar2);
                    if (z) {
                        cqivVar.a(d, c);
                    }
                }
                i2++;
            }
            cqivVar.a(xxfVar, xyvVar);
            i2++;
        }
        if (xzpVar2.m() != null) {
            cqivVar.a(new xtr(), xzpVar2);
        }
        xys t = xzpVar2.t();
        if (t != null) {
            cqivVar.a(new xnb(), t);
        }
        xzi s = xzpVar2.s();
        if (s != null) {
            cqivVar.a(new xsb(), s);
        }
        cqivVar.a(new xtd(), xzpVar2);
        qjf u = xzpVar2.u();
        if (u != null) {
            cqivVar.a(qiy.a(), u);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<xzp> a() {
        cqmj e = vlh.e(xsl.a, xsm.a, xsn.a, new cqmp[0]);
        cqjg cqjgVar = b;
        cqmp[] cqmpVarArr = {cqgr.fH(xso.a), cqgr.az(true), cqgr.dr(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.aT(cqjgVar), e};
        cqjb<xzp, cqiv> C = C();
        Integer valueOf = Integer.valueOf((int) R.id.details_cardlist);
        return cqgr.gj(cqgr.gd(cqmpVarArr), GmmRecyclerView.aw(C, cqqx.p(null), cqgr.aR(valueOf), cqgr.aT(a), cqgr.bY(cqjd.u(cqjgVar)), cqgr.dU(cqrp.d(dcyn.a)), cqgr.dQ(cqrp.d(dcyn.a)), cqgr.dF(cqrp.d(dcyn.a)), cqgr.fG(new xsq()), cqgr.ep(false), cqgr.P(false)), jdx.b(cqgr.bp(-1), cqgr.cd(-1), cqgr.bY(cqjd.u(cqjgVar)), jdx.c(valueOf)));
    }
}
