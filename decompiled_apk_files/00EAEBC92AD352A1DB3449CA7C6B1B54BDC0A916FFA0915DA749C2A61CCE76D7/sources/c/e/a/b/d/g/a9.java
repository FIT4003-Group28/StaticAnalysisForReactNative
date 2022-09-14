package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class a9 implements b9 {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4052a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Long> f4053b;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4052a = r2Var.a("measurement.sdk.attribution.cache", true);
        f4053b = r2Var.a("measurement.sdk.attribution.cache.ttl", 604800000L);
    }

    @Override // c.e.a.b.d.g.b9
    public final boolean f() {
        return f4052a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.b9
    public final long j() {
        return f4053b.b().longValue();
    }
}
