package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: idg  reason: default package */
/* loaded from: classes6.dex */
public final class idg {
    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqsn> cqlcVar, cqlc<T, cqsn> cqlcVar2, cqlc<T, cqtd> cqlcVar3, final cqlc<T, cqtd> cqlcVar4, final cqlc<T, cqsn> cqlcVar5, cqlc<T, View.OnClickListener> cqlcVar6, cqlc<T, cjtd> cqlcVar7) {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.dU(cqrp.d(16.0d)), cqgr.dB(cqrp.d(14.0d)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ca(Float.valueOf(1.0f)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bD(cqrp.d(6.0d)), cqgr.eN(5), cqgr.cB(2), cqgr.ar(TextUtils.TruncateAt.END), ibq.m(), ibq.v(), cqgr.eM(cqlcVar)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bD(cqrp.d(8.0d)), cqgr.eN(5), cqgr.cB(6), cqgr.ar(TextUtils.TruncateAt.END), cqgr.co(cqrp.f(2.0d), false), ibq.p(), ibq.x(), cqgr.eM(cqlcVar2)), hyw.w(cqlcVar4, cqlcVar6, cqlcVar7, cqkz.a(null), cqkz.a(null), cqkz.a(true), cqkz.a(false), hyw.J(), cqgr.eM(cqlcVar5), cqgr.V(cqlcVar5), cqgr.cd(-2), cqgr.bp(-2), cqgr.aF(new cqlc(cqlcVar5, cqlcVar4) { // from class: idf
            private final cqlc a;
            private final cqlc b;

            {
                this.a = cqlcVar5;
                this.b = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar8 = this.a;
                cqlc cqlcVar9 = this.b;
                boolean z = false;
                if (((cqju) cqjv.x(cqlcVar8)).a(cqkpVar).booleanValue() && ((cqju) cqjv.x(cqlcVar9)).a(cqkpVar).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }))), cqgr.gc(cqgr.bq(cqrp.d(88.0d)), cqgr.ce(cqrp.d(88.0d)), cqgr.bR(irh.c()), cqgr.eG(cqlcVar3), cqgr.ei(ImageView.ScaleType.FIT_CENTER)));
    }

    public static <T extends cqkp> cqmj<T> b(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2) {
        return a(cqkz.a(cqrt.l(R.string.NO_INTERNET_CONNECTION_ERROR_TITLE)), cqkz.a(cqrt.l(R.string.NO_INTERNET_CONNECTION_ERROR_SUBTITLE)), cqkz.a(iup.e(R.raw.offline_error)), cqkz.a(cqrt.g(2131232872, ibm.x())), cqkz.a(cqrt.l(R.string.NO_INTERNET_CONNECTION_TRY_AGAIN_BUTTON)), cqlcVar, cqlcVar2);
    }

    public static <T extends cqkp> cqmj<T> c(cqlc<T, View.OnClickListener> cqlcVar, cqlc<T, cjtd> cqlcVar2) {
        return a(cqkz.a(cqrt.l(R.string.UNKNOWN_NETWORK_ERROR_TITLE)), cqkz.a(cqrt.l(R.string.UNKNOWN_NETWORK_ERROR_SUBTITLE)), cqkz.a(iup.e(R.raw.local_error)), cqkz.a(cqrt.g(2131232872, ibm.x())), cqkz.a(cqrt.l(R.string.TRY_AGAIN)), cqlcVar, cqlcVar2);
    }
}
