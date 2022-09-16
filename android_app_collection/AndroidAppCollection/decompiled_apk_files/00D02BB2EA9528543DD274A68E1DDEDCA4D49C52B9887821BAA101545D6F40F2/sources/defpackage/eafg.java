package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: eafg  reason: default package */
/* loaded from: classes6.dex */
public final class eafg extends eagy {
    public final eadj a;
    public final eaes b;
    public Socket c;
    public Socket d;
    public eadv e;
    public eaeh f;
    public eahe g;
    public eajb h;
    public eaja i;
    public boolean j;
    public int k;
    public int l = 1;
    public final List<Reference<eafm>> m = new ArrayList();
    public long n = Long.MAX_VALUE;

    public eafg(eadj eadjVar, eaes eaesVar) {
        this.a = eadjVar;
        this.b = eaesVar;
    }

    public final void a(eaff eaffVar) {
        boolean z;
        SSLSocket sSLSocket;
        eadl eadlVar;
        eaeh eaehVar;
        eacx eacxVar = this.b.a;
        SSLSocketFactory sSLSocketFactory = eacxVar.i;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            try {
                Socket socket = this.c;
                eadz eadzVar = eacxVar.a;
                z = true;
                sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, eadzVar.b, eadzVar.c, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i = eaffVar.b;
            int size = eaffVar.a.size();
            while (true) {
                if (i >= size) {
                    eadlVar = null;
                    break;
                }
                eadlVar = eaffVar.a.get(i);
                if (eadlVar.a(sSLSocket)) {
                    eaffVar.b = i + 1;
                    break;
                }
                i++;
            }
            if (eadlVar == null) {
                throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + eaffVar.d + ", modes=" + eaffVar.a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
            }
            int i2 = eaffVar.b;
            while (true) {
                if (i2 >= eaffVar.a.size()) {
                    z = false;
                    break;
                } else if (eaffVar.a.get(i2).a(sSLSocket)) {
                    break;
                } else {
                    i2++;
                }
            }
            eaffVar.c = z;
            boolean z2 = eaffVar.d;
            String[] i3 = eadlVar.e != null ? eafa.i(eadh.a, sSLSocket.getEnabledCipherSuites(), eadlVar.e) : sSLSocket.getEnabledCipherSuites();
            String[] i4 = eadlVar.f != null ? eafa.i(eafa.f, sSLSocket.getEnabledProtocols(), eadlVar.f) : sSLSocket.getEnabledProtocols();
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            int D = eafa.D(eadh.a, supportedCipherSuites);
            if (z2 && D != -1) {
                i3 = eafa.m(i3, supportedCipherSuites[D]);
            }
            eadk eadkVar = new eadk(eadlVar);
            eadkVar.b(i3);
            eadkVar.d(i4);
            eadl a = eadkVar.a();
            String[] strArr = a.f;
            if (strArr != null) {
                sSLSocket.setEnabledProtocols(strArr);
            }
            String[] strArr2 = a.e;
            if (strArr2 != null) {
                sSLSocket.setEnabledCipherSuites(strArr2);
            }
            if (eadlVar.d) {
                eaim.c.c(sSLSocket, eacxVar.a.b, eacxVar.e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            eadv a2 = eadv.a(session);
            if (!eacxVar.j.verify(eacxVar.a.b, session)) {
                X509Certificate x509Certificate = (X509Certificate) a2.b.get(0);
                StringBuilder sb = new StringBuilder();
                sb.append("Hostname ");
                sb.append(eacxVar.a.b);
                sb.append(" not verified:\n    certificate: ");
                sb.append(eadf.b(x509Certificate));
                sb.append("\n    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n    subjectAltNames: ");
                List<String> a3 = eair.a(x509Certificate, 7);
                List<String> a4 = eair.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a3.size() + a4.size());
                arrayList.addAll(a3);
                arrayList.addAll(a4);
                sb.append(arrayList);
                throw new SSLPeerUnverifiedException(sb.toString());
            }
            eacxVar.k.a(eacxVar.a.b, a2.b);
            if (eadlVar.d) {
                str = eaim.c.d(sSLSocket);
            }
            this.d = sSLSocket;
            this.h = eajl.a(eajl.h(sSLSocket));
            this.i = eajl.b(eajl.d(this.d));
            this.e = a2;
            if (str == null) {
                eaehVar = eaeh.HTTP_1_1;
            } else if (str.equals(eaeh.HTTP_1_0.g)) {
                eaehVar = eaeh.HTTP_1_0;
            } else if (str.equals(eaeh.HTTP_1_1.g)) {
                eaehVar = eaeh.HTTP_1_1;
            } else if (str.equals(eaeh.H2_PRIOR_KNOWLEDGE.g)) {
                eaehVar = eaeh.H2_PRIOR_KNOWLEDGE;
            } else if (str.equals(eaeh.HTTP_2.g)) {
                eaehVar = eaeh.HTTP_2;
            } else if (str.equals(eaeh.SPDY_3.g)) {
                eaehVar = eaeh.SPDY_3;
            } else if (!str.equals(eaeh.QUIC.g)) {
                throw new IOException("Unexpected protocol: " + str);
            } else {
                eaehVar = eaeh.QUIC;
            }
            this.f = eaehVar;
            if (sSLSocket == null) {
                return;
            }
            eaim.c.q(sSLSocket);
        } catch (AssertionError e2) {
            e = e2;
            if (!eafa.l(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                eaim.c.q(sSLSocket2);
            }
            eafa.c(sSLSocket2);
            throw th;
        }
    }

    public final boolean b(eacx eacxVar, @dzsi eaes eaesVar) {
        if (this.m.size() < this.l && !this.j && this.b.a.a(eacxVar)) {
            if (eacxVar.a.b.equals(this.b.a.a.b)) {
                return true;
            }
            if (this.g != null && eaesVar != null && eaesVar.b.type() == Proxy.Type.DIRECT && this.b.b.type() == Proxy.Type.DIRECT && this.b.c.equals(eaesVar.c) && eaesVar.a.j == eair.a && c(eacxVar.a)) {
                try {
                    eacxVar.k.a(eacxVar.a.b, this.e.b);
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                }
            }
        }
        return false;
    }

    public final boolean c(eadz eadzVar) {
        int i = eadzVar.c;
        eadz eadzVar2 = this.b.a.a;
        if (i == eadzVar2.c) {
            if (eadzVar.b.equals(eadzVar2.b)) {
                return true;
            }
            eadv eadvVar = this.e;
            return eadvVar != null && eair.b(eadzVar.b, (X509Certificate) eadvVar.b.get(0));
        }
        return false;
    }

    public final void d() {
        eafa.c(this.c);
    }

    public final boolean e(boolean z) {
        if (this.d.isClosed() || this.d.isInputShutdown() || this.d.isOutputShutdown()) {
            return false;
        }
        eahe eaheVar = this.g;
        if (eaheVar != null) {
            return !eaheVar.i();
        }
        if (z) {
            try {
                int soTimeout = this.d.getSoTimeout();
                try {
                    this.d.setSoTimeout(1);
                    return !this.h.c();
                } finally {
                    this.d.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eagy
    public final void f(eahl eahlVar) {
        eahlVar.j(8);
    }

    @Override // defpackage.eagy
    public final void g(eahe eaheVar) {
        synchronized (this.a) {
            this.l = eaheVar.c();
        }
    }

    public final boolean h() {
        return this.g != null;
    }

    public final void i(int i, int i2) {
        Socket createSocket;
        eaes eaesVar = this.b;
        Proxy proxy = eaesVar.b;
        eacx eacxVar = eaesVar.a;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            createSocket = eacxVar.c.createSocket();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        InetSocketAddress inetSocketAddress = this.b.c;
        this.c.setSoTimeout(i2);
        try {
            eaim.c.a(this.c, this.b.c, i);
            try {
                this.h = eajl.a(eajl.h(this.c));
                this.i = eajl.b(eajl.d(this.c));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j() {
        this.d.setSoTimeout(0);
        eagw eagwVar = new eagw();
        Socket socket = this.d;
        String str = this.b.a.a.b;
        eajb eajbVar = this.h;
        eaja eajaVar = this.i;
        eagwVar.a = socket;
        eagwVar.b = str;
        eagwVar.c = eajbVar;
        eagwVar.d = eajaVar;
        eagwVar.e = this;
        eahe eaheVar = new eahe(eagwVar);
        this.g = eaheVar;
        eaheVar.q.a();
        eaheVar.q.e(eaheVar.m);
        int d = eaheVar.m.d();
        if (d != 65535) {
            eaheVar.q.g(0, d - 65535);
        }
        new Thread(eaheVar.r).start();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.b.a.a.b);
        sb.append(":");
        sb.append(this.b.a.a.c);
        sb.append(", proxy=");
        sb.append(this.b.b);
        sb.append(" hostAddress=");
        sb.append(this.b.c);
        sb.append(" cipherSuite=");
        eadv eadvVar = this.e;
        sb.append(eadvVar != null ? eadvVar.a : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
