package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eahz  reason: default package */
/* loaded from: classes6.dex */
public final class eahz extends eahu {
    private final eahy a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eahz(java.net.URL r2, defpackage.eaee r3) {
        /*
            r1 = this;
            eahy r0 = new eahy
            r0.<init>(r2, r3)
            r1.<init>(r0)
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eahz.<init>(java.net.URL, eaee):void");
    }

    @Override // defpackage.eahu
    protected final eadv a() {
        eahy eahyVar = this.a;
        if (eahyVar.d == null) {
            throw new IllegalStateException("Connection has not yet been established");
        }
        return eahyVar.i;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.a.c.n;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.a.c.l;
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        eahy eahyVar = this.a;
        eaed a = eahyVar.c.a();
        if (hostnameVerifier != null) {
            a.l = hostnameVerifier;
            eahyVar.c = a.a();
            return;
        }
        throw new NullPointerException("hostnameVerifier == null");
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory != null) {
            eahy eahyVar = this.a;
            eaed a = eahyVar.c.a();
            a.j = sSLSocketFactory;
            eaim eaimVar = eaim.c;
            X509TrustManager b = eaimVar.b(sSLSocketFactory);
            if (b == null) {
                throw new IllegalStateException("Unable to extract the trust manager on " + eaim.c + ", sslSocketFactory is " + sSLSocketFactory.getClass());
            }
            a.k = eaimVar.h(b);
            eahyVar.c = a.a();
            return;
        }
        throw new IllegalArgumentException("sslSocketFactory == null");
    }
}
