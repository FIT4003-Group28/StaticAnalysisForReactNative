package defpackage;
/* compiled from: PG */
/* renamed from: dxyl  reason: default package */
/* loaded from: classes6.dex */
public final class dxyl implements dxyk {
    public static final cxmb<Boolean> a;
    public static final cxmb<Boolean> b;
    public static final cxmb<Boolean> c;
    public static final cxmb<Long> d;
    public static final cxmb<String> e;
    public static final cxmb<Long> f;
    public static final cxmb<Long> g;
    public static final cxmb<Boolean> h;
    private final dbsg<cxji> i;

    static {
        cxml a2 = new cxml("com.google.android.libraries.consent.flows.footprints").a();
        a = a2.d("FootprintsConsentFeature__call_facs_cache_to_get_device_level_settings", false);
        b = a2.d("FootprintsConsentFeature__call_facs_cache_to_update_settings", false);
        c = a2.d("FootprintsConsentFeature__call_update_settings_with_empty_settings_on", false);
        d = a2.c("FootprintsConsentFeature__footprints_oneplatform_service_deadline_ms", 10000L);
        e = a2.e("FootprintsConsentFeature__footprints_oneplatform_service_host", "footprints-pa.googleapis.com");
        f = a2.c("FootprintsConsentFeature__footprints_oneplatform_service_port", 443L);
        g = a2.c("FootprintsConsentFeature__footprints_responses_cache_ttl_seconds", 300L);
        h = a2.d("FootprintsConsentFeature__kill_switch_on", false);
    }

    public dxyl(dbsg<cxji> dbsgVar) {
        this.i = dbsgVar;
    }

    @Override // defpackage.dxyk
    public final boolean a() {
        return a.a().booleanValue();
    }

    @Override // defpackage.dxyk
    public final boolean b() {
        return b.a().booleanValue();
    }

    @Override // defpackage.dxyk
    public final boolean c() {
        return c.a().booleanValue();
    }

    @Override // defpackage.dxyk
    public final long d() {
        return d.a().longValue();
    }

    @Override // defpackage.dxyk
    public final String e() {
        return e.a();
    }

    @Override // defpackage.dxyk
    public final long f() {
        return f.a().longValue();
    }

    @Override // defpackage.dxyk
    public final long g() {
        return g.a().longValue();
    }

    @Override // defpackage.dxyk
    public final boolean h() {
        return h.a().booleanValue();
    }
}
