package defpackage;

import java.util.concurrent.ScheduledFuture;
/* compiled from: PG */
/* renamed from: aybw  reason: default package */
/* loaded from: classes2.dex */
public final class aybw {
    public final aybv a;
    private final ScheduledFuture b;

    public aybw(aybv aybvVar, ScheduledFuture scheduledFuture) {
        this.a = aybvVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }
}
