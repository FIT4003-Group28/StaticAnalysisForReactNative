package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.j0;
import com.google.firebase.iid.r0;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class FirebaseInstanceId {
    private static r0 j;
    static ScheduledExecutorService l;

    /* renamed from: a  reason: collision with root package name */
    final Executor f9190a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.b.d f9191b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f9192c;

    /* renamed from: d  reason: collision with root package name */
    private final s f9193d;

    /* renamed from: e  reason: collision with root package name */
    private final j0 f9194e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.h f9195f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9196g;

    /* renamed from: h  reason: collision with root package name */
    private final a f9197h;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9198a;

        /* renamed from: b  reason: collision with root package name */
        private final c.e.b.l.d f9199b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f9200c;

        /* renamed from: d  reason: collision with root package name */
        private c.e.b.l.b<c.e.b.a> f9201d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f9202e;

        a(c.e.b.l.d dVar) {
            this.f9199b = dVar;
        }

        private boolean c() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context b2 = FirebaseInstanceId.this.f9191b.b();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(b2.getPackageName());
                ResolveInfo resolveService = b2.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        private Boolean d() {
            ApplicationInfo applicationInfo;
            Context b2 = FirebaseInstanceId.this.f9191b.b();
            SharedPreferences sharedPreferences = b2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = b2.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(b2.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void a() {
            if (this.f9200c) {
                return;
            }
            this.f9198a = c();
            this.f9202e = d();
            if (this.f9202e == null && this.f9198a) {
                this.f9201d = new c.e.b.l.b(this) { // from class: com.google.firebase.iid.p

                    /* renamed from: a  reason: collision with root package name */
                    private final FirebaseInstanceId.a f9260a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f9260a = this;
                    }

                    @Override // c.e.b.l.b
                    public final void a(c.e.b.l.a aVar) {
                        this.f9260a.a(aVar);
                    }
                };
                this.f9199b.a(c.e.b.a.class, this.f9201d);
            }
            this.f9200c = true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final /* synthetic */ void a(c.e.b.l.a aVar) {
            synchronized (this) {
                if (b()) {
                    FirebaseInstanceId.this.q();
                }
            }
        }

        synchronized void a(boolean z) {
            a();
            if (this.f9201d != null) {
                this.f9199b.b(c.e.b.a.class, this.f9201d);
                this.f9201d = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.f9191b.b().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.q();
            }
            this.f9202e = Boolean.valueOf(z);
        }

        synchronized boolean b() {
            a();
            if (this.f9202e != null) {
                return this.f9202e.booleanValue();
            }
            return this.f9198a && FirebaseInstanceId.this.f9191b.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInstanceId(c.e.b.d dVar, c.e.b.l.d dVar2, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2) {
        this(dVar, new f0(dVar.b()), h.b(), h.b(), dVar2, hVar, cVar, hVar2);
    }

    FirebaseInstanceId(c.e.b.d dVar, f0 f0Var, Executor executor, Executor executor2, c.e.b.l.d dVar2, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2) {
        this.f9196g = false;
        if (f0.a(dVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (j == null) {
                    j = new r0(dVar.b());
                }
            }
            this.f9191b = dVar;
            this.f9192c = f0Var;
            this.f9193d = new s(dVar, f0Var, hVar, cVar, hVar2);
            this.f9190a = executor2;
            this.f9197h = new a(dVar2);
            this.f9194e = new j0(executor);
            this.f9195f = hVar2;
            executor2.execute(new Runnable(this) { // from class: com.google.firebase.iid.j

                /* renamed from: b  reason: collision with root package name */
                private final FirebaseInstanceId f9236b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f9236b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f9236b.k();
                }
            });
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private <T> T a(c.e.a.b.g.h<T> hVar) {
        try {
            return (T) c.e.a.b.g.k.a(hVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    l();
                }
                throw ((IOException) cause);
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            } else {
                throw ((RuntimeException) cause);
            }
        }
    }

    private static void a(c.e.b.d dVar) {
        com.google.android.gms.common.internal.s.a(dVar.d().f(), (Object) "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        com.google.android.gms.common.internal.s.a(dVar.d().b(), (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        com.google.android.gms.common.internal.s.a(dVar.d().a(), (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        com.google.android.gms.common.internal.s.a(b(dVar.d().b()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.s.a(a(dVar.d().a()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    static boolean a(String str) {
        return k.matcher(str).matches();
    }

    private static <T> T b(c.e.a.b.g.h<T> hVar) {
        com.google.android.gms.common.internal.s.a(hVar, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.a(l.f9243a, new c.e.a.b.g.c(countDownLatch) { // from class: com.google.firebase.iid.m

            /* renamed from: a  reason: collision with root package name */
            private final CountDownLatch f9246a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9246a = countDownLatch;
            }

            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar2) {
                this.f9246a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return (T) c(hVar);
    }

    static boolean b(String str) {
        return str.contains(":");
    }

    private static <T> T c(c.e.a.b.g.h<T> hVar) {
        if (hVar.e()) {
            return hVar.b();
        }
        if (hVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        if (!hVar.d()) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new IllegalStateException(hVar.a());
    }

    private static String c(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private c.e.a.b.g.h<w> d(final String str, String str2) {
        final String c2 = c(str2);
        return c.e.a.b.g.k.a((Object) null).b(this.f9190a, new c.e.a.b.g.a(this, str, c2) { // from class: com.google.firebase.iid.k

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f9239a;

            /* renamed from: b  reason: collision with root package name */
            private final String f9240b;

            /* renamed from: c  reason: collision with root package name */
            private final String f9241c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9239a = this;
                this.f9240b = str;
                this.f9241c = c2;
            }

            @Override // c.e.a.b.g.a
            public final Object a(c.e.a.b.g.h hVar) {
                return this.f9239a.a(this.f9240b, this.f9241c, hVar);
            }
        });
    }

    @Keep
    public static FirebaseInstanceId getInstance(c.e.b.d dVar) {
        a(dVar);
        return (FirebaseInstanceId) dVar.a(FirebaseInstanceId.class);
    }

    public static FirebaseInstanceId n() {
        return getInstance(c.e.b.d.k());
    }

    private String o() {
        return "[DEFAULT]".equals(this.f9191b.c()) ? "" : this.f9191b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (a(h())) {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ c.e.a.b.g.h a(final String str, final String str2, c.e.a.b.g.h hVar) {
        final String f2 = f();
        r0.a c2 = c(str, str2);
        return !a(c2) ? c.e.a.b.g.k.a(new x(f2, c2.f9282a)) : this.f9194e.a(str, str2, new j0.a(this, f2, str, str2) { // from class: com.google.firebase.iid.n

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f9248a;

            /* renamed from: b  reason: collision with root package name */
            private final String f9249b;

            /* renamed from: c  reason: collision with root package name */
            private final String f9250c;

            /* renamed from: d  reason: collision with root package name */
            private final String f9251d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9248a = this;
                this.f9249b = f2;
                this.f9250c = str;
                this.f9251d = str2;
            }

            @Override // com.google.firebase.iid.j0.a
            public final c.e.a.b.g.h start() {
                return this.f9248a.a(this.f9249b, this.f9250c, this.f9251d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ c.e.a.b.g.h a(final String str, final String str2, final String str3) {
        return this.f9193d.b(str, str2, str3).a(this.f9190a, new c.e.a.b.g.g(this, str2, str3, str) { // from class: com.google.firebase.iid.o

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseInstanceId f9255a;

            /* renamed from: b  reason: collision with root package name */
            private final String f9256b;

            /* renamed from: c  reason: collision with root package name */
            private final String f9257c;

            /* renamed from: d  reason: collision with root package name */
            private final String f9258d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9255a = this;
                this.f9256b = str2;
                this.f9257c = str3;
                this.f9258d = str;
            }

            @Override // c.e.a.b.g.g
            public final c.e.a.b.g.h a(Object obj) {
                return this.f9255a.a(this.f9256b, this.f9257c, this.f9258d, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ c.e.a.b.g.h a(String str, String str2, String str3, String str4) {
        j.a(o(), str, str2, str4, this.f9192c.a());
        return c.e.a.b.g.k.a(new x(str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return b(f0.a(this.f9191b), "*");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(long j2) {
        a(new s0(this, Math.min(Math.max(30L, j2 << 1), i)), j2);
        this.f9196g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (l == null) {
                l = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.q.a("FirebaseInstanceId"));
            }
            l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public void a(String str, String str2) {
        a(this.f9191b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String c2 = c(str2);
            a(this.f9193d.a(f(), str, c2));
            j.a(o(), str, c2);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void a(boolean z) {
        this.f9197h.a(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(r0.a aVar) {
        return aVar == null || aVar.a(this.f9192c.a());
    }

    public String b(String str, String str2) {
        a(this.f9191b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((w) a(d(str, str2))).b();
        }
        throw new IOException("MAIN_THREAD");
    }

    public void b() {
        a(this.f9191b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            a(this.f9195f.b());
            l();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(boolean z) {
        this.f9196g = z;
    }

    r0.a c(String str, String str2) {
        return j.b(o(), str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        j.a(o());
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.b.d d() {
        return this.f9191b;
    }

    public String e() {
        a(this.f9191b);
        q();
        return f();
    }

    String f() {
        try {
            j.b(this.f9191b.e());
            return (String) b(this.f9195f.a());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public c.e.a.b.g.h<w> g() {
        a(this.f9191b);
        return d(f0.a(this.f9191b), "*");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0.a h() {
        return c(f0.a(this.f9191b), "*");
    }

    public boolean i() {
        return this.f9197h.b();
    }

    public boolean j() {
        return this.f9192c.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        if (i()) {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void l() {
        j.a();
        if (i()) {
            m();
        }
    }

    synchronized void m() {
        if (!this.f9196g) {
            a(0L);
        }
    }
}
