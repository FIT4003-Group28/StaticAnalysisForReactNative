package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: eafk  reason: default package */
/* loaded from: classes6.dex */
public final class eafk {
    public final eacx a;
    public final eafh b;
    public List<Proxy> c;
    public int d;
    public List<InetSocketAddress> e = Collections.emptyList();
    public final List<eaes> f = new ArrayList();

    public eafk(eacx eacxVar, eafh eafhVar) {
        List<Proxy> g;
        this.c = Collections.emptyList();
        this.a = eacxVar;
        this.b = eafhVar;
        eadz eadzVar = eacxVar.a;
        Proxy proxy = eacxVar.h;
        if (proxy != null) {
            this.c = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = eacxVar.g.select(eadzVar.b());
            if (select == null || select.isEmpty()) {
                g = eafa.g(Proxy.NO_PROXY);
            } else {
                g = eafa.e(select);
            }
            this.c = g;
        }
        this.d = 0;
    }

    public final boolean a() {
        return b() || !this.f.isEmpty();
    }

    public final boolean b() {
        return this.d < this.c.size();
    }
}
