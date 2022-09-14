package com.google.firebase.crashlytics.c.h;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
/* loaded from: classes.dex */
public class t {

    /* renamed from: c  reason: collision with root package name */
    boolean f8767c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedPreferences f8768d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f8769e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f8770f;

    /* renamed from: g  reason: collision with root package name */
    private final c.e.b.d f8771g;

    /* renamed from: a  reason: collision with root package name */
    private Object f8765a = new Object();

    /* renamed from: b  reason: collision with root package name */
    c.e.a.b.g.i<Void> f8766b = new c.e.a.b.g.i<>();

    /* renamed from: h  reason: collision with root package name */
    private c.e.a.b.g.i<Void> f8772h = new c.e.a.b.g.i<>();

    /* JADX WARN: Removed duplicated region for block: B:35:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(c.e.b.d r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f8765a = r0
            c.e.a.b.g.i r0 = new c.e.a.b.g.i
            r0.<init>()
            r4.f8766b = r0
            r0 = 0
            r4.f8767c = r0
            c.e.a.b.g.i r1 = new c.e.a.b.g.i
            r1.<init>()
            r4.f8772h = r1
            r4.f8771g = r5
            android.content.Context r5 = r5.b()
            if (r5 == 0) goto L8c
            android.content.SharedPreferences r1 = com.google.firebase.crashlytics.c.h.h.h(r5)
            r4.f8768d = r1
            android.content.SharedPreferences r1 = r4.f8768d
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.contains(r2)
            r2 = 1
            if (r1 == 0) goto L3e
            android.content.SharedPreferences r5 = r4.f8768d
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r0, r2)
        L3c:
            r0 = 1
            goto L72
        L3e:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r1 == 0) goto L71
            java.lang.String r5 = r5.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo(r5, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r5 == 0) goto L71
            android.os.Bundle r1 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r1 == 0) goto L71
            android.os.Bundle r1 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r1 = r1.containsKey(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            if (r1 == 0) goto L71
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            java.lang.String r1 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L67
            goto L3c
        L67:
            r5 = move-exception
            com.google.firebase.crashlytics.c.b r1 = com.google.firebase.crashlytics.c.b.a()
            java.lang.String r3 = "Unable to get PackageManager. Falling through"
            r1.a(r3, r5)
        L71:
            r5 = 1
        L72:
            r4.f8770f = r5
            r4.f8769e = r0
            java.lang.Object r5 = r4.f8765a
            monitor-enter(r5)
            boolean r0 = r4.a()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L87
            c.e.a.b.g.i<java.lang.Void> r0 = r4.f8766b     // Catch: java.lang.Throwable -> L89
            r1 = 0
            r0.b(r1)     // Catch: java.lang.Throwable -> L89
            r4.f8767c = r2     // Catch: java.lang.Throwable -> L89
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L89
            throw r0
        L8c:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.c.h.t.<init>(c.e.b.d):void");
    }

    public void a(boolean z) {
        if (z) {
            this.f8772h.b((c.e.a.b.g.i<Void>) null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public boolean a() {
        return this.f8769e ? this.f8770f : this.f8771g.f();
    }

    public c.e.a.b.g.h<Void> b() {
        c.e.a.b.g.h<Void> a2;
        synchronized (this.f8765a) {
            a2 = this.f8766b.a();
        }
        return a2;
    }

    @SuppressLint({"CommitPrefEdits", "ApplySharedPref"})
    public void b(boolean z) {
        this.f8770f = z;
        this.f8769e = true;
        this.f8768d.edit().putBoolean("firebase_crashlytics_collection_enabled", z).commit();
        synchronized (this.f8765a) {
            if (z) {
                if (!this.f8767c) {
                    this.f8766b.b((c.e.a.b.g.i<Void>) null);
                    this.f8767c = true;
                }
            } else if (this.f8767c) {
                this.f8766b = new c.e.a.b.g.i<>();
                this.f8767c = false;
            }
        }
    }

    public c.e.a.b.g.h<Void> c() {
        return k0.a(this.f8772h.a(), b());
    }
}
