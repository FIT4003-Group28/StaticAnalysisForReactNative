package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ykw  reason: default package */
/* loaded from: classes4.dex */
public final class ykw {
    public final ScheduledExecutorService a;
    private final Executor b;

    public ykw(ywk ywkVar, ScheduledExecutorService scheduledExecutorService, Executor executor, azqb azqbVar, azqb azqbVar2) {
        if ((ywkVar.c(ywk.U) & 1) != 0) {
            this.a = (ScheduledExecutorService) azqbVar.get();
            this.b = anlz.g((Executor) azqbVar2.get());
            return;
        }
        this.a = scheduledExecutorService;
        this.b = anlz.g(executor);
    }

    public final void a(int i, Runnable runnable) {
        if (i - 1 != 0) {
            this.b.execute(runnable);
        } else {
            this.a.execute(runnable);
        }
    }
}
