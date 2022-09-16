package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: uxt  reason: default package */
/* loaded from: classes4.dex */
public final class uxt {
    private static final uxs d = uxn.a;
    public volatile uxs a = d;
    public ScheduledFuture b;
    public ScheduledFuture c;

    public uxt(uui uuiVar, ankx ankxVar) {
        uuiVar.a(new uxp(this, ankxVar));
        uuiVar.a(new uxr(this, ankxVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.b = null;
        }
        ScheduledFuture scheduledFuture2 = this.c;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.c = null;
        }
    }
}
