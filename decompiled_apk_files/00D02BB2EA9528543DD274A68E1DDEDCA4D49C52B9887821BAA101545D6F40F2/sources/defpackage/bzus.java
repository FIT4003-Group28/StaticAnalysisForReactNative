package defpackage;
/* compiled from: PG */
/* renamed from: bzus  reason: default package */
/* loaded from: classes4.dex */
public final class bzus extends bzvw {
    private bqkx b;
    private bqkz c;
    private String d;
    private String e;
    private String g;
    private dbsg<Runnable> f = dbpy.a;
    public dbsg<Runnable> a = dbpy.a;

    @Override // defpackage.bzvw
    public final void b(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null failureMessage");
    }

    @Override // defpackage.bzvw
    public final void c(bqkx bqkxVar) {
        if (bqkxVar != null) {
            this.b = bqkxVar;
            return;
        }
        throw new NullPointerException("Null review");
    }

    @Override // defpackage.bzvw
    public final void d(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null sendingMessage");
    }

    @Override // defpackage.bzvw
    public final void e(bqkz bqkzVar) {
        if (bqkzVar != null) {
            this.c = bqkzVar;
            return;
        }
        throw new NullPointerException("Null submitOptions");
    }

    @Override // defpackage.bzvw
    public final void f(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null successMessage");
    }

    @Override // defpackage.bzvw
    public final void g(Runnable runnable) {
        this.f = dbsg.i(runnable);
    }

    @Override // defpackage.bzvw
    public final bzvx a() {
        String str = this.b == null ? " review" : "";
        if (this.c == null) {
            str = str.concat(" submitOptions");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" sendingMessage");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" successMessage");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" failureMessage");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzut(this.b, this.c, this.d, this.e, this.f, this.g, this.a);
    }
}
