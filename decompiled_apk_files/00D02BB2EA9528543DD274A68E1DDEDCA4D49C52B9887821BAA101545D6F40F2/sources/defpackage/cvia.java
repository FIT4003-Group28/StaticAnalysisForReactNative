package defpackage;
/* compiled from: PG */
/* renamed from: cvia  reason: default package */
/* loaded from: classes5.dex */
public final class cvia {
    public final cvhz a;
    public final int b;
    @dzsi
    public final String c;

    public cvia(cvhz cvhzVar, int i, @dzsi String str) {
        this.a = cvhzVar;
        this.b = i;
        this.c = str;
    }

    public static cvia a(cvhz cvhzVar) {
        return new cvia(cvhzVar, -1, null);
    }

    public static cvia b(cvhz cvhzVar, @dzsi String str) {
        return new cvia(cvhzVar, -1, str);
    }

    public static cvia c(cvhz cvhzVar, Throwable th) {
        return new cvia(cvhzVar, -1, th.getMessage());
    }
}
