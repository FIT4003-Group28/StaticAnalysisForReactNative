package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: roz  reason: default package */
/* loaded from: classes4.dex */
public final class roz {
    final /* synthetic */ rpa a;

    public roz(rpa rpaVar) {
        this.a = rpaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.n();
        rlf M = this.a.M();
        this.a.Q();
        if (M.h(System.currentTimeMillis())) {
            this.a.M().k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance != 100) {
                return;
            }
            this.a.aG().k.a("Detected application was in foreground");
            this.a.Q();
            c(System.currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.a.n();
        this.a.f();
        if (this.a.M().h(j)) {
            this.a.M().k.a(true);
        }
        this.a.M().n.b(j);
        if (this.a.M().k.b()) {
            c(j, z);
        }
    }

    final void c(long j, boolean z) {
        this.a.n();
        if (!this.a.w.w()) {
            return;
        }
        this.a.M().n.b(j);
        this.a.Q();
        this.a.aG().k.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
        Long valueOf = Long.valueOf(j / 1000);
        this.a.j().T("auto", "_sid", valueOf, j);
        this.a.M().k.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.a.J().o(rkg.af) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.a.j().v("auto", "_s", j, bundle);
        axsn.b();
        if (!this.a.J().o(rkg.aj)) {
            return;
        }
        String a = this.a.M().s.a();
        if (TextUtils.isEmpty(a)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("_ffr", a);
        this.a.j().v("auto", "_ssr", j, bundle2);
    }
}
