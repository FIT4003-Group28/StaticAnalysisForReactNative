package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: hea  reason: default package */
/* loaded from: classes6.dex */
public abstract class hea extends cqiw<oxi> {
    public static final /* synthetic */ int a = 0;

    @SafeVarargs
    public static cqmj<oxi> d(cqlc<oxi, CharSequence> cqlcVar, cqlc<oxi, cqss> cqlcVar2, cqlc<oxi, Boolean> cqlcVar3, cqlc<oxi, Boolean> cqlcVar4, boolean z, cqmp<oxi>... cqmpVarArr) {
        cqmp[] cqmpVarArr2 = new cqmp[11];
        cqmpVarArr2[0] = cqgr.aF(cqjv.x(cqlcVar));
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.cd(-1);
        cqmpVarArr2[3] = cqjv.l(cqlcVar3, cqgr.cB(1), cqgr.cB(Integer.MAX_VALUE));
        int i = 4;
        cqmpVarArr2[4] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr2[5] = irn.m();
        cqmpVarArr2[6] = cqgr.cm(cqrp.f(2.0d));
        cqmpVarArr2[7] = cqjv.l(cqjv.x(cqlcVar2), ibq.y(), cqgr.eW(cqlcVar2));
        if (true != z) {
            i = 5;
        }
        cqmpVarArr2[8] = cqgr.eN(Integer.valueOf(i));
        cqmpVarArr2[9] = cqgr.m(cqlcVar4);
        cqmpVarArr2[10] = cqgr.eM(cqlcVar);
        cqmj<oxi> gq = cqgr.gq(cqmpVarArr2);
        gq.f(cqmpVarArr);
        return gq;
    }
}
