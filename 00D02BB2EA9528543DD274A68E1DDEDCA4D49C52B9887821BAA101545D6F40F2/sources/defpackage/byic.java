package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byic  reason: default package */
/* loaded from: classes4.dex */
public final class byic extends cqiw<byim> {
    private static final cqtv a = cqsg.d(aece.a, cqrp.d(8.0d));
    private static final cqjb<byim, Float> b = byib.a;

    public static Boolean e(byim byimVar) {
        boolean z = true;
        if (!byimVar.r().booleanValue() && !byimVar.q().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, byim byimVar, Context context, cqiv cqivVar) {
        cqiw ijeVar;
        cqiw bygmVar;
        Object m;
        byim byimVar2 = byimVar;
        if (byimVar2.q().booleanValue()) {
            if (byimVar2.n().booleanValue()) {
                bygmVar = new byfm();
                m = byimVar2.o();
            } else {
                bygmVar = new bygm();
                m = byimVar2.m();
            }
            cqivVar.a(bygmVar, m);
            cqivVar.a(new ije(), byimVar2);
            ijeVar = new byhz();
        } else if (byimVar2.r().booleanValue()) {
            cqivVar.c(new bygg());
            cqivVar.a(new ije(), byimVar2);
            ijeVar = new byhz();
        } else {
            if (byimVar2.l().a() == byih.VISIBLE_TOP) {
                cqivVar.a(new byfh(), byimVar2.l());
                cqivVar.a(new ije(), byimVar2);
            }
            if (byimVar2.p() != null) {
                cqivVar.a(new bygf(), byimVar2.p());
                cqivVar.a(new ije(), byimVar2);
            }
            cqivVar.a(new byhz(), byimVar2);
            cqivVar.a(new ije(), byimVar2);
            if (byimVar2.l().a() == byih.VISIBLE_MIDDLE) {
                cqivVar.a(new byfh(), byimVar2.l());
                cqivVar.a(new ije(), byimVar2);
            }
            if (byimVar2.l().a() != byih.INVISIBLE || !byimVar2.k().a().booleanValue()) {
                return;
            }
            cqivVar.a(new bygp(), byimVar2.k());
            ijeVar = new ije();
        }
        cqivVar.a(ijeVar, byimVar2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<byim> a() {
        Integer valueOf = Integer.valueOf((int) R.id.traffic_hub_card_container);
        return aefx.f(cqgr.bp(-1), cqgr.cd(-1), aefx.d(valueOf), aefx.c(b), acnp.a(cqgr.bp(-2), cqgr.cd(-1), cqgr.aR(valueOf), cqgr.x(cqta.f()), cqgr.gd(cqgr.ck(C()), cqgr.x(ibk.b()), cqgr.dU(cqrp.d(12.0d)), cqjv.o(byia.a, cqgr.dB(a), cqgr.dB(cqrp.d(dcyn.a))), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1))), cqgr.az(true), cqgr.aW(1), cqgr.d(R.id.on_map_directions_button));
    }
}
