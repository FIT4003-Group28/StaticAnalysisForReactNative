package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpil  reason: default package */
/* loaded from: classes3.dex */
public final class bpil extends cqiw<bpvj> {
    private static cqmj<bpvj> e(int i, cqlc<bpvj, CharSequence> cqlcVar, cqlc<bpvj, View.OnClickListener> cqlcVar2, cqlc<bpvj, cjtd> cqlcVar3, boolean z) {
        cqmj c;
        cqmp[] cqmpVarArr = new cqmp[5];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dU(cqsv.f(18.0d, 8.0d, 18.0d, 8.0d));
        cqmpVarArr[3] = cqgr.aJ(1);
        if (z) {
            c = hyb.a(cqgr.aR(Integer.valueOf(i)), cqgr.cd(-2), cqgr.J(true), iue.c(cqlcVar3), cqgr.cW(cqlcVar2), cqgr.eM(cqlcVar));
        } else {
            c = hyb.c(cqgr.aR(Integer.valueOf(i)), cqgr.cd(-2), cqgr.J(true), iue.c(cqlcVar3), cqgr.cW(cqlcVar2), cqgr.eM(cqlcVar));
        }
        cqmpVarArr[4] = c;
        return cqgr.gd(cqmpVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bpvj> a() {
        cqmn a = cqmn.a(cqgr.bR(cqrp.d(12.0d)), cqgr.bG(cqrp.d(12.0d)), cqgr.dU(cqsv.f(18.0d, 8.0d, 18.0d, 8.0d)), cqgr.eN(4));
        cqrp d = cqrp.d(18.0d);
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dz(d, d, d, d), cqgr.dB(cqsv.f(36.0d, 24.0d, 36.0d, 24.0d)), cqgr.z(ibm.b()), cqgr.gq(a, cqgr.dV(0), cqgr.fe(cqvh.a(cqgm.a)), ibq.m(), cqgr.eU(ibm.t()), cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.ADDRESS_REDIRECT_DIALOG_TITLE), cqiq.h(bpid.a)))), cqgr.gq(a, cqgr.fe(cqvh.a(cqgm.g)), cqgr.eU(ibm.n()), cqgr.eM(bpie.a)), cqgr.gq(a, cqgr.fe(ibq.F()), cqgr.eL(Integer.valueOf((int) R.string.ADDRESS_REDIRECT_DIALOG_MESSAGE)), ibq.p(), cqgr.eU(ibm.p())), e(R.id.top, bpif.a, cqgr.q(bpig.a), bpih.a, false), e(R.id.bottom, bpii.a, cqgr.q(bpij.a), bpik.a, true));
    }
}
