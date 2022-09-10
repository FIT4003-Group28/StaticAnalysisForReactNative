package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eaee  reason: default package */
/* loaded from: classes6.dex */
public final class eaee implements Cloneable {
    static final List<eaeh> a = eafa.g(eaeh.HTTP_2, eaeh.HTTP_1_1);
    static final List<eadl> b = eafa.g(eadl.a, eadl.b);
    public final eadp c;
    @dzsi
    public final Proxy d;
    public final List<eaeh> e;
    public final List<eadl> f;
    final List<eaea> g;
    final List<eaea> h;
    public final ProxySelector i;
    public final eado j;
    public final SocketFactory k;
    public final SSLSocketFactory l;
    final eaiq m;
    public final HostnameVerifier n;
    public final eadf o;
    public final eacz p;
    public final eacz q;
    public final eadj r;
    public final eadr s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    final eadt y;

    static {
        eaeu.a = new eaec();
    }

    public eaee() {
        this(new eaed());
    }

    private static SSLSocketFactory b(X509TrustManager x509TrustManager) {
        try {
            SSLContext j = eaim.c.j();
            j.init(null, new TrustManager[]{x509TrustManager}, null);
            return j.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw eafa.w("No System TLS", e);
        }
    }

    public final eaed a() {
        return new eaed(this);
    }

    public eaee(eaed eaedVar) {
        boolean z;
        this.c = eaedVar.a;
        this.d = eaedVar.b;
        this.e = eaedVar.c;
        List<eadl> list = eaedVar.d;
        this.f = list;
        this.g = eafa.e(eaedVar.e);
        this.h = eafa.e(eaedVar.f);
        this.y = eaedVar.w;
        this.i = eaedVar.g;
        this.j = eaedVar.h;
        this.k = eaedVar.i;
        loop0: while (true) {
            z = false;
            for (eadl eadlVar : list) {
                z = (z || eadlVar.c) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = eaedVar.j;
        if (sSLSocketFactory != null || !z) {
            this.l = sSLSocketFactory;
            this.m = eaedVar.k;
        } else {
            X509TrustManager y = eafa.y();
            this.l = b(y);
            this.m = eaim.c.h(y);
        }
        if (this.l != null) {
            eaim.c.m(this.l);
        }
        this.n = eaedVar.l;
        eadf eadfVar = eaedVar.m;
        eaiq eaiqVar = this.m;
        this.o = !eafa.a(eadfVar.c, eaiqVar) ? new eadf(eadfVar.b, eaiqVar) : eadfVar;
        this.p = eaedVar.n;
        this.q = eaedVar.o;
        this.r = eaedVar.p;
        this.s = eaedVar.q;
        this.t = eaedVar.r;
        this.u = eaedVar.s;
        this.v = eaedVar.t;
        this.w = eaedVar.u;
        this.x = eaedVar.v;
        if (this.g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.g);
        } else if (this.h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.h);
        }
    }
}
