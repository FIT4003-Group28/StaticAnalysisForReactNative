package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class pb implements mb {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4361a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Boolean> f4362b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<Boolean> f4363c;

    /* renamed from: d  reason: collision with root package name */
    private static final k2<Boolean> f4364d;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4361a = r2Var.a("measurement.sdk.collection.enable_extend_user_property_size", true);
        f4362b = r2Var.a("measurement.sdk.collection.last_deep_link_referrer2", true);
        f4363c = r2Var.a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f4364d = r2Var.a("measurement.sdk.collection.last_gclid_from_referrer2", false);
        r2Var.a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // c.e.a.b.d.g.mb
    public final boolean f() {
        return f4361a.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.mb
    public final boolean j() {
        return f4362b.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.mb
    public final boolean k() {
        return f4364d.b().booleanValue();
    }

    @Override // c.e.a.b.d.g.mb
    public final boolean l() {
        return f4363c.b().booleanValue();
    }
}
