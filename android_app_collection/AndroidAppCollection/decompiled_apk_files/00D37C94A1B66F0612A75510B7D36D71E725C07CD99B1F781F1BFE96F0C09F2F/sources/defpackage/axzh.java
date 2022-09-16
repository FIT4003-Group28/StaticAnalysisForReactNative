package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* compiled from: PG */
/* renamed from: axzh  reason: default package */
/* loaded from: classes2.dex */
public final class axzh {
    public String a;
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    public final axzi a() {
        return new axzi(this.c, this.d, this.a, this.b);
    }

    public final void b(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.c = socketAddress;
    }

    public final void c(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.d = inetSocketAddress;
    }
}
