package defpackage;
/* compiled from: PG */
/* renamed from: cyuy  reason: default package */
/* loaded from: classes5.dex */
final class cyuy extends cyxi {
    private cyxh a;
    private Double b;
    private Double c;

    @Override // defpackage.cyxi
    public final void b(double d) {
        this.c = Double.valueOf(d);
    }

    @Override // defpackage.cyxi
    public final void c(cyxh cyxhVar) {
        if (cyxhVar != null) {
            this.a = cyxhVar;
            return;
        }
        throw new NullPointerException("Null featureType");
    }

    @Override // defpackage.cyxi
    public final void d(double d) {
        this.b = Double.valueOf(d);
    }

    @Override // defpackage.cyxi
    public final cyxj a() {
        String str = this.a == null ? " featureType" : "";
        if (this.b == null) {
            str = str.concat(" weight");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" exponent");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyuz(this.a, this.b.doubleValue(), this.c.doubleValue());
    }
}
