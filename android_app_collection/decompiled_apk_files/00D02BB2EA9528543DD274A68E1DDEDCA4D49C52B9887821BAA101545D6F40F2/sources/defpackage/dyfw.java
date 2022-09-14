package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: dyfw  reason: default package */
/* loaded from: classes6.dex */
public final class dyfw {
    public static final dyek<String> a = dyek.a("io.grpc.EquivalentAddressGroup.authorityOverride");
    public final List<SocketAddress> b;
    public final dyel c;
    private final int d;

    public dyfw(SocketAddress socketAddress) {
        dyel dyelVar = dyel.b;
        List singletonList = Collections.singletonList(socketAddress);
        dbsk.b(!singletonList.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(singletonList));
        this.b = unmodifiableList;
        dbsk.t(dyelVar, "attrs");
        this.c = dyelVar;
        this.d = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyfw)) {
            return false;
        }
        dyfw dyfwVar = (dyfw) obj;
        if (this.b.size() != dyfwVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (!this.b.get(i).equals(dyfwVar.b.get(i))) {
                return false;
            }
        }
        return this.c.equals(dyfwVar.c);
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
