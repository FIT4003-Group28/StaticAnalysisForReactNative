package defpackage;
/* compiled from: PG */
/* renamed from: cwli  reason: default package */
/* loaded from: classes5.dex */
public final class cwli extends cwlq {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    private String g;
    private Boolean h;
    private Boolean i;
    private int j;

    @Override // defpackage.cwlq
    public final void b(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    @Override // defpackage.cwlq
    public final void c(String str) {
        this.e = str;
    }

    @Override // defpackage.cwlq
    public final void d(String str) {
        this.a = str;
    }

    @Override // defpackage.cwlq
    public final void e(String str) {
        this.c = str;
    }

    @Override // defpackage.cwlq
    public final void f(String str) {
        this.b = str;
    }

    @Override // defpackage.cwlq
    public final void g(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.cwlq
    public final void h(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.cwlq
    public final void i(String str) {
        this.d = str;
    }

    @Override // defpackage.cwlq
    public final void j(int i) {
        this.j = i;
    }

    @Override // defpackage.cwlq
    public final cwls a() {
        String str = this.g == null ? " accountName" : "";
        if (this.h == null) {
            str = str.concat(" isG1User");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" isDasherUser");
        }
        if (this.j == 0) {
            str = String.valueOf(str).concat(" isUnicornUser");
        }
        if (this.f == 0) {
            str = String.valueOf(str).concat(" ageRange");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwlj(this.g, this.a, this.b, this.c, this.d, this.h.booleanValue(), this.i.booleanValue(), this.j, this.e, this.f);
    }
}
