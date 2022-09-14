package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: akio  reason: default package */
/* loaded from: classes2.dex */
public final class akio extends akij {
    public static final akgn<aklg> a = new akgt(null, akgt.c, null, null, null, 3);
    public static final akgn<aklg> b = new akgt(akgt.b, akgt.c, null, null, null, 3);
    public static final akgn<aklg> c = new akgt(cqrp.d(279.0d), null, null, null, null, 2);
    public static final akgn<aklg> d = new akgt(null, null, null, null, null, 2);
    private final cqiw<aklg> e;
    private final cqiw<aklg> f;
    private final Integer g;

    public akio(akgn<akld> akgnVar, diii diiiVar, cqiw<aklg> cqiwVar, cqiw<aklg> cqiwVar2) {
        super(akgnVar, diiiVar, cqiwVar, cqiwVar2);
        this.g = Integer.valueOf(cqir.a());
        this.e = cqiwVar;
        this.f = cqiwVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, akld akldVar, Context context) {
        cqiv cqivVar = new cqiv();
        boolean z = false;
        for (aklg aklgVar : akldVar.b()) {
            if (z) {
                cqivVar.a(new hsd(), hsd.d(cqrp.d(4.0d)));
            }
            cqivVar.a(this.f, aklgVar);
            z = true;
        }
        return cqivVar;
    }

    @Override // defpackage.akij
    protected final cqmj<akld> e() {
        cqrp d2 = cqrp.d(14.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.bR(d2), cqgr.bG(d2), cqgr.dU(akhn.a), cqgr.dB(cqrp.d(8.0d)), cqgr.L(false), cqgr.P(false), cqgr.ep(false), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqgr.P(false), cqgr.ga(cqgr.aE(akin.a), cqgr.aR(this.g), cqgr.eh(false), cqgr.dk(akik.a), cqgr.ep(false), cqgr.L(false), cqgr.P(false), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqgr.P(false), cqgr.ck(C()))), cqgr.fY(cqgr.aH(akin.a), cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqgr.P(false), cqgr.fP(this.e, akil.a, new cqmp[0]))), cqgr.fR(new akig(), akim.a, new cqmp[0]));
    }
}
