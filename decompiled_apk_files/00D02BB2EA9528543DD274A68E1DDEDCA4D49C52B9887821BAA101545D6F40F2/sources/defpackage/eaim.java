package defpackage;

import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eaim  reason: default package */
/* loaded from: classes6.dex */
public class eaim {
    private static final Logger a;
    public static final eaim c;

    static {
        Class<?> cls;
        eaim eaimVar;
        eail eailVar;
        eail eailVar2;
        eaik eaikVar = null;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            eail eailVar3 = new eail(null, "setUseSessionTickets", Boolean.TYPE);
            eail eailVar4 = new eail(null, "setHostname", String.class);
            if (Security.getProvider("GMSCore_OpenSSL") == null) {
                try {
                    Class.forName("android.net.Network");
                } catch (ClassNotFoundException unused2) {
                    eailVar = null;
                    eailVar2 = null;
                }
            }
            eailVar = new eail(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            eailVar2 = new eail(null, "setAlpnProtocols", byte[].class);
            eaimVar = new eaig(cls2, eailVar3, eailVar4, eailVar, eailVar2);
        } catch (ClassNotFoundException unused3) {
            eaimVar = null;
        }
        if (eaimVar == null && ((!"conscrypt".equals(System.getProperty("okhttp.platform")) && !"Conscrypt".equals(Security.getProviders()[0].getName())) || (eaimVar = eaih.l()) == null)) {
            try {
                eaimVar = new eaii(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
            } catch (NoSuchMethodException unused4) {
                eaimVar = null;
            }
            if (eaimVar == null) {
                try {
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    eaikVar = new eaik(cls3.getMethod("put", SSLSocket.class, cls4), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
                } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                }
                eaimVar = eaikVar == null ? new eaim() : eaikVar;
            }
        }
        c = eaimVar;
        a = Logger.getLogger(eaee.class.getName());
    }

    public static List<String> n(List<eaeh> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eaeh eaehVar = list.get(i);
            if (eaehVar != eaeh.HTTP_1_0) {
                arrayList.add(eaehVar.g);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static <T> T o(Object obj, Class<T> cls, String str) {
        Object o;
        for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null && cls.isInstance(obj2)) {
                    return cls.cast(obj2);
                }
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (str.equals("delegate") || (o = o(obj, Object.class, "delegate")) == null) {
            return null;
        }
        return (T) o(o, cls, str);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    @dzsi
    public X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        try {
            Object o = o(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (o != null) {
                return (X509TrustManager) o(o, X509TrustManager.class, "trustManager");
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void c(SSLSocket sSLSocket, @dzsi String str, List<eaeh> list) {
    }

    @dzsi
    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public void e(int i, String str, @dzsi Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void f(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        e(5, str, (Throwable) obj);
    }

    public boolean g(String str) {
        return true;
    }

    public eaiq h(X509TrustManager x509TrustManager) {
        return new eaio(i(x509TrustManager));
    }

    public eais i(X509TrustManager x509TrustManager) {
        return new eaip(x509TrustManager.getAcceptedIssuers());
    }

    public SSLContext j() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public Object k() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void m(SSLSocketFactory sSLSocketFactory) {
    }

    public void q(SSLSocket sSLSocket) {
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
