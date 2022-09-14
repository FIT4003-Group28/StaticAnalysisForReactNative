package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import c.e.a.b.a.a.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m4 extends b6 {
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final s4 A;
    public final q4 B;
    public final r4 C;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f7484c;

    /* renamed from: d  reason: collision with root package name */
    public t4 f7485d;

    /* renamed from: e  reason: collision with root package name */
    public final q4 f7486e;

    /* renamed from: f  reason: collision with root package name */
    public final q4 f7487f;

    /* renamed from: g  reason: collision with root package name */
    public final q4 f7488g;

    /* renamed from: h  reason: collision with root package name */
    public final q4 f7489h;
    public final q4 i;
    public final q4 j;
    public final q4 k;
    public final s4 l;
    private String m;
    private boolean n;
    private long o;
    public final q4 p;
    public final q4 q;
    public final o4 r;
    public final s4 s;
    public final o4 t;
    public final q4 u;
    public boolean v;
    public o4 w;
    public o4 x;
    public q4 y;
    public final s4 z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m4(d5 d5Var) {
        super(d5Var);
        this.f7486e = new q4(this, "last_upload", 0L);
        this.f7487f = new q4(this, "last_upload_attempt", 0L);
        this.f7488g = new q4(this, "backoff", 0L);
        this.f7489h = new q4(this, "last_delete_stale", 0L);
        this.p = new q4(this, "time_before_start", 10000L);
        this.q = new q4(this, "session_timeout", 1800000L);
        this.r = new o4(this, "start_new_session", true);
        this.u = new q4(this, "last_pause_time", 0L);
        this.s = new s4(this, "non_personalized_ads", null);
        this.t = new o4(this, "allow_remote_dynamite", false);
        this.i = new q4(this, "midnight_offset", 0L);
        this.j = new q4(this, "first_open_time", 0L);
        this.k = new q4(this, "app_install_time", 0L);
        this.l = new s4(this, "app_instance_id", null);
        this.w = new o4(this, "app_backgrounded", false);
        this.x = new o4(this, "deep_link_retrieval_complete", false);
        this.y = new q4(this, "deep_link_retrieval_attempts", 0L);
        this.z = new s4(this, "firebase_feature_rollouts", null);
        this.A = new s4(this, "deferred_attribution_cache", null);
        this.B = new q4(this, "deferred_attribution_cache_timestamp", 0L);
        this.C = new r4(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        return this.f7484c.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> a(String str) {
        g();
        long b2 = b().b();
        String str2 = this.m;
        if (str2 == null || b2 >= this.o) {
            this.o = b2 + l().a(str, r.f7631b);
            c.e.a.b.a.a.a.a(true);
            try {
                a.C0095a a2 = c.e.a.b.a.a.a.a(d());
                if (a2 != null) {
                    this.m = a2.a();
                    this.n = a2.b();
                }
                if (this.m == null) {
                    this.m = "";
                }
            } catch (Exception e2) {
                c().A().a("Unable to get advertising id", e2);
                this.m = "";
            }
            c.e.a.b.a.a.a.a(false);
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        return new Pair<>(str2, Boolean.valueOf(this.n));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        g();
        SharedPreferences.Editor edit = s().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(long j) {
        return j - this.q.a() > this.u.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(String str) {
        g();
        String str2 = (String) a(str).first;
        MessageDigest y = z9.y();
        if (y == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, y.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        g();
        SharedPreferences.Editor edit = s().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        g();
        SharedPreferences.Editor edit = s().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        g();
        c().B().a("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = s().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        g();
        SharedPreferences.Editor edit = s().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final void m() {
        this.f7484c = d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.v = this.f7484c.getBoolean("has_been_opened", false);
        if (!this.v) {
            SharedPreferences.Editor edit = this.f7484c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f7485d = new t4(this, "health_monitor", Math.max(0L, r.f7632c.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences s() {
        g();
        n();
        return this.f7484c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String t() {
        g();
        return s().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String u() {
        g();
        return s().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean v() {
        g();
        if (!s().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(s().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        g();
        Boolean y = y();
        SharedPreferences.Editor edit = s().edit();
        edit.clear();
        edit.apply();
        if (y != null) {
            b(y.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean y() {
        g();
        if (s().contains("measurement_enabled")) {
            return Boolean.valueOf(s().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String z() {
        g();
        String string = s().getString("previous_os_version", null);
        h().n();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = s().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }
}
