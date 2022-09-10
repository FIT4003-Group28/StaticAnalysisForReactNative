package defpackage;
/* compiled from: PG */
/* renamed from: cxcy  reason: default package */
/* loaded from: classes5.dex */
final class cxcy extends cxdf {
    public Integer a;
    public Float b;
    public dbsg<cxda> c = dbpy.a;
    public int d;

    @Override // defpackage.cxdf
    public final void b(int i) {
        this.d = i;
    }

    @Override // defpackage.cxdf
    public final cxdg a() {
        String str = this.d == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" rateLimitPerSecond");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" samplingProbability");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cxcz(this.d, this.a.intValue(), this.b.floatValue(), this.c);
    }
}
