package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class m9 implements n9 {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4296a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4297b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Boolean> f4298c;

    /* renamed from: d  reason: collision with root package name */
    private static final k2<Boolean> f4299d;

    /* renamed from: e  reason: collision with root package name */
    private static final k2<Boolean> f4300e;

    /* renamed from: f  reason: collision with root package name */
    private static final k2<Boolean> f4301f;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4296a = r2Var.a("measurement.gold.enhanced_ecommerce.format_logs", true);
        f4297b = r2Var.a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", true);
        f4298c = r2Var.a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", true);
        f4299d = r2Var.a("measurement.gold.enhanced_ecommerce.updated_schema.client", true);
        f4300e = r2Var.a("measurement.gold.enhanced_ecommerce.updated_schema.service", true);
        f4301f = r2Var.a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", true);
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean e() {
        return f4300e.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean g() {
        return f4299d.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean h() {
        return f4301f.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean j() {
        return f4296a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean k() {
        return f4298c.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.n9
    public final boolean l() {
        return f4297b.b().booleanValue();
    }
}
