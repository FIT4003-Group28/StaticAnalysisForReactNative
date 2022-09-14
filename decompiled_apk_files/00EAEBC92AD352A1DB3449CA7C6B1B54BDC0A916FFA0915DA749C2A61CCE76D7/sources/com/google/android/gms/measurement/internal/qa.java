package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.e.a.b.d.g.tb;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class qa extends y5 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f7627b;

    /* renamed from: c  reason: collision with root package name */
    private b f7628c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f7629d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qa(d5 d5Var) {
        super(d5Var);
        this.f7628c = c.f7200a;
    }

    private final int a(String str, s3<Integer> s3Var, int i, int i2) {
        return Math.max(Math.min(b(str, s3Var), i2), i);
    }

    private final String a(String str, String str2) {
        b4 s;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e2) {
            e = e2;
            s = c().s();
            str3 = "Could not find SystemProperties class";
            s.a(str3, e);
            return str2;
        } catch (IllegalAccessException e3) {
            e = e3;
            s = c().s();
            str3 = "Could not access SystemProperties.get()";
            s.a(str3, e);
            return str2;
        } catch (NoSuchMethodException e4) {
            e = e4;
            s = c().s();
            str3 = "Could not find SystemProperties.get() method";
            s.a(str3, e);
            return str2;
        } catch (InvocationTargetException e5) {
            e = e5;
            s = c().s();
            str3 = "SystemProperties.get() threw an exception";
            s.a(str3, e);
            return str2;
        }
    }

    public static long v() {
        return r.D.a(null).longValue();
    }

    public static long x() {
        return r.f7633d.a(null).longValue();
    }

    private final Bundle y() {
        try {
            if (d().getPackageManager() == null) {
                c().s().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a2 = com.google.android.gms.common.n.c.a(d()).a(d().getPackageName(), 128);
            if (a2 != null) {
                return a2.metaData;
            }
            c().s().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            c().s().a("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final int a(String str) {
        return a(str, r.I, 25, 100);
    }

    public final long a(String str, s3<Long> s3Var) {
        if (str != null) {
            String a2 = this.f7628c.a(str, s3Var.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return s3Var.a(Long.valueOf(Long.parseLong(a2))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.n()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = c.e.a.b.d.g.cb.a()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.qa r1 = r5.l()
            java.lang.String r2 = r6.l()
            com.google.android.gms.measurement.internal.s3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.r.o0
            boolean r1 = r1.d(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.p()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.o()
        L33:
            com.google.android.gms.measurement.internal.s3<java.lang.String> r2 = com.google.android.gms.measurement.internal.r.f7634e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.s3<java.lang.String> r4 = com.google.android.gms.measurement.internal.r.f7635f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.m()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.n()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.a(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b bVar) {
        this.f7628c = bVar;
    }

    public final boolean a(s3<Boolean> s3Var) {
        return d(null, s3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str) {
        if (!c.e.a.b.d.g.e9.a() || !d(null, r.K0)) {
            return 500;
        }
        return a(str, r.H, 500, 2000);
    }

    public final int b(String str, s3<Integer> s3Var) {
        if (str != null) {
            String a2 = this.f7628c.a(str, s3Var.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return s3Var.a(Integer.valueOf(Integer.parseInt(a2))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).intValue();
    }

    public final double c(String str, s3<Double> s3Var) {
        if (str != null) {
            String a2 = this.f7628c.a(str, s3Var.a());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    return s3Var.a(Double.valueOf(Double.parseDouble(a2))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return s3Var.a(null).doubleValue();
    }

    public final int c(String str) {
        return b(str, r.o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(String str) {
        if (!c.e.a.b.d.g.e9.a() || !d(null, r.K0)) {
            return 25;
        }
        return a(str, r.G, 25, 100);
    }

    public final boolean d(String str, s3<Boolean> s3Var) {
        Boolean a2;
        if (str != null) {
            String a3 = this.f7628c.a(str, s3Var.a());
            if (!TextUtils.isEmpty(a3)) {
                a2 = s3Var.a(Boolean.valueOf(Boolean.parseBoolean(a3)));
                return a2.booleanValue();
            }
        }
        a2 = s3Var.a(null);
        return a2.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean e(String str) {
        com.google.android.gms.common.internal.s.b(str);
        Bundle y = y();
        if (y == null) {
            c().s().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (y.containsKey(str)) {
            return Boolean.valueOf(y.getBoolean(str));
        } else {
            return null;
        }
    }

    public final boolean e(String str, s3<Boolean> s3Var) {
        return d(str, s3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> f(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.s.b(r4)
            android.os.Bundle r0 = r3.y()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.z3 r4 = r3.c()
            com.google.android.gms.measurement.internal.b4 r4 = r4.s()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.d()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.z3 r0 = r3.c()
            com.google.android.gms.measurement.internal.b4 r0 = r0.s()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.f(java.lang.String):java.util.List");
    }

    public final boolean g(String str) {
        return "1".equals(this.f7628c.a(str, "gaia_collection_enabled"));
    }

    public final boolean h(String str) {
        return "1".equals(this.f7628c.a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(String str) {
        return d(str, r.K);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String j(String str) {
        s3<String> s3Var = r.L;
        return s3Var.a(str == null ? null : this.f7628c.a(str, s3Var.a()));
    }

    public final int m() {
        return (!c.e.a.b.d.g.e9.a() || !l().d(null, r.L0) || j().u() < 201500) ? 25 : 100;
    }

    public final long n() {
        w();
        return 29000L;
    }

    public final boolean o() {
        if (this.f7629d == null) {
            synchronized (this) {
                if (this.f7629d == null) {
                    ApplicationInfo applicationInfo = d().getApplicationInfo();
                    String a2 = com.google.android.gms.common.util.m.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f7629d = Boolean.valueOf(str != null && str.equals(a2));
                    }
                    if (this.f7629d == null) {
                        this.f7629d = Boolean.TRUE;
                        c().s().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7629d.booleanValue();
    }

    public final boolean p() {
        w();
        Boolean e2 = e("firebase_analytics_collection_deactivated");
        return e2 != null && e2.booleanValue();
    }

    public final Boolean q() {
        e();
        Boolean e2 = e("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(e2 == null || e2.booleanValue());
    }

    public final Boolean r() {
        e();
        boolean z = true;
        if (!tb.a() || !a(r.C0)) {
            return true;
        }
        Boolean e2 = e("google_analytics_automatic_screen_reporting_enabled");
        if (e2 != null && !e2.booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final String s() {
        return a("debug.firebase.analytics.app", "");
    }

    public final String t() {
        return a("debug.deferred.deeplink", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        if (this.f7627b == null) {
            this.f7627b = e("app_measurement_lite");
            if (this.f7627b == null) {
                this.f7627b = false;
            }
        }
        return this.f7627b.booleanValue() || !this.f7802a.C();
    }
}
