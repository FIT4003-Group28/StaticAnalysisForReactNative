package defpackage;

import io.grpc.Status;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: aykt  reason: default package */
/* loaded from: classes2.dex */
final class aykt implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw Status.b(th).withDescription("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
    }
}
