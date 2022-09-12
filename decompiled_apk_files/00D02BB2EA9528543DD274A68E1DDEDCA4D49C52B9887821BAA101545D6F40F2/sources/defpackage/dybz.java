package defpackage;
/* compiled from: PG */
/* renamed from: dybz  reason: default package */
/* loaded from: classes6.dex */
public final class dybz implements dyby {
    public static final cxju<Long> a;
    public static final cxju<Long> b;
    public static final cxju<Long> c;
    public static final cxju<Boolean> d;
    public static final cxju<Boolean> e;
    public static final cxju<Long> f;
    public static final cxju<Boolean> g;
    public static final cxju<Long> h;
    public static final cxju<Boolean> i;
    public static final cxju<Boolean> j;
    public static final cxju<Boolean> k;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        a = cxjsVar.g("TopnFeature__big_request_size", 500L);
        b = cxjsVar.g("TopnFeature__cache_invalidate_time_ms", 86400000L);
        c = cxjsVar.g("TopnFeature__cache_refresh_time_ms", 43200000L);
        d = cxjsVar.h("TopnFeature__empty_cache_on_null_response", true);
        cxjsVar.h("TopnFeature__enable_file_deletion_ttl", true);
        e = cxjsVar.h("TopnFeature__enable_new_file_naming_scheme", false);
        f = cxjsVar.g("TopnFeature__file_deletion_ttl_hours", 720L);
        g = cxjsVar.h("TopnFeature__save_response_async", false);
        h = cxjsVar.g("TopnFeature__small_request_size", 10L);
        i = cxjsVar.h("TopnFeature__use_cache_expiry_overrides", false);
        j = cxjsVar.h("TopnFeature__use_noop_request_when_disabled", true);
        k = cxjsVar.h("TopnFeature__use_primary_profile_email_lookup", false);
    }

    @Override // defpackage.dyby
    public final long a() {
        return a.f().longValue();
    }

    @Override // defpackage.dyby
    public final long b() {
        return b.f().longValue();
    }

    @Override // defpackage.dyby
    public final long c() {
        return c.f().longValue();
    }

    @Override // defpackage.dyby
    public final boolean d() {
        return d.f().booleanValue();
    }

    @Override // defpackage.dyby
    public final boolean e() {
        return e.f().booleanValue();
    }

    @Override // defpackage.dyby
    public final long f() {
        return f.f().longValue();
    }

    @Override // defpackage.dyby
    public final boolean g() {
        return g.f().booleanValue();
    }

    @Override // defpackage.dyby
    public final long h() {
        return h.f().longValue();
    }

    @Override // defpackage.dyby
    public final boolean i() {
        return i.f().booleanValue();
    }

    @Override // defpackage.dyby
    public final boolean j() {
        return j.f().booleanValue();
    }

    @Override // defpackage.dyby
    public final boolean k() {
        return k.f().booleanValue();
    }
}
