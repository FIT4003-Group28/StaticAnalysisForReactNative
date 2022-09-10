package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aelf  reason: default package */
/* loaded from: classes2.dex */
public abstract class aelf extends cqiw<aeni> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(56.0d);

    @SafeVarargs
    private final cqmj<aeni> j(cqmp<aeni>... cqmpVarArr) {
        cqmj<aeni> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(8388629), hyb.d(ibn.s(), cqgr.cd(-2), cqgr.bp(-2), cqgr.eL(Integer.valueOf((int) R.string.HOTEL_DIALOG_CANCEL_BUTTON)), cqgr.cW(cqgr.q(aele.a))), i());
        gd.f(cqmpVarArr);
        return gd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aeni> a() {
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.x(ibm.b()), f(), h(), j(cqgr.cH(b), cqgr.x(ibm.b()), cqgr.ap(cqrp.d(30.0d))));
        gd.g(cqic.e(aelc.a, new cqmp[0]));
        cqmj gd2 = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.x(ibm.b()), e(), cqgr.gk(cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(4.0f)), g()), j(cqgr.dB(cqrp.d(8.0d))));
        gd2.g(cqic.b(aeld.a, new cqmp[0]));
        return cqgr.fY(gd, gd2);
    }

    protected abstract cqmp<aeni> e();

    protected abstract cqmp<aeni> f();

    protected abstract cqmp<aeni> g();

    protected abstract cqmp<aeni> h();

    protected abstract cqmp<aeni> i();
}
