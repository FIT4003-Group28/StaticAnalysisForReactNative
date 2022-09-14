package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class wb implements xb {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Long> f4508a;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        r2Var.a("measurement.id.max_bundles_per_iteration", 0L);
        f4508a = r2Var.a("measurement.max_bundles_per_iteration", 2L);
    }

    @Override // c.e.a.b.d.g.xb
    public final long f() {
        return f4508a.b().longValue();
    }
}
