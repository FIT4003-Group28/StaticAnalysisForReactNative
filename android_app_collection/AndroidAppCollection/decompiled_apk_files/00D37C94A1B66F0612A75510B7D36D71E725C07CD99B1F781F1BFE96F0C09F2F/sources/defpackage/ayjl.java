package defpackage;

import java.net.SocketAddress;
import java.net.URI;
/* compiled from: PG */
/* renamed from: ayjl  reason: default package */
/* loaded from: classes2.dex */
final class ayjl extends aybb {
    final SocketAddress a;
    final String b;

    public ayjl(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    @Override // defpackage.aybb
    public final aybg a(URI uri, ayaz ayazVar) {
        return new ayjk(this);
    }

    @Override // defpackage.aybb
    public final String b() {
        return "directaddress";
    }
}
