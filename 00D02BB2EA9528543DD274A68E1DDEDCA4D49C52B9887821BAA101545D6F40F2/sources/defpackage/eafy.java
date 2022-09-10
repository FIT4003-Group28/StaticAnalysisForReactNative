package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: eafy  reason: default package */
/* loaded from: classes6.dex */
public final class eafy implements eaea {
    public volatile eafm a;
    public Object b;
    public volatile boolean c;
    private final eaee d;

    public eafy(eaee eaeeVar) {
        this.d = eaeeVar;
    }

    private final eacx b(eadz eadzVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        eadf eadfVar;
        if (eadzVar.c()) {
            eaee eaeeVar = this.d;
            SSLSocketFactory sSLSocketFactory2 = eaeeVar.l;
            HostnameVerifier hostnameVerifier2 = eaeeVar.n;
            eadfVar = eaeeVar.o;
            sSLSocketFactory = sSLSocketFactory2;
            hostnameVerifier = hostnameVerifier2;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            eadfVar = null;
        }
        String str = eadzVar.b;
        int i = eadzVar.c;
        eaee eaeeVar2 = this.d;
        return new eacx(str, i, eaeeVar2.s, eaeeVar2.k, sSLSocketFactory, hostnameVerifier, eadfVar, eaeeVar2.p, eaeeVar2.d, eaeeVar2.e, eaeeVar2.f, eaeeVar2.i);
    }

    private final boolean c(IOException iOException, eafm eafmVar, boolean z, eaem eaemVar) {
        eafmVar.f(iOException);
        if (!this.d.u) {
            return false;
        }
        if ((z && (eaemVar.d instanceof eaic)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        if (eafmVar.c != null) {
            return true;
        }
        eafj eafjVar = eafmVar.b;
        return (eafjVar != null && eafjVar.a()) || eafmVar.g.a();
    }

    private static final int d(eaep eaepVar, int i) {
        String a = eaepVar.a("Retry-After");
        if (a == null) {
            return i;
        }
        if (!a.matches("\\d+")) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(a).intValue();
    }

    private static final boolean e(eaep eaepVar, eadz eadzVar) {
        eadz eadzVar2 = eaepVar.a.a;
        return eadzVar2.b.equals(eadzVar.b) && eadzVar2.c == eadzVar.c && eadzVar2.a.equals(eadzVar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x014d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef A[Catch: IOException -> 0x01d7, TryCatch #0 {IOException -> 0x01d7, blocks: (B:12:0x004b, B:24:0x006b, B:64:0x00d5, B:67:0x00dc, B:70:0x00e5, B:72:0x00ef, B:76:0x00f8, B:78:0x0108, B:80:0x0116, B:86:0x0129, B:82:0x011e, B:84:0x0124, B:87:0x0138, B:89:0x013e, B:90:0x0143, B:26:0x006f, B:29:0x0076, B:32:0x007d, B:34:0x0081, B:37:0x0086, B:40:0x008d, B:42:0x0092, B:44:0x0099, B:47:0x00a2, B:48:0x00a9, B:43:0x0095, B:49:0x00aa, B:51:0x00ae, B:54:0x00b3, B:56:0x00bc, B:59:0x00c4, B:61:0x00cc), top: B:139:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8 A[Catch: IOException -> 0x01d7, TryCatch #0 {IOException -> 0x01d7, blocks: (B:12:0x004b, B:24:0x006b, B:64:0x00d5, B:67:0x00dc, B:70:0x00e5, B:72:0x00ef, B:76:0x00f8, B:78:0x0108, B:80:0x0116, B:86:0x0129, B:82:0x011e, B:84:0x0124, B:87:0x0138, B:89:0x013e, B:90:0x0143, B:26:0x006f, B:29:0x0076, B:32:0x007d, B:34:0x0081, B:37:0x0086, B:40:0x008d, B:42:0x0092, B:44:0x0099, B:47:0x00a2, B:48:0x00a9, B:43:0x0095, B:49:0x00aa, B:51:0x00ae, B:54:0x00b3, B:56:0x00bc, B:59:0x00c4, B:61:0x00cc), top: B:139:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    @Override // defpackage.eaea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eaep a(defpackage.eafv r15) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eafy.a(eafv):eaep");
    }
}
