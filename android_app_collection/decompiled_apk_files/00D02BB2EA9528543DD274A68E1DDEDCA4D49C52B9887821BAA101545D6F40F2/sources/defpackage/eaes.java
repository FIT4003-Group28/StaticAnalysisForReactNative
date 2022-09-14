package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
/* compiled from: PG */
/* renamed from: eaes  reason: default package */
/* loaded from: classes6.dex */
public final class eaes {
    public final eacx a;
    public final Proxy b;
    public final InetSocketAddress c;

    public final boolean a() {
        return this.a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof eaes) {
            eaes eaesVar = (eaes) obj;
            return eaesVar.a.equals(this.a) && eaesVar.b.equals(this.b) && eaesVar.c.equals(this.c);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }

    public eaes(eacx eacxVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (proxy != null) {
            if (inetSocketAddress != null) {
                this.a = eacxVar;
                this.b = proxy;
                this.c = inetSocketAddress;
                return;
            }
            throw new NullPointerException("inetSocketAddress == null");
        }
        throw new NullPointerException("proxy == null");
    }
}
