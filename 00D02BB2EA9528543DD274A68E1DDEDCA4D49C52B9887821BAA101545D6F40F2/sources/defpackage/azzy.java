package defpackage;
/* compiled from: PG */
/* renamed from: azzy  reason: default package */
/* loaded from: classes3.dex */
public final class azzy extends baah {
    public String a;
    public dpuk b;
    public dhti c;
    public dpop d;
    private String e;
    private String f;
    private String g;
    private String h;

    @Override // defpackage.baah
    public final void b(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null cardVed");
    }

    @Override // defpackage.baah
    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null categoryName");
    }

    @Override // defpackage.baah
    public final void d(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null coverImageUrl");
    }

    @Override // defpackage.baah
    public final void e(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null locationDisplayName");
    }

    @Override // defpackage.baah
    public final baai a() {
        String str = this.a == null ? " mid" : "";
        if (this.b == null) {
            str = str.concat(" experienceType");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" categoryName");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" locationDisplayName");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" coverImageUrl");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" cardVed");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new azzz(this.a, this.b, this.e, this.f, this.g, this.c, this.d, this.h);
    }
}
