package defpackage;

import android.content.Context;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: bfra  reason: default package */
/* loaded from: classes3.dex */
final class bfra extends cqiw<bfrc> {
    private static final cqrp a = cqrp.f(19.0d);

    public static final CharSequence e(bfrc bfrcVar, Context context) {
        bvsi bvsiVar = new bvsi(context);
        bvsiVar.c(bfrcVar.d());
        bvsiVar.c(bfrcVar.f());
        bvsiVar.c(bfrcVar.c());
        bvsiVar.c(bfrcVar.e());
        return bvsiVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfrc> a() {
        cqmj gc = cqgr.gc(cqgr.bY(cqjd.f()), cqgr.bq(a), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.bR(ibn.d()), itj.q(), cqgr.eE(cqrt.g(2131232201, ibm.o())));
        cqmp[] cqmpVarArr = {cqgr.bY(cqjd.z(gc))};
        cqmj gq = cqgr.gq(cqgr.cd(-2), cqgr.eN(6), cqgr.bR(ibn.d()), ibq.z(), ibq.l(), cqgr.eU(ibm.t()), cqgr.eM(bfqy.a));
        gq.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqgr.bY(cqjd.e(), cqjd.z(gq))};
        cqmj gq2 = cqgr.gq(cqgr.cd(-2), cqgr.eN(5), ibq.q(), ibq.y(), cqgr.eM(bfqx.a));
        gq2.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqgr.bY(cqjd.e(), cqjd.v(gq2), cqjd.z(gq))};
        cqmj gq3 = cqgr.gq(cqgr.cd(-2), cqgr.eN(5), ibq.q(), ibq.y(), cqgr.eM(bfqz.a));
        gq3.f(cqmpVarArr3);
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), ict.l(cqkz.a(bfqt.a), new cqmp[0]), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dU(ibn.f()), cqgr.dB(ibn.f()), cqgr.dQ(bfqt.a), cqgr.x(ibo.a()), cqgr.cW(cqgr.q(bfqu.a)), iue.c(bfqv.a), cqgr.U(new cqjb() { // from class: bfqw
            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return bfra.e((bfrc) cqkpVar, context);
            }
        }), cqgr.aW(1), gq2, gq, gc, gq3));
    }
}
