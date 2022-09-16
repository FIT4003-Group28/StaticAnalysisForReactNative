package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: agxa */
/* loaded from: classes.dex */
public final class agxa {
    public final ScheduledExecutorService a;
    public final aagi b;
    public final azqb c;
    public final azqb d;
    public final azqb e;
    public agvj f;
    public ankt g;
    public ankt h;
    private ankt i;

    public agxa(ScheduledExecutorService scheduledExecutorService, aagi aagiVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.a = scheduledExecutorService;
        this.b = aagiVar;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
    }

    public static final void d(Throwable th) {
        cff cffVar;
        if (th instanceof cff) {
            cffVar = (cff) th;
        } else {
            cffVar = new cff(th);
        }
        String valueOf = String.valueOf(cffVar.getMessage());
        zep.b(valueOf.length() != 0 ? "[Offline] OfflineVideoPlaybackPositionSyncService request failed: ".concat(valueOf) : new String("[Offline] OfflineVideoPlaybackPositionSyncService request failed: "));
    }

    public final void a() {
        ankt anktVar = this.i;
        if (anktVar == null || anktVar.isCancelled() || this.i.isDone()) {
            ankt i = anii.i(anko.q(anlz.q(((agrf) this.e.get()).a())), urc.l, this.a);
            this.i = i;
            ylx.k(i, anjk.a, afsc.m, new agwx(this, 2));
        }
    }
}
