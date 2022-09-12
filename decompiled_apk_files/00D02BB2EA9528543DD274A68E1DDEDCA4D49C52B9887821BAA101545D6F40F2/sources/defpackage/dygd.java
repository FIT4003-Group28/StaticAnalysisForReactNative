package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
/* compiled from: PG */
/* renamed from: dygd  reason: default package */
/* loaded from: classes6.dex */
public final class dygd {
    @dzsi
    public String a;
    @dzsi
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    public final dyge a() {
        return new dyge(this.c, this.d, this.a, this.b);
    }

    public final void b(SocketAddress socketAddress) {
        dbsk.t(socketAddress, "proxyAddress");
        this.c = socketAddress;
    }

    public final void c(InetSocketAddress inetSocketAddress) {
        dbsk.t(inetSocketAddress, "targetAddress");
        this.d = inetSocketAddress;
    }
}
