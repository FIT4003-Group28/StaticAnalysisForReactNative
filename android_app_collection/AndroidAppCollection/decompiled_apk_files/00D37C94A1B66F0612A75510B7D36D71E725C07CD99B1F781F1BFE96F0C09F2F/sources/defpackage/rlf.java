package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rlf  reason: default package */
/* loaded from: classes4.dex */
public final class rlf extends rmk {
    static final Pair a = new Pair("", 0L);
    public SharedPreferences b;
    public rld c;
    public final rlc d;
    public final rlc e;
    public final rle f;
    public String g;
    public boolean h;
    public long i;
    public final rlc j;
    public final rla k;
    public final rle l;
    public final rla m;
    public final rlc n;
    public boolean o;
    public final rla p;
    public final rla q;
    public final rlc r;
    public final rle s;
    public final rle t;
    public final rlc u;
    public final rlb v;

    public rlf(rlx rlxVar) {
        super(rlxVar);
        this.j = new rlc(this, "session_timeout", 1800000L);
        this.k = new rla(this, "start_new_session", true);
        this.n = new rlc(this, "last_pause_time", 0L);
        this.l = new rle(this, "non_personalized_ads");
        this.m = new rla(this, "allow_remote_dynamite", false);
        this.d = new rlc(this, "first_open_time", 0L);
        this.e = new rlc(this, "app_install_time", 0L);
        this.f = new rle(this, "app_instance_id");
        this.p = new rla(this, "app_backgrounded", false);
        this.q = new rla(this, "deep_link_retrieval_complete", false);
        this.r = new rlc(this, "deep_link_retrieval_attempts", 0L);
        this.s = new rle(this, "firebase_feature_rollouts");
        this.t = new rle(this, "deferred_attribution_cache");
        this.u = new rlc(this, "deferred_attribution_cache_timestamp", 0L);
        this.v = new rlb(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences a() {
        n();
        j();
        qnm.b(this.b);
        return this.b;
    }

    @Override // defpackage.rmk
    protected final void aI() {
        SharedPreferences sharedPreferences = I().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.b = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.o = z;
        if (!z) {
            SharedPreferences.Editor edit = this.b.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        J();
        this.c = new rld(this, Math.max(0L, ((Long) rkg.c.a()).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rjq b() {
        n();
        return rjq.b(a().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean c() {
        n();
        if (a().contains("measurement_enabled")) {
            return Boolean.valueOf(a().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(Boolean bool) {
        n();
        SharedPreferences.Editor edit = a().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @Override // defpackage.rmk
    protected final boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        n();
        aG().k.b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(long j) {
        return j - this.j.a() > this.n.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(int i) {
        return rjq.i(i, a().getInt("consent_source", 100));
    }
}
