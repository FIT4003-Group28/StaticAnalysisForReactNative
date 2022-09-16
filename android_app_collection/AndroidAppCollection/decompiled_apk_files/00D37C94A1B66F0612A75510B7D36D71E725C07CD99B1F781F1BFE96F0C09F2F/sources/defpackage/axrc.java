package defpackage;
/* compiled from: PG */
/* renamed from: axrc  reason: default package */
/* loaded from: classes2.dex */
public final class axrc implements axrb {
    public static final vbt a;
    public static final vbt b;
    public static final vbt c;
    public static final vbt d;
    public static final vbt e;
    public static final vbt f;

    static {
        vbr a2 = new vbr(vbi.a("com.google.android.libraries.consentverifier")).b().a();
        a = a2.f("CollectionBasisVerifierFeatures__enable_all_features", true);
        b = a2.f("CollectionBasisVerifierFeatures__enable_logging", false);
        c = a2.f("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false);
        d = a2.d("CollectionBasisVerifierFeatures__failure_log_cooldown_period_ms", 86400000L);
        e = a2.d("CollectionBasisVerifierFeatures__max_stack_trace_size", 1000L);
        f = a2.d("CollectionBasisVerifierFeatures__min_app_version_code_to_log", -1L);
        a2.f("CollectionBasisVerifierFeatures__use_packed_proto", true);
    }

    @Override // defpackage.axrb
    public final long a() {
        return ((Long) d.c()).longValue();
    }

    @Override // defpackage.axrb
    public final long b() {
        return ((Long) e.c()).longValue();
    }

    @Override // defpackage.axrb
    public final long c() {
        return ((Long) f.c()).longValue();
    }

    @Override // defpackage.axrb
    public final boolean d() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.axrb
    public final boolean e() {
        return ((Boolean) b.c()).booleanValue();
    }

    @Override // defpackage.axrb
    public final boolean f() {
        return ((Boolean) c.c()).booleanValue();
    }
}
