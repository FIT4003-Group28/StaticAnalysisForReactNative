package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: qco  reason: default package */
/* loaded from: classes7.dex */
public abstract class qco {
    public static qcj h() {
        qah qahVar = new qah();
        qahVar.d(dcdc.e());
        qahVar.f(false);
        return qahVar;
    }

    @dzsi
    public static qco i(@dzsi Bundle bundle) {
        qup i;
        if (bundle == null) {
            return null;
        }
        qcl k = qcl.k(bundle.getBundle("StartCommuteBoardParams.src"));
        qcl k2 = qcl.k(bundle.getBundle("StartCommuteBoardParams.dst"));
        if (k == null || k2 == null) {
            return null;
        }
        qcj h = h();
        h.e(k);
        h.b(k2);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("StartCommuteBoardParams.routeToDisplay");
        if (parcelableArrayList != null) {
            h.d(dcbg.b(parcelableArrayList).s(qch.a).o(dbss.NOT_NULL).z());
        }
        h.f(bundle.getBoolean("StartCommuteBoardParams.swapWithCurrentFragment"));
        Bundle bundle2 = bundle.getBundle("StartCommuteBoardParams.commuteHubDirective");
        if (bundle2 != null && (i = qup.i(bundle2)) != null) {
            ((qah) h).a = i;
        }
        quy quyVar = (quy) bundle.getSerializable("StartCommuteBoardParams.commuteHubState");
        if (quyVar != null) {
            ((qah) h).b = quyVar;
        }
        if (bundle.containsKey(".directionsRequestLoggingParams")) {
            h.c((dnqh) dsuv.c(bundle, ".directionsRequestLoggingParams", dnqh.p, dsqa.c()));
        }
        return h.a();
    }

    public abstract dcdc<qcn> a();

    public abstract qcl b();

    public abstract qcl c();

    public abstract boolean d();

    @dzsi
    public abstract qup e();

    @dzsi
    public abstract quy f();

    public abstract dbsg<dnqh> g();

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putBundle("StartCommuteBoardParams.src", b().j());
        bundle.putBundle("StartCommuteBoardParams.dst", c().j());
        bundle.putParcelableArrayList("StartCommuteBoardParams.routeToDisplay", new ArrayList<>(dcbg.b(a()).s(qci.a).z()));
        bundle.putBoolean("StartCommuteBoardParams.swapWithCurrentFragment", d());
        qup e = e();
        if (e != null) {
            bundle.putBundle("StartCommuteBoardParams.commuteHubDirective", e.h());
        }
        bundle.putSerializable("StartCommuteBoardParams.commuteHubState", f());
        dbsg<dnqh> g = g();
        if (g.a()) {
            dsuv.d(bundle, ".directionsRequestLoggingParams", g.b());
        }
        return bundle;
    }

    @dzsi
    public final qcn k() {
        if (a().isEmpty()) {
            return null;
        }
        return a().get(0);
    }
}
