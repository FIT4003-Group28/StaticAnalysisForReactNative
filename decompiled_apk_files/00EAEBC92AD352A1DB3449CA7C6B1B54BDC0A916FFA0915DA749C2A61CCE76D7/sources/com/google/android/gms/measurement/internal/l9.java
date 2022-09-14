package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l9 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c9 f7469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l9(c9 c9Var) {
        this.f7469a = c9Var;
    }

    private final void b(long j, boolean z) {
        this.f7469a.g();
        if (!this.f7469a.f7802a.g()) {
            return;
        }
        this.f7469a.k().u.a(j);
        this.f7469a.c().B().a("Session started, time", Long.valueOf(this.f7469a.b().b()));
        Long valueOf = Long.valueOf(j / 1000);
        this.f7469a.o().a("auto", "_sid", valueOf, j);
        this.f7469a.k().r.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.f7469a.l().a(r.q0) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f7469a.o().a("auto", "_s", j, bundle);
        if (!c.e.a.b.d.g.w9.a() || !this.f7469a.l().a(r.v0)) {
            return;
        }
        String a2 = this.f7469a.k().z.a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("_ffr", a2);
        this.f7469a.o().a("auto", "_ssr", j, bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f7469a.g();
        if (this.f7469a.k().a(this.f7469a.b().a())) {
            this.f7469a.k().r.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance != 100) {
                return;
            }
            this.f7469a.c().B().a("Detected application was in foreground");
            b(this.f7469a.b().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        this.f7469a.g();
        this.f7469a.B();
        if (this.f7469a.k().a(j)) {
            this.f7469a.k().r.a(true);
        }
        this.f7469a.k().u.a(j);
        if (this.f7469a.k().r.a()) {
            b(j, z);
        }
    }
}
