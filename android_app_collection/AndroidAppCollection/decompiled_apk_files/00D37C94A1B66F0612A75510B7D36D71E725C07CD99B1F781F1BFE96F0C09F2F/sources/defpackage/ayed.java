package defpackage;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayed  reason: default package */
/* loaded from: classes2.dex */
public final class ayed implements ayet {
    private final ayet a;

    public ayed(ayet ayetVar, Executor executor) {
        ayetVar.getClass();
        this.a = ayetVar;
        executor.getClass();
    }

    @Override // defpackage.ayet
    public final ayez a(SocketAddress socketAddress, ayes ayesVar, axyf axyfVar) {
        return new ayec(this.a.a(socketAddress, ayesVar, axyfVar), ayesVar.a);
    }

    @Override // defpackage.ayet
    public final ScheduledExecutorService b() {
        return this.a.b();
    }

    @Override // defpackage.ayet, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
