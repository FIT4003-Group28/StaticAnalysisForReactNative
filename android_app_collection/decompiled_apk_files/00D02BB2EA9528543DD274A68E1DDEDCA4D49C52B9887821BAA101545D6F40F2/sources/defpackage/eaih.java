package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
/* compiled from: PG */
/* renamed from: eaih  reason: default package */
/* loaded from: classes6.dex */
public final class eaih extends eaim {
    private eaih() {
    }

    public static eaih l() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new eaih();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static final Provider p() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // defpackage.eaim
    @dzsi
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.b(sSLSocketFactory);
        }
        try {
            Object o = o(sSLSocketFactory, Object.class, "sslParameters");
            if (o == null) {
                return null;
            }
            return (X509TrustManager) o(o, X509TrustManager.class, "x509TrustManager");
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // defpackage.eaim
    public final void c(SSLSocket sSLSocket, String str, List<eaeh> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) eaim.n(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.eaim
    @dzsi
    public final String d(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.eaim
    public final SSLContext j() {
        try {
            return SSLContext.getInstance("TLSv1.3", p());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", p());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // defpackage.eaim
    public final void m(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
