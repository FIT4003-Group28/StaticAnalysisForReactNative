package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: brso  reason: default package */
/* loaded from: classes4.dex */
public final class brso extends cqiw<brvd> {
    private final brkj a;

    public brso(brkj brkjVar) {
        this.a = brkjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brvd> a() {
        jba A = B().A();
        bruy H = B().H();
        cqmp[] cqmpVarArr = {cqgr.bp(-2), cqgr.cd(-1), this.a.n(A), this.a.l(A)};
        cqmp[] cqmpVarArr2 = {cqgr.cd(-2), cqic.a(cqjv.t(cqjv.u(H.a()), cqjv.v(A.i())), new cqmp[0]), this.a.a(), cqgr.eI(A.i()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqjv.k(B().g(), cqgr.cB(1), cqgr.cB(2))};
        cqmj<brvd> f = this.a.f(A);
        f.f(cqic.d(cqjv.r(B().g(), H.a()), new cqmp[0]));
        cqmj<brvd> o = this.a.o(A);
        o.f(cqic.d(B().ah(), new cqmp[0]));
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqmpVarArr), this.a.c(B()), cqgr.gq(cqmpVarArr2), f, o);
    }
}
