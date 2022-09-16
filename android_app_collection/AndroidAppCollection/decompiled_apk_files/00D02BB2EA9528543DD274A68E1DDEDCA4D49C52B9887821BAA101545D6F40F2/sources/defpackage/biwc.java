package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: PG */
/* renamed from: biwc  reason: default package */
/* loaded from: classes3.dex */
public final class biwc {
    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(final cqlc<T, Boolean> cqlcVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, final cqlc<T, Boolean> cqlcVar4, cqlc<T, View.OnLongClickListener> cqlcVar5, cqlc<T, cjtd> cqlcVar6, cqmj<T> cqmjVar, cqmj<T> cqmjVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.cJ(new cqlc(cqlcVar4) { // from class: biwa
            private final cqlc a;

            {
                this.a = cqlcVar4;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cqrp.f(((Boolean) ((cqlb) this.a).a).booleanValue() ? dcyn.a : 48.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cd(-1), cqgr.dF(irh.b()), cqgr.aJ(16), cqgr.y(new cqlc(cqlcVar) { // from class: biwb
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return ((Boolean) this.a.a(cqkpVar)).booleanValue() ? irn.G() : cqta.f();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.c(cqlcVar6), cqgr.cW(cqlcVar2), cqgr.K(cqlcVar), cqgr.dn(cqlcVar5), cqgr.cs(cqlcVar3), cqmjVar, cqmjVar2);
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqtd> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.ce(irh.e()), cqgr.bp(-1), cqgr.dQ(irh.b()), cqgr.gc(cqgr.eG(cqlcVar)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqlc<T, cqsn> cqlcVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> gq = cqgr.gq(cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), irn.m(), irn.x(), cqgr.eM(cqlcVar));
        gq.f(cqmpVarArr);
        return gq;
    }
}
