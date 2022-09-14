package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.e.a.b.d.g.hb;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d5 implements a6 {
    private static volatile d5 G;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private int D;
    final long F;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7238a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7239b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7240c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7241d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f7242e;

    /* renamed from: f  reason: collision with root package name */
    private final pa f7243f;

    /* renamed from: g  reason: collision with root package name */
    private final qa f7244g;

    /* renamed from: h  reason: collision with root package name */
    private final m4 f7245h;
    private final z3 i;
    private final a5 j;
    private final c9 k;
    private final z9 l;
    private final x3 m;
    private final com.google.android.gms.common.util.e n;
    private final p7 o;
    private final j6 p;
    private final a q;
    private final k7 r;
    private v3 s;
    private y7 t;
    private j u;
    private w3 v;
    private v4 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger E = new AtomicInteger(0);

    private d5(k6 k6Var) {
        b4 v;
        String str;
        Bundle bundle;
        boolean z = false;
        com.google.android.gms.common.internal.s.a(k6Var);
        this.f7243f = new pa(k6Var.f7422a);
        p3.f7576a = this.f7243f;
        this.f7238a = k6Var.f7422a;
        this.f7239b = k6Var.f7423b;
        this.f7240c = k6Var.f7424c;
        this.f7241d = k6Var.f7425d;
        this.f7242e = k6Var.f7429h;
        this.A = k6Var.f7426e;
        c.e.a.b.d.g.f fVar = k6Var.f7428g;
        if (fVar != null && (bundle = fVar.f4142h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = fVar.f4142h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        c.e.a.b.d.g.k2.a(this.f7238a);
        this.n = com.google.android.gms.common.util.h.d();
        Long l = k6Var.i;
        this.F = l != null ? l.longValue() : this.n.a();
        this.f7244g = new qa(this);
        m4 m4Var = new m4(this);
        m4Var.o();
        this.f7245h = m4Var;
        z3 z3Var = new z3(this);
        z3Var.o();
        this.i = z3Var;
        z9 z9Var = new z9(this);
        z9Var.o();
        this.l = z9Var;
        x3 x3Var = new x3(this);
        x3Var.o();
        this.m = x3Var;
        this.q = new a(this);
        p7 p7Var = new p7(this);
        p7Var.y();
        this.o = p7Var;
        j6 j6Var = new j6(this);
        j6Var.y();
        this.p = j6Var;
        c9 c9Var = new c9(this);
        c9Var.y();
        this.k = c9Var;
        k7 k7Var = new k7(this);
        k7Var.o();
        this.r = k7Var;
        a5 a5Var = new a5(this);
        a5Var.o();
        this.j = a5Var;
        c.e.a.b.d.g.f fVar2 = k6Var.f7428g;
        if (fVar2 != null && fVar2.f4137c != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f7238a.getApplicationContext() instanceof Application) {
            j6 t = t();
            if (t.d().getApplicationContext() instanceof Application) {
                Application application = (Application) t.d().getApplicationContext();
                if (t.f7393c == null) {
                    t.f7393c = new e7(t, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(t.f7393c);
                    application.registerActivityLifecycleCallbacks(t.f7393c);
                    v = t.c().B();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.j.a(new g5(this, k6Var));
        }
        v = c().v();
        str = "Application context is not an Application";
        v.a(str);
        this.j.a(new g5(this, k6Var));
    }

    private final k7 I() {
        b(this.r);
        return this.r;
    }

    public static d5 a(Context context, c.e.a.b.d.g.f fVar, Long l) {
        Bundle bundle;
        if (fVar != null && (fVar.f4140f == null || fVar.f4141g == null)) {
            fVar = new c.e.a.b.d.g.f(fVar.f4136b, fVar.f4137c, fVar.f4138d, fVar.f4139e, null, null, fVar.f4142h);
        }
        com.google.android.gms.common.internal.s.a(context);
        com.google.android.gms.common.internal.s.a(context.getApplicationContext());
        if (G == null) {
            synchronized (d5.class) {
                if (G == null) {
                    G = new d5(new k6(context, fVar, l));
                }
            }
        } else if (fVar != null && (bundle = fVar.f4142h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            G.a(fVar.f4142h.getBoolean("dataCollectionDefaultEnabled"));
        }
        return G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(k6 k6Var) {
        b4 z;
        String concat;
        a().g();
        j jVar = new j(this);
        jVar.o();
        this.u = jVar;
        w3 w3Var = new w3(this, k6Var.f7427f);
        w3Var.y();
        this.v = w3Var;
        v3 v3Var = new v3(this);
        v3Var.y();
        this.s = v3Var;
        y7 y7Var = new y7(this);
        y7Var.y();
        this.t = y7Var;
        this.l.p();
        this.f7245h.p();
        this.w = new v4(this);
        this.v.z();
        c().z().a("App measurement initialized, version", Long.valueOf(this.f7244g.n()));
        c().z().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String B = w3Var.B();
        if (TextUtils.isEmpty(this.f7239b)) {
            if (u().d(B)) {
                z = c().z();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                z = c().z();
                String valueOf = String.valueOf(B);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
            }
            z.a(concat);
        }
        c().A().a("Debug-level message logging enabled");
        if (this.D != this.E.get()) {
            c().s().a("Not all components initialized", Integer.valueOf(this.D), Integer.valueOf(this.E.get()));
        }
        this.x = true;
    }

    private static void a(y5 y5Var) {
        if (y5Var != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    private static void b(b6 b6Var) {
        if (b6Var != null) {
            if (b6Var.r()) {
                return;
            }
            String valueOf = String.valueOf(b6Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void b(f5 f5Var) {
        if (f5Var != null) {
            if (f5Var.v()) {
                return;
            }
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    public final String A() {
        return this.f7240c;
    }

    public final String B() {
        return this.f7241d;
    }

    public final boolean C() {
        return this.f7242e;
    }

    public final p7 D() {
        b(this.o);
        return this.o;
    }

    public final y7 E() {
        b(this.t);
        return this.t;
    }

    public final j F() {
        b(this.u);
        return this.u;
    }

    public final w3 G() {
        b(this.v);
        return this.v;
    }

    public final a H() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a5 a() {
        b(this.j);
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(b6 b6Var) {
        this.D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(f5 f5Var) {
        this.D++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            c().v().a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        o().x.a(true);
        if (bArr.length == 0) {
            c().A().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                c().A().a("Deferred Deep Link is empty.");
                return;
            }
            z9 u = u();
            u.e();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = u.d().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                c().v().a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.a("auto", "_cmp", bundle);
            z9 u2 = u();
            if (TextUtils.isEmpty(optString) || !u2.a(optString, optDouble)) {
                return;
            }
            u2.d().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e2) {
            c().s().a("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final com.google.android.gms.common.util.e b() {
        return this.n;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final z3 c() {
        b(this.i);
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context d() {
        return this.f7238a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        a().g();
        if (o().f7486e.a() == 0) {
            o().f7486e.a(this.n.a());
        }
        if (Long.valueOf(o().j.a()).longValue() == 0) {
            c().B().a("Persisting first open", Long.valueOf(this.F));
            o().j.a(this.F);
        }
        if (this.f7244g.a(r.R0)) {
            t().f7398h.b();
        }
        if (l()) {
            if (!TextUtils.isEmpty(G().C()) || !TextUtils.isEmpty(G().D())) {
                u();
                if (z9.a(G().C(), o().t(), G().D(), o().u())) {
                    c().z().a("Rechecking which service to use due to a GMP App Id change");
                    o().x();
                    x().B();
                    this.t.H();
                    this.t.F();
                    o().j.a(this.F);
                    o().l.a(null);
                }
                o().c(G().C());
                o().d(G().D());
            }
            t().a(o().l.a());
            if (c.e.a.b.d.g.w9.a() && this.f7244g.a(r.v0) && !u().x() && !TextUtils.isEmpty(o().z.a())) {
                c().v().a("Remote config removed with active feature rollouts");
                o().z.a(null);
            }
            if (!TextUtils.isEmpty(G().C()) || !TextUtils.isEmpty(G().D())) {
                boolean g2 = g();
                if (!o().A() && !this.f7244g.p()) {
                    o().c(!g2);
                }
                if (g2) {
                    t().I();
                }
                q().f7222d.a();
                E().a(new AtomicReference<>());
                if (hb.a() && this.f7244g.a(r.N0)) {
                    E().a(o().C.a());
                }
            }
        } else if (g()) {
            if (!u().c("android.permission.INTERNET")) {
                c().s().a("App is missing INTERNET permission");
            }
            if (!u().c("android.permission.ACCESS_NETWORK_STATE")) {
                c().s().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!com.google.android.gms.common.n.c.a(this.f7238a).a() && !this.f7244g.u()) {
                if (!w4.a(this.f7238a)) {
                    c().s().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!z9.a(this.f7238a, false)) {
                    c().s().a("AppMeasurementService not registered/enabled");
                }
            }
            c().s().a("Uploading is not possible. App measurement disabled");
        }
        o().t.a(this.f7244g.a(r.a0));
    }

    public final boolean f() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        a().g();
        if (this.f7244g.p()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean y = o().y();
        if (y != null) {
            return y.booleanValue() ? 0 : 3;
        }
        qa qaVar = this.f7244g;
        qaVar.w();
        Boolean e2 = qaVar.e("firebase_analytics_collection_enabled");
        if (e2 != null) {
            return e2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        } else if (com.google.android.gms.common.api.internal.f.b()) {
            return 6;
        } else {
            return (!this.f7244g.a(r.T) || this.A == null || this.A.booleanValue()) ? 0 : 7;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        this.E.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean l() {
        if (this.x) {
            a().g();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z = true;
                this.y = Boolean.valueOf(u().c("android.permission.INTERNET") && u().c("android.permission.ACCESS_NETWORK_STATE") && (com.google.android.gms.common.n.c.a(this.f7238a).a() || this.f7244g.u() || (w4.a(this.f7238a) && z9.a(this.f7238a, false))));
                if (this.y.booleanValue()) {
                    if (!u().a(G().C(), G().D(), G().E()) && TextUtils.isEmpty(G().D())) {
                        z = false;
                    }
                    this.y = Boolean.valueOf(z);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final void m() {
        a().g();
        b(I());
        String B = G().B();
        Pair<String, Boolean> a2 = o().a(B);
        if (!this.f7244g.q().booleanValue() || ((Boolean) a2.second).booleanValue() || TextUtils.isEmpty((CharSequence) a2.first)) {
            c().A().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!I().s()) {
            c().v().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            URL a3 = u().a(G().l().n(), B, (String) a2.first, o().y.a() - 1);
            k7 I = I();
            j7 j7Var = new j7(this) { // from class: com.google.android.gms.measurement.internal.h5

                /* renamed from: a  reason: collision with root package name */
                private final d5 f7344a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f7344a = this;
                }

                @Override // com.google.android.gms.measurement.internal.j7
                public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
                    this.f7344a.a(str, i, th, bArr, map);
                }
            };
            I.g();
            I.n();
            com.google.android.gms.common.internal.s.a(a3);
            com.google.android.gms.common.internal.s.a(j7Var);
            I.a().b(new m7(I, B, a3, null, null, j7Var));
        }
    }

    public final qa n() {
        return this.f7244g;
    }

    public final m4 o() {
        a((y5) this.f7245h);
        return this.f7245h;
    }

    public final z3 p() {
        z3 z3Var = this.i;
        if (z3Var == null || !z3Var.r()) {
            return null;
        }
        return this.i;
    }

    public final c9 q() {
        b(this.k);
        return this.k;
    }

    public final v4 r() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a5 s() {
        return this.j;
    }

    public final j6 t() {
        b(this.p);
        return this.p;
    }

    public final z9 u() {
        a((y5) this.l);
        return this.l;
    }

    public final x3 v() {
        a((y5) this.m);
        return this.m;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa w() {
        return this.f7243f;
    }

    public final v3 x() {
        b(this.s);
        return this.s;
    }

    public final boolean y() {
        return TextUtils.isEmpty(this.f7239b);
    }

    public final String z() {
        return this.f7239b;
    }
}
