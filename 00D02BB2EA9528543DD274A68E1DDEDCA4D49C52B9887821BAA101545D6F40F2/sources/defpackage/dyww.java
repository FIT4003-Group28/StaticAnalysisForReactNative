package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyww  reason: default package */
/* loaded from: classes6.dex */
public class dyww {
    public static final dyww b;
    protected final dyxs c;
    public static final Logger a = Logger.getLogger(dyww.class.getName());
    private static final dyxs d = dyxs.b;

    static {
        dyww dywwVar;
        ClassLoader classLoader = dyww.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                dywwVar = new dyww(d);
            }
        }
        dywwVar = new dywv(d);
        b = dywwVar;
    }

    public dyww(dyxs dyxsVar) {
        dbsk.t(dyxsVar, "platform");
        this.c = dyxsVar;
    }

    public String a(SSLSocket sSLSocket, String str, @dzsi List<dyxt> list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String c = c(sSLSocket);
            if (c != null) {
                return c;
            }
            String valueOf = String.valueOf(list);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("TLS ALPN negotiation failed with protocols: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void b(SSLSocket sSLSocket, String str, List<dyxt> list) {
        this.c.a(sSLSocket, str, list);
    }

    public String c(SSLSocket sSLSocket) {
        return this.c.b(sSLSocket);
    }
}
