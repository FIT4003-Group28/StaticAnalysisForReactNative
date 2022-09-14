package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class l9 implements i9 {

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Boolean> f4286a;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4286a = r2Var.a("measurement.sdk.dynamite.allow_remote_dynamite2", false);
        r2Var.a("measurement.collection.init_params_control_enabled", true);
        r2Var.a("measurement.sdk.dynamite.use_dynamite3", true);
        r2Var.a("measurement.id.sdk.dynamite.use_dynamite", 0L);
    }

    @Override // c.e.a.b.d.g.i9
    public final boolean f() {
        return f4286a.b().booleanValue();
    }
}
