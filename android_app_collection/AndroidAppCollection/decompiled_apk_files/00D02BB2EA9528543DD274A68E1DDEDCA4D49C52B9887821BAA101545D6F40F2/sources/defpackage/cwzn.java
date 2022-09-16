package defpackage;

import java.util.concurrent.ScheduledFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwzn  reason: default package */
/* loaded from: classes5.dex */
public final class cwzn {
    public static final cwzm a = cwzh.a;
    public volatile cwzm b = a;
    public ScheduledFuture<?> c;
    public ScheduledFuture<?> d;

    public cwzn(cwrb cwrbVar, dehq dehqVar) {
        cwrbVar.a(new cwzj(this, dehqVar));
        cwrbVar.a(new cwzl(this, dehqVar));
    }

    public final void a() {
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.c = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.d = null;
        }
    }
}
