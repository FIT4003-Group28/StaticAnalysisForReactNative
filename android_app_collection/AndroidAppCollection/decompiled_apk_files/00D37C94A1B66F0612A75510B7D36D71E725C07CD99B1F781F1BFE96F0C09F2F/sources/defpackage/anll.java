package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anll  reason: default package */
/* loaded from: classes.dex */
public final class anll implements Runnable {
    anln a;

    public anll(anln anlnVar) {
        this.a = anlnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ankt anktVar;
        anln anlnVar = this.a;
        if (anlnVar == null || (anktVar = anlnVar.a) == null) {
            return;
        }
        this.a = null;
        if (anktVar.isDone()) {
            anlnVar.lV(anktVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = anlnVar.b;
            anlnVar.b = null;
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
            String valueOf2 = String.valueOf(anktVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            anlnVar.e(new anlm(sb2.toString()));
        } finally {
            anktVar.cancel(true);
        }
    }
}
