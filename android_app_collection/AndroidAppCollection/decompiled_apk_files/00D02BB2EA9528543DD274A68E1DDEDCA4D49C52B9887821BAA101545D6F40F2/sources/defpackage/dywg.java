package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: dywg  reason: default package */
/* loaded from: classes6.dex */
final class dywg implements dylx {
    private final Executor a;
    private final boolean b;
    private final boolean c;
    private final dyvq d;
    @dzsi
    private final SSLSocketFactory e;
    private final dyxh f;
    private final int g;
    private final boolean h;
    private final dykt i;
    private final long j;
    private final int k;
    private final int l;
    private final ScheduledExecutorService m;
    private boolean n;

    public dywg(Executor executor, @dzsi ScheduledExecutorService scheduledExecutorService, @dzsi SSLSocketFactory sSLSocketFactory, dyxh dyxhVar, int i, boolean z, long j, long j2, int i2, int i3, dyvq dyvqVar) {
        boolean z2 = true;
        boolean z3 = scheduledExecutorService == null;
        this.c = z3;
        this.m = z3 ? (ScheduledExecutorService) dyvg.a(dyow.m) : scheduledExecutorService;
        this.e = sSLSocketFactory;
        this.f = dyxhVar;
        this.g = 4194304;
        this.h = false;
        this.i = new dykt(Long.MAX_VALUE);
        this.j = j2;
        this.k = 65535;
        this.l = Integer.MAX_VALUE;
        z2 = executor != null ? false : z2;
        this.b = z2;
        dbsk.t(dyvqVar, "transportTracerFactory");
        this.d = dyvqVar;
        if (z2) {
            this.a = (Executor) dyvg.a(dywh.c);
        } else {
            this.a = executor;
        }
    }

    @Override // defpackage.dylx
    public final dymc a(SocketAddress socketAddress, dylw dylwVar, dyev dyevVar) {
        if (!this.n) {
            dykt dyktVar = this.i;
            return new dywr((InetSocketAddress) socketAddress, dylwVar.a, dylwVar.c, dylwVar.b, this.a, this.e, this.f, 4194304, 65535, dylwVar.d, new dywf(new dyks(dyktVar, dyktVar.c.get())), Integer.MAX_VALUE, this.d.a());
        }
        throw new IllegalStateException("The transport factory is closed.");
    }

    @Override // defpackage.dylx
    public final ScheduledExecutorService b() {
        return this.m;
    }

    @Override // defpackage.dylx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (this.c) {
            dyvg.e(dyow.m, this.m);
        }
        if (!this.b) {
            return;
        }
        dyvg.e(dywh.c, this.a);
    }
}
