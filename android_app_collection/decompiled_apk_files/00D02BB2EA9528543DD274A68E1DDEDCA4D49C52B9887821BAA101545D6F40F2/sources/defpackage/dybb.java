package defpackage;
/* compiled from: PG */
/* renamed from: dybb  reason: default package */
/* loaded from: classes6.dex */
public final class dybb implements dyba {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<Boolean> c;
    public static final cxju<Boolean> d;
    public static final cxju<Long> e;
    public static final cxju<Long> f;
    public static final cxju<Long> g;
    public static final cxju<Long> h;
    public static final cxju<Boolean> i;
    public static final cxju<Boolean> j;
    public static final cxju<Boolean> k;
    public static final cxju<Long> l;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.h("LeanFeature__check_account_status_before_rpc", false);
        b = cxjsVar.h("LeanFeature__enable_exchange_directory_provider", true);
        c = cxjsVar.h("LeanFeature__handle_lookup_future_cancellation", true);
        d = cxjsVar.h("LeanFeature__lean_fishfood_enabled", false);
        e = cxjsVar.g("LeanFeature__lookup_rpc_cache_trim_amount", 1000L);
        f = cxjsVar.g("LeanFeature__lookup_rpc_cache_trim_threshold", 5000L);
        g = cxjsVar.g("LeanFeature__top_n_provider_empty_query_limit_multiplier", 2L);
        h = cxjsVar.g("LeanFeature__top_n_provider_non_empty_query_limit_multiplier", 2L);
        i = cxjsVar.h("LeanFeature__use_async_cache_info_provider", true);
        j = cxjsVar.h("LeanFeature__use_client_executor_for_database", true);
        k = cxjsVar.h("LeanFeature__use_provider_level_latency_logging", true);
        l = cxjsVar.g("LeanFeature__warmup_rpc_throttle_millis", 300000L);
    }

    @Override // defpackage.dyba
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final boolean c() {
        return c.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final boolean d() {
        return d.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final long e() {
        return e.f().longValue();
    }

    @Override // defpackage.dyba
    public final long f() {
        return f.f().longValue();
    }

    @Override // defpackage.dyba
    public final long g() {
        return g.f().longValue();
    }

    @Override // defpackage.dyba
    public final long h() {
        return h.f().longValue();
    }

    @Override // defpackage.dyba
    public final boolean i() {
        return i.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final boolean j() {
        return j.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final boolean k() {
        return k.f().booleanValue();
    }

    @Override // defpackage.dyba
    public final long l() {
        return l.f().longValue();
    }
}
