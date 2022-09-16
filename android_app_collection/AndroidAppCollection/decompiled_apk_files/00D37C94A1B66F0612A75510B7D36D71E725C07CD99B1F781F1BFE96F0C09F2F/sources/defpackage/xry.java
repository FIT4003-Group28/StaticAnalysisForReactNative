package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: xry  reason: default package */
/* loaded from: classes4.dex */
public final class xry {
    public static final Charset a = Charset.forName("UTF-8");
    public final vzm b;
    public final afvn c;
    public final awyu d;
    public final awyv e;

    public xry(vzm vzmVar, afvn afvnVar, awyv awyvVar) {
        vzmVar.getClass();
        this.b = vzmVar;
        afvnVar.getClass();
        this.c = afvnVar;
        this.e = awyvVar;
        awyt a2 = awyu.a();
        a2.a = 60L;
        this.d = a2.a();
    }

    public static cew a(int i, awya awyaVar, byte[] bArr) {
        afw afwVar = new afw();
        for (String str : awyaVar.c()) {
            afwVar.put(str, awyaVar.a(str));
        }
        return new cew(i, bArr, afwVar);
    }
}
