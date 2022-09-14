package c.e.a.b.d.g;
/* loaded from: classes.dex */
public final class f9 implements c9 {
    private static final k2<Long> A;
    private static final k2<Long> B;
    private static final k2<Long> C;
    private static final k2<Long> D;
    private static final k2<Long> E;
    private static final k2<String> F;
    private static final k2<Long> G;

    /* renamed from: a  reason: collision with root package name */
    private static final k2<Long> f4150a;

    /* renamed from: b  reason: collision with root package name */
    private static final k2<Long> f4151b;

    /* renamed from: c  reason: collision with root package name */
    private static final k2<String> f4152c;

    /* renamed from: d  reason: collision with root package name */
    private static final k2<String> f4153d;

    /* renamed from: e  reason: collision with root package name */
    private static final k2<Long> f4154e;

    /* renamed from: f  reason: collision with root package name */
    private static final k2<Long> f4155f;

    /* renamed from: g  reason: collision with root package name */
    private static final k2<Long> f4156g;

    /* renamed from: h  reason: collision with root package name */
    private static final k2<Long> f4157h;
    private static final k2<Long> i;
    private static final k2<Long> j;
    private static final k2<Long> k;
    private static final k2<Long> l;
    private static final k2<Long> m;
    private static final k2<Long> n;
    private static final k2<Long> o;
    private static final k2<Long> p;
    private static final k2<Long> q;
    private static final k2<Long> r;
    private static final k2<Long> s;
    private static final k2<Long> t;
    private static final k2<Long> u;
    private static final k2<Long> v;
    private static final k2<Long> w;
    private static final k2<Long> x;
    private static final k2<Long> y;
    private static final k2<Long> z;

    static {
        r2 r2Var = new r2(l2.a("com.google.android.gms.measurement"));
        f4150a = r2Var.a("measurement.ad_id_cache_time", 10000L);
        f4151b = r2Var.a("measurement.config.cache_time", 86400000L);
        r2Var.a("measurement.log_tag", "FA");
        f4152c = r2Var.a("measurement.config.url_authority", "app-measurement.com");
        f4153d = r2Var.a("measurement.config.url_scheme", "https");
        f4154e = r2Var.a("measurement.upload.debug_upload_interval", 1000L);
        f4155f = r2Var.a("measurement.lifetimevalue.max_currency_tracked", 4L);
        f4156g = r2Var.a("measurement.store.max_stored_events_per_app", 100000L);
        f4157h = r2Var.a("measurement.experiment.max_ids", 50L);
        i = r2Var.a("measurement.audience.filter_result_max_count", 200L);
        j = r2Var.a("measurement.alarm_manager.minimum_interval", 60000L);
        k = r2Var.a("measurement.upload.minimum_delay", 500L);
        l = r2Var.a("measurement.monitoring.sample_period_millis", 86400000L);
        m = r2Var.a("measurement.upload.realtime_upload_interval", 10000L);
        n = r2Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        r2Var.a("measurement.config.cache_time.service", 3600000L);
        o = r2Var.a("measurement.service_client.idle_disconnect_millis", 5000L);
        r2Var.a("measurement.log_tag.service", "FA-SVC");
        p = r2Var.a("measurement.upload.stale_data_deletion_interval", 86400000L);
        q = r2Var.a("measurement.upload.backoff_period", 43200000L);
        r = r2Var.a("measurement.upload.initial_upload_delay_time", 15000L);
        s = r2Var.a("measurement.upload.interval", 3600000L);
        t = r2Var.a("measurement.upload.max_bundle_size", 65536L);
        u = r2Var.a("measurement.upload.max_bundles", 100L);
        v = r2Var.a("measurement.upload.max_conversions_per_day", 500L);
        w = r2Var.a("measurement.upload.max_error_events_per_day", 1000L);
        x = r2Var.a("measurement.upload.max_events_per_bundle", 1000L);
        y = r2Var.a("measurement.upload.max_events_per_day", 100000L);
        z = r2Var.a("measurement.upload.max_public_events_per_day", 50000L);
        A = r2Var.a("measurement.upload.max_queue_time", 2419200000L);
        B = r2Var.a("measurement.upload.max_realtime_events_per_day", 10L);
        C = r2Var.a("measurement.upload.max_batch_size", 65536L);
        D = r2Var.a("measurement.upload.retry_count", 6L);
        E = r2Var.a("measurement.upload.retry_time", 1800000L);
        F = r2Var.a("measurement.upload.url", "https://app-measurement.com/a");
        G = r2Var.a("measurement.upload.window_interval", 3600000L);
    }

    @Override // c.e.a.b.d.g.c9
    public final long A() {
        return s.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long B() {
        return o.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long C() {
        return k.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long D() {
        return B.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long E() {
        return x.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final String F() {
        return F.b();
    }

    @Override // c.e.a.b.d.g.c9
    public final long G() {
        return t.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long a() {
        return q.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long b() {
        return m.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long c() {
        return r.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long d() {
        return n.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long e() {
        return f4155f.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long f() {
        return f4150a.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long g() {
        return f4154e.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long h() {
        return f4156g.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long i() {
        return p.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long j() {
        return f4151b.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final String k() {
        return f4153d.b();
    }

    @Override // c.e.a.b.d.g.c9
    public final String l() {
        return f4152c.b();
    }

    @Override // c.e.a.b.d.g.c9
    public final long m() {
        return l.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long n() {
        return C.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long o() {
        return y.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long p() {
        return f4157h.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long q() {
        return G.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long r() {
        return z.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long s() {
        return v.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long t() {
        return i.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long u() {
        return D.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long v() {
        return j.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long w() {
        return u.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long x() {
        return A.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long y() {
        return w.b().longValue();
    }

    @Override // c.e.a.b.d.g.c9
    public final long z() {
        return E.b().longValue();
    }
}
