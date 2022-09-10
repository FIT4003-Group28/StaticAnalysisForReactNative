package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: tsh  reason: default package */
/* loaded from: classes7.dex */
public final class tsh extends cqiw<cqkp> {
    public static final cqrp a = cqrp.d(8.0d);
    public static final cqrp b = cqrp.d(20.0d);
    public static final cqrp c = cqrp.d(24.0d);
    public static final cqrp d = cqrp.d(16.0d);
    public static final cqrp e = cqrp.d(100.0d);
    public static final cqrp f = cqrp.d(160.0d);
    public static final cqrp g = cqrp.d(56.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<cqix<?>> d(cqkp cqkpVar) {
        return dcdc.h(cqgr.fT(new tsg(), cqkpVar), cqgr.fT(new tsg(), cqkpVar), cqgr.fT(new tsg(), cqkpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cqkp> a() {
        cqlc cqlcVar = tsf.a;
        final cqtv z = ibn.z();
        final cqtd a2 = itd.a(cqrp.d(1.0d), ibm.h());
        return udx.c(cqgr.cd(-1), cqgr.bp(-2), jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.g()), GmmRecyclerView.ax(cqlcVar, cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.g()), cqgr.R("Loading view for directions results contents"), cqqx.K(new cqjb(a2, z) { // from class: tse
            private final cqtd a;
            private final cqtv b;

            {
                this.a = a2;
                this.b = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                return new tub(this.a.a(context), this.b.e(context), false);
            }
        }), cqqx.F())));
    }
}
