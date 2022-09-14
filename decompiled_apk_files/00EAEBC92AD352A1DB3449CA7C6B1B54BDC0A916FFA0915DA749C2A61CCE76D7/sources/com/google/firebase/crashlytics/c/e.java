package com.google.firebase.crashlytics.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import c.e.a.b.g.g;
import c.e.a.b.g.h;
import com.google.firebase.crashlytics.c.h.m;
import com.google.firebase.crashlytics.c.h.t;
import com.google.firebase.crashlytics.c.h.v;
import com.google.firebase.crashlytics.c.h.y;
import com.google.firebase.crashlytics.c.q.j.f;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.l.c f8586a = new com.google.firebase.crashlytics.c.l.c();

    /* renamed from: b  reason: collision with root package name */
    private final c.e.b.d f8587b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8588c;

    /* renamed from: d  reason: collision with root package name */
    private PackageManager f8589d;

    /* renamed from: e  reason: collision with root package name */
    private String f8590e;

    /* renamed from: f  reason: collision with root package name */
    private PackageInfo f8591f;

    /* renamed from: g  reason: collision with root package name */
    private String f8592g;

    /* renamed from: h  reason: collision with root package name */
    private String f8593h;
    private String i;
    private String j;
    private String k;
    private y l;
    private t m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g<com.google.firebase.crashlytics.c.q.i.b, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8594a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.c.q.d f8595b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f8596c;

        a(String str, com.google.firebase.crashlytics.c.q.d dVar, Executor executor) {
            this.f8594a = str;
            this.f8595b = dVar;
            this.f8596c = executor;
        }

        @Override // c.e.a.b.g.g
        public h<Void> a(com.google.firebase.crashlytics.c.q.i.b bVar) {
            try {
                e.this.a(bVar, this.f8594a, this.f8595b, this.f8596c, true);
                return null;
            } catch (Exception e2) {
                com.google.firebase.crashlytics.c.b.a().b("Error performing auto configuration.", e2);
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements g<Void, com.google.firebase.crashlytics.c.q.i.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.c.q.d f8598a;

        b(e eVar, com.google.firebase.crashlytics.c.q.d dVar) {
            this.f8598a = dVar;
        }

        @Override // c.e.a.b.g.g
        public h<com.google.firebase.crashlytics.c.q.i.b> a(Void r1) {
            return this.f8598a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements c.e.a.b.g.a<Void, Object> {
        c(e eVar) {
        }

        @Override // c.e.a.b.g.a
        public Object a(h<Void> hVar) {
            if (!hVar.e()) {
                com.google.firebase.crashlytics.c.b.a().b("Error fetching settings.", hVar.a());
                return null;
            }
            return null;
        }
    }

    public e(c.e.b.d dVar, Context context, y yVar, t tVar) {
        this.f8587b = dVar;
        this.f8588c = context;
        this.l = yVar;
        this.m = tVar;
    }

    private com.google.firebase.crashlytics.c.q.i.a a(String str, String str2) {
        return new com.google.firebase.crashlytics.c.q.i.a(str, str2, d().b(), this.f8593h, this.f8592g, com.google.firebase.crashlytics.c.h.h.a(com.google.firebase.crashlytics.c.h.h.e(a()), str2, this.f8593h, this.f8592g), this.j, v.a(this.i).a(), this.k, "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.google.firebase.crashlytics.c.q.i.b bVar, String str, com.google.firebase.crashlytics.c.q.d dVar, Executor executor, boolean z) {
        if ("new".equals(bVar.f9129a)) {
            if (!a(bVar, str, z)) {
                com.google.firebase.crashlytics.c.b.a().b("Failed to create app with Crashlytics service.", null);
                return;
            }
        } else if (!"configured".equals(bVar.f9129a)) {
            if (!bVar.f9134f) {
                return;
            }
            com.google.firebase.crashlytics.c.b.a().a("Server says an update is required - forcing a full App update.");
            b(bVar, str, z);
            return;
        }
        dVar.a(com.google.firebase.crashlytics.c.q.c.SKIP_CACHE_LOOKUP, executor);
    }

    private boolean a(com.google.firebase.crashlytics.c.q.i.b bVar, String str, boolean z) {
        return new com.google.firebase.crashlytics.c.q.j.c(b(), bVar.f9130b, this.f8586a, e()).a(a(bVar.f9133e, str), z);
    }

    private boolean b(com.google.firebase.crashlytics.c.q.i.b bVar, String str, boolean z) {
        return new f(b(), bVar.f9130b, this.f8586a, e()).a(a(bVar.f9133e, str), z);
    }

    private y d() {
        return this.l;
    }

    private static String e() {
        return m.i();
    }

    public Context a() {
        return this.f8588c;
    }

    public com.google.firebase.crashlytics.c.q.d a(Context context, c.e.b.d dVar, Executor executor) {
        com.google.firebase.crashlytics.c.q.d a2 = com.google.firebase.crashlytics.c.q.d.a(context, dVar.d().b(), this.l, this.f8586a, this.f8592g, this.f8593h, b(), this.m);
        a2.a(executor).a(executor, new c(this));
        return a2;
    }

    public void a(Executor executor, com.google.firebase.crashlytics.c.q.d dVar) {
        this.m.c().a(executor, new b(this, dVar)).a(executor, new a(this.f8587b.d().b(), dVar, executor));
    }

    String b() {
        return com.google.firebase.crashlytics.c.h.h.b(this.f8588c, "com.crashlytics.ApiEndpoint");
    }

    public boolean c() {
        try {
            this.i = this.l.c();
            this.f8589d = this.f8588c.getPackageManager();
            this.f8590e = this.f8588c.getPackageName();
            this.f8591f = this.f8589d.getPackageInfo(this.f8590e, 0);
            this.f8592g = Integer.toString(this.f8591f.versionCode);
            this.f8593h = this.f8591f.versionName == null ? "0.0" : this.f8591f.versionName;
            this.j = this.f8589d.getApplicationLabel(this.f8588c.getApplicationInfo()).toString();
            this.k = Integer.toString(this.f8588c.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            com.google.firebase.crashlytics.c.b.a().b("Failed init", e2);
            return false;
        }
    }
}
