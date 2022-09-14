package okhttp3.internal.connection;

import b.a.a.a.a.b.a;
import c.d;
import c.e;
import c.l;
import c.t;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
/* loaded from: classes.dex */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private d sink;
    private Socket socket;
    private e source;
    public int successCount;
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    public long idleAtNanos = Long.MAX_VALUE;

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.connectionPool = connectionPool;
        this.route = route;
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j) {
        RealConnection realConnection = new RealConnection(connectionPool, route);
        realConnection.socket = socket;
        realConnection.idleAtNanos = j;
        return realConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: IOException -> 0x009e, TryCatch #1 {IOException -> 0x009e, blocks: (B:17:0x0077, B:19:0x007f, B:21:0x0086, B:20:0x0083), top: B:44:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[Catch: IOException -> 0x009e, TryCatch #1 {IOException -> 0x009e, blocks: (B:17:0x0077, B:19:0x007f, B:21:0x0086, B:20:0x0083), top: B:44:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void connect(int r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            okhttp3.Protocol r0 = r5.protocol
            if (r0 == 0) goto Lc
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "already connected"
            r6.<init>(r7)
            throw r6
        Lc:
            okhttp3.Route r0 = r5.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r1 = new okhttp3.internal.connection.ConnectionSpecSelector
            r1.<init>(r0)
            okhttp3.Route r2 = r5.route
            okhttp3.Address r2 = r2.address()
            javax.net.ssl.SSLSocketFactory r2 = r2.sslSocketFactory()
            if (r2 != 0) goto L75
            okhttp3.ConnectionSpec r2 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L3c
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.String r8 = "CLEARTEXT communication not enabled for client"
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L3c:
            okhttp3.Route r0 = r5.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform r2 = okhttp3.internal.platform.Platform.get()
            boolean r2 = r2.isCleartextTrafficPermitted(r0)
            if (r2 != 0) goto L75
            okhttp3.internal.connection.RouteException r6 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r7 = new java.net.UnknownServiceException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "CLEARTEXT communication to "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r9 = " not permitted by network security policy"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            r6.<init>(r7)
            throw r6
        L75:
            r0 = 0
            r2 = r0
        L77:
            okhttp3.Route r3 = r5.route     // Catch: java.io.IOException -> L9e
            boolean r3 = r3.requiresTunnel()     // Catch: java.io.IOException -> L9e
            if (r3 == 0) goto L83
            r5.connectTunnel(r6, r7, r8)     // Catch: java.io.IOException -> L9e
            goto L86
        L83:
            r5.connectSocket(r6, r7)     // Catch: java.io.IOException -> L9e
        L86:
            r5.establishProtocol(r1)     // Catch: java.io.IOException -> L9e
            okhttp3.internal.http2.Http2Connection r6 = r5.http2Connection
            if (r6 == 0) goto L9d
            okhttp3.ConnectionPool r6 = r5.connectionPool
            monitor-enter(r6)
            okhttp3.internal.http2.Http2Connection r7 = r5.http2Connection     // Catch: java.lang.Throwable -> L9a
            int r7 = r7.maxConcurrentStreams()     // Catch: java.lang.Throwable -> L9a
            r5.allocationLimit = r7     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L9a
            throw r7
        L9d:
            return
        L9e:
            r3 = move-exception
            java.net.Socket r4 = r5.socket
            okhttp3.internal.Util.closeQuietly(r4)
            java.net.Socket r4 = r5.rawSocket
            okhttp3.internal.Util.closeQuietly(r4)
            r5.socket = r0
            r5.rawSocket = r0
            r5.source = r0
            r5.sink = r0
            r5.handshake = r0
            r5.protocol = r0
            r5.http2Connection = r0
            if (r2 != 0) goto Lbf
            okhttp3.internal.connection.RouteException r2 = new okhttp3.internal.connection.RouteException
            r2.<init>(r3)
            goto Lc2
        Lbf:
            r2.addConnectException(r3)
        Lc2:
            if (r9 == 0) goto Lca
            boolean r3 = r1.connectionFailed(r3)
            if (r3 != 0) goto L77
        Lca:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, boolean):void");
    }

    private void connectTunnel(int i, int i2, int i3) {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (true) {
            i4++;
            if (i4 > 21) {
                throw new ProtocolException("Too many tunnel connections attempted: 21");
            }
            connectSocket(i, i2);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest == null) {
                return;
            }
            Util.closeQuietly(this.rawSocket);
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
        }
    }

    private void connectSocket(int i, int i2) {
        Proxy proxy = this.route.proxy();
        this.rawSocket = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? this.route.address().socketFactory().createSocket() : new Socket(proxy);
        this.rawSocket.setSoTimeout(i2);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i);
            this.source = l.a(l.b(this.rawSocket));
            this.sink = l.a(l.a(this.rawSocket));
        } catch (ConnectException e) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e);
            throw connectException;
        }
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector) {
        if (this.route.address().sslSocketFactory() == null) {
            this.protocol = Protocol.HTTP_1_1;
            this.socket = this.rawSocket;
            return;
        }
        connectTls(connectionSpecSelector);
        if (this.protocol != Protocol.HTTP_2) {
            return;
        }
        this.socket.setSoTimeout(0);
        this.http2Connection = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).build();
        this.http2Connection.start();
    }

    private void connectTls(ConnectionSpecSelector connectionSpecSelector) {
        SSLSocket sSLSocket;
        Address address = this.route.address();
        String str = null;
        try {
            try {
                sSLSocket = (SSLSocket) address.sslSocketFactory().createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            ConnectionSpec configureSecureSocket = connectionSpecSelector.configureSecureSocket(sSLSocket);
            if (configureSecureSocket.supportsTlsExtensions()) {
                Platform.get().configureTlsExtensions(sSLSocket, address.url().host(), address.protocols());
            }
            sSLSocket.startHandshake();
            Handshake handshake = Handshake.get(sSLSocket.getSession());
            if (!address.hostnameVerifier().verify(address.url().host(), sSLSocket.getSession())) {
                X509Certificate x509Certificate = (X509Certificate) handshake.peerCertificates().get(0);
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified:\n    certificate: " + CertificatePinner.pin(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + OkHostnameVerifier.allSubjectAltNames(x509Certificate));
            }
            address.certificatePinner().check(address.url().host(), handshake.peerCertificates());
            if (configureSecureSocket.supportsTlsExtensions()) {
                str = Platform.get().getSelectedProtocol(sSLSocket);
            }
            this.socket = sSLSocket;
            this.source = l.a(l.b(this.socket));
            this.sink = l.a(l.a(this.socket));
            this.handshake = handshake;
            this.protocol = str != null ? Protocol.get(str) : Protocol.HTTP_1_1;
            if (sSLSocket == null) {
                return;
            }
            Platform.get().afterHandshake(sSLSocket);
        } catch (AssertionError e2) {
            e = e2;
            if (!Util.isAndroidGetsocknameError(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                Platform.get().afterHandshake(sSLSocket);
            }
            Util.closeQuietly((Socket) sSLSocket);
            throw th;
        }
    }

    private Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) {
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers(), str);
            http1Codec.finishRequest();
            Response build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            t newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Api.BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code == 200) {
                if (this.source.b().e() && this.sink.b().e()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (code == 407) {
                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                if (authenticate == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
                if ("close".equalsIgnoreCase(build.header("Connection"))) {
                    return authenticate;
                }
                request = authenticate;
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + build.code());
            }
        }
    }

    private Request createTunnelRequest() {
        return new Request.Builder().url(this.route.address().url()).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header(a.HEADER_USER_AGENT, Version.userAgent()).build();
    }

    public boolean isEligible(Address address) {
        return this.allocations.size() < this.allocationLimit && address.equals(route().address()) && !this.noNewStreams;
    }

    public HttpCodec newCodec(OkHttpClient okHttpClient, StreamAllocation streamAllocation) {
        if (this.http2Connection != null) {
            return new Http2Codec(okHttpClient, streamAllocation, this.http2Connection);
        }
        this.socket.setSoTimeout(okHttpClient.readTimeoutMillis());
        this.source.timeout().timeout(okHttpClient.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout(okHttpClient.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    public RealWebSocket.Streams newWebSocketStreams(final StreamAllocation streamAllocation) {
        return new RealWebSocket.Streams(true, this.source, this.sink) { // from class: okhttp3.internal.connection.RealConnection.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                streamAllocation.streamFinished(true, streamAllocation.codec());
            }
        };
    }

    @Override // okhttp3.Connection
    public Route route() {
        return this.route;
    }

    public void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    @Override // okhttp3.Connection
    public Socket socket() {
        return this.socket;
    }

    public boolean isHealthy(boolean z) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        if (this.http2Connection != null) {
            return !this.http2Connection.isShutdown();
        }
        if (z) {
            try {
                int soTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    return !this.source.e();
                } finally {
                    this.socket.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public void onSettings(Http2Connection http2Connection) {
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    @Override // okhttp3.Connection
    public Handshake handshake() {
        return this.handshake;
    }

    public boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    @Override // okhttp3.Connection
    public Protocol protocol() {
        return this.protocol;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(":");
        sb.append(this.route.address().url().port());
        sb.append(", proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        sb.append(this.handshake != null ? this.handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }
}
