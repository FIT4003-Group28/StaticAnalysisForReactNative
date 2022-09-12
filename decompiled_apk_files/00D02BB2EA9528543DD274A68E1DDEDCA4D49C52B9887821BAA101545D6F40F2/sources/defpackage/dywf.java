package defpackage;

import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dywf  reason: default package */
/* loaded from: classes6.dex */
final class dywf implements Runnable {
    final /* synthetic */ dyks a;

    public dywf(dyks dyksVar) {
        this.a = dyksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyks dyksVar = this.a;
        long j = dyksVar.a;
        long max = Math.max(j + j, j);
        if (dyksVar.b.c.compareAndSet(dyksVar.a, max)) {
            dykt.a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{dyksVar.b.b, Long.valueOf(max)});
        }
    }
}
