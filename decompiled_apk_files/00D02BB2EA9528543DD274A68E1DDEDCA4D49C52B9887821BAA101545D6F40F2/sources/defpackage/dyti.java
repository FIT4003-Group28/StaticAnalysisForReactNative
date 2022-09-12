package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyti  reason: default package */
/* loaded from: classes6.dex */
public final class dyti implements dyit {
    private final dbty<ProxySelector> c;
    private final InetSocketAddress d;
    public static final Logger a = Logger.getLogger(dyti.class.getName());
    private static final dytg e = new dytg();
    private static final dbty<ProxySelector> b = new dyth();

    public dyti() {
        dbty<ProxySelector> dbtyVar = b;
        dytg dytgVar = e;
        String str = System.getenv("GRPC_PROXY_EXP");
        dbsk.s(dbtyVar);
        this.c = dbtyVar;
        dbsk.s(dytgVar);
        if (str == null) {
            this.d = null;
            return;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.d = new InetSocketAddress(split[0], parseInt);
    }

    private static final dyis b(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", null, dyow.g(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
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
                PasswordAuthentication a2 = dytg.a(dyow.g(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                dygd a3 = dyge.a();
                a3.c(inetSocketAddress);
                a3.b(inetSocketAddress2);
                if (a2 == null) {
                    return a3.a();
                }
                a3.a = a2.getUserName();
                if (a2.getPassword() != null) {
                    str = new String(a2.getPassword());
                }
                a3.b = str;
                return a3.a();
            } catch (URISyntaxException e2) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    @Override // defpackage.dyit
    @dzsi
    public final dyis a(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.d != null) {
            dygd a2 = dyge.a();
            a2.b(this.d);
            a2.c((InetSocketAddress) socketAddress);
            return a2.a();
        }
        return b((InetSocketAddress) socketAddress);
    }
}
