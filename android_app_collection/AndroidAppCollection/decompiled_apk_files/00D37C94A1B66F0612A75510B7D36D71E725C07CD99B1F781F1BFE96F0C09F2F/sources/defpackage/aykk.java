package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aykk  reason: default package */
/* loaded from: classes2.dex */
public final class aykk implements aybn {
    public final InetSocketAddress b;
    public static final Logger a = Logger.getLogger(aykk.class.getName());
    private static final azww d = new azww();
    private static final amqo c = new izn(5);

    public aykk() {
        amqo amqoVar = c;
        azww azwwVar = d;
        String str = System.getenv("GRPC_PROXY_EXP");
        amqoVar.getClass();
        azwwVar.getClass();
        if (str == null) {
            this.b = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.b = new InetSocketAddress(split[0], parseInt);
    }

    public static final aybm a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", null, ayhf.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication e = azww.e(ayhf.d(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                axzh a2 = axzi.a();
                a2.c(inetSocketAddress);
                a2.b(inetSocketAddress2);
                if (e == null) {
                    return a2.a();
                }
                a2.a = e.getUserName();
                if (e.getPassword() != null) {
                    str = new String(e.getPassword());
                }
                a2.b = str;
                return a2.a();
            } catch (URISyntaxException e2) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
