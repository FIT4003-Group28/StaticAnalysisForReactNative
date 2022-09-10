package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dyor  reason: default package */
/* loaded from: classes6.dex */
final class dyor implements dyvf<ScheduledExecutorService> {
    @Override // defpackage.dyvf
    public final /* bridge */ /* synthetic */ void a(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.shutdown();
    }

    @Override // defpackage.dyvf
    public final /* bridge */ /* synthetic */ ScheduledExecutorService b() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, dyow.k("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, true);
        } catch (NoSuchMethodException unused) {
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }
}
