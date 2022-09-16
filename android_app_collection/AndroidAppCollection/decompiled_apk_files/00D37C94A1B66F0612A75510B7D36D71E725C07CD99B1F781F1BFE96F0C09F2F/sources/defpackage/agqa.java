package defpackage;
/* compiled from: PG */
/* renamed from: agqa  reason: default package */
/* loaded from: classes.dex */
public final class agqa {
    public final String a;
    public final String b;
    public final aalc c;
    public final atqf d;
    public final boolean e;

    public agqa(String str, String str2, boolean z, aalc aalcVar, atqf atqfVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = aalcVar;
        this.e = z;
        this.d = atqfVar;
    }

    public static agqa a(atqf atqfVar) {
        if (atqfVar == null || (atqfVar.b & 1) == 0) {
            return null;
        }
        atqe atqeVar = atqfVar.c;
        if (atqeVar == null) {
            atqeVar = atqe.a;
        }
        avhn avhnVar = atqeVar.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return b(atqfVar, new aalc(avhnVar));
    }

    public static agqa b(atqf atqfVar, aalc aalcVar) {
        if (atqfVar == null || (atqfVar.b & 1) == 0) {
            return null;
        }
        atqe atqeVar = atqfVar.c;
        if (atqeVar == null) {
            atqeVar = atqe.a;
        }
        return new agqa(atqeVar.c, atqeVar.e, atqeVar.f, aalcVar, atqfVar);
    }
}
