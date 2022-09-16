package com.google.firebase.iid;

import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
/* loaded from: classes3.dex */
public class FirebaseInstanceId {
    public static aoab a;
    static ScheduledExecutorService b;
    private static final long j = TimeUnit.HOURS.toSeconds(8);
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    public final Executor c;
    public final anwg d;
    public final anzv e;
    public final anzt f;
    public final anzy g;
    public final aoal h;
    private boolean l = false;
    public final List i = new ArrayList();

    public FirebaseInstanceId(anwg anwgVar, anzv anzvVar, Executor executor, Executor executor2, aoaf aoafVar, aoaf aoafVar2, aoal aoalVar) {
        if (anzv.e(anwgVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (a == null) {
                    a = new aoab(anwgVar.a());
                }
            }
            this.d = anwgVar;
            this.e = anzvVar;
            this.f = new anzt(anwgVar, anzvVar, new qrl(anwgVar.a()), aoafVar, aoafVar2, aoalVar);
            this.c = executor2;
            this.g = new anzy(executor);
            this.h = aoalVar;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static void g(anwg anwgVar) {
        qnm.m(anwgVar.e().d, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        qnm.m(anwgVar.e().b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        qnm.m(anwgVar.e().a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        qnm.d(anwgVar.e().b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        qnm.d(k.matcher(anwgVar.e().a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static FirebaseInstanceId getInstance(anwg anwgVar) {
        g(anwgVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) anwgVar.f(FirebaseInstanceId.class);
        qnm.n(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public static final void m(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new qyo("FirebaseInstanceId"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final Object n(rve rveVar) {
        try {
            return rwd.e(rveVar, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    h();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    public final rve a(final String str, final String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return rwd.c(null).c(this.c, new rui() { // from class: anzo
            @Override // defpackage.rui
            public final Object a(rve rveVar) {
                FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.this;
                String str3 = str;
                String str4 = str2;
                try {
                    FirebaseInstanceId.a.f(firebaseInstanceId.d.h());
                    rve a2 = firebaseInstanceId.h.a();
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    a2.m(qrj.h, new rut() { // from class: anzp
                        @Override // defpackage.rut
                        public final void a(rve rveVar2) {
                            CountDownLatch countDownLatch2 = countDownLatch;
                            aoab aoabVar = FirebaseInstanceId.a;
                            countDownLatch2.countDown();
                        }
                    });
                    countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
                    if (a2.k()) {
                        String str5 = (String) a2.g();
                        aoaa c = firebaseInstanceId.c(str3, str4);
                        if (!firebaseInstanceId.l(c)) {
                            return rwd.c(new anzu(c.b));
                        }
                        return firebaseInstanceId.g.a(str3, str4, new anzs(firebaseInstanceId, str5, str3, str4, c));
                    } else if (((rvj) a2).d) {
                        throw new CancellationException("Task is already canceled");
                    } else {
                        if (a2.j()) {
                            throw new IllegalStateException(a2.f());
                        }
                        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
                    }
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        });
    }

    public final aoaa b() {
        return c(anzv.e(this.d), "*");
    }

    public final aoaa c(String str, String str2) {
        return a.a(d(), str, str2);
    }

    public final String d() {
        return "[DEFAULT]".equals(this.d.g()) ? "" : this.d.h();
    }

    @Deprecated
    public final String e() {
        g(this.d);
        aoaa b2 = b();
        if (l(b2)) {
            j();
        }
        return aoaa.c(b2);
    }

    @Deprecated
    public final String f(String str, String str2) {
        g(this.d);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((anzu) n(a(str, str2))).a;
    }

    final synchronized void h() {
        a.b();
    }

    public final synchronized void i(boolean z) {
        this.l = z;
    }

    final synchronized void j() {
        if (!this.l) {
            k(0L);
        }
    }

    public final synchronized void k(long j2) {
        m(new aoad(this, Math.min(Math.max(30L, j2 + j2), j)), j2);
        this.l = true;
    }

    public final boolean l(aoaa aoaaVar) {
        if (aoaaVar != null) {
            return System.currentTimeMillis() > aoaaVar.d + aoaa.a || !this.e.c().equals(aoaaVar.c);
        }
        return true;
    }
}
