package defpackage;
/* compiled from: PG */
/* renamed from: dyay  reason: default package */
/* loaded from: classes6.dex */
public final class dyay implements dyax {
    public static final cxju<Boolean> a;
    public static final cxju<Boolean> b;
    public static final cxju<String> c;
    public static final cxju<String> d;
    public static final cxju<Boolean> e;
    public static final cxju<Boolean> f;
    public static final cxju<Long> g;
    public static final cxju<Boolean> h;
    public static final cxju<Boolean> i;
    public static final cxju<Boolean> j;

    static {
        cxjs cxjsVar = new cxjs("phenotype__com.google.android.libraries.social.populous");
        cxjsVar.j("GrpcLoaderFeature__auth_scope", "oauth2:https://www.googleapis.com/auth/peopleapi.readonly");
        a = cxjsVar.h("GrpcLoaderFeature__enable_private_photo_url", false);
        b = cxjsVar.h("GrpcLoaderFeature__log_network_usage", true);
        c = cxjsVar.j("GrpcLoaderFeature__people_stack_service_authority_override", "");
        d = cxjsVar.j("GrpcLoaderFeature__service_authority_override", "");
        e = cxjsVar.h("GrpcLoaderFeature__skip_live_peopleapi_loader_when_logged_out", false);
        f = cxjsVar.h("GrpcLoaderFeature__sort_iant_originating_fields_by_affinity", true);
        g = cxjsVar.g("GrpcLoaderFeature__timeout_ms", 60000L);
        h = cxjsVar.h("GrpcLoaderFeature__use_async_loaders", true);
        i = cxjsVar.h("GrpcLoaderFeature__use_generated_request_mask", false);
        j = cxjsVar.h("GrpcLoaderFeature__use_targeted_request_mask", false);
    }

    @Override // defpackage.dyax
    public final boolean a() {
        return a.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final boolean b() {
        return b.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final String c() {
        return c.f();
    }

    @Override // defpackage.dyax
    public final String d() {
        return d.f();
    }

    @Override // defpackage.dyax
    public final boolean e() {
        return e.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final boolean f() {
        return f.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final long g() {
        return g.f().longValue();
    }

    @Override // defpackage.dyax
    public final boolean h() {
        return h.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final boolean i() {
        return i.f().booleanValue();
    }

    @Override // defpackage.dyax
    public final boolean j() {
        return j.f().booleanValue();
    }
}
