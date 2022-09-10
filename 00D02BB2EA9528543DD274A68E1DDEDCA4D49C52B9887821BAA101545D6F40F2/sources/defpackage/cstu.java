package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cstu  reason: default package */
/* loaded from: classes5.dex */
public final class cstu extends cstc {
    private static Reference<cstu> b = new WeakReference(null);

    public static synchronized cstu b() {
        synchronized (cstu.class) {
            cstu cstuVar = b.get();
            if (cstuVar == null) {
                cstu cstuVar2 = new cstu();
                b = new WeakReference(cstuVar2);
                return cstuVar2;
            }
            return cstuVar;
        }
    }

    @Override // defpackage.cstc
    protected final dehp a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        deip deipVar = new deip();
        deipVar.b(true);
        deipVar.a = "LIT-UnlimitedExecutor #%d";
        deipVar.c(csts.a);
        cstb cstbVar = new cstb(scheduledExecutorService, "UnlimitedThrExecutor", 50, 50, timeUnit, linkedBlockingDeque, deip.a(deipVar));
        cstbVar.allowCoreThreadTimeOut(true);
        return dehx.c(cstbVar);
    }
}
