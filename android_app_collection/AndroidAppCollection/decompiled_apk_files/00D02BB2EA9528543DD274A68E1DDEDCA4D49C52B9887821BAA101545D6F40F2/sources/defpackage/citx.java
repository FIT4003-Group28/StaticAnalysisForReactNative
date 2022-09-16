package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: citx  reason: default package */
/* loaded from: classes4.dex */
public final class citx extends cqiw<city> {
    public static final cqjg a = cqjg.a();

    public static List<cqix<?>> e(city cityVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dchl.k(cityVar.d(), citt.a));
        arrayList.addAll(dchl.k(cityVar.c(), citu.a));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<city> a() {
        cqmp[] cqmpVarArr = {cqgr.aF(cqjv.x(citm.a)), cqgr.cd(-1), cqjv.l(citn.a, cqgr.dz(cqrp.d(20.0d), cqrp.d(8.0d), cqrp.d(20.0d), cqrp.d(dcyn.a)), cqgr.dz(cqrp.d(20.0d), cqrp.d(8.0d), cqrp.d(20.0d), cqrp.d(16.0d))), cqgr.aJ(16), cqgr.eM(cito.a), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), ibq.e()};
        cqml f = cayj.f(citp.a);
        ((cqmm) f).a(cqgr.aI(citq.a), cqgr.aJ(16), cqgr.dJ(cqrp.d(20.0d)));
        cqlc cqlcVar = citr.a;
        final cqrp d = cqrp.d(4.0d);
        final cqrp d2 = cqrp.d(12.0d);
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.dB(cqrp.d(16.0d)), cqgr.x(ibm.b()), cqgr.gq(cqmpVarArr), f, GmmRecyclerView.ax(cqlcVar, cqgr.aT(a), cqqx.G(), cqgr.ep(false), cqqx.K(new cqjb(d, d2) { // from class: citv
            private final cqtv a;
            private final cqtv b;

            {
                this.a = d;
                this.b = d2;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                cqtv cqtvVar = this.a;
                cqtv cqtvVar2 = this.b;
                city cityVar = (city) cqkpVar;
                cqjg cqjgVar = citx.a;
                return new citw(cqtvVar.e(context), cqtvVar2.e(context));
            }
        }), cqgr.dk(cits.a)));
    }
}
