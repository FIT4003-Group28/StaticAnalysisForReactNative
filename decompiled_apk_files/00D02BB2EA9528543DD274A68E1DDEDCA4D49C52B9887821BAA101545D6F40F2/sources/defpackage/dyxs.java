package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: dyxs  reason: default package */
/* loaded from: classes6.dex */
public class dyxs {
    public final Provider c;
    public static final Logger a = Logger.getLogger(dyxs.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final dyxs b = f();

    public dyxs(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List<dyxt> list) {
        eaiz eaizVar = new eaiz();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dyxt dyxtVar = list.get(i);
            if (dyxtVar != dyxt.HTTP_1_0) {
                eaizVar.M(dyxtVar.e.length());
                eaizVar.V(dyxtVar.e);
            }
        }
        return eaizVar.v();
    }

    private static dyxs f() {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 < length) {
                Provider provider2 = providers[i2];
                String[] strArr = d;
                int length2 = strArr.length;
                for (int i3 = 0; i3 < 5; i3++) {
                    String str = strArr[i3];
                    if (str.equals(provider2.getClass().getName())) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                        provider = provider2;
                        break loop0;
                    }
                }
                i2++;
            } else {
                a.logp(Level.WARNING, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Unable to find Conscrypt");
                provider = null;
                break;
            }
        }
        if (provider == null) {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new dyxl())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                        return new dyxp(provider3, (Method) AccessController.doPrivileged(new dyxm()), (Method) AccessController.doPrivileged(new dyxn()));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused) {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        return new dyxq(cls.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return new dyxs(provider3);
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
        dyxk dyxkVar = new dyxk(null, "setUseSessionTickets", Boolean.TYPE);
        dyxk dyxkVar2 = new dyxk(null, "setHostname", String.class);
        dyxk dyxkVar3 = new dyxk(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        dyxk dyxkVar4 = new dyxk(null, "setAlpnProtocols", byte[].class);
        try {
            Class<?> cls2 = Class.forName("android.net.TrafficStats");
            cls2.getMethod("tagSocket", Socket.class);
            cls2.getMethod("untagSocket", Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
        }
        if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
            try {
                dyxs.class.getClassLoader().loadClass("android.net.Network");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e2);
                try {
                    dyxs.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    i = 2;
                } catch (ClassNotFoundException e3) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e3);
                    i = 3;
                }
            }
        }
        i = 1;
        return new dyxo(dyxkVar, dyxkVar2, dyxkVar3, dyxkVar4, provider, i);
    }

    public void a(SSLSocket sSLSocket, String str, List<dyxt> list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }
}
