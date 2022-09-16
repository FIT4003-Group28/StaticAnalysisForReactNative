package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aoeb  reason: default package */
/* loaded from: classes.dex */
public final class aoeb extends axzd {
    public static final amzy a = amzy.l("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder");
    public final Context b;
    public final ayjm c;
    public final Executor e;
    public final aymj g = aymj.a(ayhf.l);
    public final ayca f = ayca.a;
    public aycd d = aycc.a();

    private aoeb(aybz aybzVar, Context context) {
        this.b = context;
        ayjm ayjmVar = new ayjm(aybzVar, aybzVar.a().getPackageName(), new aodz(this));
        this.c = ayjmVar;
        ayjmVar.h = axzb.a();
        ayjmVar.i = new axys(new axyr[0]);
        ayjmVar.m = false;
        ayjmVar.l = false;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aqxo.t(true, "idle timeout is %s, but must be positive", 1L);
        if (timeUnit.toDays(1L) >= 30) {
            ayjmVar.j = -1L;
        } else {
            ayjmVar.j = Math.max(timeUnit.toMillis(1L), ayjm.b);
        }
        Executor h = ake.h(context);
        h.getClass();
        this.e = h;
    }

    public static synchronized aoeb a(Application application, aybz aybzVar) {
        aoeb aoebVar;
        synchronized (aoeb.class) {
            aoebVar = new aoeb(aybzVar, application);
        }
        return aoebVar;
    }

    @Override // defpackage.axzd
    public final ayam b() {
        return this.c;
    }
}
