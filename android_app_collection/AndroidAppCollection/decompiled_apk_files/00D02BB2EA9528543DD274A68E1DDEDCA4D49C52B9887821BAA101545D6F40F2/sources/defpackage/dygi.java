package defpackage;

import java.security.cert.Certificate;
import java.util.logging.Level;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
/* compiled from: PG */
/* renamed from: dygi  reason: default package */
/* loaded from: classes6.dex */
public final class dygi {
    public dygi(SSLSession sSLSession) {
        sSLSession.getCipherSuite();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            Certificate certificate = localCertificates[0];
        }
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates == null) {
                return;
            }
            Certificate certificate2 = peerCertificates[0];
        } catch (SSLPeerUnverifiedException e) {
            dygj.a.logp(Level.FINE, "io.grpc.InternalChannelz$Tls", "<init>", String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
        }
    }
}
