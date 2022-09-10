package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: batx  reason: default package */
/* loaded from: classes3.dex */
public final class batx {
    @dzsi
    public static Integer a(@dzsi GmmLocation gmmLocation, @dzsi akqq akqqVar) {
        if (gmmLocation == null || akqqVar == null) {
            return null;
        }
        return Integer.valueOf(Math.round(gmmLocation.F(akqqVar)));
    }

    public static String b(@dzsi Integer num, bvsl bvslVar) {
        return num == null ? "" : bvslVar.c(num.intValue(), null, true, true);
    }
}
