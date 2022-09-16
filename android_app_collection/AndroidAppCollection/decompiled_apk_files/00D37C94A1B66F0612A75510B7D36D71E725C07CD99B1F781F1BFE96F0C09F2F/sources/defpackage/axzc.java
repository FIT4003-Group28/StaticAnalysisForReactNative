package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: axzc  reason: default package */
/* loaded from: classes2.dex */
public final class axzc {
    public static final axya a = axya.a("io.grpc.EquivalentAddressGroup.authorityOverride");
    public final List b;
    public final axyb c;
    private final int d;

    public axzc(SocketAddress socketAddress) {
        axyb axybVar = axyb.a;
        List singletonList = Collections.singletonList(socketAddress);
        aqxo.q(!singletonList.isEmpty(), "addrs is empty");
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.b = unmodifiableList;
        axybVar.getClass();
        this.c = axybVar;
        this.d = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axzc)) {
            return false;
        }
        axzc axzcVar = (axzc) obj;
        if (this.b.size() != axzcVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!((SocketAddress) this.b.get(i)).equals(axzcVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(axzcVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
