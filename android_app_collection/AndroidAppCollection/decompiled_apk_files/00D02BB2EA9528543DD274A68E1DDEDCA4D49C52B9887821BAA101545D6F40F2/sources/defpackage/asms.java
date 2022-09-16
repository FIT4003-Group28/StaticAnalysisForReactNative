package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: asms  reason: default package */
/* loaded from: classes2.dex */
public final class asms {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> a(cqlc<T, cqsn> cqlcVar, cqmj<T> cqmjVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, Boolean> cqlcVar4, boolean z, final cqlc<T, ddho> cqlcVar5, final cqlc<T, ddho> cqlcVar6) {
        cqnf l = cqjv.l(cqlcVar3, iue.c(new cqlc(cqlcVar6) { // from class: asmq
            private final cqlc a;

            {
                this.a = cqlcVar6;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cjtd.a((ddho) ((cqlb) this.a).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), iue.c(new cqlc(cqlcVar5) { // from class: asmr
            private final cqlc a;

            {
                this.a = cqlcVar5;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                return cjtd.a((ddho) ((cqlb) this.a).a);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        if (!z) {
            return cqgr.gd(d(cqlcVar, cqmjVar, cqlcVar2, cqlcVar3, cqlcVar4, l, cqmp.e, cqmp.e));
        }
        return jfw.a(d(cqlcVar, cqmjVar, cqlcVar2, cqlcVar3, cqlcVar4, l, cqgr.fW(cqgr.ce(cqrp.d(48.0d)), cqgr.bq(cqrp.d(48.0d)), cqgr.I(cqlcVar3), cqgr.cW(cqlcVar2), cqgr.V(cqlcVar), iuy.n()), cqgr.I(cqlcVar3)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> b(cqlc<T, cqtd> cqlcVar, cqlc<T, Boolean> cqlcVar2) {
        return cqgr.gc(cqgr.ch(cqrp.d(64.0d)), cqjv.l(cqlcVar2, cqgr.fo(ibl.H()), cqgr.fo(iva.b(ibl.d(), ire.c()))), cqgr.eG(cqlcVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> c(int i, cqlc<T, Boolean> cqlcVar) {
        return cqgr.gc(cqgr.ce(cqrp.d(64.0d)), cqgr.bq(cqrp.d(64.0d)), cqjv.l(cqlcVar, cqgr.eE(cqrt.h(i, ibl.H())), cqgr.eE(cqrt.h(i, iva.b(ibl.d(), ire.c())))));
    }

    private static <T extends cqkp> cqmp<T>[] d(cqlc<T, cqsn> cqlcVar, cqmj<T> cqmjVar, cqlc<T, View.OnClickListener> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, Boolean> cqlcVar4, cqmp<T> cqmpVar, cqmp<T> cqmpVar2, cqmp<T> cqmpVar3) {
        cqrp d = cqrp.d(44.0d);
        cqmjVar.f(cqgr.bw(16), cqgr.dz(cqrp.d(20.0d), cqrp.d(20.0d), cqrp.d(20.0d), cqrp.d(20.0d)));
        return new cqmp[]{cqgr.bq(cqrp.d(64.0d)), cqgr.cd(-1), cqgr.aJ(16), cqgr.aI(cqlcVar4), cqjv.j(iug.DIALOG_BUTTON_MIN_HEIGHT, d), iuy.e(), cqgr.cW(cqlcVar2), cqmpVar3, cqgr.V(cqlcVar), cqmpVar, cqmjVar, cqgr.gq(cqgr.cd(0), cqgr.bp(-2), cqgr.ca(Float.valueOf(1.0f)), cqgr.eM(cqlcVar), irn.r(), cqjv.l(cqlcVar3, cqgr.eU(ibl.H()), iuy.b())), cqmpVar2};
    }
}
