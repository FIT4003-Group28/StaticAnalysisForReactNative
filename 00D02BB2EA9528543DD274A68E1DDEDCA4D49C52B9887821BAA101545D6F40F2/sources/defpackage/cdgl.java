package defpackage;

import android.app.Application;
import android.content.ComponentName;
import com.google.android.apps.gmm.ugc.phototaken.StartPhotoTakenNotifierServiceReceiver;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cdgl  reason: default package */
/* loaded from: classes4.dex */
public final class cdgl implements cdgo {
    public final Application a;
    public final ckcw b;
    public final cjnx c;
    public final bvjj d;
    public final bttf e;
    public final cqat f;
    public final dxio<apni> g;
    private final bvrb h;
    private final btvo i;

    public cdgl(Application application, bvrb bvrbVar, ckcw ckcwVar, cjnx cjnxVar, btvo btvoVar, bvjj bvjjVar, bttf bttfVar, cqat cqatVar, dxio<apni> dxioVar) {
        this.a = application;
        this.h = bvrbVar;
        this.b = ckcwVar;
        this.c = cjnxVar;
        this.i = btvoVar;
        this.d = bvjjVar;
        this.e = bttfVar;
        this.f = cqatVar;
        this.g = dxioVar;
    }

    public final dvls a() {
        return this.i.getPhotoTakenNotificationParameters();
    }

    public final long b() {
        return TimeUnit.SECONDS.toMillis(a().e);
    }

    @Override // defpackage.cdgo
    public final dehn<Boolean> c(btlu btluVar, boolean z) {
        deig d = deig.d();
        this.h.b(new cdgk(this, d, btluVar, z), bvrj.BACKGROUND_THREADPOOL);
        return d;
    }

    public final void d(boolean z) {
        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, StartPhotoTakenNotifierServiceReceiver.class), true != z ? 2 : 1, 1);
    }
}
