package defpackage;
/* compiled from: PG */
/* renamed from: deld  reason: default package */
/* loaded from: classes6.dex */
public final class deld {
    public String a;
    public String b;
    public String c;
    public String d;
    private String e;
    private String f;

    public final dele a() {
        return new dele(this.f, this.e, this.a, null, this.b, this.c, this.d);
    }

    public final void b(String str) {
        cnwc.m(str, "ApiKey must be set.");
        this.e = str;
    }

    public final void c(String str) {
        cnwc.m(str, "ApplicationId must be set.");
        this.f = str;
    }
}
