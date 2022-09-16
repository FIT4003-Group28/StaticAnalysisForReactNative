package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class z9 implements aa {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4563a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4564b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Boolean> f4565c;

    /* renamed from: d  reason: collision with root package name */
    private static final k2<Boolean> f4566d;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4563a = r2Var.a("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f4564b = r2Var.a("measurement.audience.refresh_event_count_filters_timestamp", false);
        f4565c = r2Var.a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f4566d = r2Var.a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // c.e.a.b.d.g.aa
    public final boolean f() {
        return true;
    }

    @Override // c.e.a.b.d.g.aa
    public final boolean g() {
        return f4566d.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.aa
    public final boolean j() {
        return f4563a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.aa
    public final boolean k() {
        return f4565c.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.aa
    public final boolean l() {
        return f4564b.b().booleanValue();
    }
}
