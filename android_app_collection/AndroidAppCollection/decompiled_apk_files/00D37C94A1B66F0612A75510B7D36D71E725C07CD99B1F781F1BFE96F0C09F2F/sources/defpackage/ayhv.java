package defpackage;

import java.net.SocketAddress;
import java.util.List;
/* compiled from: PG */
/* renamed from: ayhv  reason: default package */
/* loaded from: classes2.dex */
final class ayhv {
    public List a;
    public int b;
    public int c;

    public ayhv(List list) {
        this.a = list;
    }

    public final SocketAddress a() {
        return (SocketAddress) ((axzc) this.a.get(this.b)).b.get(this.c);
    }

    public final void b() {
        this.b = 0;
        this.c = 0;
    }
}
