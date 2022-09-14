package com.google.firebase.crashlytics;

import android.content.Context;
import c.e.a.b.g.h;
import c.e.a.b.g.k;
import com.google.firebase.analytics.a.a;
import com.google.firebase.crashlytics.c.e;
import com.google.firebase.crashlytics.c.f.f;
import com.google.firebase.crashlytics.c.g.c;
import com.google.firebase.crashlytics.c.h.m;
import com.google.firebase.crashlytics.c.h.t;
import com.google.firebase.crashlytics.c.h.w;
import com.google.firebase.crashlytics.c.h.y;
import com.google.firebase.crashlytics.c.q.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* renamed from: a  reason: collision with root package name */
    private final m f8573a;

    /* loaded from: classes.dex */
    class a implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f8574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecutorService f8575b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f8576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f8577d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f8578e;

        a(e eVar, ExecutorService executorService, d dVar, boolean z, m mVar) {
            this.f8574a = eVar;
            this.f8575b = executorService;
            this.f8576c = dVar;
            this.f8577d = z;
            this.f8578e = mVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            this.f8574a.a(this.f8575b, this.f8576c);
            if (this.f8577d) {
                this.f8578e.a(this.f8576c);
                return null;
            }
            return null;
        }
    }

    private FirebaseCrashlytics(m mVar) {
        this.f8573a = mVar;
    }

    private static a.InterfaceC0162a a(com.google.firebase.analytics.a.a aVar, com.google.firebase.crashlytics.a aVar2) {
        a.InterfaceC0162a a2 = aVar.a("clx", aVar2);
        if (a2 == null) {
            com.google.firebase.crashlytics.c.b.a().a("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a2 = aVar.a("crash", aVar2);
            if (a2 != null) {
                com.google.firebase.crashlytics.c.b.a().d("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.firebase.crashlytics.c.f.b, com.google.firebase.crashlytics.c.f.d] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.firebase.crashlytics.c.f.e] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.firebase.crashlytics.a] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.firebase.crashlytics.c.f.b, com.google.firebase.crashlytics.c.f.c] */
    public static FirebaseCrashlytics a(c.e.b.d dVar, com.google.firebase.iid.z0.a aVar, com.google.firebase.crashlytics.c.a aVar2, com.google.firebase.analytics.a.a aVar3) {
        f fVar;
        c cVar;
        Context b2 = dVar.b();
        y yVar = new y(b2, b2.getPackageName(), aVar);
        t tVar = new t(dVar);
        com.google.firebase.crashlytics.c.c cVar2 = aVar2 == null ? new com.google.firebase.crashlytics.c.c() : aVar2;
        e eVar = new e(dVar, b2, yVar, tVar);
        if (aVar3 != null) {
            com.google.firebase.crashlytics.c.b.a().a("Firebase Analytics is available.");
            ?? eVar2 = new com.google.firebase.crashlytics.c.f.e(aVar3);
            ?? aVar4 = new com.google.firebase.crashlytics.a();
            if (a(aVar3, aVar4) != null) {
                com.google.firebase.crashlytics.c.b.a().a("Firebase Analytics listener registered successfully.");
                ?? dVar2 = new com.google.firebase.crashlytics.c.f.d();
                ?? cVar3 = new com.google.firebase.crashlytics.c.f.c(eVar2, 500, TimeUnit.MILLISECONDS);
                aVar4.a(dVar2);
                aVar4.b(cVar3);
                fVar = cVar3;
                cVar = dVar2;
            } else {
                com.google.firebase.crashlytics.c.b.a().a("Firebase Analytics listener registration failed.");
                cVar = new c();
                fVar = eVar2;
            }
        } else {
            com.google.firebase.crashlytics.c.b.a().a("Firebase Analytics is unavailable.");
            cVar = new c();
            fVar = new f();
        }
        m mVar = new m(dVar, yVar, cVar2, tVar, cVar, fVar, w.a("Crashlytics Exception Handler"));
        if (!eVar.c()) {
            com.google.firebase.crashlytics.c.b.a().b("Unable to start Crashlytics.");
            return null;
        }
        ExecutorService a2 = w.a("com.google.firebase.crashlytics.startup");
        d a3 = eVar.a(b2, dVar, a2);
        k.a(a2, new a(eVar, a2, a3, mVar.b(a3), mVar));
        return new FirebaseCrashlytics(mVar);
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) c.e.b.d.k().a(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public h<Boolean> checkForUnsentReports() {
        return this.f8573a.a();
    }

    public void deleteUnsentReports() {
        this.f8573a.b();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f8573a.c();
    }

    public void log(String str) {
        this.f8573a.a(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            com.google.firebase.crashlytics.c.b.a().d("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.f8573a.a(th);
        }
    }

    public void sendUnsentReports() {
        this.f8573a.g();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.f8573a.a(z);
    }

    public void setCustomKey(String str, double d2) {
        this.f8573a.a(str, Double.toString(d2));
    }

    public void setCustomKey(String str, float f2) {
        this.f8573a.a(str, Float.toString(f2));
    }

    public void setCustomKey(String str, int i) {
        this.f8573a.a(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.f8573a.a(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.f8573a.a(str, str2);
    }

    public void setCustomKey(String str, boolean z) {
        this.f8573a.a(str, Boolean.toString(z));
    }

    public void setUserId(String str) {
        this.f8573a.b(str);
    }
}
