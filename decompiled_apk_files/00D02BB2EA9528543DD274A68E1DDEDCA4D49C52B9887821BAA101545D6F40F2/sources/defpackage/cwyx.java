package defpackage;
/* compiled from: PG */
/* renamed from: cwyx  reason: default package */
/* loaded from: classes5.dex */
final class cwyx extends cwzd {
    public Integer a;
    public Boolean b;
    public dbsg<cwzg> c = dbpy.a;
    public Boolean d;
    public Boolean e;
    public int f;
    private Boolean g;

    @Override // defpackage.cwzd
    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.cwzd
    public final void c(int i) {
        this.f = i;
    }

    @Override // defpackage.cwzd
    public final cwze a() {
        String str = this.f == 0 ? " enablement" : "";
        if (this.a == null) {
            str = str.concat(" rateLimitPerSecond");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" recordMetricPerProcess");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" forceGcBeforeRecordMemory");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" captureDebugMetrics");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" captureMemoryInfo");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cwyy(this.f, this.a.intValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.g.booleanValue(), this.e.booleanValue());
    }
}
