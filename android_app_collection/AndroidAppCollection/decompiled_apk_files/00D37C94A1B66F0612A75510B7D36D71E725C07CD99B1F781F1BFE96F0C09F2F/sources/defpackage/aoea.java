package defpackage;

import android.content.Context;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: aoea  reason: default package */
/* loaded from: classes.dex */
final class aoea implements ayet {
    private final Context a;
    private final aycd b;
    private final Executor c;
    private ScheduledExecutorService d;
    private Executor e;
    private boolean f;
    private final aymj g;
    private final aymj h;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    public aoea(Context context, Executor executor, aymj aymjVar, aymj aymjVar2, aycd aycdVar) {
        this.a = context;
        this.g = aymjVar;
        this.h = aymjVar2;
        this.b = aycdVar;
        this.d = (ScheduledExecutorService) aymjVar.b();
        this.e = aymjVar2.b();
        this.c = executor;
    }

    @Override // defpackage.ayet
    public final ScheduledExecutorService b() {
        return this.d;
    }

    @Override // defpackage.ayet, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f = true;
        this.g.c(this.d);
        this.d = null;
        this.h.c(this.e);
        this.e = null;
    }

    @Override // defpackage.ayet
    public final ayez a(SocketAddress socketAddress, ayes ayesVar, axyf axyfVar) {
        if (this.f) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        if (socketAddress instanceof aody) {
            ((amzw) ((amzw) aoeb.a.e()).i("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder$TransportFactory", "newClientTransport", 326, "OnDeviceChannelBuilder.java")).s("Creating in-process transport to %s", socketAddress);
            aody aodyVar = (aody) socketAddress;
            throw null;
        } else if (socketAddress instanceof aybz) {
            ((amzw) ((amzw) aoeb.a.e()).i("com/google/frameworks/client/data/android/binder/OnDeviceChannelBuilder$TransportFactory", "newClientTransport", 329, "OnDeviceChannelBuilder.java")).s("Creating cross-process transport to %s", socketAddress);
            return new ayck(this.a, (aybz) socketAddress, this.c, this.g, this.h, this.b, ayesVar.b);
        } else {
            throw Status.g.withDescription("Unrecognized address").d();
        }
    }
}
