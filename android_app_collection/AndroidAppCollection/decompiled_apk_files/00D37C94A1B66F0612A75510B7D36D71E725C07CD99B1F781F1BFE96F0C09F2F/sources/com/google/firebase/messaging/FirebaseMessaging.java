package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.cardboard.sdk.R;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class FirebaseMessaging {
    static osn a;
    static ScheduledExecutorService b;
    public static final /* synthetic */ int h = 0;
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static aocm j;
    public final anwg c;
    public final Context d;
    public final aobz e;
    public final rve f;
    public final aocd g;
    private final aoae k;
    private final aocg l;
    private final aoby m;
    private final Executor n;
    private boolean o;
    private final Application.ActivityLifecycleCallbacks p;

    public FirebaseMessaging(anwg anwgVar, aoae aoaeVar, aoaf aoafVar, aoaf aoafVar2, aoal aoalVar, osn osnVar, anzh anzhVar) {
        aocd aocdVar = new aocd(anwgVar.a());
        aobz aobzVar = new aobz(anwgVar, aocdVar, new qrl(anwgVar.a()), aoafVar, aoafVar2, aoalVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new qyo("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new qyo("Firebase-Messaging-Init"));
        this.o = false;
        a = osnVar;
        this.c = anwgVar;
        this.k = aoaeVar;
        this.m = new aoby(this, anzhVar);
        Context a2 = anwgVar.a();
        this.d = a2;
        aobq aobqVar = new aobq();
        this.p = aobqVar;
        this.g = aocdVar;
        this.e = aobzVar;
        this.l = new aocg(newSingleThreadExecutor);
        this.n = scheduledThreadPoolExecutor;
        Context a3 = anwgVar.a();
        if (a3 instanceof Application) {
            ((Application) a3).registerActivityLifecycleCallbacks(aobqVar);
        } else {
            String valueOf = String.valueOf(a3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowMinWidthMinor);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (aoaeVar != null) {
            aoaeVar.b(new aobu(this));
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: aobw
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                if (firebaseMessaging.j()) {
                    firebaseMessaging.h();
                }
            }
        });
        rve a4 = aocs.a(this, aocdVar, aobzVar, a2, new ScheduledThreadPoolExecutor(1, new qyo("Firebase-Messaging-Topics-Io")));
        this.f = a4;
        a4.p(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new qyo("Firebase-Messaging-Trigger-Topics-Io")), new ruz() { // from class: aobr
            @Override // defpackage.ruz
            public final void d(Object obj) {
                aocs aocsVar = (aocs) obj;
                if (FirebaseMessaging.this.j()) {
                    aocsVar.f();
                }
            }
        });
    }

    public static synchronized FirebaseMessaging a() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(anwg.b());
        }
        return firebaseMessaging;
    }

    public static synchronized aocm c(Context context) {
        aocm aocmVar;
        synchronized (FirebaseMessaging.class) {
            if (j == null) {
                j = new aocm(context);
            }
            aocmVar = j;
        }
        return aocmVar;
    }

    static synchronized FirebaseMessaging getInstance(anwg anwgVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) anwgVar.f(FirebaseMessaging.class);
            qnm.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static final void l(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1, new qyo("TAG"));
            }
            b.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private final synchronized void m() {
        if (!this.o) {
            i(0L);
        }
    }

    final aocl b() {
        return c(this.d).a(e(), aocd.e(this.c));
    }

    public final String d() {
        aoae aoaeVar = this.k;
        if (aoaeVar != null) {
            try {
                return (String) rwd.d(aoaeVar.a());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        aocl b2 = b();
        if (!k(b2)) {
            return b2.b;
        }
        String e2 = aocd.e(this.c);
        try {
            return (String) rwd.d(this.l.a(e2, new aobv(this, e2, b2)));
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String e() {
        return "[DEFAULT]".equals(this.c.g()) ? "" : this.c.h();
    }

    public final void f(String str) {
        if ("[DEFAULT]".equals(this.c.g())) {
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            aobp.b(intent, this.d, qrj.j);
        }
    }

    public final synchronized void g(boolean z) {
        this.o = z;
    }

    public final void h() {
        aoae aoaeVar = this.k;
        if (aoaeVar != null) {
            aoaeVar.c();
        } else if (!k(b())) {
        } else {
            m();
        }
    }

    public final synchronized void i(long j2) {
        l(new aoco(this, Math.min(Math.max(30L, j2 + j2), i)), j2);
        this.o = true;
    }

    public final boolean j() {
        return this.m.b();
    }

    final boolean k(aocl aoclVar) {
        if (aoclVar != null) {
            return System.currentTimeMillis() > aoclVar.d + aocl.a || !this.g.c().equals(aoclVar.c);
        }
        return true;
    }
}
