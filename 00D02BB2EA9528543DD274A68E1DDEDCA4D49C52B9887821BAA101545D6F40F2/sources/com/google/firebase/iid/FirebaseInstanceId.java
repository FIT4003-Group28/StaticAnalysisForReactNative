package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
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
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public class FirebaseInstanceId {
    public static desf a;
    static ScheduledExecutorService b;
    private static final long h = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern i = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final dela d;
    public final derx e;
    public final derv f;
    public final desc g;
    private final desz j;
    private boolean k = false;

    public FirebaseInstanceId(dela delaVar, derx derxVar, Executor executor, Executor executor2, desq<devr> desqVar, desq<derf> desqVar2, desz deszVar) {
        if (derx.getDefaultSenderId(delaVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (a == null) {
                    a = new desf(delaVar.a());
                }
            }
            this.d = delaVar;
            this.e = derxVar;
            this.f = new derv(delaVar, derxVar, desqVar, desqVar2, deszVar);
            this.c = executor2;
            this.g = new desc(executor);
            this.j = deszVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static synchronized void clearInstancesForTest() {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = b;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            b = null;
            a = null;
        }
    }

    public static void d(dela delaVar) {
        cnwc.m(delaVar.c().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        cnwc.m(delaVar.c().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        cnwc.m(delaVar.c().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        cnwc.e(delaVar.c().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        cnwc.e(i.matcher(delaVar.c().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(dela.getInstance());
    }

    public static final void m(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new cnxx("FirebaseInstanceId"));
            }
            b.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    private final cpcq<derw> o(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return cpda.a(null).h(this.c, new cpbu(this, str, str2) { // from class: derp
            private final FirebaseInstanceId a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
            }

            @Override // defpackage.cpbu
            public final Object a(cpcq cpcqVar) {
                FirebaseInstanceId firebaseInstanceId = this.a;
                String str3 = this.b;
                String str4 = this.c;
                String e = firebaseInstanceId.e();
                dese i2 = firebaseInstanceId.i(str3, str4);
                if (!firebaseInstanceId.l(i2)) {
                    return cpda.a(new derw(e, i2.b));
                }
                return firebaseInstanceId.g.a(str3, str4, new ders(firebaseInstanceId, e, str3, str4));
            }
        });
    }

    private final <T> T p(cpcq<T> cpcqVar) {
        try {
            return (T) cpda.e(cpcqVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    j();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    public final synchronized void a(boolean z) {
        this.k = z;
    }

    public final synchronized void b() {
        if (!this.k) {
            c(0L);
        }
    }

    public final synchronized void c(long j) {
        m(new desh(this, Math.min(Math.max(30L, j + j), h)), j);
        this.k = true;
    }

    public final String e() {
        try {
            a.f(this.d.g());
            cpcq<String> d = this.j.d();
            cnwc.n(d, "Task must not be null");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            d.n(derq.a, new cpcf(countDownLatch) { // from class: derr
                private final CountDownLatch a;

                {
                    this.a = countDownLatch;
                }

                @Override // defpackage.cpcf
                public final void a(cpcq cpcqVar) {
                    CountDownLatch countDownLatch2 = this.a;
                    desf desfVar = FirebaseInstanceId.a;
                    countDownLatch2.countDown();
                }
            });
            countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
            if (d.b()) {
                return d.d();
            }
            if (d.c()) {
                throw new CancellationException("Task is already canceled");
            }
            if (d.a()) {
                throw new IllegalStateException(d.e());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Deprecated
    public final cpcq<derw> f() {
        d(this.d);
        return o(derx.getDefaultSenderId(this.d), "*");
    }

    @Deprecated
    public final String g(String str, String str2) {
        d(this.d);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((derw) p(o(str, str2))).b;
    }

    public final dese h() {
        return i(derx.getDefaultSenderId(this.d), "*");
    }

    public final dese i(String str, String str2) {
        return a.c(k(), str, str2);
    }

    final synchronized void j() {
        a.b();
    }

    public final String k() {
        return "[DEFAULT]".equals(this.d.b()) ? "" : this.d.g();
    }

    public final boolean l(dese deseVar) {
        if (deseVar != null) {
            return System.currentTimeMillis() > deseVar.d + dese.a || !this.e.c().equals(deseVar.c);
        }
        return true;
    }

    @Deprecated
    public final void n() {
        d(this.d);
        if (l(h())) {
            b();
        }
        long j = dese.a;
    }

    public static FirebaseInstanceId getInstance(dela delaVar) {
        d(delaVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) delaVar.d(FirebaseInstanceId.class);
        cnwc.n(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }
}
