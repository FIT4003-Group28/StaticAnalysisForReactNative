package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ayhd  reason: default package */
/* loaded from: classes2.dex */
final class ayhd implements aymh {
    @Override // defpackage.aymh
    public final /* bridge */ /* synthetic */ Object a() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, ayhf.j("grpc-timer-%d"));
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

    @Override // defpackage.aymh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
