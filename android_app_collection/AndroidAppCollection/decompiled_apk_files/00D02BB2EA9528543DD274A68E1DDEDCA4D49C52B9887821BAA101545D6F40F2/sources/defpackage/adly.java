package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adly  reason: default package */
/* loaded from: classes2.dex */
public final class adly extends cqiw<admb> {
    public static final /* synthetic */ int a = 0;

    private static <T extends cqkp> cqmp<admb> e(int i, final ddho ddhoVar) {
        return hyw.i(cqkz.a(cqrt.l(i)), adlw.a, new cqlc(ddhoVar) { // from class: adlx
            private final ddho a;

            {
                this.a = ddhoVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ddho ddhoVar2 = this.a;
                int i2 = adly.a;
                return ((admb) cqkpVar).b(ddhoVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]);
    }

    @SafeVarargs
    private static cqmp<admb> f(int i, cqmp<admb>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.cd(-1), cqgr.bp(-2), cqgr.eN(2), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), irn.l(), ibq.y(), cqgr.eL(Integer.valueOf(i)));
        gq.f(cqmpVarArr);
        return gq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<admb> a() {
        return cqgr.gd(aczp.a(adls.a), iue.c(adlt.a), cqgr.dr(1), cqgr.cd(-1), cqgr.z(ibm.b()), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.dB(irh.c()), cqgr.fY(cqic.c(adlu.a, new cqmp[0]), cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(1), cqgr.gc(cqgr.bp(-2), cqgr.cd(-2), cqgr.eE(cqrt.f(2131233091))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(1), cqgr.dU(cqrp.d(26.0d)), cqgr.gd(cqgr.bp(-2), cqgr.cd(-2), cqgr.dr(0), cqgr.aJ(16), cqgr.gc(cqgr.dF(cqrp.d(22.0d)), cqgr.eE(cqtt.i(cqrt.g(2131232273, ibm.m()), cqrp.d(20.0d), cqrp.d(20.0d)))), cqgr.gd(cqgr.dr(1), f(R.string.HOME_USEFUL_CARD_PROMPT, ibq.l(), cqgr.eU(ibm.t())), f(R.string.HOME_USEFUL_CARD_EXPLANATION, ibq.q(), cqgr.dU(cqrp.d(2.0d))))), hyw.B(cqgr.cd(-2), cqgr.dU(cqrp.d(14.0d)), e(R.string.HOME_USEFUL_CARD_YES_BUTTON, dtxr.aQ), e(R.string.HOME_USEFUL_CARD_NOT_THIS_TIME_BUTTON, dtxr.aP), e(R.string.HOME_USEFUL_CARD_NEVER_BUTTON, dtxr.aO)))), f(R.string.HOME_USEFUL_CARD_THANK_YOU, cqic.f(adlv.a, new cqmp[0]), ibq.l(), cqgr.eU(ibm.c()), cqgr.eN(4), cqgr.dU(irh.c())));
    }
}
