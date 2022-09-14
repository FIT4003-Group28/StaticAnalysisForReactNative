package defpackage;

import java.net.SocketAddress;
import java.util.List;
/* compiled from: PG */
/* renamed from: dypt  reason: default package */
/* loaded from: classes6.dex */
final class dypt {
    public List<dyfw> a;
    public int b;
    public int c;

    public dypt(List<dyfw> list) {
        this.a = list;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final SocketAddress b() {
        return this.a.get(this.b).b.get(this.c);
    }
}
