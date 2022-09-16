package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: qis  reason: default package */
/* loaded from: classes4.dex */
public final class qis {
    public static final qso a;
    public static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        qir qirVar = new qir();
        c = qirVar;
        a = new qso("Auth.PROXY_API", qirVar, twxVar, null, null, null);
    }

    public static qst a(Context context) {
        return new qst(context, a, qit.a, qss.a);
    }
}
