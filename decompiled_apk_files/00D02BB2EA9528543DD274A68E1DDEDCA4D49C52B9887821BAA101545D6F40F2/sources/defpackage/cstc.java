package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: PG */
/* renamed from: cstc  reason: default package */
/* loaded from: classes5.dex */
public abstract class cstc {
    public final dehp a;

    public cstc() {
        deip deipVar = new deip();
        deipVar.b(true);
        deipVar.a = "LIT-TimeoutScheduler";
        this.a = a(new ScheduledThreadPoolExecutor(1, deip.a(deipVar)));
    }

    protected abstract dehp a(ScheduledExecutorService scheduledExecutorService);
}
