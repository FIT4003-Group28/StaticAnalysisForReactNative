package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyld  reason: default package */
/* loaded from: classes6.dex */
public final class dyld implements dylx {
    public final Executor a;
    private final dylx b;

    public dyld(dylx dylxVar, Executor executor) {
        dbsk.t(dylxVar, "delegate");
        this.b = dylxVar;
        dbsk.t(executor, "appExecutor");
        this.a = executor;
    }

    @Override // defpackage.dylx
    public final dymc a(SocketAddress socketAddress, dylw dylwVar, dyev dyevVar) {
        return new dylc(this, this.b.a(socketAddress, dylwVar, dyevVar), dylwVar.a);
    }

    @Override // defpackage.dylx
    public final ScheduledExecutorService b() {
        return this.b.b();
    }

    @Override // defpackage.dylx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
