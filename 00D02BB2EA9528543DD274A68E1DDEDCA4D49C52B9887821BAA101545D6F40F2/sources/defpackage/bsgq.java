package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bsgq  reason: default package */
/* loaded from: classes4.dex */
public class bsgq extends cqiw<bsgz> {
    public static final /* synthetic */ int a = 0;
    private static final cqrp b = cqrp.d(8.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, bsgz bsgzVar, Context context) {
        bsgz bsgzVar2 = bsgzVar;
        cqiv cqivVar = new cqiv();
        int intValue = bsgzVar2.c().intValue();
        for (int i2 = 0; i2 < intValue; i2++) {
            cqivVar.a(new bsgp(i2), bsgzVar2);
            if (i2 < intValue - 1 && bsgzVar2.Rg(i2).booleanValue()) {
                cqivVar.a(new hsd(), hsd.d(b));
            }
        }
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bsgz> a() {
        return cqgr.gd(cqgr.P(false), cqgr.L(false), cqgr.M(false), cqgr.dr(1), cqgr.aJ(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(ibn.f()), cqgr.dQ(ibn.f()), cqgr.dF(ibn.f()), e(), cqgr.fY(cqgr.aI(bsgd.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.P(false), cqgr.L(false), cqgr.M(false), cqgr.ga(cqgr.ep(false), cqgr.av(true), cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.aJ(17), cqgr.ck(C())))));
    }

    protected cqmj<bsgz> e() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bq(ibn.a()), cqgr.bw(16), cqgr.gq(ibq.l(), ibq.v(), cqgr.eM(bsge.a), cqgr.aJ(16), cqgr.bq(ibn.a())), cqgr.gd(cqgr.aF(cqjv.x(bsgf.a)), cqgr.bq(ibn.a()), cqgr.aJ(16), cqgr.gq(cqgr.aJ(16), cqgr.eI(" · ")), cqgr.gq(cqgr.aJ(16), cqgr.eM(bsgg.a))));
    }
}
