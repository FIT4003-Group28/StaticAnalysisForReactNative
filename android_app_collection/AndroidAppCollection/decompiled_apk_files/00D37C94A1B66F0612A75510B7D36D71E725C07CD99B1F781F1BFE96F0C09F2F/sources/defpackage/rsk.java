package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rsk  reason: default package */
/* loaded from: classes4.dex */
public final class rsk {
    public static final qso a;
    public static final twx b;
    static final tzc c;

    static {
        twx twxVar = new twx();
        b = twxVar;
        rsg rsgVar = new rsg();
        c = rsgVar;
        a = new qso("People.API_1P", rsgVar, twxVar, null, null, null);
    }

    @Deprecated
    public static rsf a(Context context, rsj rsjVar) {
        return new rsf(context, rsjVar);
    }

    @Deprecated
    public static qst b(Context context, rsj rsjVar) {
        return new qst(context, a, rsjVar, qss.a);
    }

    @Deprecated
    public static qst c(Context context, rsj rsjVar) {
        return new qst(context, a, rsjVar, qss.a);
    }
}
