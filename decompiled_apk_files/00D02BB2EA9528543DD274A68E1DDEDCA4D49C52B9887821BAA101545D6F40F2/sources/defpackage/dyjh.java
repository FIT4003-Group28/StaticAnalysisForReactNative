package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: dyjh  reason: default package */
/* loaded from: classes6.dex */
public final class dyjh {
    public final dyjg a;
    private final ScheduledFuture<?> b;

    public dyjh(dyjg dyjgVar, ScheduledFuture<?> scheduledFuture) {
        this.a = dyjgVar;
        dbsk.t(scheduledFuture, "future");
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }
}
