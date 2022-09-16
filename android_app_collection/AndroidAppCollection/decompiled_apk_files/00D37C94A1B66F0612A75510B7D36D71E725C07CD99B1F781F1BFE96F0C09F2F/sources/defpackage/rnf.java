package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnf  reason: default package */
/* loaded from: classes4.dex */
public final class rnf implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ rng a;

    public rnf(rng rngVar) {
        this.a = rngVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        rng rngVar;
        try {
            try {
                this.a.aG().k.a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    rngVar = this.a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.a.N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.a.aH().g(new rne(this, z, data, str, queryParameter));
                        rngVar = this.a;
                    }
                    rngVar = this.a;
                }
            } catch (RuntimeException e) {
                this.a.aG().c.b("Throwable caught in onActivityCreated", e);
                rngVar = this.a;
            }
            rngVar.k().r(activity, bundle);
        } catch (Throwable th) {
            this.a.k().r(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        rns k = this.a.k();
        synchronized (k.k) {
            if (activity == k.f) {
                k.f = null;
            }
        }
        if (!k.J().r()) {
            return;
        }
        k.e.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        rns k = this.a.k();
        synchronized (k.k) {
            k.j = false;
            k.g = true;
        }
        k.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!k.J().r()) {
            k.b = null;
            k.aH().g(new rnp(k, elapsedRealtime));
        } else {
            rnm e = k.e(activity);
            k.c = k.b;
            k.b = null;
            k.aH().g(new rnq(k, e, elapsedRealtime));
        }
        rpa m = this.a.m();
        m.Q();
        m.aH().g(new rot(m, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        rpa m = this.a.m();
        m.Q();
        m.aH().g(new rot(m, SystemClock.elapsedRealtime(), 1));
        rns k = this.a.k();
        synchronized (k.k) {
            k.j = true;
            if (activity != k.f) {
                synchronized (k.k) {
                    k.f = activity;
                    k.g = false;
                }
                if (k.J().r()) {
                    k.h = null;
                    k.aH().g(new rnr(k));
                }
            }
        }
        if (!k.J().r()) {
            k.b = k.h;
            k.aH().g(new rnr(k, 1));
            return;
        }
        k.p(activity, k.e(activity), false);
        riu g = k.g();
        g.Q();
        g.aH().g(new rit(g, SystemClock.elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        rnm rnmVar;
        rns k = this.a.k();
        if (!k.J().r() || bundle == null || (rnmVar = (rnm) k.e.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", rnmVar.c);
        bundle2.putString("name", rnmVar.a);
        bundle2.putString("referrer_name", rnmVar.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
