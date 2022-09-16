package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: PG */
/* renamed from: eadv  reason: default package */
/* loaded from: classes6.dex */
public final class eadv {
    public final eadh a;
    public final List<Certificate> b;
    public final List<Certificate> c;
    private final eaet d;

    private eadv(eaet eaetVar, eadh eadhVar, List<Certificate> list, List<Certificate> list2) {
        this.d = eaetVar;
        this.a = eadhVar;
        this.b = list;
        this.c = list2;
    }

    public static eadv a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List emptyList;
        List emptyList2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            eadh a = eadh.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                if ("NONE".equals(protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                eaet a2 = eaet.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    emptyList = eafa.g(certificateArr);
                } else {
                    emptyList = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    emptyList2 = eafa.g(localCertificates);
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new eadv(a2, a, emptyList, emptyList2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof eadv)) {
            return false;
        }
        eadv eadvVar = (eadv) obj;
        return this.d.equals(eadvVar.d) && this.a.equals(eadvVar.a) && this.b.equals(eadvVar.b) && this.c.equals(eadvVar.c);
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
