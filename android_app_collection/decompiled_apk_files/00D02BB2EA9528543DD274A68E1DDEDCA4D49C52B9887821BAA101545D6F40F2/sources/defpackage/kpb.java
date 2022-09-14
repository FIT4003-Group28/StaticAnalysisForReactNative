package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: kpb  reason: default package */
/* loaded from: classes7.dex */
public final class kpb extends cqiw<kpc> {
    public static final cqtv a = cqrp.d(20.0d);
    public static final cqtv b = cqrp.d(36.0d);
    private static final cqtv c = cqrp.d(345.0d);
    private final boolean d;
    private final int e;
    private final cjtd f;

    public kpb(boolean z, int i, cjtd cjtdVar) {
        super(Boolean.valueOf(z), Integer.valueOf(i), cjtdVar);
        this.d = z;
        this.e = i;
        this.f = cjtdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<kpc> a() {
        cqnf bV;
        cqmp[] cqmpVarArr = new cqmp[10];
        cqmpVarArr[0] = cqgr.aR(Integer.valueOf((int) R.id.ev_profile_tooltip));
        cqmpVarArr[1] = iue.b(this.f);
        cqmpVarArr[2] = cqgr.cd(-2);
        cqmpVarArr[3] = cqgr.bp(-2);
        cqmpVarArr[4] = cqgr.cW(cqgr.q(koz.a));
        cqmpVarArr[5] = cqgr.bR(cqsg.d(nqo.am, nqo.Q));
        if (this.d) {
            bV = cqgr.bV(cqsg.d(nqo.Q, nqo.aE));
        } else {
            bV = cqgr.bV(cqrp.d(dcyn.a));
        }
        cqmpVarArr[6] = bV;
        cqmpVarArr[7] = cqgr.x(cqta.f());
        cqmpVarArr[8] = cqgr.fY(cqgr.ap(nqo.ae), cqgr.bR(nqo.Q), cqgr.ce(a), cqgr.bq(b), cqgr.bw(16), cqgr.x(cqtt.p(new kpa(new Object[0]), nql.aM)));
        cqmpVarArr[9] = nsc.a(cqgr.cd(-2), cqgr.bp(-2), cqgr.bV(nqo.Q), cqgr.bG(nqo.Q), cqgr.bD(nqo.Q), cqqx.g(nqo.ad), cqqx.i(nqo.ae), new cqmh(ntp.class, cqgr.cd(-2), cqgr.bp(-2), cqgr.cz(c), cqgr.ar(null), cqgr.dQ(nqo.R), cqgr.dF(nqo.R), cqgr.aJ(16), nre.s(cqrp.d(18.0d), cqrp.d(18.0d)), cqgr.eL(Integer.valueOf(this.e))));
        return cqgr.gd(cqmpVarArr);
    }
}
