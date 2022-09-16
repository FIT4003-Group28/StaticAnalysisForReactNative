package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: rtd  reason: default package */
/* loaded from: classes4.dex */
public final class rtd {
    @Deprecated
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rtc rtcVar = new rtc();
        c = rtcVar;
        a = new qso("Phenotype.API", rtcVar, twxVar, null, null, null);
    }

    public static Uri a() {
        return vbi.a("com.google.android.gms.clearcut.public");
    }

    public static qst b(Context context) {
        return new qst(context, a, qsm.f, qss.a);
    }
}
