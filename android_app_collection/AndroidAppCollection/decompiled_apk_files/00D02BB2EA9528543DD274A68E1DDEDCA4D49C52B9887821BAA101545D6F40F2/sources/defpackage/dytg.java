package defpackage;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: dytg  reason: default package */
/* loaded from: classes6.dex */
final class dytg {
    public static final PasswordAuthentication a(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            dyti.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", "https", str));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
}
