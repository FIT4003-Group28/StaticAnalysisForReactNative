package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: tua  reason: default package */
/* loaded from: classes7.dex */
public final class tua extends cqiw<ubt> {
    public static final cqrp a;
    public static final int b;
    public static final int c;
    private static final cqgq d;
    private static final cqgq e;

    static {
        cqgq n = cqgr.n();
        n.d = 200;
        n.a = Float.valueOf(1.0f);
        d = n;
        cqgq n2 = cqgr.n();
        n2.d = 200;
        n2.a = Float.valueOf(0.0f);
        e = n2;
        a = cqrp.d(16.0d);
        b = R.id.directions_group_list;
        c = R.id.result_list_error_layout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<cqix<?>> d(ubt ubtVar) {
        ArrayList arrayList = new ArrayList();
        if (ubtVar.d().booleanValue()) {
            arrayList.add(cqgr.fT(new tsh(), cqkp.T));
        } else {
            dcdc<ubo> b2 = ubtVar.b();
            int size = b2.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(cqgr.fT(new tst(), b2.get(i)));
            }
            if (ubtVar.h() != null) {
                ttq ttqVar = new ttq();
                ubs h = ubtVar.h();
                dbsk.s(h);
                arrayList.add(cqgr.fT(ttqVar, h));
            }
            if (ubtVar.i() != null) {
                ttb ttbVar = new ttb();
                ubq i2 = ubtVar.i();
                dbsk.s(i2);
                arrayList.add(cqgr.fT(ttbVar, i2));
            }
        }
        return dcdc.r(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<ubt> a() {
        cqmj m = vlh.m(cqgr.aR(Integer.valueOf((int) R.id.slider_grippy)));
        m.f(cqgr.dU(cqrp.d(12.0d)), cqgr.dB(cqrp.d(dcyn.a)), cqgr.bA(cqrp.d(dcyn.a)));
        m.f(cqjv.l(ttu.a, d.b(), e.b()), cqgr.aI(ttv.a));
        cqlc cqlcVar = ttt.a;
        cqlc cqlcVar2 = ttx.a;
        final cqtv z = ibn.z();
        final cqtd a2 = itd.a(cqrp.d(1.0d), ibm.h());
        cqmj j = ict.j(cqkz.a(false), cqlcVar, jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.z(ibm.b()), cqgr.fP(new ttm(), ttw.a, new cqmp[0]), cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), GmmRecyclerView.ax(cqlcVar2, cqgr.aR(Integer.valueOf(b)), cqqx.p(null), cqgr.cd(-1), cqgr.bp(-2), cqgr.R("A list of directions results"), cqgr.z(ibm.g()), cqqx.K(new cqjb(a2, z) { // from class: ttr
            private final cqtd a;
            private final cqtv b;

            {
                this.a = a2;
                this.b = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                ubt ubtVar = (ubt) cqkpVar;
                return new tub(this.a.a(context), this.b.e(context), true);
            }
        }), cqqx.F()), cqgr.gc(cqgr.aI(tty.a), cqgr.bq(cqrp.d(3.0d)), cqgr.cd(-1), cqgr.p(true), cqgr.eE(ibp.b())))), cqgr.fY(cqgr.aR(Integer.valueOf(c)), cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new ico(), ttz.a, new cqmp[0])));
        j.f(cqgr.cd(-1), cqgr.bp(-2));
        return jgn.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b()), cqgr.ap(cqrp.d(6.0d)), jgn.d(tts.a), jgi.d(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), m, j));
    }
}
