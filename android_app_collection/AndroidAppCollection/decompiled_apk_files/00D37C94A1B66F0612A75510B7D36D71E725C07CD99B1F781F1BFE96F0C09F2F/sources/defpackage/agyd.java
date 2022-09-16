package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agyd  reason: default package */
/* loaded from: classes.dex */
final class agyd extends Thread {
    final /* synthetic */ agye a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyd(agye agyeVar, Runnable runnable) {
        super(runnable, "offlineTransfer");
        this.a = agyeVar;
    }

    private final void a() {
        try {
            this.a.a.release();
        } catch (RuntimeException unused) {
            zep.l("Wakelock already released.");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        zep.g("Acquiring transfer wakelock");
        long millis = TimeUnit.HOURS.toMillis(this.a.b.a());
        long currentTimeMillis = System.currentTimeMillis();
        if (millis > 0) {
            this.a.a.acquire(millis);
        } else {
            this.a.a.acquire();
        }
        try {
            super.run();
        } finally {
            a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (millis > 0) {
                currentTimeMillis2 = Math.min(currentTimeMillis2, millis);
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Transfer wakelock held for ");
            sb.append(currentTimeMillis2);
            sb.append(" ms");
            zep.l(sb.toString());
        }
    }
}
