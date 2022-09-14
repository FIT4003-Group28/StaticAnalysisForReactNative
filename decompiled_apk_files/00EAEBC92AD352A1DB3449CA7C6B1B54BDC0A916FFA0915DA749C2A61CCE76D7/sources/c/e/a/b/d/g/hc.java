package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class hc implements ec {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4201a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Double> f4202b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Long> f4203c;

    /* renamed from: d  reason: collision with root package name */
    private static final k2<Long> f4204d;

    /* renamed from: e  reason: collision with root package name */
    private static final k2<String> f4205e;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4201a = r2Var.a("measurement.test.boolean_flag", false);
        f4202b = r2Var.a("measurement.test.double_flag", -3.0d);
        f4203c = r2Var.a("measurement.test.int_flag", -2L);
        f4204d = r2Var.a("measurement.test.long_flag", -1L);
        f4205e = r2Var.a("measurement.test.string_flag", "---");
    }

    @Override // c.e.a.b.d.g.ec
    public final boolean f() {
        return f4201a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.ec
    public final String g() {
        return f4205e.b();
    }

    @Override // c.e.a.b.d.g.ec
    public final double j() {
        return f4202b.b().doubleValue();
    }

    @Override // c.e.a.b.d.g.ec
    public final long k() {
        return f4204d.b().longValue();
    }

    @Override // c.e.a.b.d.g.ec
    public final long l() {
        return f4203c.b().longValue();
    }
}
