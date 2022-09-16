package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: adod  reason: default package */
/* loaded from: classes.dex */
public final class adod implements adny {
    public final zah a;
    private final ScheduledExecutorService b;
    private ScheduledFuture c;

    public adod(zah zahVar, ScheduledExecutorService scheduledExecutorService) {
        zahVar.getClass();
        this.a = zahVar;
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
        this.c = this.b.scheduleAtFixedRate(new adoc(this, adntVar), 300000L, 300000L, TimeUnit.MILLISECONDS);
    }
}
