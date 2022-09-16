package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpnr  reason: default package */
/* loaded from: classes4.dex */
final class bpnr extends iph<bpwd> {
    public static final cqrp b = cqrp.d(172.0d);
    public static final cqrp c = cqrp.d(144.0d);
    public static final cqrp d = cqrp.d(88.0d);
    public static final cqtv e = cqrp.d(8.0d);

    public bpnr() {
        super(R.id.rmi_feature_picker_scroll_view, b, ibn.o(), c);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> E = cqqx.E(cqqx.i(iva.i(cqrp.d(2.0d), cqrp.d(dcyn.a))), cqgr.x(aclp.a(ibm.b(), ibm.i(), iva.i(cqrp.d(dcyn.a), cqrp.d(1.0d)), cqrp.d(8.0d))), cqqx.B(false));
        E.f(cqmpVarArr);
        return E;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        cqivVar.f(new bpnj(), ((bpwd) cqkpVar).c());
        hsd hsdVar = new hsd();
        cqtv cqtvVar = e;
        cqrp cqrpVar = c;
        cqivVar.a(hsdVar, hsd.d(cqsg.g(cqsz.c(), cqsg.d(ibn.o(), cqsg.f(cqrpVar, Float.valueOf(0.15f)), cqsg.f(cqsg.d(cqtvVar, cqrpVar, cqtvVar), Float.valueOf(1.05f)), cqtvVar, ibn.o()))));
    }

    @Override // defpackage.iph, defpackage.cqiw
    protected final cqmj<bpwd> a() {
        return cqgr.gd(cqgr.aI(bpnh.a), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fR(new bpno(), bpni.a, new cqmp[0]), super.a());
    }
}
