package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: eahy  reason: default package */
/* loaded from: classes6.dex */
public final class eahy extends HttpURLConnection implements eadd {
    public static final String a;
    public static final String b;
    private static final Set<String> j;
    eaee c;
    eadc d;
    public final Object e;
    eaep f;
    boolean g;
    Proxy h;
    eadv i;
    private final eahv k;
    private final eadw l;
    private boolean m;
    private eadx n;
    private long o;
    private eaep p;
    private Throwable q;

    static {
        StringBuilder sb = new StringBuilder();
        eaim eaimVar = eaim.c;
        sb.append("OkHttp");
        sb.append("-Selected-Protocol");
        a = sb.toString();
        b = "OkHttp-Response-Source";
        j = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));
    }

    public eahy(URL url, eaee eaeeVar) {
        super(url);
        this.k = new eahv(this);
        this.l = new eadw();
        this.o = -1L;
        this.e = new Object();
        this.g = true;
        this.c = eaeeVar;
    }

    private final eadx d() {
        String str;
        if (this.n == null) {
            eaep f = f(true);
            eadw e = f.f.e();
            e.f(a, f.b.g);
            String str2 = b;
            if (f.h == null) {
                if (f.i == null) {
                    str = "NONE";
                } else {
                    str = "CACHE " + f.c;
                }
            } else if (f.i == null) {
                str = "NETWORK " + f.c;
            } else {
                str = "CONDITIONAL_CACHE " + f.h.c;
            }
            e.f(str2, str);
            this.n = e.b();
        }
        return this.n;
    }

    private final eadc e() {
        eaib eaibVar;
        eadc eadcVar = this.d;
        if (eadcVar != null) {
            return eadcVar;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!eafu.a(this.method)) {
                throw new ProtocolException(this.method + " does not support writing");
            }
        }
        if (this.l.a("User-Agent") == null) {
            eadw eadwVar = this.l;
            String property = System.getProperty("http.agent");
            if (property != null) {
                int length = property.length();
                int i = 0;
                while (i < length) {
                    int codePointAt = property.codePointAt(i);
                    if (codePointAt > 31 && codePointAt < 127) {
                        i += Character.charCount(codePointAt);
                    } else {
                        eaiz eaizVar = new eaiz();
                        eaizVar.R(property, 0, i);
                        eaizVar.S(63);
                        while (true) {
                            i += Character.charCount(codePointAt);
                            if (i >= length) {
                                break;
                            }
                            codePointAt = property.codePointAt(i);
                            eaizVar.S((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                        }
                        property = eaizVar.p();
                    }
                }
            } else {
                property = "okhttp/3.12.0";
            }
            eadwVar.f("User-Agent", property);
        }
        if (eafu.a(this.method)) {
            if (this.l.a("Content-Type") == null) {
                this.l.f("Content-Type", "application/x-www-form-urlencoded");
            }
            long j2 = -1;
            if (this.o == -1 && this.chunkLength <= 0) {
                z = false;
            }
            String a2 = this.l.a("Content-Length");
            long j3 = this.o;
            if (j3 != -1) {
                j2 = j3;
            } else if (a2 != null) {
                j2 = Long.parseLong(a2);
            }
            if (z) {
                eaibVar = new eaic(j2);
            } else {
                eaibVar = new eaht(j2);
            }
            eaibVar.c.l(this.c.x, TimeUnit.MILLISECONDS);
        } else {
            eaibVar = null;
        }
        try {
            String url = getURL().toString();
            eady eadyVar = new eady();
            eadyVar.e(null, url);
            eadz b2 = eadyVar.b();
            eael eaelVar = new eael();
            eaelVar.a = b2;
            eaelVar.c(this.l.b());
            eaelVar.d(this.method, eaibVar);
            eaem a3 = eaelVar.a();
            eaed a4 = this.c.a();
            a4.e.clear();
            a4.e.add(eahx.a);
            a4.f.clear();
            a4.f.add(this.k);
            a4.a = new eadp(this.c.c.a());
            getUseCaches();
            eaek h = eaek.h(a4.a(), a3);
            this.d = h;
            return h;
        } catch (IllegalArgumentException e) {
            if (e.getMessage().startsWith("Invalid URL host")) {
                UnknownHostException unknownHostException = new UnknownHostException();
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private final eaep f(boolean z) {
        eaep eaepVar;
        synchronized (this.e) {
            eaep eaepVar2 = this.p;
            if (eaepVar2 != null) {
                return eaepVar2;
            }
            Throwable th = this.q;
            if (th != null) {
                if (z && (eaepVar = this.f) != null) {
                    return eaepVar;
                }
                throw g(th);
            }
            eadc e = e();
            this.k.b();
            eaen eaenVar = e.a().d;
            if (eaenVar != null) {
                ((eaib) eaenVar).d.close();
            }
            if (this.m) {
                synchronized (this.e) {
                    while (this.p == null && this.q == null) {
                        try {
                            try {
                                this.e.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        } finally {
                        }
                    }
                }
            } else {
                this.m = true;
                try {
                    b(e.b());
                } catch (IOException e2) {
                    a(e2);
                }
            }
            synchronized (this.e) {
                Throwable th2 = this.q;
                if (th2 == null) {
                    eaep eaepVar3 = this.p;
                    if (eaepVar3 == null) {
                        throw new AssertionError();
                    }
                    return eaepVar3;
                }
                throw g(th2);
            }
        }
    }

    private static IOException g(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new AssertionError();
        }
        throw ((RuntimeException) th);
    }

    @Override // defpackage.eadd
    public final void a(IOException iOException) {
        synchronized (this.e) {
            boolean z = iOException instanceof eahx;
            Throwable th = iOException;
            if (z) {
                th = iOException.getCause();
            }
            this.q = th;
            this.e.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                eaim eaimVar = eaim.c;
                eaimVar.e(5, "Ignoring header " + str + " because its value was null.", null);
                return;
            }
            this.l.f(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot add request property after connection is made");
    }

    @Override // defpackage.eadd
    public final void b(eaep eaepVar) {
        synchronized (this.e) {
            this.p = eaepVar;
            this.i = eaepVar.e;
            this.url = eaepVar.a.a.a();
            this.e.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void connect() {
        if (this.m) {
            return;
        }
        eadc e = e();
        this.m = true;
        e.c(this);
        synchronized (this.e) {
            while (this.g && this.p == null && this.q == null) {
                try {
                    this.e.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            Throwable th = this.q;
            if (th != null) {
                throw g(th);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.d == null) {
            return;
        }
        this.k.b();
        this.d.d();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.c.v;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            eaep f = f(true);
            if (eaft.c(f) && f.c >= 400) {
                return f.g.c();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        try {
            eadx d = d();
            if (i >= 0 && i < d.b()) {
                return d.d(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        try {
            eadx d = d();
            if (i >= 0 && i < d.b()) {
                return d.c(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        try {
            return eaew.a(d(), eafz.a(f(true)).toString());
        } catch (IOException unused) {
            return Collections.emptyMap();
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        eaep f = f(false);
        if (f.c >= 400) {
            throw new FileNotFoundException(this.url.toString());
        }
        return f.g.c();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.c.t;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        eaen eaenVar = e().a().d;
        if (eaenVar == null) {
            throw new ProtocolException("method does not support a request body: " + this.method);
        }
        if (eaenVar instanceof eaic) {
            connect();
            this.k.b();
        }
        eaib eaibVar = (eaib) eaenVar;
        if (eaibVar.e) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return eaibVar.d;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        int f;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            f = url.getPort();
        } else {
            f = eadz.f(url.getProtocol());
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.c.d.address();
            host = inetSocketAddress.getHostName();
            f = inetSocketAddress.getPort();
        }
        return new SocketPermission(host + ":" + f, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.c.w;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return eaew.a(this.l.b(), null);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.l.a(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).c;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return f(true).d;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        eaed a2 = this.c.a();
        a2.b(i, TimeUnit.MILLISECONDS);
        this.c = a2.a();
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        super.setIfModifiedSince(j2);
        if (this.ifModifiedSince != 0) {
            this.l.e("If-Modified-Since", eafs.a(new Date(this.ifModifiedSince)));
        } else {
            this.l.d("If-Modified-Since");
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        eaed a2 = this.c.a();
        a2.r = z;
        this.c = a2.a();
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        eaed a2 = this.c.a();
        a2.c(i, TimeUnit.MILLISECONDS);
        this.c = a2.a();
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        Set<String> set = j;
        if (set.contains(str)) {
            this.method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + set + " but was " + str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (!this.connected) {
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                eaim eaimVar = eaim.c;
                eaimVar.e(5, "Ignoring header " + str + " because its value was null.", null);
                return;
            }
            this.l.e(str, str2);
            return;
        }
        throw new IllegalStateException("Cannot set request property after connection is made");
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.h != null) {
            return true;
        }
        Proxy proxy = this.c.d;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j2 >= 0) {
            this.o = j2;
            ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j2, 2147483647L);
            return;
        }
        throw new IllegalArgumentException("contentLength < 0");
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return eafz.a(f(true)).toString();
            }
            return d().a(str);
        } catch (IOException unused) {
            return null;
        }
    }
}
