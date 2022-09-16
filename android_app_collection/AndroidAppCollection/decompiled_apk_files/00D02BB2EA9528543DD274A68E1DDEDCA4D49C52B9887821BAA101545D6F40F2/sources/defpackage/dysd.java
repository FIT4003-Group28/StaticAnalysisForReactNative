package defpackage;

import java.net.SocketAddress;
import java.net.URI;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysd  reason: default package */
/* loaded from: classes6.dex */
public final class dysd extends dyif {
    final SocketAddress a;
    final String b;

    public dysd(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    @Override // defpackage.dyif
    public final dyik a(URI uri, dyid dyidVar) {
        return new dysc(this);
    }

    @Override // defpackage.dyif
    public final String b() {
        return "directaddress";
    }
}
