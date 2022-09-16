package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ayde  reason: default package */
/* loaded from: classes2.dex */
public final class ayde implements ayet {
    private final ScheduledExecutorService a = (ScheduledExecutorService) aymi.a(ayhf.l);
    private final Executor b;
    private final int c;
    private final aydf d;
    private final aymt e;

    public ayde(aydf aydfVar, Executor executor, int i, aymt aymtVar) {
        this.c = i;
        this.d = aydfVar;
        executor.getClass();
        this.b = executor;
        this.e = aymtVar;
    }

    @Override // defpackage.ayet
    public final ayez a(SocketAddress socketAddress, ayes ayesVar, axyf axyfVar) {
        return new aydm(this.d, (InetSocketAddress) socketAddress, ayesVar.a, ayesVar.c, ayesVar.b, this.b, this.c, this.e);
    }

    @Override // defpackage.ayet
    public final ScheduledExecutorService b() {
        return this.a;
    }

    @Override // defpackage.ayet, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aymi.d(ayhf.l, this.a);
    }
}
