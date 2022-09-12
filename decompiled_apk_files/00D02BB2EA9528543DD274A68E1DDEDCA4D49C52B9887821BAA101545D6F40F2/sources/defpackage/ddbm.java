package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: ddbm  reason: default package */
/* loaded from: classes5.dex */
final class ddbm {
    static final ScheduledExecutorService a;
    private static final ThreadFactory b;

    static {
        deip deipVar = new deip();
        deipVar.a = "RetryingFuture-Timer-%d";
        deipVar.b(true);
        ThreadFactory a2 = deip.a(deipVar);
        b = a2;
        a = Executors.newSingleThreadScheduledExecutor(a2);
    }
}
