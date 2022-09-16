package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rwq  reason: default package */
/* loaded from: classes4.dex */
public final class rwq {
    public static final qso a;
    private static final twx b;
    private static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rwm rwmVar = new rwm();
        c = rwmVar;
        a = new qso("Wallet.API", rwmVar, twxVar, null, null, null);
    }

    public static rwv a(Context context, rwp rwpVar) {
        return new rwv(context, rwpVar);
    }
}
