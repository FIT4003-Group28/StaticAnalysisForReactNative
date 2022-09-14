package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
/* compiled from: PG */
/* renamed from: dywv  reason: default package */
/* loaded from: classes6.dex */
final class dywv extends dyww {
    private static final dyxk<Socket> d = new dyxk<>(null, "setUseSessionTickets", Boolean.TYPE);
    private static final dyxk<Socket> e = new dyxk<>(null, "setHostname", String.class);
    private static final dyxk<Socket> f = new dyxk<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final dyxk<Socket> g = new dyxk<>(null, "setAlpnProtocols", byte[].class);
    private static final dyxk<Socket> h = new dyxk<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final dyxk<Socket> i = new dyxk<>(null, "setNpnProtocols", byte[].class);
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Constructor<?> p;

    static {
        NoSuchMethodException e2;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException e3;
        Method method4;
        NoSuchMethodException noSuchMethodException;
        ClassNotFoundException classNotFoundException;
        Method method5;
        Method method6;
        NoSuchMethodException noSuchMethodException2;
        Method method7;
        ClassNotFoundException classNotFoundException2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                } catch (ClassNotFoundException e4) {
                    e3 = e4;
                    method3 = null;
                    method4 = method3;
                    classNotFoundException = e3;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                } catch (NoSuchMethodException e5) {
                    e2 = e5;
                    method3 = null;
                    method4 = method3;
                    noSuchMethodException = e2;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                }
                try {
                    cls = Class.forName("android.net.ssl.SSLSockets");
                    method6 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                } catch (ClassNotFoundException e6) {
                    e3 = e6;
                    method4 = null;
                    classNotFoundException = e3;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                } catch (NoSuchMethodException e7) {
                    e2 = e7;
                    method4 = null;
                    noSuchMethodException = e2;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                }
                try {
                    method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                } catch (ClassNotFoundException e8) {
                    classNotFoundException = e8;
                    method4 = method6;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                } catch (NoSuchMethodException e9) {
                    noSuchMethodException = e9;
                    method4 = method6;
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                    method5 = null;
                    method6 = method4;
                    l = method2;
                    m = method;
                    n = method3;
                    j = method6;
                    k = method5;
                    method7 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method7;
                    p = constructor;
                }
            } catch (ClassNotFoundException e10) {
                e3 = e10;
                method = null;
                method3 = null;
            } catch (NoSuchMethodException e11) {
                e2 = e11;
                method = null;
                method3 = null;
            }
        } catch (ClassNotFoundException e12) {
            e3 = e12;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e13) {
            e2 = e13;
            method = null;
            method2 = null;
            method3 = null;
        }
        l = method2;
        m = method;
        n = method3;
        j = method6;
        k = method5;
        try {
            method7 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e14) {
            classNotFoundException2 = e14;
            method7 = null;
        } catch (NoSuchMethodException e15) {
            noSuchMethodException2 = e15;
            method7 = null;
        }
        try {
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e16) {
            classNotFoundException2 = e16;
            dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) classNotFoundException2);
            o = method7;
            p = constructor;
        } catch (NoSuchMethodException e17) {
            noSuchMethodException2 = e17;
            dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) noSuchMethodException2);
            o = method7;
            p = constructor;
        }
        o = method7;
        p = constructor;
    }

    public dywv(dyxs dyxsVar) {
        super(dyxsVar);
    }

    @Override // defpackage.dyww
    public final String a(SSLSocket sSLSocket, String str, List<dyxt> list) {
        String c = c(sSLSocket);
        return c == null ? super.a(sSLSocket, str, list) : c;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    @Override // defpackage.dyww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void b(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<defpackage.dyxt> r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dywv.b(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }

    @Override // defpackage.dyww
    public final String c(SSLSocket sSLSocket) {
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (e3.getTargetException() instanceof UnsupportedOperationException) {
                    dyww.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                } else {
                    throw new RuntimeException(e3);
                }
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.b(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, dyxv.b);
                }
            } catch (Exception e4) {
                dyww.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.b(sSLSocket, new Object[0]);
                if (bArr2 == null) {
                    return null;
                }
                return new String(bArr2, dyxv.b);
            } catch (Exception e5) {
                dyww.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                return null;
            }
        }
        return null;
    }
}
