package b.a.a.a.a.e;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: HttpRequest.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f1171b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    private static b f1172c = b.f1180a;

    /* renamed from: a  reason: collision with root package name */
    public final URL f1173a;
    private final String e;
    private e f;
    private boolean g;
    private String k;
    private int l;

    /* renamed from: d  reason: collision with root package name */
    private HttpURLConnection f1174d = null;
    private boolean h = true;
    private boolean i = false;
    private int j = PKIFailureInfo.certRevoked;

    /* compiled from: HttpRequest.java */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1180a = new b() { // from class: b.a.a.a.a.e.d.b.1
            @Override // b.a.a.a.a.e.d.b
            public HttpURLConnection a(URL url) {
                return (HttpURLConnection) url.openConnection();
            }

            @Override // b.a.a.a.a.e.d.b
            public HttpURLConnection a(URL url, Proxy proxy) {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection a(URL url);

        HttpURLConnection a(URL url, Proxy proxy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    private static StringBuilder a(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    private static StringBuilder b(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    /* compiled from: HttpRequest.java */
    /* loaded from: classes.dex */
    public static class c extends RuntimeException {
        protected c(IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: HttpRequest.java */
    /* renamed from: b.a.a.a.a.e.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractCallableC0028d<V> implements Callable<V> {
        protected abstract V b();

        protected abstract void c();

        protected AbstractCallableC0028d() {
        }

        @Override // java.util.concurrent.Callable
        public V call() {
            Throwable th;
            boolean z = true;
            try {
                try {
                    V b2 = b();
                    try {
                        c();
                        return b2;
                    } catch (IOException e) {
                        throw new c(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        c();
                    } catch (IOException e2) {
                        if (!z) {
                            throw new c(e2);
                        }
                    }
                    throw th;
                }
            } catch (c e3) {
                throw e3;
            } catch (IOException e4) {
                throw new c(e4);
            } catch (Throwable th3) {
                th = th3;
                z = false;
                c();
                throw th;
            }
        }
    }

    /* compiled from: HttpRequest.java */
    /* loaded from: classes.dex */
    protected static abstract class a<V> extends AbstractCallableC0028d<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Closeable f1178a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1179b;

        protected a(Closeable closeable, boolean z) {
            this.f1178a = closeable;
            this.f1179b = z;
        }

        @Override // b.a.a.a.a.e.d.AbstractCallableC0028d
        protected void c() {
            if (this.f1178a instanceof Flushable) {
                ((Flushable) this.f1178a).flush();
            }
            if (this.f1179b) {
                try {
                    this.f1178a.close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            this.f1178a.close();
        }
    }

    /* compiled from: HttpRequest.java */
    /* loaded from: classes.dex */
    public static class e extends BufferedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        private final CharsetEncoder f1181a;

        public e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f1181a = Charset.forName(d.f(str)).newEncoder();
        }

        public e a(String str) {
            ByteBuffer encode = this.f1181a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public static String a(CharSequence charSequence) {
        int port;
        int i;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            if (url.getPort() != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace("+", "%2B");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new c(iOException);
            }
        } catch (IOException e3) {
            throw new c(e3);
        }
    }

    public static String a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        a(charSequence2, sb);
        b(charSequence2, sb);
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry<?, ?> next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry<?, ?> next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    public static d b(CharSequence charSequence) {
        return new d(charSequence, "GET");
    }

    public static d a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a2 = a(charSequence, map);
        if (z) {
            a2 = a((CharSequence) a2);
        }
        return b((CharSequence) a2);
    }

    public static d c(CharSequence charSequence) {
        return new d(charSequence, "POST");
    }

    public static d b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String a2 = a(charSequence, map);
        if (z) {
            a2 = a((CharSequence) a2);
        }
        return c((CharSequence) a2);
    }

    public static d d(CharSequence charSequence) {
        return new d(charSequence, "PUT");
    }

    public static d e(CharSequence charSequence) {
        return new d(charSequence, "DELETE");
    }

    public d(CharSequence charSequence, String str) {
        try {
            this.f1173a = new URL(charSequence.toString());
            this.e = str;
        } catch (MalformedURLException e2) {
            throw new c(e2);
        }
    }

    private Proxy q() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.k, this.l));
    }

    private HttpURLConnection r() {
        HttpURLConnection a2;
        try {
            if (this.k != null) {
                a2 = f1172c.a(this.f1173a, q());
            } else {
                a2 = f1172c.a(this.f1173a);
            }
            a2.setRequestMethod(this.e);
            return a2;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public String toString() {
        return p() + ' ' + o();
    }

    public HttpURLConnection a() {
        if (this.f1174d == null) {
            this.f1174d = r();
        }
        return this.f1174d;
    }

    public int b() {
        try {
            k();
            return a().getResponseCode();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public boolean c() {
        return 200 == b();
    }

    protected ByteArrayOutputStream d() {
        int j = j();
        if (j > 0) {
            return new ByteArrayOutputStream(j);
        }
        return new ByteArrayOutputStream();
    }

    public String a(String str) {
        ByteArrayOutputStream d2 = d();
        try {
            a(f(), d2);
            return d2.toString(f(str));
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public String e() {
        return a(h());
    }

    public BufferedInputStream f() {
        return new BufferedInputStream(g(), this.j);
    }

    public InputStream g() {
        InputStream inputStream;
        if (b() < 400) {
            try {
                inputStream = a().getInputStream();
            } catch (IOException e2) {
                throw new c(e2);
            }
        } else {
            inputStream = a().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = a().getInputStream();
                } catch (IOException e3) {
                    throw new c(e3);
                }
            }
        }
        if (!this.i || !"gzip".equals(i())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e4) {
            throw new c(e4);
        }
    }

    public d a(int i) {
        a().setConnectTimeout(i);
        return this;
    }

    public d a(String str, String str2) {
        a().setRequestProperty(str, str2);
        return this;
    }

    public d a(Map.Entry<String, String> entry) {
        return a(entry.getKey(), entry.getValue());
    }

    public String b(String str) {
        l();
        return a().getHeaderField(str);
    }

    public int c(String str) {
        return a(str, -1);
    }

    public int a(String str, int i) {
        l();
        return a().getHeaderFieldInt(str, i);
    }

    public String b(String str, String str2) {
        return c(b(str), str2);
    }

    protected String c(String str, String str2) {
        String trim;
        int length;
        if (str == null || str.length() == 0) {
            return null;
        }
        int length2 = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length2) {
            return null;
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = length2;
        }
        while (indexOf < indexOf2) {
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 != -1 && indexOf3 < indexOf2 && str2.equals(str.substring(indexOf, indexOf3).trim()) && (length = (trim = str.substring(indexOf3 + 1, indexOf2).trim()).length()) != 0) {
                if (length > 2 && '\"' == trim.charAt(0)) {
                    int i = length - 1;
                    if ('\"' == trim.charAt(i)) {
                        return trim.substring(1, i);
                    }
                }
                return trim;
            }
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(59, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = length2;
            }
        }
        return null;
    }

    public String h() {
        return b("Content-Type", "charset");
    }

    public d a(boolean z) {
        a().setUseCaches(z);
        return this;
    }

    public String i() {
        return b("Content-Encoding");
    }

    public d d(String str) {
        return d(str, null);
    }

    public d d(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            return a("Content-Type", str + "; charset=" + str2);
        }
        return a("Content-Type", str);
    }

    public int j() {
        return c("Content-Length");
    }

    protected d a(final InputStream inputStream, final OutputStream outputStream) {
        return new a<d>(inputStream, this.h) { // from class: b.a.a.a.a.e.d.1
            @Override // b.a.a.a.a.e.d.AbstractCallableC0028d
            /* renamed from: a */
            public d b() {
                byte[] bArr = new byte[d.this.j];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        return d.this;
                    }
                }
            }
        }.call();
    }

    protected d k() {
        if (this.f == null) {
            return this;
        }
        if (this.g) {
            this.f.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.h) {
            try {
                this.f.close();
            } catch (IOException unused) {
            }
        } else {
            this.f.close();
        }
        this.f = null;
        return this;
    }

    protected d l() {
        try {
            return k();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    protected d m() {
        if (this.f != null) {
            return this;
        }
        a().setDoOutput(true);
        this.f = new e(a().getOutputStream(), c(a().getRequestProperty("Content-Type"), "charset"), this.j);
        return this;
    }

    protected d n() {
        if (!this.g) {
            this.g = true;
            d("multipart/form-data; boundary=00content0boundary00").m();
            this.f.a("--00content0boundary00\r\n");
        } else {
            this.f.a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    protected d a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        f("Content-Disposition", sb.toString());
        if (str3 != null) {
            f("Content-Type", str3);
        }
        return f("\r\n");
    }

    public d e(String str, String str2) {
        return b(str, (String) null, str2);
    }

    public d b(String str, String str2, String str3) {
        return a(str, str2, (String) null, str3);
    }

    public d a(String str, String str2, String str3, String str4) {
        try {
            n();
            a(str, str2, str3);
            this.f.a(str4);
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public d a(String str, Number number) {
        return a(str, (String) null, number);
    }

    public d a(String str, String str2, Number number) {
        return b(str, str2, number != null ? number.toString() : null);
    }

    public d a(String str, String str2, String str3, File file) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            d a2 = a(str, str2, str3, bufferedInputStream);
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a2;
        } catch (IOException e3) {
            e = e3;
            throw new c(e);
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public d a(String str, String str2, String str3, InputStream inputStream) {
        try {
            n();
            a(str, str2, str3);
            a(inputStream, this.f);
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public d f(String str, String str2) {
        return f((CharSequence) str).f(": ").f((CharSequence) str2).f("\r\n");
    }

    public d f(CharSequence charSequence) {
        try {
            m();
            this.f.a(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public URL o() {
        return a().getURL();
    }

    public String p() {
        return a().getRequestMethod();
    }
}
