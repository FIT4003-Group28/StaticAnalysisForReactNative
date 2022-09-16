package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rgh  reason: default package */
/* loaded from: classes4.dex */
public final class rgh {
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rgg rggVar = new rgg();
        c = rggVar;
        a = new qso("LocationServices.API", rggVar, twxVar, null, null, null);
    }

    public static qst a(Context context) {
        return new qst(context, a, qsm.f, new anwi(1));
    }
}
