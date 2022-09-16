package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dehx  reason: default package */
/* loaded from: classes.dex */
public final class dehx {
    public static dehp a() {
        return new dehs();
    }

    public static Executor b(Executor executor) {
        return new deif(executor);
    }

    public static dehp c(ExecutorService executorService) {
        dehp dehtVar;
        if (executorService instanceof dehp) {
            return (dehp) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            dehtVar = new dehw((ScheduledExecutorService) executorService);
        } else {
            dehtVar = new deht(executorService);
        }
        return dehtVar;
    }

    public static dehq d(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof dehq) {
            return (dehq) scheduledExecutorService;
        }
        return new dehw(scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor e(Executor executor, dees<?> deesVar) {
        dbsk.s(executor);
        return executor == dege.a ? executor : new dehr(executor, deesVar);
    }
}
