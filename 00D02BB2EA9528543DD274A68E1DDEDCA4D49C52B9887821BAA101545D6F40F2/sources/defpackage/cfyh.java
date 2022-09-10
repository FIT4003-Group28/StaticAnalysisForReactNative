package defpackage;

import android.view.animation.AlphaAnimation;
/* compiled from: PG */
/* renamed from: cfyh  reason: default package */
/* loaded from: classes4.dex */
public final class cfyh extends cqiw<cfyi> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cfyi> a() {
        cqmp[] cqmpVarArr = {cqgr.aF(cfya.a)};
        final cqmj fY = cqgr.fY(cqgr.fP(new cfzt(), cfyf.a, new cqmp[0]));
        final cqmj fY2 = cqgr.fY(cqgr.fP(new cfzt(), cfyg.a, new cqmp[0]));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(750L);
        alphaAnimation.setStartOffset(250L);
        alphaAnimation.setInterpolator(new aop());
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(750L);
        alphaAnimation2.setInterpolator(new aon());
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.aJ(1), cqgr.gv(fY, fY2, cqgr.o(false), cqgr.aY(alphaAnimation), cqgr.du(alphaAnimation2), cqgr.ad(new cqlc(fY, fY2) { // from class: cfxz
            private final cqmj a;
            private final cqmj b;

            {
                this.a = fY;
                this.b = fY2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqmj cqmjVar = this.a;
                cqmj cqmjVar2 = this.b;
                int i = cfyh.a;
                return ((cfyi) cqkpVar).a().booleanValue() ? cqmjVar.c() : cqmjVar2.c();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })));
        gd.f(cqmpVarArr);
        return cqgr.fY(cfun.b(), cqgr.aI(cfxy.a), cqgr.gd(cqgr.dr(1), cqgr.aJ(1), gd, cqgr.fP(new cfyx(), cfyb.a, cqgr.aI(cfyc.a)), cqgr.fP(new cftx(), cfyd.a, cqgr.bV(cqrp.d(16.0d)), cqgr.aF(cfye.a))));
    }
}
