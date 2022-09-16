package defpackage;

import android.content.Context;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: chhn  reason: default package */
/* loaded from: classes4.dex */
public final class chhn extends cqiw<chmz> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();
    private static final cqjg e = cqjg.a();
    private static final cqjg f = cqjg.a();
    public static final cqtv c = cqrp.d(15.0d);
    public static final cqtv d = cqsv.f(35.0d, 161.0d, 35.0d, 161.0d);

    private static AlphaAnimation e(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setDuration(500L);
        return alphaAnimation;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, chmz chmzVar, Context context, cqiv cqivVar) {
        cqiw chhlVar;
        Collection v;
        chmz chmzVar2 = chmzVar;
        if (i == 1) {
            chhlVar = new chhl();
            v = chmzVar2.v();
        } else if (i != 2) {
            return;
        } else {
            chhlVar = new chgd();
            v = chmzVar2.g();
        }
        cqivVar.f(chhlVar, v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<chmz> a() {
        cqjb<chmz, cqiv> D = D(1);
        cqmp[] cqmpVarArr = {cqgr.aT(chmz.m), cqgr.cd(-1), cqgr.bp(-1), cqgr.fu(true), cqqx.r(new chhe(new Object[0])), cqqx.t(B().x()), cqgr.fD(B().y()), cqqx.I(), cqgr.ep(false)};
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bq(cqrp.d(48.0d)), cqjv.i(jea.CAROUSEL_DOTS_COUNT, cqjv.z(B().v()), jeb.a), cqjv.i(jea.CAROUSEL_DOTS_INDEX, B().w(), jeb.a)};
        Boolean A = cqjv.A(B().s(), 1);
        cqjg cqjgVar = f;
        cqnf ac = cqgr.ac(cqjgVar);
        cqjg cqjgVar2 = e;
        chmw h = B().h();
        cqmp[] cqmpVarArr3 = {cqgr.aT(cqjgVar2)};
        cqmj gd = cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.dr(1), cqgr.bV(cqrp.d(22.0d)), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqjv.k(cqjv.r(F(), E()), cqgr.dr(0), cqgr.dr(1)), cqgr.ck(D(2))), cqgr.fQ(new chgd(), h, cqgr.bw(1)));
        gd.f(cqmpVarArr3);
        return cqgr.gk(cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(17), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), GmmRecyclerView.aw(D, cqmpVarArr), jeb.a(cqmpVarArr2), cqgr.gt(cqgr.bw(1), cqgr.bp(-2), cqgr.cd(-1), cqgr.aY(e(0.0f, 1.0f)), cqgr.du(e(1.0f, 0.0f)), cqgr.o(false), cqjv.k(A, ac, cqgr.ac(cqjgVar2)), gd, cqgr.gs(cqgr.aT(cqjgVar)))));
    }
}
