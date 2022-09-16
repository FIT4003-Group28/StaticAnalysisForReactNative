package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ayju  reason: default package */
/* loaded from: classes3.dex */
public final class ayju extends cqiw<ayms> {
    static final View.AccessibilityDelegate a;
    private static final cqtv b = cqrp.d(8.0d);
    private static final cqtv c;
    private static final cqtv d;
    private static final cqtv e;

    static {
        cqrp d2 = cqrp.d(54.0d);
        c = d2;
        cqrp d3 = cqrp.d(4.0d);
        d = d3;
        e = cqsg.d(d2, d3);
        a = new ayjt();
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, ayms aymsVar, Context context, cqiv cqivVar) {
        for (aymq aymqVar : aymsVar.f()) {
            hyw.x(cqivVar, aymqVar, new ayix());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ayms> a() {
        aycu aycuVar = new aycu(false);
        cqlc cqlcVar = ayiy.a;
        cqmp[] cqmpVarArr = {cqgr.aI(ayjj.a), cqgr.bw(1)};
        cqtv cqtvVar = c;
        cqmj fY = cqgr.fY(cqgr.fR(aycuVar, cqlcVar, cqmpVarArr), cqgr.fY(cqgr.aF(ayjl.a), cqgr.bw(1), cqgr.ch(e), cqgr.x(cqtt.g(ibm.b())), jfx.a(cqgr.ch(cqtvVar), cqgr.bw(17), ict.e(ayjm.a, cqgr.ch(cqtvVar), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE), cqgr.V(ayjn.a), iue.c(ayjo.a), cqgr.cW(ayjp.a), cqgr.K(ayjq.a), cqgr.B(ayjr.a)))));
        cqmj gd = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.aJ(17), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.eN(4), cqgr.eM(ayjs.a), ibq.e(), ibq.v(), cqgr.cB(4), cqgr.ar(TextUtils.TruncateAt.END)), cqgr.gq(cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(cqrp.d(2.0d)), cqgr.dB(cqrp.d(2.0d)), iue.c(ayiz.a), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), ibq.y(), cqgr.eN(4), cqgr.eM(ayja.a)), cqgr.gq(cqgr.aF(cqjv.x(ayjb.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.dU(cqrp.d(2.0d)), cqgr.dB(cqrp.d(2.0d)), iue.c(ayjc.a), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), ibq.y(), cqgr.eN(4), cqgr.eM(ayjd.a)), new cqmh(ayrh.class, cqgr.aW(2), cqgr.V(ayje.a), cqgr.aF(cqjv.x(ayjf.a)), cqgr.cd(-2), cqgr.bp(-2), cqgr.aJ(17), cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(12.0d)), ibq.p(), ibq.x(), cqgr.co(cqrp.d(3.0d), false), cqgr.cB(3), cqgr.u(1), cqgr.eM(ayjg.a), cqgr.eN(4)));
        cqmj b2 = jix.b(cqgr.az(false), cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(0), cqgr.ep(false), cqgr.bV(cqrp.d(4.0d)), cqgr.bR(ibn.o()), cqgr.bG(ibn.o()), cqgr.gd(cqgr.ck(C())));
        iuv b3 = ibm.b();
        cqtv cqtvVar2 = b;
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.a(a), cqgr.bV(cqsg.f(cqtvVar2, Float.valueOf(-1.0f))), cqgr.aJ(17), cqgr.x(ibm.a()), cqgr.L(false), cqgr.gd(cqgr.bV(cqrp.d(21.0d)), cqgr.bp(-2), cqgr.cd(-1), cqgr.dU(cqrp.d(36.0d)), cqgr.bw(81), cqgr.dr(1), cqgr.aJ(17), cqgr.x(cqtt.m(b3, cqtvVar2, true, true, false, false)), gd, b2, cqgr.fY(cqic.f(ayjh.a, new cqmp[0]), cqgr.fR(new aymf(), ayji.a, new cqmp[0])), cqgr.fY(cqgr.aF(ayjk.a), cqgr.bq(cqrp.d(16.0d)), cqgr.cd(-1)), ict.n(false, new cqmp[0])), fY);
    }
}
