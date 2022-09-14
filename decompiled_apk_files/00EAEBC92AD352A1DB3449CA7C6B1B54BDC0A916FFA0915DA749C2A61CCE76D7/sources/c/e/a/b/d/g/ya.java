package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class ya implements za {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4550a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4551b;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4550a = r2Var.a("measurement.collection.efficient_engagement_reporting_enabled_2", true);
        f4551b = r2Var.a("measurement.collection.redundant_engagement_removal_enabled", false);
        r2Var.a("measurement.id.collection.redundant_engagement_removal_enabled", 0L);
    }

    @Override // c.e.a.b.d.g.za
    public final boolean f() {
        return f4550a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.za
    public final boolean j() {
        return f4551b.b().booleanValue();
    }
}
