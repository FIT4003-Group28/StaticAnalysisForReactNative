package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dyjt  reason: default package */
/* loaded from: classes6.dex */
final class dyjt implements dylx {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final dyju c;
    private final dyvr d;
    private final boolean e;

    public dyjt(dyju dyjuVar, Executor executor, @dzsi ScheduledExecutorService scheduledExecutorService, dyvr dyvrVar) {
        boolean z = scheduledExecutorService == null;
        this.e = z;
        this.a = z ? (ScheduledExecutorService) dyvg.a(dyow.m) : scheduledExecutorService;
        this.c = dyjuVar;
        dbsk.t(executor, "executor");
        this.b = executor;
        this.d = dyvrVar;
    }

    @Override // defpackage.dylx
    public final dymc a(SocketAddress socketAddress, dylw dylwVar, dyev dyevVar) {
        return new dyke(this.c, (InetSocketAddress) socketAddress, dylwVar.a, dylwVar.c, dylwVar.b, this.b, this.d);
    }

    @Override // defpackage.dylx
    public final ScheduledExecutorService b() {
        return this.a;
    }

    @Override // defpackage.dylx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            dyvg.e(dyow.m, this.a);
        }
    }
}
