package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cita  reason: default package */
/* loaded from: classes4.dex */
public final class cita extends cqiw<citb> {
    private static final cqrp a = cqrp.d(10.0d);
    private static final cqrp b = cqrp.d(92.0d);
    private static final cqrp c = cqrp.d(14.0d);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<citb> a() {
        cqmj gd = cqgr.gd(cqgr.cd(-1), cqgr.dr(1), cqgr.gq(cqgr.cd(-2), cqgr.eL(Integer.valueOf((int) R.string.LOCATION_HISTORY_CARD_TITLE)), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), ibq.k(), cqgr.eU(ibm.t()), cqgr.bD(a), cqgr.aZ(false)), cqgr.gq(cqgr.cd(-2), cqgr.eL(Integer.valueOf((int) R.string.LOCATION_HISTORY_CARD_BODY)), cqgr.eN(5), cqgr.ar(TextUtils.TruncateAt.END), ibq.p(), cqgr.eU(ibm.p()), cqgr.aZ(false)));
        cqmj a2 = jgn.a(cqgr.bR(ibn.o()), jgn.b(cqrp.d(5.0d)), cqgr.gc(cqgr.bw(48), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.ce(b), cqgr.eE(iup.e(R.raw.illy_location_history_promo_100))));
        cqlc a3 = cqkz.a(cqrt.g(2131232559, ibm.b()));
        cqlc a4 = cqkz.a(cqrt.l(R.string.LOCATION_HISTORY_CARD_BUTTON_TEXT));
        cqlc q = cqgr.q(cisz.a);
        cqlc a5 = cqkz.a(cqrt.l(R.string.LOCATION_HISTORY_CARD_BUTTON_TEXT));
        cqlc a6 = cqkz.a(cjtd.a(dtyd.bq));
        cqrp cqrpVar = c;
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.x(ibm.b()), cqgr.dz(ibn.o(), ibn.o(), ibn.o(), cqrpVar), cqgr.gd(cqgr.dr(1), cqgr.ca(Float.valueOf(1.0f)), gd, cibk.d(a3, a4, q, a5, a6, cqgr.bV(cqrpVar))), a2);
    }
}
