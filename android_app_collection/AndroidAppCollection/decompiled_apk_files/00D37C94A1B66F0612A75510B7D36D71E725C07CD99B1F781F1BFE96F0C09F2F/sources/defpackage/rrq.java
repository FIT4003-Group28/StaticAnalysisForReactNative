package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rrq  reason: default package */
/* loaded from: classes4.dex */
public final class rrq {
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rrp rrpVar = new rrp();
        c = rrpVar;
        a = new qso("MobStoreFile.API", rrpVar, twxVar, null, null, null);
    }

    public static qst a(Context context) {
        return new qst(context, a, qsm.f, qss.a);
    }
}
