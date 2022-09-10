package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: eaed  reason: default package */
/* loaded from: classes6.dex */
public final class eaed {
    public eadp a;
    @dzsi
    Proxy b;
    final List<eaeh> c;
    final List<eadl> d;
    public final List<eaea> e;
    public final List<eaea> f;
    ProxySelector g;
    final eado h;
    final SocketFactory i;
    @dzsi
    public SSLSocketFactory j;
    @dzsi
    public eaiq k;
    public HostnameVerifier l;
    final eadf m;
    final eacz n;
    final eacz o;
    final eadj p;
    final eadr q;
    public boolean r;
    public boolean s;
    int t;
    int u;
    public int v;
    final eadt w;

    public eaed() {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.a = new eadp();
        this.c = eaee.a;
        this.d = eaee.b;
        this.w = new eadt(eadu.a);
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.g = proxySelector;
        if (proxySelector == null) {
            this.g = new eain();
        }
        this.h = eado.a;
        this.i = SocketFactory.getDefault();
        this.l = eair.a;
        this.m = eadf.a;
        this.n = eacz.a;
        this.o = eacz.a;
        this.p = new eadj();
        this.q = eadr.a;
        this.r = true;
        this.s = true;
        this.t = 10000;
        this.u = 10000;
        this.v = 10000;
    }

    public final eaee a() {
        return new eaee(this);
    }

    public final void b(long j, TimeUnit timeUnit) {
        this.t = eafa.A(j, timeUnit);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.u = eafa.A(j, timeUnit);
    }

    public eaed(eaee eaeeVar) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.a = eaeeVar.c;
        this.b = eaeeVar.d;
        this.c = eaeeVar.e;
        this.d = eaeeVar.f;
        arrayList.addAll(eaeeVar.g);
        arrayList2.addAll(eaeeVar.h);
        this.w = eaeeVar.y;
        this.g = eaeeVar.i;
        this.h = eaeeVar.j;
        this.i = eaeeVar.k;
        this.j = eaeeVar.l;
        this.k = eaeeVar.m;
        this.l = eaeeVar.n;
        this.m = eaeeVar.o;
        this.n = eaeeVar.p;
        this.o = eaeeVar.q;
        this.p = eaeeVar.r;
        this.q = eaeeVar.s;
        this.r = eaeeVar.t;
        this.s = eaeeVar.u;
        this.t = eaeeVar.v;
        this.u = eaeeVar.w;
        this.v = eaeeVar.x;
    }
}
