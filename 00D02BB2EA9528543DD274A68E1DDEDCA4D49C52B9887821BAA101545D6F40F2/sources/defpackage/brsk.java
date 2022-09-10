package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: brsk  reason: default package */
/* loaded from: classes4.dex */
public final class brsk extends cqiw<brvd> {
    private final brkj a;

    public brsk(brkj brkjVar) {
        this.a = brkjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<brvd> a() {
        jba A = B().A();
        cqmp[] cqmpVarArr = {this.a.n(A), this.a.l(A)};
        brkj brkjVar = this.a;
        brvd B = B();
        jba A2 = B.A();
        cqmj<brvd> i = brkjVar.i(cqgr.gq(cqic.a(cqjv.v(A2.x()), new cqmp[0]), cqgr.eN(5), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), brkjVar.a(), cqgr.eI(A2.x())), B);
        i.f(cqic.a(B().K(), new cqmp[0]));
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqmpVarArr), i, this.a.e(B()));
    }
}
