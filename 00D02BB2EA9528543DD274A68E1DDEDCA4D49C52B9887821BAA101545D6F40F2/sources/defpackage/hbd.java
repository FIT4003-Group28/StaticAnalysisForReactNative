package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: hbd  reason: default package */
/* loaded from: classes6.dex */
class hbd extends cqiw<jbf> {
    public static final /* synthetic */ int a = 0;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public hbd(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, Boolean> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, cqsn> cqlcVar3, boolean z, boolean z2, boolean z3, cqlc<T, cjtd> cqlcVar4, cqmp<T>... cqmpVarArr) {
        final cqlc a2 = cqkz.a(null);
        cqmp[] cqmpVarArr2 = new cqmp[8];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqmpVarArr2[1] = cqgr.cH(cqrp.d(56.0d));
        cqmpVarArr2[2] = cqgr.aJ(16);
        cqmpVarArr2[3] = cqgr.x(irn.G());
        cqmpVarArr2[4] = iue.c(cqlcVar4);
        cqmpVarArr2[5] = cqgr.cW(cqlcVar2);
        cqmpVarArr2[6] = cqgr.K(cqlcVar);
        cqmp[] cqmpVarArr3 = new cqmp[9];
        cqmpVarArr3[0] = cqgr.bR(z2 ? irh.e() : irh.b());
        cqmpVarArr3[1] = cqgr.bG(irh.b());
        cqmpVarArr3[2] = cqgr.cd(-1);
        cqmpVarArr3[3] = cqgr.bp(-2);
        cqmpVarArr3[4] = cqgr.aJ(Integer.valueOf(true != z3 ? 8388611 : 1));
        cqmpVarArr3[5] = cqgr.cB(1);
        cqmpVarArr3[6] = cqgr.ar(TextUtils.TruncateAt.END);
        cqmpVarArr3[7] = z ? ibq.u() : cqmn.a(irn.p(), cqgr.eW(new cqlc(a2) { // from class: hbc
            private final cqlc a;

            {
                this.a = a2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar5 = this.a;
                int i = hbd.a;
                Object obj = ((cqlb) cqlcVar5).a;
                return obj == null ? ibm.x() : obj;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqmpVarArr3[8] = cqgr.eM(cqlcVar3);
        cqmpVarArr2[7] = cqgr.gq(cqmpVarArr3);
        cqmj<T> gd = cqgr.gd(cqmpVarArr2);
        gd.f(cqmpVarArr);
        return gd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jbf> a() {
        return e(hay.a, acly.a(haz.a), hba.a, this.d, this.b, this.c, hbb.a, new cqmp[0]);
    }
}
