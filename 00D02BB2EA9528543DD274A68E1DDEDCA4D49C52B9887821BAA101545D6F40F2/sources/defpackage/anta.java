package defpackage;
/* compiled from: PG */
/* renamed from: anta  reason: default package */
/* loaded from: classes2.dex */
final class anta extends anyj {
    private String a;
    private String b;
    private cqss c;
    private jic d;
    private String e;

    @Override // defpackage.anyj
    public final void b(jic jicVar) {
        this.d = jicVar;
    }

    @Override // defpackage.anyj
    public final void c(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null iconDescription");
    }

    @Override // defpackage.anyj
    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null primaryText");
    }

    @Override // defpackage.anyj
    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null secondaryText");
    }

    @Override // defpackage.anyj
    public final void f(cqss cqssVar) {
        this.c = cqssVar;
    }

    @Override // defpackage.anyj
    public final anyk a() {
        String str = this.a == null ? " primaryText" : "";
        if (this.b == null) {
            str = str.concat(" secondaryText");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" textColor");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" icon");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" iconDescription");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new antb(this.a, this.b, this.c, this.d, this.e);
    }
}
