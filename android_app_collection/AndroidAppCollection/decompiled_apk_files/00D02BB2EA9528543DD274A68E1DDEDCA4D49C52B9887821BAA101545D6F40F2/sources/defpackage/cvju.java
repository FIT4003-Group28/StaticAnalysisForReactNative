package defpackage;
/* compiled from: PG */
/* renamed from: cvju  reason: default package */
/* loaded from: classes5.dex */
public final class cvju {
    public Long a;
    public String b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    private String g;
    private cviv h;
    private Integer i;

    public cvju() {
    }

    public cvju(cvkc cvkcVar) {
        cvjv cvjvVar = (cvjv) cvkcVar;
        this.a = cvjvVar.a;
        this.g = cvjvVar.b;
        this.b = cvjvVar.c;
        this.c = cvjvVar.d;
        this.d = cvjvVar.e;
        this.h = cvjvVar.f;
        this.e = cvjvVar.g;
        this.i = Integer.valueOf(cvjvVar.h);
        this.f = cvjvVar.i;
    }

    public final void b(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public final void c(int i) {
        this.i = Integer.valueOf(i);
    }

    public final void d(cviv cvivVar) {
        if (cvivVar != null) {
            this.h = cvivVar;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public final cvkc a() {
        String str = this.g == null ? " accountName" : "";
        if (this.c == null) {
            str = str.concat(" syncVersion");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" pageVersion");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" registrationStatus");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" lastRegistrationTimeMs");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" lastRegistrationRequestHash");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" firstRegistrationVersion");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvjv(this.a, this.g, this.b, this.c, this.d, this.h, this.e, this.i.intValue(), this.f);
    }
}
