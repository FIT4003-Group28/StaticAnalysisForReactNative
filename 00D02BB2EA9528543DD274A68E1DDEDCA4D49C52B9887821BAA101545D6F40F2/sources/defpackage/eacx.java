package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: eacx  reason: default package */
/* loaded from: classes6.dex */
public final class eacx {
    public final eadz a;
    public final eadr b;
    public final SocketFactory c;
    public final eacz d;
    public final List<eaeh> e;
    public final List<eadl> f;
    public final ProxySelector g;
    @dzsi
    public final Proxy h;
    @dzsi
    public final SSLSocketFactory i;
    @dzsi
    public final HostnameVerifier j;
    @dzsi
    public final eadf k;

    public eacx(String str, int i, eadr eadrVar, SocketFactory socketFactory, @dzsi SSLSocketFactory sSLSocketFactory, @dzsi HostnameVerifier hostnameVerifier, @dzsi eadf eadfVar, eacz eaczVar, @dzsi Proxy proxy, List<eaeh> list, List<eadl> list2, ProxySelector proxySelector) {
        eady eadyVar = new eady();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            eadyVar.a = "http";
        } else if (!str2.equalsIgnoreCase("https")) {
            throw new IllegalArgumentException("unexpected scheme: " + str2);
        } else {
            eadyVar.a = "https";
        }
        if (str != null) {
            String c = eady.c(str, 0, str.length());
            if (c == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            eadyVar.d = c;
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            eadyVar.e = i;
            this.a = eadyVar.b();
            this.b = eadrVar;
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            }
            this.c = socketFactory;
            this.d = eaczVar;
            if (list == null) {
                throw new NullPointerException("protocols == null");
            }
            this.e = eafa.e(list);
            if (list2 == null) {
                throw new NullPointerException("connectionSpecs == null");
            }
            this.f = eafa.e(list2);
            if (proxySelector == null) {
                throw new NullPointerException("proxySelector == null");
            }
            this.g = proxySelector;
            this.h = proxy;
            this.i = sSLSocketFactory;
            this.j = hostnameVerifier;
            this.k = eadfVar;
            return;
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(eacx eacxVar) {
        return this.b.equals(eacxVar.b) && this.d.equals(eacxVar.d) && this.e.equals(eacxVar.e) && this.f.equals(eacxVar.f) && this.g.equals(eacxVar.g) && eafa.a(this.h, eacxVar.h) && eafa.a(this.i, eacxVar.i) && eafa.a(this.j, eacxVar.j) && eafa.a(this.k, eacxVar.k) && this.a.c == eacxVar.a.c;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof eacx) {
            eacx eacxVar = (eacx) obj;
            return this.a.equals(eacxVar.a) && a(eacxVar);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        eadf eadfVar = this.k;
        if (eadfVar != null) {
            i = eadfVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.b);
        sb.append(":");
        sb.append(this.a.c);
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }
}
