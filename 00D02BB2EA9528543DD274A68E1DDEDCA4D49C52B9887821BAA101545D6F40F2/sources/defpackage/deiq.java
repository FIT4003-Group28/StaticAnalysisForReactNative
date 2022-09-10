package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deiq  reason: default package */
/* loaded from: classes6.dex */
public final class deiq<V> implements Runnable {
    deis<V> a;

    public deiq(deis<V> deisVar) {
        this.a = deisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dehn<V> dehnVar;
        deis<V> deisVar = this.a;
        if (deisVar == null || (dehnVar = deisVar.a) == null) {
            return;
        }
        this.a = null;
        if (dehnVar.isDone()) {
            deisVar.p(dehnVar);
            return;
        }
        try {
            ScheduledFuture<?> scheduledFuture = deisVar.b;
            deisVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                if (abs > 10) {
                    StringBuilder sb = new StringBuilder(75);
                    sb.append(str);
                    sb.append(" (timeout delayed by ");
                    sb.append(abs);
                    sb.append(" ms after scheduled time)");
                    str = sb.toString();
                }
            }
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(dehnVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            deisVar.k(new deir(sb2.toString()));
        } finally {
            dehnVar.cancel(true);
        }
    }
}
