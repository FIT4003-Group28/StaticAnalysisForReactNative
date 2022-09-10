package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eaig  reason: default package */
/* loaded from: classes6.dex */
final class eaig extends eaim {
    private final Class<?> a;
    private final eail<Socket> b;
    private final eail<Socket> d;
    private final eail<Socket> e;
    private final eail<Socket> f;
    private final eaif g;

    public eaig(Class<?> cls, eail<Socket> eailVar, eail<Socket> eailVar2, eail<Socket> eailVar3, eail<Socket> eailVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", new Class[0]);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.g = new eaif(method3, method2, method);
        this.a = cls;
        this.b = eailVar;
        this.d = eailVar2;
        this.e = eailVar3;
        this.f = eailVar4;
    }

    @Override // defpackage.eaim
    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!eafa.l(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException2 = new IOException("Exception in connect");
            iOException2.initCause(e3);
            throw iOException2;
        }
    }

    @Override // defpackage.eaim
    @dzsi
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object o = o(sSLSocketFactory, this.a, "sslParameters");
        if (o == null) {
            try {
                o = o(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.b(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) o(o, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) o(o, X509TrustManager.class, "trustManager");
    }

    @Override // defpackage.eaim
    public final void c(SSLSocket sSLSocket, String str, List<eaeh> list) {
        if (str != null) {
            this.b.c(sSLSocket, true);
            this.d.c(sSLSocket, str);
        }
        eail<Socket> eailVar = this.f;
        if (eailVar == null || !eailVar.a(sSLSocket)) {
            return;
        }
        Object[] objArr = new Object[1];
        eaiz eaizVar = new eaiz();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eaeh eaehVar = list.get(i);
            if (eaehVar != eaeh.HTTP_1_0) {
                eaizVar.M(eaehVar.g.length());
                eaizVar.V(eaehVar.g);
            }
        }
        objArr[0] = eaizVar.v();
        this.f.b(sSLSocket, objArr);
    }

    @Override // defpackage.eaim
    @dzsi
    public final String d(SSLSocket sSLSocket) {
        byte[] bArr;
        eail<Socket> eailVar = this.e;
        if (eailVar == null || !eailVar.a(sSLSocket) || (bArr = (byte[]) this.e.b(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, eafa.d);
    }

    @Override // defpackage.eaim
    public final void e(int i, String str, @dzsi Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            do {
                i2 = Math.min(indexOf, i2 + 4000);
            } while (i2 < indexOf);
            i2++;
        }
    }

    @Override // defpackage.eaim
    public final void f(String str, Object obj) {
        eaif eaifVar = this.g;
        if (obj != null) {
            try {
                eaifVar.c.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        e(5, str, null);
    }

    @Override // defpackage.eaim
    public final boolean g(String str) {
        try {
            try {
                Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                try {
                    try {
                        return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(invoke, str)).booleanValue();
                    } catch (NoSuchMethodException unused) {
                        return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(invoke, new Object[0])).booleanValue();
                    }
                } catch (NoSuchMethodException unused2) {
                    return true;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw eafa.w("unable to determine cleartext support", e);
        }
    }

    @Override // defpackage.eaim
    public final eaiq h(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new eaid(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.h(x509TrustManager);
        }
    }

    @Override // defpackage.eaim
    public final eais i(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new eaie(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.i(x509TrustManager);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
        if (android.os.Build.VERSION.SDK_INT < 22) goto L13;
     */
    @Override // defpackage.eaim
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final javax.net.ssl.SSLContext j() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoClassDefFoundError -> L6
            r1 = 22
            if (r0 >= r1) goto Ld
        L6:
            java.lang.String r0 = "TLSv1.2"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Ld
            return r0
        Ld:
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No TLS provider"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaig.j():javax.net.ssl.SSLContext");
    }

    @Override // defpackage.eaim
    public final Object k() {
        eaif eaifVar = this.g;
        Method method = eaifVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                eaifVar.b.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
