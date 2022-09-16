package defpackage;
/* compiled from: PG */
/* renamed from: anwj  reason: default package */
/* loaded from: classes.dex */
public final class anwj {
    public String a;
    public String b;
    private String c;
    private String d;

    public final anwk a() {
        return new anwk(this.d, this.c, null, null, this.a, null, this.b);
    }

    public final void b(String str) {
        qnm.m(str, "ApiKey must be set.");
        this.c = str;
    }

    public final void c(String str) {
        qnm.m(str, "ApplicationId must be set.");
        this.d = str;
    }
}
