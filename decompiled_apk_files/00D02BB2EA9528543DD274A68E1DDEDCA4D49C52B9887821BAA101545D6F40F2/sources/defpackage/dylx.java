package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dylx  reason: default package */
/* loaded from: classes6.dex */
public interface dylx extends Closeable {
    dymc a(SocketAddress socketAddress, dylw dylwVar, dyev dyevVar);

    ScheduledExecutorService b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
