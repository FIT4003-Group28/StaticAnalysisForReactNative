package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyvg  reason: default package */
/* loaded from: classes6.dex */
public final class dyvg {
    private static final dyvg c = new dyvg();
    public final IdentityHashMap<dyvf<?>, dyve> a = new IdentityHashMap<>();
    public ScheduledExecutorService b;

    public static <T> T a(dyvf<T> dyvfVar) {
        return (T) c.b(dyvfVar);
    }

    public static <T> void e(dyvf<T> dyvfVar, T t) {
        c.d(dyvfVar, t);
    }

    final synchronized <T> T b(dyvf<T> dyvfVar) {
        dyve dyveVar;
        dyveVar = this.a.get(dyvfVar);
        if (dyveVar == null) {
            dyveVar = new dyve(dyvfVar.b());
            this.a.put(dyvfVar, dyveVar);
        }
        ScheduledFuture<?> scheduledFuture = dyveVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            dyveVar.c = null;
        }
        dyveVar.b++;
        return (T) dyveVar.a;
    }

    final synchronized <T> void d(dyvf<T> dyvfVar, T t) {
        dyve dyveVar = this.a.get(dyvfVar);
        if (dyveVar == null) {
            String valueOf = String.valueOf(dyvfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No cached instance found for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean z = true;
        dbsk.b(t == dyveVar.a, "Releasing the wrong instance");
        dbsk.m(dyveVar.b > 0, "Refcount has already reached zero");
        int i = dyveVar.b - 1;
        dyveVar.b = i;
        if (i != 0) {
            return;
        }
        if (dyveVar.c != null) {
            z = false;
        }
        dbsk.m(z, "Destroy task already scheduled");
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor(dyow.k("grpc-shared-destroyer-%d"));
        }
        dyveVar.c = this.b.schedule(new dyqh(new dyvd(this, dyveVar, dyvfVar, t)), 1L, TimeUnit.SECONDS);
    }
}
