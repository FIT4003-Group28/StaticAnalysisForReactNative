package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: PG */
/* renamed from: eaii  reason: default package */
/* loaded from: classes6.dex */
final class eaii extends eaim {
    final Method a;
    final Method b;

    public eaii(Method method, Method method2) {
        this.a = method;
        this.b = method2;
    }

    @Override // defpackage.eaim
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // defpackage.eaim
    public final void c(SSLSocket sSLSocket, String str, List<eaeh> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> n = n(list);
            this.a.invoke(sSLParameters, n.toArray(new String[n.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw eafa.w("unable to set ssl parameters", e);
        }
    }

    @Override // defpackage.eaim
    @dzsi
    public final String d(SSLSocket sSLSocket) {
        try {
            String str = (String) this.b.invoke(sSLSocket, new Object[0]);
            if (str == null) {
                return null;
            }
            if (!str.equals("")) {
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw eafa.w("unable to get selected protocols", e);
        }
    }
}
