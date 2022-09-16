package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rvq  reason: default package */
/* loaded from: classes4.dex */
public final class rvq {
    @Deprecated
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rvo rvoVar = new rvo();
        c = rvoVar;
        a = new qso("UsageReporting.API", rvoVar, twxVar, null, null, null);
    }

    public static qst a(Context context) {
        return new qst(context, a, new rvp(), qss.a);
    }
}
