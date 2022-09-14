package com.google.android.datatransport.cct.b;
/* loaded from: classes.dex */
public final class b implements c.e.b.k.h.a {

    /* renamed from: a  reason: collision with root package name */
    public static final c.e.b.k.h.a f6589a = new b();

    /* loaded from: classes.dex */
    private static final class a implements c.e.b.k.d<com.google.android.datatransport.cct.b.a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f6590a = new a();

        private a() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            com.google.android.datatransport.cct.b.a aVar = (com.google.android.datatransport.cct.b.a) obj;
            c.e.b.k.e eVar = (c.e.b.k.e) obj2;
            eVar.mo169a("sdkVersion", aVar.h());
            eVar.mo169a("model", aVar.e());
            eVar.mo169a("hardware", aVar.c());
            eVar.mo169a("device", aVar.a());
            eVar.mo169a("product", aVar.g());
            eVar.mo169a("osBuild", aVar.f());
            eVar.mo169a("manufacturer", aVar.d());
            eVar.mo169a("fingerprint", aVar.b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0142b implements c.e.b.k.d<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0142b f6591a = new C0142b();

        private C0142b() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            ((c.e.b.k.e) obj2).mo169a("logRequest", ((j) obj).a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements c.e.b.k.d<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f6592a = new c();

        private c() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            k kVar = (k) obj;
            c.e.b.k.e eVar = (c.e.b.k.e) obj2;
            eVar.mo169a("clientType", kVar.b());
            eVar.mo169a("androidClientInfo", kVar.a());
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements c.e.b.k.d<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f6593a = new d();

        private d() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            l lVar = (l) obj;
            c.e.b.k.e eVar = (c.e.b.k.e) obj2;
            eVar.mo168a("eventTimeMs", lVar.b());
            eVar.mo169a("eventCode", lVar.a());
            eVar.mo168a("eventUptimeMs", lVar.c());
            eVar.mo169a("sourceExtension", lVar.e());
            eVar.mo169a("sourceExtensionJsonProto3", lVar.f());
            eVar.mo168a("timezoneOffsetSeconds", lVar.g());
            eVar.mo169a("networkConnectionInfo", lVar.d());
        }
    }

    /* loaded from: classes.dex */
    private static final class e implements c.e.b.k.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f6594a = new e();

        private e() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            m mVar = (m) obj;
            c.e.b.k.e eVar = (c.e.b.k.e) obj2;
            eVar.mo168a("requestTimeMs", mVar.f());
            eVar.mo168a("requestUptimeMs", mVar.g());
            eVar.mo169a("clientInfo", mVar.a());
            eVar.mo169a("logSource", mVar.c());
            eVar.mo169a("logSourceName", mVar.d());
            eVar.mo169a("logEvent", mVar.b());
            eVar.mo169a("qosTier", mVar.e());
        }
    }

    /* loaded from: classes.dex */
    private static final class f implements c.e.b.k.d<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f6595a = new f();

        private f() {
        }

        @Override // c.e.b.k.d
        public void a(Object obj, Object obj2) {
            o oVar = (o) obj;
            c.e.b.k.e eVar = (c.e.b.k.e) obj2;
            eVar.mo169a("networkType", oVar.b());
            eVar.mo169a("mobileSubtype", oVar.a());
        }
    }

    private b() {
    }

    @Override // c.e.b.k.h.a
    public void a(c.e.b.k.h.b<?> bVar) {
        bVar.a(j.class, C0142b.f6591a);
        bVar.a(com.google.android.datatransport.cct.b.d.class, C0142b.f6591a);
        bVar.a(m.class, e.f6594a);
        bVar.a(g.class, e.f6594a);
        bVar.a(k.class, c.f6592a);
        bVar.a(com.google.android.datatransport.cct.b.e.class, c.f6592a);
        bVar.a(com.google.android.datatransport.cct.b.a.class, a.f6590a);
        bVar.a(com.google.android.datatransport.cct.b.c.class, a.f6590a);
        bVar.a(l.class, d.f6593a);
        bVar.a(com.google.android.datatransport.cct.b.f.class, d.f6593a);
        bVar.a(o.class, f.f6595a);
        bVar.a(i.class, f.f6595a);
    }
}
