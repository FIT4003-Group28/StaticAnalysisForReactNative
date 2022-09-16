package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: anln  reason: default package */
/* loaded from: classes.dex */
public final class anln extends anjv {
    public ankt a;
    public ScheduledFuture b;

    public anln(ankt anktVar) {
        anktVar.getClass();
        this.a = anktVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anie
    public final String c() {
        ankt anktVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (anktVar != null) {
            String valueOf = String.valueOf(anktVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture == null) {
                return sb2;
            }
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay <= 0) {
                return sb2;
            }
            String valueOf2 = String.valueOf(sb2);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
            sb3.append(valueOf2);
            sb3.append(", remaining delay=[");
            sb3.append(delay);
            sb3.append(" ms]");
            return sb3.toString();
        }
        return null;
    }

    @Override // defpackage.anie
    protected final void qu() {
        n(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
