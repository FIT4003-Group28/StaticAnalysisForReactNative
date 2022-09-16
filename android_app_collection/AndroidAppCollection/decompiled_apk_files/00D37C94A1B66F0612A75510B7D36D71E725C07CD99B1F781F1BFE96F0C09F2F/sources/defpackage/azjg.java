package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: azjg  reason: default package */
/* loaded from: classes2.dex */
final class azjg implements Runnable {
    final long a;
    final azjf b;

    public azjg(long j, azjf azjfVar) {
        this.a = j;
        this.b = azjfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        azjf azjfVar = this.b;
        if (azjfVar.compareAndSet(this.a, Long.MAX_VALUE)) {
            ayqi.c(azjfVar.f);
            azjfVar.a.b(new TimeoutException(azom.c(azjfVar.b, azjfVar.c)));
            azjfVar.d.qr();
        }
    }
}
