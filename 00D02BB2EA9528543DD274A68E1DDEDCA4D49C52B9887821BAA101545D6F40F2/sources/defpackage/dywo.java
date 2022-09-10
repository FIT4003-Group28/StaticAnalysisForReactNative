package defpackage;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: PG */
/* renamed from: dywo  reason: default package */
/* loaded from: classes6.dex */
final class dywo implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ dyvy b;
    final /* synthetic */ dyym c;
    final /* synthetic */ dywr d;

    public dywo(dywr dywrVar, CountDownLatch countDownLatch, dyvy dyvyVar, dyym dyymVar) {
        this.d = dywrVar;
        this.a = countDownLatch;
        this.b = dyvyVar;
        this.c = dyymVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eajb eajbVar;
        eajb eajbVar2;
        eajb eajbVar3;
        Throwable th;
        Exception exc;
        eajb eajbVar4;
        dyjc dyjcVar;
        dywr dywrVar;
        dywq dywqVar;
        dywr dywrVar2;
        dyge dygeVar;
        Socket createSocket;
        eajy h;
        eaja b;
        dxij dxijVar;
        String hostName;
        Socket socket;
        String lowerCase;
        Socket socket2;
        int i;
        boolean z;
        SSLSession sSLSession;
        SSLSocket sSLSocket;
        try {
            this.a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        eajb a = eajl.a(new dywn());
        try {
            try {
                dywrVar2 = this.d;
                dygeVar = dywrVar2.E;
            } catch (Throwable th2) {
                th = th2;
                dywr dywrVar3 = this.d;
                dywrVar3.n = new dywq(dywrVar3, this.c.e(a));
                throw th;
            }
        } catch (dyjc e) {
            e = e;
            eajbVar3 = a;
        } catch (Exception e2) {
            e = e2;
            eajbVar2 = a;
        } catch (Throwable th3) {
            th = th3;
            eajbVar = a;
        }
        try {
            try {
                if (dygeVar == null) {
                    socket2 = dywrVar2.s.createSocket(dywrVar2.b.getAddress(), this.d.b.getPort());
                } else {
                    SocketAddress socketAddress = dygeVar.a;
                    if (!(socketAddress instanceof InetSocketAddress)) {
                        dyjb dyjbVar = dyjb.l;
                        String valueOf = String.valueOf(this.d.E.a.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        sb.append("Unsupported SocketAddress implementation ");
                        sb.append(valueOf);
                        throw dyjbVar.g(sb.toString()).l();
                    }
                    InetSocketAddress inetSocketAddress = dygeVar.b;
                    String str = dygeVar.c;
                    String str2 = dygeVar.d;
                    try {
                        createSocket = ((InetSocketAddress) socketAddress).getAddress() != null ? dywrVar2.s.createSocket(((InetSocketAddress) socketAddress).getAddress(), ((InetSocketAddress) socketAddress).getPort()) : dywrVar2.s.createSocket(((InetSocketAddress) socketAddress).getHostName(), ((InetSocketAddress) socketAddress).getPort());
                        createSocket.setTcpNoDelay(true);
                        h = eajl.h(createSocket);
                        b = eajl.b(eajl.d(createSocket));
                        dxijVar = new dxij();
                        dxijVar.a = "https";
                        hostName = inetSocketAddress.getHostName();
                    } catch (IOException e3) {
                        e = e3;
                    }
                    try {
                        if (hostName == null) {
                            throw new IllegalArgumentException("host == null");
                        }
                        String d = dxik.d(hostName, hostName.length(), false);
                        if (!d.startsWith("[") || !d.endsWith("]")) {
                            socket = createSocket;
                            try {
                                lowerCase = IDN.toASCII(d).toLowerCase(Locale.US);
                                if (!lowerCase.isEmpty()) {
                                    for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                                        char charAt = lowerCase.charAt(i2);
                                        if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException unused2) {
                            }
                            lowerCase = null;
                            break;
                        }
                        InetAddress b2 = dxij.b(d, d.length() - 1);
                        if (b2 == null) {
                            socket = createSocket;
                            lowerCase = null;
                            break;
                        }
                        byte[] address = b2.getAddress();
                        if (address.length != 16) {
                            throw new AssertionError();
                        }
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = -1;
                        while (i3 < address.length) {
                            eajb eajbVar5 = a;
                            int i6 = i3;
                            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                                i6 += 2;
                            }
                            int i7 = i6 - i3;
                            int i8 = i7 > i4 ? i7 : i4;
                            if (i7 > i4) {
                                i5 = i3;
                            }
                            i3 = i6 + 2;
                            a = eajbVar5;
                            i4 = i8;
                        }
                        eaiz eaizVar = new eaiz();
                        int i9 = 0;
                        while (i9 < address.length) {
                            Socket socket3 = createSocket;
                            int i10 = i5;
                            if (i9 == i10) {
                                eaizVar.M(58);
                                i9 += i4;
                                i = i4;
                                if (i9 == 16) {
                                    eaizVar.M(58);
                                }
                            } else {
                                i = i4;
                                if (i9 > 0) {
                                    eaizVar.M(58);
                                }
                                eaizVar.U(((address[i9] & 255) << 8) | (address[i9 + 1] & 255));
                                i9 += 2;
                            }
                            i4 = i;
                            i5 = i10;
                            createSocket = socket3;
                        }
                        socket = createSocket;
                        lowerCase = eaizVar.p();
                        if (lowerCase == null) {
                            throw new IllegalArgumentException(hostName.length() != 0 ? "unexpected host: ".concat(hostName) : new String("unexpected host: "));
                        }
                        dxijVar.d = lowerCase;
                        int port = inetSocketAddress.getPort();
                        if (port <= 0 || port > 65535) {
                            StringBuilder sb2 = new StringBuilder(28);
                            sb2.append("unexpected port: ");
                            sb2.append(port);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        dxijVar.e = port;
                        if (dxijVar.a == null) {
                            throw new IllegalStateException("scheme == null");
                        }
                        if (dxijVar.d == null) {
                            throw new IllegalStateException("host == null");
                        }
                        dxik dxikVar = new dxik(dxijVar);
                        dxim dximVar = new dxim();
                        dximVar.a = dxikVar;
                        String str3 = dxikVar.a;
                        int i11 = dxikVar.b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 12);
                        sb3.append(str3);
                        sb3.append(":");
                        sb3.append(i11);
                        dximVar.a("Host", sb3.toString());
                        dximVar.a("User-Agent", dywrVar2.d);
                        if (str != null && str2 != null) {
                            try {
                                StringBuilder sb4 = new StringBuilder(str.length() + 1 + str2.length());
                                sb4.append(str);
                                sb4.append(":");
                                sb4.append(str2);
                                String valueOf2 = String.valueOf(eajc.a(sb4.toString().getBytes("ISO-8859-1")).d());
                                dximVar.a("Proxy-Authorization", valueOf2.length() != 0 ? "Basic ".concat(valueOf2) : new String("Basic "));
                            } catch (UnsupportedEncodingException unused3) {
                                throw new AssertionError();
                            }
                        }
                        if (dximVar.a == null) {
                            throw new IllegalStateException("url == null");
                        }
                        dxin dxinVar = new dxin(dximVar);
                        dxik dxikVar2 = dxinVar.a;
                        b.W(String.format("CONNECT %s:%d HTTP/1.1", dxikVar2.a, Integer.valueOf(dxikVar2.b)));
                        b.W("\r\n");
                        int a2 = dxinVar.b.a();
                        for (int i12 = 0; i12 < a2; i12++) {
                            b.W(dxinVar.b.b(i12));
                            b.W(": ");
                            b.W(dxinVar.b.c(i12));
                            b.W("\r\n");
                        }
                        b.W("\r\n");
                        b.flush();
                        String h2 = dywr.h(h);
                        int i13 = 9;
                        if (h2.startsWith("HTTP/1.")) {
                            if (h2.length() >= 9 && h2.charAt(8) == ' ') {
                                int charAt2 = h2.charAt(7) - '0';
                                if (charAt2 == 0) {
                                    dxil dxilVar = dxil.HTTP_1_0;
                                } else if (charAt2 != 1) {
                                    String valueOf3 = String.valueOf(h2);
                                    throw new ProtocolException(valueOf3.length() != 0 ? "Unexpected status line: ".concat(valueOf3) : new String("Unexpected status line: "));
                                } else {
                                    dxil dxilVar2 = dxil.HTTP_1_0;
                                }
                            }
                            String valueOf4 = String.valueOf(h2);
                            throw new ProtocolException(valueOf4.length() != 0 ? "Unexpected status line: ".concat(valueOf4) : new String("Unexpected status line: "));
                        } else if (!h2.startsWith("ICY ")) {
                            String valueOf5 = String.valueOf(h2);
                            throw new ProtocolException(valueOf5.length() != 0 ? "Unexpected status line: ".concat(valueOf5) : new String("Unexpected status line: "));
                        } else {
                            dxil dxilVar3 = dxil.HTTP_1_0;
                            i13 = 4;
                        }
                        int i14 = i13 + 3;
                        if (h2.length() < i14) {
                            String valueOf6 = String.valueOf(h2);
                            throw new ProtocolException(valueOf6.length() != 0 ? "Unexpected status line: ".concat(valueOf6) : new String("Unexpected status line: "));
                        }
                        try {
                            int parseInt = Integer.parseInt(h2.substring(i13, i14));
                            String str4 = "";
                            if (h2.length() > i14) {
                                if (h2.charAt(i14) != ' ') {
                                    String valueOf7 = String.valueOf(h2);
                                    throw new ProtocolException(valueOf7.length() != 0 ? "Unexpected status line: ".concat(valueOf7) : new String("Unexpected status line: "));
                                }
                                str4 = h2.substring(i13 + 4);
                            }
                            do {
                            } while (!dywr.h(h).equals(""));
                            if (parseInt < 200 || parseInt >= 300) {
                                eaiz eaizVar2 = new eaiz();
                                try {
                                    socket.shutdownOutput();
                                    h.Te(eaizVar2, 1024L);
                                } catch (IOException e4) {
                                    String valueOf8 = String.valueOf(e4.toString());
                                    eaizVar2.V(valueOf8.length() != 0 ? "Unable to read body: ".concat(valueOf8) : new String("Unable to read body: "));
                                }
                                try {
                                    socket.close();
                                } catch (IOException unused4) {
                                }
                                throw dyjb.m.g(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(parseInt), str4, eaizVar2.p())).l();
                            }
                            socket2 = socket;
                        } catch (NumberFormatException unused5) {
                            String valueOf9 = String.valueOf(h2);
                            throw new ProtocolException(valueOf9.length() != 0 ? "Unexpected status line: ".concat(valueOf9) : new String("Unexpected status line: "));
                        }
                    } catch (IOException e5) {
                        e = e5;
                        throw dyjb.m.g("Failed trying to connect with proxy").f(e).l();
                    }
                }
                dywr dywrVar4 = this.d;
                SSLSocketFactory sSLSocketFactory = dywrVar4.t;
                if (sSLSocketFactory != null) {
                    URI e6 = dyow.e(dywrVar4.c);
                    String host = e6.getHost() != null ? e6.getHost() : dywrVar4.c;
                    dywr dywrVar5 = this.d;
                    URI e7 = dyow.e(dywrVar5.c);
                    SSLSocket a3 = dywy.a(sSLSocketFactory, socket2, host, e7.getPort() != -1 ? e7.getPort() : dywrVar5.b.getPort(), this.d.w);
                    sSLSession = a3.getSession();
                    z = true;
                    sSLSocket = a3;
                } else {
                    z = true;
                    sSLSession = null;
                    sSLSocket = socket2;
                }
                sSLSocket.setTcpNoDelay(z);
                eajbVar4 = eajl.a(eajl.h(sSLSocket));
                try {
                    dyvy dyvyVar = this.b;
                    eajx d2 = eajl.d(sSLSocket);
                    dbsk.m(dyvyVar.f == null, "AsyncSink's becomeConnected should only be called once.");
                    dyvyVar.f = d2;
                    dbsk.t(sSLSocket, "socket");
                    dyvyVar.g = sSLSocket;
                    dywr dywrVar6 = this.d;
                    dyej c = dywrVar6.o.c();
                    c.b(dygc.a, sSLSocket.getRemoteSocketAddress());
                    c.b(dygc.b, sSLSocket.getLocalSocketAddress());
                    c.b(dygc.c, sSLSession);
                    c.b(dyop.a, sSLSession == null ? dyiu.NONE : dyiu.PRIVACY_AND_INTEGRITY);
                    dywrVar6.o = c.a();
                    dywr dywrVar7 = this.d;
                    dywrVar7.n = new dywq(dywrVar7, this.c.e(eajbVar4));
                    synchronized (this.d.j) {
                        dbsk.t(sSLSocket, "socket");
                        if (sSLSession != null) {
                            new dygi(sSLSession);
                        }
                    }
                } catch (dyjc e8) {
                    dyjcVar = e8;
                    this.d.m(0, dyxw.INTERNAL_ERROR, dyjcVar.a);
                    dywrVar = this.d;
                    dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
                    dywrVar.n = dywqVar;
                } catch (Exception e9) {
                    exc = e9;
                    this.d.a(exc);
                    dywrVar = this.d;
                    dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
                    dywrVar.n = dywqVar;
                }
            } catch (dyjc e10) {
                e = e10;
                dyjcVar = e;
                eajbVar4 = eajbVar3;
                this.d.m(0, dyxw.INTERNAL_ERROR, dyjcVar.a);
                dywrVar = this.d;
                dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
                dywrVar.n = dywqVar;
            } catch (Exception e11) {
                e = e11;
                exc = e;
                eajbVar4 = eajbVar2;
                this.d.a(exc);
                dywrVar = this.d;
                dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
                dywrVar.n = dywqVar;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                a = eajbVar;
                dywr dywrVar32 = this.d;
                dywrVar32.n = new dywq(dywrVar32, this.c.e(a));
                throw th;
            }
        } catch (dyjc e12) {
            dyjcVar = e12;
            eajbVar3 = a;
            eajbVar4 = eajbVar3;
            this.d.m(0, dyxw.INTERNAL_ERROR, dyjcVar.a);
            dywrVar = this.d;
            dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
            dywrVar.n = dywqVar;
        } catch (Exception e13) {
            exc = e13;
            eajbVar2 = a;
            eajbVar4 = eajbVar2;
            this.d.a(exc);
            dywrVar = this.d;
            dywqVar = new dywq(dywrVar, this.c.e(eajbVar4));
            dywrVar.n = dywqVar;
        } catch (Throwable th5) {
            th = th5;
            eajbVar = a;
            a = eajbVar;
            dywr dywrVar322 = this.d;
            dywrVar322.n = new dywq(dywrVar322, this.c.e(a));
            throw th;
        }
    }
}
