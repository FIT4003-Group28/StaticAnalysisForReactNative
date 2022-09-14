package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: dywy  reason: default package */
/* loaded from: classes6.dex */
final class dywy {
    static final List<dyxt> a = Collections.unmodifiableList(Arrays.asList(dyxt.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, dyxh dyxhVar) {
        dyxt dyxtVar;
        dbsk.t(socket, "socket");
        dbsk.t(dyxhVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        List<dyxt> list = null;
        String[] strArr = dyxhVar.c != null ? (String[]) dyxv.b(String.class, dyxhVar.c, sSLSocket.getEnabledCipherSuites()) : null;
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        dyxg dyxgVar = new dyxg(dyxhVar);
        dyxgVar.c(strArr);
        dyxgVar.e((String[]) dyxv.b(String.class, dyxhVar.d, enabledProtocols));
        dyxh a2 = dyxgVar.a();
        sSLSocket.setEnabledProtocols(a2.d);
        String[] strArr2 = a2.c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        dyww dywwVar = dyww.b;
        if (dyxhVar.e) {
            list = a;
        }
        String a3 = dywwVar.a(sSLSocket, str, list);
        List<dyxt> list2 = a;
        if (a3.equals(dyxt.HTTP_1_0.e)) {
            dyxtVar = dyxt.HTTP_1_0;
        } else if (a3.equals(dyxt.HTTP_1_1.e)) {
            dyxtVar = dyxt.HTTP_1_1;
        } else if (a3.equals(dyxt.HTTP_2.e)) {
            dyxtVar = dyxt.HTTP_2;
        } else if (!a3.equals(dyxt.SPDY_3.e)) {
            String valueOf = String.valueOf(a3);
            throw new IOException(valueOf.length() != 0 ? "Unexpected protocol: ".concat(valueOf) : new String("Unexpected protocol: "));
        } else {
            dyxtVar = dyxt.SPDY_3;
        }
        boolean contains = list2.contains(dyxtVar);
        String valueOf2 = String.valueOf(list2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 50);
        sb.append("Only ");
        sb.append(valueOf2);
        sb.append(" are supported, but negotiated protocol is %s");
        dbsk.p(contains, sb.toString(), a3);
        if (!dyxj.a.verify((!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1), sSLSocket.getSession())) {
            String valueOf3 = String.valueOf(str);
            throw new SSLPeerUnverifiedException(valueOf3.length() != 0 ? "Cannot verify hostname: ".concat(valueOf3) : new String("Cannot verify hostname: "));
        }
        return sSLSocket;
    }
}
