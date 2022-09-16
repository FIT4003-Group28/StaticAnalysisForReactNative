package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aymi  reason: default package */
/* loaded from: classes2.dex */
public final class aymi {
    private static final aymi c = new aymi();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(aymh aymhVar) {
        return c.b(aymhVar);
    }

    public static void d(aymh aymhVar, Object obj) {
        c.e(aymhVar, obj);
    }

    final synchronized Object b(aymh aymhVar) {
        aymg aymgVar;
        aymgVar = (aymg) this.a.get(aymhVar);
        if (aymgVar == null) {
            aymgVar = new aymg(aymhVar.a());
            this.a.put(aymhVar, aymgVar);
        }
        ScheduledFuture scheduledFuture = aymgVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            aymgVar.c = null;
        }
        aymgVar.b++;
        return aymgVar.a;
    }

    final synchronized void e(aymh aymhVar, Object obj) {
        aymg aymgVar = (aymg) this.a.get(aymhVar);
        if (aymgVar == null) {
            String valueOf = String.valueOf(aymhVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No cached instance found for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean z = true;
        aqxo.q(obj == aymgVar.a, "Releasing the wrong instance");
        aqxo.z(aymgVar.b > 0, "Refcount has already reached zero");
        int i = aymgVar.b - 1;
        aymgVar.b = i;
        if (i != 0) {
            return;
        }
        if (aymgVar.c != null) {
            z = false;
        }
        aqxo.z(z, "Destroy task already scheduled");
        if (this.b == null) {
            this.b = Executors.newSingleThreadScheduledExecutor(ayhf.j("grpc-shared-destroyer-%d"));
        }
        aymgVar.c = this.b.schedule(new ayid(new aymf(this, aymgVar, aymhVar, obj)), 1L, TimeUnit.SECONDS);
    }
}
