package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aend  reason: default package */
/* loaded from: classes2.dex */
final class aend extends cqiw<aeng> {
    public static final /* synthetic */ int a = 0;
    private final Integer b;
    private final boolean c;

    public aend(Integer num, boolean z) {
        super(num, Boolean.valueOf(z));
        this.b = num;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aeng> a() {
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.K(aemx.a);
        cqmpVarArr[1] = cqgr.cW(acly.a(aemy.a));
        cqmpVarArr[2] = iue.c(aemz.a);
        cqmpVarArr[3] = cqgr.cL(ibn.a());
        cqmpVarArr[4] = cqgr.cd(0);
        cqmpVarArr[5] = cqgr.ca(Float.valueOf(1.0f));
        cqmj gq = cqgr.gq(cqgr.bv(3), cqgr.bV(aene.b), cqgr.aJ(16), cqgr.dU(cqrp.d(10.0d)), cqgr.dB(cqrp.d(11.0d)), cqgr.dQ(ibn.f()), cqgr.dF(ibn.d()), cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.y(aena.a), cqgr.eN(5), cqgr.V(aenb.a), ibq.p(), cqgr.eU(irg.J()), cqgr.eM(aenc.a));
        if (this.c) {
            gq.g(cqgr.cH(ibn.a()));
        }
        cqmpVarArr[6] = gq;
        cqmpVarArr[7] = cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.x(ibm.b()), cqgr.dQ(cqrp.d(4.0d)), cqgr.dF(cqrp.d(4.0d)), cqgr.aZ(false), cqgr.eN(5), cqgr.bR(cqsg.g(ibn.f(), cqrp.d(4.0d))), ibq.q(), ibq.y(), cqgr.eM(cqle.a(this.b.intValue())));
        cqmj<aeng> fY = cqgr.fY(cqmpVarArr);
        if (this.c) {
            return fY;
        }
        fY.g(cqgr.cH(ibn.a()));
        return fY;
    }
}
