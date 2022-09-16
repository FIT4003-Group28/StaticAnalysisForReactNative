package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axzi  reason: default package */
/* loaded from: classes2.dex */
public final class axzi extends aybm {
    private static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final String c;
    private final String d;

    public axzi(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        aqxo.B(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public static axzh a() {
        return new axzh();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axzi)) {
            return false;
        }
        axzi axziVar = (axzi) obj;
        return akzj.f(this.b, axziVar.b) && akzj.f(this.a, axziVar.a) && akzj.f(this.c, axziVar.c) && akzj.f(this.d, axziVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("proxyAddr", this.b);
        c.b("targetAddr", this.a);
        c.b(vzx.USERNAME, this.c);
        c.g("hasPassword", this.d != null);
        return c.toString();
    }
}
