package okhttp3;

import c.c;
import c.d;
import c.e;
import c.f;
import c.g;
import c.h;
import c.l;
import c.s;
import c.t;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
/* loaded from: classes.dex */
public final class Cache implements Closeable, Flushable {
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    final DiskLruCache cache;
    private int hitCount;
    final InternalCache internalCache;
    private int networkCount;
    private int requestCount;
    int writeAbortCount;
    int writeSuccessCount;

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    Cache(File file, long j, FileSystem fileSystem) {
        this.internalCache = new InternalCache() { // from class: okhttp3.Cache.1
            @Override // okhttp3.internal.cache.InternalCache
            public Response get(Request request) {
                return Cache.this.get(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public CacheRequest put(Response response) {
                return Cache.this.put(response);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void remove(Request request) {
                Cache.this.remove(request);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void update(Response response, Response response2) {
                Cache.this.update(response, response2);
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackConditionalCacheHit() {
                Cache.this.trackConditionalCacheHit();
            }

            @Override // okhttp3.internal.cache.InternalCache
            public void trackResponse(CacheStrategy cacheStrategy) {
                Cache.this.trackResponse(cacheStrategy);
            }
        };
        this.cache = DiskLruCache.create(fileSystem, file, VERSION, 2, j);
    }

    public static String key(HttpUrl httpUrl) {
        return f.a(httpUrl.toString()).c().f();
    }

    Response get(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (entry.matches(request, response)) {
                    return response;
                }
                Util.closeQuietly(response.body());
                return null;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    CacheRequest put(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.invalidatesCache(response.request().method())) {
            try {
                remove(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || HttpHeaders.hasVaryAll(response)) {
            return null;
        } else {
            Entry entry = new Entry(response);
            try {
                editor = this.cache.edit(key(response.request().url()));
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new CacheRequestImpl(editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
            }
        }
    }

    void remove(Request request) {
        this.cache.remove(key(request.url()));
    }

    void update(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        try {
            editor = ((CacheResponseBody) response.body()).snapshot.edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    private void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public void initialize() {
        this.cache.initialize();
    }

    public void delete() {
        this.cache.delete();
    }

    public void evictAll() {
        this.cache.evictAll();
    }

    public Iterator<String> urls() {
        return new Iterator<String>() { // from class: okhttp3.Cache.2
            boolean canRemove;
            final Iterator<DiskLruCache.Snapshot> delegate;
            String nextUrl;

            {
                this.delegate = Cache.this.cache.snapshots();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while (this.delegate.hasNext()) {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        this.nextUrl = l.a(next.getSource(0)).r();
                        return true;
                    } catch (IOException unused) {
                    } finally {
                        next.close();
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.nextUrl;
                this.nextUrl = null;
                this.canRemove = true;
                return str;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (!this.canRemove) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.delegate.remove();
            }
        };
    }

    public synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    public long size() {
        return this.cache.size();
    }

    public long maxSize() {
        return this.cache.getMaxSize();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    public File directory() {
        return this.cache.getDirectory();
    }

    public boolean isClosed() {
        return this.cache.isClosed();
    }

    synchronized void trackResponse(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.networkRequest != null) {
            this.networkCount++;
        } else if (cacheStrategy.cacheResponse != null) {
            this.hitCount++;
        }
    }

    synchronized void trackConditionalCacheHit() {
        this.hitCount++;
    }

    public synchronized int networkCount() {
        return this.networkCount;
    }

    public synchronized int hitCount() {
        return this.hitCount;
    }

    public synchronized int requestCount() {
        return this.requestCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class CacheRequestImpl implements CacheRequest {
        private s body;
        private s cacheOut;
        boolean done;
        private final DiskLruCache.Editor editor;

        public CacheRequestImpl(final DiskLruCache.Editor editor) {
            this.editor = editor;
            this.cacheOut = editor.newSink(1);
            this.body = new g(this.cacheOut) { // from class: okhttp3.Cache.CacheRequestImpl.1
                @Override // c.g, c.s, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    synchronized (Cache.this) {
                        if (CacheRequestImpl.this.done) {
                            return;
                        }
                        CacheRequestImpl.this.done = true;
                        Cache.this.writeSuccessCount++;
                        super.close();
                        editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (Cache.this) {
                if (this.done) {
                    return;
                }
                this.done = true;
                Cache.this.writeAbortCount++;
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public s body() {
            return this.body;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class Entry {
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final String url;
        private final Headers varyHeaders;
        private static final String SENT_MILLIS = Platform.get().getPrefix() + "-Sent-Millis";
        private static final String RECEIVED_MILLIS = Platform.get().getPrefix() + "-Received-Millis";

        public Entry(t tVar) {
            try {
                e a2 = l.a(tVar);
                this.url = a2.r();
                this.requestMethod = a2.r();
                Headers.Builder builder = new Headers.Builder();
                int readInt = Cache.readInt(a2);
                for (int i = 0; i < readInt; i++) {
                    builder.addLenient(a2.r());
                }
                this.varyHeaders = builder.build();
                StatusLine parse = StatusLine.parse(a2.r());
                this.protocol = parse.protocol;
                this.code = parse.code;
                this.message = parse.message;
                Headers.Builder builder2 = new Headers.Builder();
                int readInt2 = Cache.readInt(a2);
                for (int i2 = 0; i2 < readInt2; i2++) {
                    builder2.addLenient(a2.r());
                }
                String str = builder2.get(SENT_MILLIS);
                String str2 = builder2.get(RECEIVED_MILLIS);
                builder2.removeAll(SENT_MILLIS);
                builder2.removeAll(RECEIVED_MILLIS);
                long j = 0;
                this.sentRequestMillis = str != null ? Long.parseLong(str) : 0L;
                this.receivedResponseMillis = str2 != null ? Long.parseLong(str2) : j;
                this.responseHeaders = builder2.build();
                TlsVersion tlsVersion = null;
                if (isHttps()) {
                    String r = a2.r();
                    if (r.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + r + "\"");
                    }
                    this.handshake = Handshake.get(!a2.e() ? TlsVersion.forJavaName(a2.r()) : tlsVersion, CipherSuite.forJavaName(a2.r()), readCertificateList(a2), readCertificateList(a2));
                } else {
                    this.handshake = null;
                }
            } finally {
                tVar.close();
            }
        }

        public Entry(Response response) {
            this.url = response.request().url().toString();
            this.varyHeaders = HttpHeaders.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }

        public void writeTo(DiskLruCache.Editor editor) {
            d a2 = l.a(editor.newSink(0));
            a2.b(this.url).i(10);
            a2.b(this.requestMethod).i(10);
            a2.n(this.varyHeaders.size()).i(10);
            int size = this.varyHeaders.size();
            for (int i = 0; i < size; i++) {
                a2.b(this.varyHeaders.name(i)).b(": ").b(this.varyHeaders.value(i)).i(10);
            }
            a2.b(new StatusLine(this.protocol, this.code, this.message).toString()).i(10);
            a2.n(this.responseHeaders.size() + 2).i(10);
            int size2 = this.responseHeaders.size();
            for (int i2 = 0; i2 < size2; i2++) {
                a2.b(this.responseHeaders.name(i2)).b(": ").b(this.responseHeaders.value(i2)).i(10);
            }
            a2.b(SENT_MILLIS).b(": ").n(this.sentRequestMillis).i(10);
            a2.b(RECEIVED_MILLIS).b(": ").n(this.receivedResponseMillis).i(10);
            if (isHttps()) {
                a2.i(10);
                a2.b(this.handshake.cipherSuite().javaName()).i(10);
                writeCertList(a2, this.handshake.peerCertificates());
                writeCertList(a2, this.handshake.localCertificates());
                if (this.handshake.tlsVersion() != null) {
                    a2.b(this.handshake.tlsVersion().javaName()).i(10);
                }
            }
            a2.close();
        }

        private boolean isHttps() {
            return this.url.startsWith("https://");
        }

        private List<Certificate> readCertificateList(e eVar) {
            int readInt = Cache.readInt(eVar);
            if (readInt == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i < readInt; i++) {
                    String r = eVar.r();
                    c cVar = new c();
                    cVar.b(f.b(r));
                    arrayList.add(certificateFactory.generateCertificate(cVar.f()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private void writeCertList(d dVar, List<Certificate> list) {
            try {
                dVar.n(list.size()).i(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.b(f.a(list.get(i).getEncoded()).b()).i(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public boolean matches(Request request, Response response) {
            return this.url.equals(request.url().toString()) && this.requestMethod.equals(request.method()) && HttpHeaders.varyMatches(response, this.varyHeaders, request);
        }

        public Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }
    }

    static int readInt(e eVar) {
        try {
            long n = eVar.n();
            String r = eVar.r();
            if (n >= 0 && n <= 2147483647L && r.isEmpty()) {
                return (int) n;
            }
            throw new IOException("expected an int but was \"" + n + r + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class CacheResponseBody extends ResponseBody {
        private final e bodySource;
        private final String contentLength;
        private final String contentType;
        final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(final DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = l.a(new h(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // c.h, c.t, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    snapshot.close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            if (this.contentType != null) {
                return MediaType.parse(this.contentType);
            }
            return null;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            try {
                if (this.contentLength == null) {
                    return -1L;
                }
                return Long.parseLong(this.contentLength);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // okhttp3.ResponseBody
        public e source() {
            return this.bodySource;
        }
    }
}
