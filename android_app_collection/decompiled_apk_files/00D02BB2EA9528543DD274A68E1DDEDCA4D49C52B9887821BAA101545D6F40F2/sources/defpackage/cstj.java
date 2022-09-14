package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cstj  reason: default package */
/* loaded from: classes5.dex */
public final class cstj extends cstc {
    private static Reference<cstj> b = new WeakReference(null);

    public static synchronized cstj b() {
        synchronized (cstj.class) {
            cstj cstjVar = b.get();
            if (cstjVar == null) {
                cstj cstjVar2 = new cstj();
                b = new WeakReference(cstjVar2);
                return cstjVar2;
            }
            return cstjVar;
        }
    }

    @Override // defpackage.cstc
    protected final dehp a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        deip deipVar = new deip();
        deipVar.b(true);
        deipVar.a = "LIT-LimitedExecutor #%d";
        deipVar.c(csth.a);
        return dehx.c(new cstb(scheduledExecutorService, "LimitedThrExecutor", 0, 10, timeUnit, linkedBlockingDeque, deip.a(deipVar)));
    }
}
