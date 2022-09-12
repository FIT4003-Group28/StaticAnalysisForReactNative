package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: btuq  reason: default package */
/* loaded from: classes.dex */
public final class btuq implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ btur a;

    public btuq(btur bturVar) {
        this.a = bturVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, @dzsi Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        btur bturVar = this.a;
        if (bturVar.c) {
            bturVar.c = false;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(bturVar.a.e() - bturVar.d);
            if (seconds <= 0) {
                return;
            }
            ((ckcp) bturVar.b.a(ckja.B)).a(bturVar.f);
            ((ckcp) bturVar.b.a(ckja.C)).a(bturVar.e);
            ((ckcp) bturVar.b.a(ckja.D)).a(bturVar.g);
            ((ckcp) bturVar.b.a(ckja.E)).a(bturVar.h);
            ((ckcp) bturVar.b.a(ckja.G)).a(bturVar.f / seconds);
            ((ckcp) bturVar.b.a(ckja.F)).a(bturVar.e / seconds);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        btur bturVar = this.a;
        if (!bturVar.c) {
            bturVar.c = true;
            bturVar.d = bturVar.a.e();
            bturVar.h = 0L;
            bturVar.g = 0L;
            bturVar.f = 0L;
            bturVar.e = 0L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
