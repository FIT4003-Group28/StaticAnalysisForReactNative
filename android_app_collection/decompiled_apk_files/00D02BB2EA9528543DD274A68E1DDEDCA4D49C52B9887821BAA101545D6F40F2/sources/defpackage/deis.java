package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deis  reason: default package */
/* loaded from: classes6.dex */
public final class deis<V> extends dego<V> {
    public dehn<V> a;
    public ScheduledFuture<?> b;

    public deis(dehn<V> dehnVar) {
        dbsk.s(dehnVar);
        this.a = dehnVar;
    }

    @Override // defpackage.dees
    protected final void OO() {
        o(this.a);
        ScheduledFuture<?> scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        dehn<V> dehnVar = this.a;
        ScheduledFuture<?> scheduledFuture = this.b;
        if (dehnVar != null) {
            String valueOf = String.valueOf(dehnVar);
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
}
