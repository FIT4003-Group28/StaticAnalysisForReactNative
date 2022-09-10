package defpackage;

import com.google.android.apps.maps.R;
import defpackage.tdh;
/* compiled from: PG */
/* renamed from: tau  reason: default package */
/* loaded from: classes7.dex */
public abstract class tau<T extends tdh> extends cqiw<T> {
    public static final /* synthetic */ int a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        cqmp<T>[] cqmpVarArr = {cqgr.dB(cqrp.d(12.0d)), cqgr.dQ(ibn.o()), cqgr.dF(ibn.o())};
        cqmj<T> d = d();
        d.f(cqgr.aF(tas.a));
        d.f(cqmpVarArr);
        cqmp<T>[] cqmpVarArr2 = {cqgr.dQ(ibn.o()), cqgr.dF(ibn.o())};
        cqmj<T> e = e();
        e.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqgr.bV(ibn.f()), cqgr.aF(taq.a)};
        cqmp<T>[] cqmpVarArr4 = {cqgr.dX(tar.a), cqgr.dQ(ibn.o()), cqgr.dF(ibn.o())};
        cqmj<T> f = f();
        f.f(cqgr.aF(tat.a));
        f.f(cqmpVarArr4);
        return jgi.d(cqgr.aR(Integer.valueOf((int) R.id.trip_details_summary_header)), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), g(), cqgr.z(ibm.b()), d, e, ict.n(false, cqmpVarArr3), f);
    }

    public cqmj<T> d() {
        return cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)));
    }

    public abstract cqmj<T> e();

    public cqmj<T> f() {
        return cqgr.gs(cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)));
    }

    public cqmn<T> g() {
        return cqmn.a(cqgr.dU(ibn.d()), cqgr.dB(ibn.d()));
    }
}
