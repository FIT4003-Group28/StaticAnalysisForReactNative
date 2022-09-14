package defpackage;

import android.app.Activity;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: uay  reason: default package */
/* loaded from: classes7.dex */
class uay implements twc {
    @dzsi
    private final String a;
    @dzsi
    private final String b;

    public uay(Activity activity, doxr doxrVar) {
        String f = f(activity, doxrVar);
        this.a = f;
        this.b = f;
    }

    @dzsi
    private static String f(Activity activity, doxr doxrVar) {
        if ((doxrVar.a & 128) != 0) {
            Resources resources = activity.getResources();
            int i = pxo.FLIGHT_DIRECTIONS_ROUND_TRIP_PRICE_AMOUNT;
            Object[] objArr = new Object[1];
            dquh dquhVar = doxrVar.i;
            if (dquhVar == null) {
                dquhVar = dquh.c;
            }
            objArr[0] = dquhVar.b;
            return resources.getString(i, objArr);
        }
        return null;
    }

    @Override // defpackage.twc
    public Boolean a() {
        return false;
    }

    @Override // defpackage.twc
    @dzsi
    /* renamed from: d */
    public String b() {
        return this.a;
    }

    @Override // defpackage.twc
    @dzsi
    /* renamed from: e */
    public String c() {
        return this.b;
    }
}
