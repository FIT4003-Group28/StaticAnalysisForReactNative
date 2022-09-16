package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: way  reason: default package */
/* loaded from: classes4.dex */
public final class way {
    public static final Charset a = Charset.forName("UTF-8");
    public final Context b;
    public final vzm c;
    public final afvn d;
    public final awyv e;

    public way(Context context, vzm vzmVar, afvn afvnVar, awyv awyvVar) {
        this.b = context;
        vzmVar.getClass();
        this.c = vzmVar;
        afvnVar.getClass();
        this.d = afvnVar;
        this.e = awyvVar;
    }

    public static cew a(int i, awya awyaVar, byte[] bArr) {
        afw afwVar = new afw();
        for (String str : awyaVar.c()) {
            afwVar.put(str, awyaVar.a(str));
        }
        return new cew(i, bArr, afwVar);
    }
}
