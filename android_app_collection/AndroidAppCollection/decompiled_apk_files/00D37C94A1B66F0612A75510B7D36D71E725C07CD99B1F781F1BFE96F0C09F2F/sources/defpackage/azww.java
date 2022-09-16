package defpackage;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
/* compiled from: PG */
/* renamed from: azww  reason: default package */
/* loaded from: classes2.dex */
public final class azww {
    public static /* synthetic */ azwu a() {
        return new azws();
    }

    public static final void b(azrd azrdVar, CancellationException cancellationException) {
        azvo azvoVar = (azvo) azrdVar.get(azvo.b);
        if (azvoVar == null) {
            return;
        }
        azvoVar.k(cancellationException);
    }

    public static aynx c(Object obj, ayqe ayqeVar) {
        ayyv ayyvVar = new ayyv(obj, ayqeVar);
        azqc.j();
        return ayyvVar;
    }

    public static boolean d(bamd bamdVar, bame bameVar, ayqe ayqeVar) {
        if (bamdVar instanceof Callable) {
            try {
                Object call = ((Callable) bamdVar).call();
                if (call == null) {
                    azoc.b(bameVar);
                    return true;
                }
                try {
                    bamd bamdVar2 = (bamd) ayqeVar.a(call);
                    ayrd.b(bamdVar2, "The mapper returned a null Publisher");
                    if (bamdVar2 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) bamdVar2).call();
                            if (call2 == null) {
                                azoc.b(bameVar);
                                return true;
                            }
                            bameVar.f(new azod(bameVar, call2));
                        } catch (Throwable th) {
                            bapv.j(th);
                            azoc.f(th, bameVar);
                            return true;
                        }
                    } else {
                        bamdVar2.ad(bameVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    bapv.j(th2);
                    azoc.f(th2, bameVar);
                    return true;
                }
            } catch (Throwable th3) {
                bapv.j(th3);
                azoc.f(th3, bameVar);
                return true;
            }
        }
        return false;
    }

    public static final PasswordAuthentication e(String str, InetAddress inetAddress, int i) {
        URL url;
        try {
            url = new URL("https", str, i, "");
        } catch (MalformedURLException unused) {
            aykk.a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", String.format("failed to create URL for Authenticator: %s %s", "https", str));
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, Authenticator.RequestorType.PROXY);
    }
}
