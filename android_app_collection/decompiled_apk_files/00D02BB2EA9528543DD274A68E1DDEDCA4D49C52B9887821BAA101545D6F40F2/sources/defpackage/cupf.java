package defpackage;
/* compiled from: PG */
/* renamed from: cupf  reason: default package */
/* loaded from: classes5.dex */
final class cupf extends cuqg {
    private String a;
    private Integer b;
    private Integer c;

    @Override // defpackage.cuqg
    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cuqg
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.cuqg
    public final void d(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cuqg
    public final cuqh a() {
        String str = this.a == null ? " text" : "";
        if (this.b == null) {
            str = str.concat(" backgroundColor");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" textColor");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cupg(this.a, this.b.intValue(), this.c.intValue());
    }
}
