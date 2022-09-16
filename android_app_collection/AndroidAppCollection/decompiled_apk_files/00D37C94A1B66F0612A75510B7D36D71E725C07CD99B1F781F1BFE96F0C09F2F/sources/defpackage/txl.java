package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: txl  reason: default package */
/* loaded from: classes4.dex */
public final class txl {
    public final Executor a;

    public txl(Executor executor) {
        this.a = executor;
    }

    public txl(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }
}
