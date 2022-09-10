package defpackage;

import android.app.Activity;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: uax  reason: default package */
/* loaded from: classes7.dex */
class uax implements twb {
    private final String a;

    public uax(Activity activity, doxr doxrVar) {
        String a;
        if ((doxrVar.a & 16) != 0) {
            Resources resources = activity.getResources();
            dgas dgasVar = doxrVar.f;
            a = bvtb.c(resources, dgasVar == null ? dgas.e : dgasVar, bvsz.ABBREVIATED).toString();
        } else {
            a = a(activity, doxrVar);
        }
        this.a = a;
        d(activity, a);
    }

    private static String a(Activity activity, doxr doxrVar) {
        Resources resources = activity.getResources();
        int i = pxo.FLIGHT_DIRECTIONS_CONNECTING_FLIGHTS_DURATION;
        Object[] objArr = new Object[1];
        Resources resources2 = activity.getResources();
        dgas dgasVar = doxrVar.g;
        if (dgasVar == null) {
            dgasVar = dgas.e;
        }
        objArr[0] = bvtb.c(resources2, dgasVar, bvsz.ABBREVIATED);
        return resources.getString(i, objArr);
    }

    private static void d(Activity activity, String str) {
        bvsi bvsiVar = new bvsi(activity.getResources());
        bvsiVar.c(activity.getResources().getString(pxo.FLIGHT_DIRECTIONS_DURATION_CONTENT_DESCRIPTION, str));
        bvsiVar.toString();
    }

    @Override // defpackage.twb
    @dzsi
    public String b() {
        return this.a;
    }

    @Override // defpackage.twb
    public cqss c() {
        return ibm.p();
    }
}
