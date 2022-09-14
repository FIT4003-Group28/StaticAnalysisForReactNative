package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class j6 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    protected e7 f7393c;

    /* renamed from: d  reason: collision with root package name */
    private i6 f7394d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<h6> f7395e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7396f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<String> f7397g;

    /* renamed from: h  reason: collision with root package name */
    final ha f7398h;
    protected boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    public j6(d5 d5Var) {
        super(d5Var);
        this.f7395e = new CopyOnWriteArraySet();
        this.i = true;
        this.f7397g = new AtomicReference<>();
        this.f7398h = new ha(d5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        g();
        String a2 = k().s.a();
        if (a2 != null) {
            if ("unset".equals(a2)) {
                a("app", "_npa", (Object) null, b().a());
            } else {
                a("app", "_npa", Long.valueOf("true".equals(a2) ? 1L : 0L), b().a());
            }
        }
        if (!this.f7802a.g() || !this.i) {
            c().A().a("Updating Scion state (FE)");
            q().C();
            return;
        }
        c().A().a("Recording app launch after enabling measurement for the first time (FE)");
        I();
        if (c.e.a.b.d.g.qa.a() && l().a(r.w0)) {
            t().f7222d.a();
        }
        if (c.e.a.b.d.g.da.a() && l().a(r.B0)) {
            if (!(this.f7802a.r().f7736a.o().k.a() > 0)) {
                v4 r = this.f7802a.r();
                r.f7736a.i();
                r.a(r.f7736a.d().getPackageName());
            }
        }
        if (!l().a(r.R0)) {
            return;
        }
        a().a(new c7(this));
    }

    private final void a(String str, String str2, long j, Object obj) {
        a().a(new p6(this, str, str2, obj, j));
    }

    private final ArrayList<Bundle> b(String str, String str2, String str3) {
        if (a().s()) {
            c().s().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (pa.a()) {
            c().s().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f7802a.a().a(atomicReference, 5000L, "get conditional user properties", new x6(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return z9.b((List<oa>) list);
            }
            c().s().a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    private final Map<String, Object> b(String str, String str2, String str3, boolean z) {
        b4 s;
        String str4;
        if (a().s()) {
            s = c().s();
            str4 = "Cannot get user properties from analytics worker thread";
        } else if (!pa.a()) {
            AtomicReference atomicReference = new AtomicReference();
            this.f7802a.a().a(atomicReference, 5000L, "get user properties", new w6(this, atomicReference, str, str2, str3, z));
            List<y9> list = (List) atomicReference.get();
            if (list == null) {
                c().s().a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            a.e.a aVar = new a.e.a(list.size());
            for (y9 y9Var : list) {
                aVar.put(y9Var.f7816c, y9Var.f());
            }
            return aVar;
        } else {
            s = c().s();
            str4 = "Cannot get user properties from main thread";
        }
        s.a(str4);
        return Collections.emptyMap();
    }

    private final void b(Bundle bundle, long j) {
        com.google.android.gms.common.internal.s.a(bundle);
        d6.a(bundle, "app_id", String.class, null);
        d6.a(bundle, "origin", String.class, null);
        d6.a(bundle, "name", String.class, null);
        d6.a(bundle, "value", Object.class, null);
        d6.a(bundle, "trigger_event_name", String.class, null);
        d6.a(bundle, "trigger_timeout", Long.class, 0L);
        d6.a(bundle, "timed_out_event_name", String.class, null);
        d6.a(bundle, "timed_out_event_params", Bundle.class, null);
        d6.a(bundle, "triggered_event_name", String.class, null);
        d6.a(bundle, "triggered_event_params", Bundle.class, null);
        d6.a(bundle, "time_to_live", Long.class, 0L);
        d6.a(bundle, "expired_event_name", String.class, null);
        d6.a(bundle, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.s.b(bundle.getString("name"));
        com.google.android.gms.common.internal.s.b(bundle.getString("origin"));
        com.google.android.gms.common.internal.s.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (j().b(string) != 0) {
            c().s().a("Invalid conditional user property name", i().c(string));
        } else if (j().b(string, obj) != 0) {
            c().s().a("Invalid conditional user property value", i().c(string), obj);
        } else {
            Object c2 = j().c(string, obj);
            if (c2 == null) {
                c().s().a("Unable to normalize conditional user property value", i().c(string), obj);
                return;
            }
            d6.a(bundle, c2);
            long j2 = bundle.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                c().s().a("Invalid conditional user property timeout", i().c(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle.getLong("time_to_live");
            if (j3 > 15552000000L || j3 < 1) {
                c().s().a("Invalid conditional user property time to live", i().c(string), Long.valueOf(j3));
            } else {
                a().a(new s6(this, bundle));
            }
        }
    }

    private final void b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        a().a(new q6(this, str, str2, j, z9.b(bundle), z, z2, z3, str3));
    }

    private final void b(String str, String str2, String str3, Bundle bundle) {
        long a2 = b().a();
        com.google.android.gms.common.internal.s.b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a2);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        a().a(new v6(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean z) {
        g();
        e();
        x();
        c().A().a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        k().b(z);
        M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Bundle bundle) {
        g();
        x();
        com.google.android.gms.common.internal.s.a(bundle);
        com.google.android.gms.common.internal.s.b(bundle.getString("name"));
        com.google.android.gms.common.internal.s.b(bundle.getString("origin"));
        com.google.android.gms.common.internal.s.a(bundle.get("value"));
        if (!this.f7802a.g()) {
            c().B().a("Conditional property not set since app measurement is disabled");
            return;
        }
        y9 y9Var = new y9(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin"));
        try {
            p a2 = j().a(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0L, true, false);
            q().a(new oa(bundle.getString("app_id"), bundle.getString("origin"), y9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), j().a(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0L, true, false), bundle.getLong("trigger_timeout"), a2, bundle.getLong("time_to_live"), j().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0L, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Bundle bundle) {
        g();
        x();
        com.google.android.gms.common.internal.s.a(bundle);
        com.google.android.gms.common.internal.s.b(bundle.getString("name"));
        if (!this.f7802a.g()) {
            c().B().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            q().a(new oa(bundle.getString("app_id"), bundle.getString("origin"), new y9(bundle.getString("name"), 0L, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean(AppStateModule.APP_STATE_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), j().a(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return false;
    }

    public final void B() {
        if (d().getApplicationContext() instanceof Application) {
            ((Application) d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f7393c);
        }
    }

    public final Boolean C() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) a().a(atomicReference, 15000L, "boolean test flag value", new o6(this, atomicReference));
    }

    public final String D() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) a().a(atomicReference, 15000L, "String test flag value", new u6(this, atomicReference));
    }

    public final Long E() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) a().a(atomicReference, 15000L, "long test flag value", new z6(this, atomicReference));
    }

    public final Integer F() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) a().a(atomicReference, 15000L, "int test flag value", new y6(this, atomicReference));
    }

    public final Double G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) a().a(atomicReference, 15000L, "double test flag value", new b7(this, atomicReference));
    }

    public final String H() {
        e();
        return this.f7397g.get();
    }

    public final void I() {
        g();
        e();
        x();
        if (!this.f7802a.l()) {
            return;
        }
        if (l().a(r.h0)) {
            qa l = l();
            l.w();
            Boolean e2 = l.e("google_analytics_deferred_deep_link_enabled");
            if (e2 != null && e2.booleanValue()) {
                c().A().a("Deferred Deep Link feature enabled.");
                a().a(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.l6

                    /* renamed from: b  reason: collision with root package name */
                    private final j6 f7457b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.f7457b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        j6 j6Var = this.f7457b;
                        j6Var.g();
                        if (j6Var.k().x.a()) {
                            j6Var.c().A().a("Deferred Deep Link already retrieved. Not fetching again.");
                            return;
                        }
                        long a2 = j6Var.k().y.a();
                        j6Var.k().y.a(1 + a2);
                        if (a2 < 5) {
                            j6Var.f7802a.m();
                            return;
                        }
                        j6Var.c().v().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        j6Var.k().x.a(true);
                    }
                });
            }
        }
        q().E();
        this.i = false;
        String z = k().z();
        if (TextUtils.isEmpty(z)) {
            return;
        }
        h().n();
        if (z.equals(Build.VERSION.RELEASE)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_po", z);
        a("auto", "_ou", bundle);
    }

    public final String J() {
        q7 B = this.f7802a.D().B();
        if (B != null) {
            return B.f7614a;
        }
        return null;
    }

    public final String K() {
        q7 B = this.f7802a.D().B();
        if (B != null) {
            return B.f7615b;
        }
        return null;
    }

    public final String L() {
        if (this.f7802a.z() != null) {
            return this.f7802a.z();
        }
        try {
            return new com.google.android.gms.common.internal.w(d()).a("google_app_id");
        } catch (IllegalStateException e2) {
            this.f7802a.c().s().a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final ArrayList<Bundle> a(String str, String str2) {
        e();
        return b((String) null, str, str2);
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        com.google.android.gms.common.internal.s.b(str);
        m();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        com.google.android.gms.common.internal.s.b(str);
        m();
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        e();
        return b((String) null, str, str2, z);
    }

    public final void a(Bundle bundle) {
        a(bundle, b().a());
    }

    public final void a(Bundle bundle, long j) {
        com.google.android.gms.common.internal.s.a(bundle);
        e();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            c().v().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j);
    }

    public final void a(h6 h6Var) {
        e();
        x();
        com.google.android.gms.common.internal.s.a(h6Var);
        if (!this.f7395e.add(h6Var)) {
            c().v().a("OnEventListener already registered");
        }
    }

    public final void a(i6 i6Var) {
        i6 i6Var2;
        g();
        e();
        x();
        if (i6Var != null && i6Var != (i6Var2 = this.f7394d)) {
            com.google.android.gms.common.internal.s.b(i6Var2 == null, "EventInterceptor already set.");
        }
        this.f7394d = i6Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        this.f7397g.set(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Bundle bundle) {
        e();
        g();
        a(str, str2, j, bundle, true, this.f7394d == null || z9.f(str2), false, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j6.a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, b().a());
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        e();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (l().a(r.D0) && z9.c(str2, "screen_view")) {
            r().a(bundle2);
            return;
        }
        b(str3, str2, j, bundle2, z2, !z2 || this.f7394d == null || z9.f(str2), !z, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.s.b(r9)
            com.google.android.gms.common.internal.s.b(r10)
            r8.g()
            r8.e()
            r8.x()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L63
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L38
            r4 = r2
            goto L3a
        L38:
            r4 = 0
        L3a:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.m4 r0 = r8.k()
            com.google.android.gms.measurement.internal.s4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r11 = "true"
        L4e:
            r0.a(r11)
            r6 = r10
            goto L61
        L53:
            if (r11 != 0) goto L63
            com.google.android.gms.measurement.internal.m4 r10 = r8.k()
            com.google.android.gms.measurement.internal.s4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
        L61:
            r3 = r1
            goto L65
        L63:
            r3 = r10
            r6 = r11
        L65:
            com.google.android.gms.measurement.internal.d5 r10 = r8.f7802a
            boolean r10 = r10.g()
            if (r10 != 0) goto L7b
            com.google.android.gms.measurement.internal.z3 r9 = r8.c()
            com.google.android.gms.measurement.internal.b4 r9 = r9.B()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            com.google.android.gms.measurement.internal.d5 r10 = r8.f7802a
            boolean r10 = r10.l()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.y9 r10 = new com.google.android.gms.measurement.internal.y9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.y7 r9 = r8.q()
            r9.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.j6.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        a(str, str2, obj, true, b().a());
    }

    public final void a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = j().b(str2);
        } else {
            z9 j2 = j();
            if (j2.a("user property", str2)) {
                if (!j2.a("user property", e6.f7272a, str2)) {
                    i = 15;
                } else if (j2.a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            j();
            String a2 = z9.a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f7802a.u().a(i, "_ev", a2, i2);
        } else if (obj == null) {
            a(str3, str2, j, (Object) null);
        } else {
            int b2 = j().b(str2, obj);
            if (b2 == 0) {
                Object c2 = j().c(str2, obj);
                if (c2 == null) {
                    return;
                }
                a(str3, str2, j, c2);
                return;
            }
            j();
            String a3 = z9.a(str2, 24, true);
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                i2 = String.valueOf(obj).length();
            }
            this.f7802a.u().a(b2, "_ev", a3, i2);
        }
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.s.b(str);
        m();
        throw null;
    }

    public final void a(boolean z) {
        x();
        e();
        a().a(new a7(this, z));
    }

    public final void b(Bundle bundle) {
        com.google.android.gms.common.internal.s.a(bundle);
        com.google.android.gms.common.internal.s.b(bundle.getString("app_id"));
        m();
        throw null;
    }

    public final void b(h6 h6Var) {
        e();
        x();
        com.google.android.gms.common.internal.s.a(h6Var);
        if (!this.f7395e.remove(h6Var)) {
            c().v().a("OnEventListener had not been registered");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, String str2, Bundle bundle) {
        e();
        g();
        a(str, str2, b().a(), bundle);
    }

    public final void c(String str, String str2, Bundle bundle) {
        e();
        b((String) null, str, str2, bundle);
    }
}
