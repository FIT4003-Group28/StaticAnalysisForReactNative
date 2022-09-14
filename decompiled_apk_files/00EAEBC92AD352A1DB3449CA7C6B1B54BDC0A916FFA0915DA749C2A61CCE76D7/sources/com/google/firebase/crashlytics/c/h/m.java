package com.google.firebase.crashlytics.c.h;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8739a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.b.d f8740b;

    /* renamed from: c  reason: collision with root package name */
    private final t f8741c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8742d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private n f8743e;

    /* renamed from: f  reason: collision with root package name */
    private n f8744f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8745g;

    /* renamed from: h  reason: collision with root package name */
    private k f8746h;
    private final y i;
    private final com.google.firebase.crashlytics.c.g.b j;
    private final com.google.firebase.crashlytics.c.f.a k;
    private ExecutorService l;
    private i m;
    private com.google.firebase.crashlytics.c.a n;

    /* loaded from: classes.dex */
    class a implements Callable<c.e.a.b.g.h<Void>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.c.q.e f8747a;

        a(com.google.firebase.crashlytics.c.q.e eVar) {
            this.f8747a = eVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public c.e.a.b.g.h<Void> mo290call() {
            return m.this.c(this.f8747a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.c.q.e f8749b;

        b(com.google.firebase.crashlytics.c.q.e eVar) {
            this.f8749b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.c(this.f8749b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Boolean mo291call() {
            try {
                boolean c2 = m.this.f8743e.c();
                com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
                a2.a("Initialization marker file removed: " + c2);
                return Boolean.valueOf(c2);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.c.b.a().b("Problem encountered deleting Crashlytics initialization marker.", e2);
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Boolean mo292call() {
            return Boolean.valueOf(m.this.f8746h.d());
        }
    }

    public m(c.e.b.d dVar, y yVar, com.google.firebase.crashlytics.c.a aVar, t tVar, com.google.firebase.crashlytics.c.g.b bVar, com.google.firebase.crashlytics.c.f.a aVar2, ExecutorService executorService) {
        this.f8740b = dVar;
        this.f8741c = tVar;
        this.f8739a = dVar.b();
        this.i = yVar;
        this.n = aVar;
        this.j = bVar;
        this.k = aVar2;
        this.l = executorService;
        this.m = new i(executorService);
    }

    static boolean a(String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.c.b.a().a("Configured not to require a build ID.");
            return true;
        } else if (!h.b(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.e.a.b.g.h<Void> c(com.google.firebase.crashlytics.c.q.e eVar) {
        f();
        this.f8746h.b();
        try {
            this.j.a(l.a(this));
            com.google.firebase.crashlytics.c.q.i.e b2 = eVar.b();
            if (!b2.b().f9137a) {
                com.google.firebase.crashlytics.c.b.a().a("Collection of crash reports disabled in Crashlytics settings.");
                return c.e.a.b.g.k.a((Exception) new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f8746h.b(b2.a().f9138a)) {
                com.google.firebase.crashlytics.c.b.a().a("Could not finalize previous sessions.");
            }
            return this.f8746h.a(1.0f, eVar.a());
        } catch (Exception e2) {
            com.google.firebase.crashlytics.c.b.a().b("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return c.e.a.b.g.k.a(e2);
        } finally {
            e();
        }
    }

    private void d(com.google.firebase.crashlytics.c.q.e eVar) {
        com.google.firebase.crashlytics.c.b a2;
        String str;
        Future<?> submit = this.l.submit(new b(eVar));
        com.google.firebase.crashlytics.c.b.a().a("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            a2 = com.google.firebase.crashlytics.c.b.a();
            str = "Crashlytics was interrupted during initialization.";
            a2.b(str, e);
        } catch (ExecutionException e3) {
            e = e3;
            a2 = com.google.firebase.crashlytics.c.b.a();
            str = "Problem encountered during Crashlytics initialization.";
            a2.b(str, e);
        } catch (TimeoutException e4) {
            e = e4;
            a2 = com.google.firebase.crashlytics.c.b.a();
            str = "Crashlytics timed out during initialization.";
            a2.b(str, e);
        }
    }

    private void h() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) k0.a(this.m.a(new d())));
        } catch (Exception unused) {
            z = false;
        }
        this.f8745g = z;
    }

    public static String i() {
        return "17.1.0";
    }

    public c.e.a.b.g.h<Boolean> a() {
        return this.f8746h.a();
    }

    public c.e.a.b.g.h<Void> a(com.google.firebase.crashlytics.c.q.e eVar) {
        return k0.a(this.l, new a(eVar));
    }

    public void a(String str) {
        this.f8746h.a(System.currentTimeMillis() - this.f8742d, str);
    }

    public void a(String str, String str2) {
        this.f8746h.a(str, str2);
    }

    public void a(Throwable th) {
        this.f8746h.a(Thread.currentThread(), th);
    }

    public void a(boolean z) {
        this.f8741c.b(z);
    }

    public c.e.a.b.g.h<Void> b() {
        return this.f8746h.c();
    }

    public void b(String str) {
        this.f8746h.a(str);
    }

    public boolean b(com.google.firebase.crashlytics.c.q.e eVar) {
        String e2 = h.e(this.f8739a);
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a("Mapping file ID is: " + e2);
        if (a(e2, h.a(this.f8739a, "com.crashlytics.RequireBuildId", true))) {
            String b2 = this.f8740b.d().b();
            try {
                com.google.firebase.crashlytics.c.b a3 = com.google.firebase.crashlytics.c.b.a();
                a3.c("Initializing Crashlytics " + i());
                com.google.firebase.crashlytics.c.m.i iVar = new com.google.firebase.crashlytics.c.m.i(this.f8739a);
                this.f8744f = new n("crash_marker", iVar);
                this.f8743e = new n("initialization_marker", iVar);
                com.google.firebase.crashlytics.c.l.c cVar = new com.google.firebase.crashlytics.c.l.c();
                com.google.firebase.crashlytics.c.h.b a4 = com.google.firebase.crashlytics.c.h.b.a(this.f8739a, this.i, b2, e2);
                com.google.firebase.crashlytics.c.s.a aVar = new com.google.firebase.crashlytics.c.s.a(this.f8739a);
                com.google.firebase.crashlytics.c.b a5 = com.google.firebase.crashlytics.c.b.a();
                a5.a("Installer package name is: " + a4.f8614c);
                this.f8746h = new k(this.f8739a, this.m, cVar, this.i, this.f8741c, iVar, this.f8744f, a4, null, null, this.n, aVar, this.k, eVar);
                boolean d2 = d();
                h();
                this.f8746h.a(Thread.getDefaultUncaughtExceptionHandler(), eVar);
                if (!d2 || !h.b(this.f8739a)) {
                    com.google.firebase.crashlytics.c.b.a().a("Exception handling initialization successful");
                    return true;
                }
                com.google.firebase.crashlytics.c.b.a().a("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                d(eVar);
                return false;
            } catch (Exception e3) {
                com.google.firebase.crashlytics.c.b.a().b("Crashlytics was not started due to an exception during initialization", e3);
                this.f8746h = null;
                return false;
            }
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    public boolean c() {
        return this.f8745g;
    }

    boolean d() {
        return this.f8743e.b();
    }

    void e() {
        this.m.a(new c());
    }

    void f() {
        this.m.a();
        this.f8743e.a();
        com.google.firebase.crashlytics.c.b.a().a("Initialization marker file created.");
    }

    public c.e.a.b.g.h<Void> g() {
        return this.f8746h.o();
    }
}
