package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dyge  reason: default package */
/* loaded from: classes6.dex */
public final class dyge extends dyis {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    @dzsi
    public final String c;
    @dzsi
    public final String d;

    public dyge(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, @dzsi String str, @dzsi String str2) {
        dbsk.t(socketAddress, "proxyAddress");
        dbsk.t(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            dbsk.p(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public static dygd a() {
        return new dygd();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyge)) {
            return false;
        }
        dyge dygeVar = (dyge) obj;
        return dbsd.a(this.a, dygeVar.a) && dbsd.a(this.b, dygeVar.b) && dbsd.a(this.c, dygeVar.c) && dbsd.a(this.d, dygeVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("proxyAddr", this.a);
        b.b("targetAddr", this.b);
        b.b("username", this.c);
        b.h("hasPassword", this.d != null);
        return b.toString();
    }
}
