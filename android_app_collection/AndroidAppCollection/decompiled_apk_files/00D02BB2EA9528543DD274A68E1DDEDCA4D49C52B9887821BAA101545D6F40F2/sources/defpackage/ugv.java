package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: ugv  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ugv implements cqlc {
    static final cqlc a = new ugv();

    private ugv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        uhe uheVar = (uhe) cqkpVar;
        cqrp cqrpVar = ugz.a;
        if (uheVar.i().booleanValue()) {
            return iup.e(R.raw.ic_route_bluedot);
        }
        if (uheVar.h().booleanValue()) {
            return iup.c(R.raw.ic_place, ibm.D());
        }
        if (uheVar.k().booleanValue()) {
            return iup.c(R.raw.ic_route_origin, ibm.n());
        }
        return iup.c(R.raw.ic_route_origin, ibm.p());
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
