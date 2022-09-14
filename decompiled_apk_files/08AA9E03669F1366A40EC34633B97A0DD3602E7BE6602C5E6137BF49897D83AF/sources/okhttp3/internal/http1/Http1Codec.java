package okhttp3.internal.http1;

import c.c;
import c.d;
import c.e;
import c.i;
import c.l;
import c.s;
import c.t;
import c.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
/* loaded from: classes.dex */
public final class Http1Codec implements HttpCodec {
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    final OkHttpClient client;
    final d sink;
    final e source;
    int state = 0;
    final StreamAllocation streamAllocation;

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, e eVar, d dVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = eVar;
        this.sink = dVar;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public s createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j != -1) {
            return newFixedLengthSink(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) {
        return new RealResponseBody(response.headers(), l.a(getTransferStream(response)));
    }

    private t getTransferStream(Response response) {
        if (!HttpHeaders.hasBody(response)) {
            return newFixedLengthSource(0L);
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return newChunkedSource(response.request().url());
        }
        long contentLength = HttpHeaders.contentLength(response);
        if (contentLength != -1) {
            return newFixedLengthSource(contentLength);
        }
        return newUnknownLengthSource();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() {
        this.sink.flush();
    }

    public void writeRequest(Headers headers, String str) {
        if (this.state != 0) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.sink.b(str).b("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.b(headers.name(i)).b(": ").b(headers.value(i)).b("\r\n");
        }
        this.sink.b("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) {
        if (this.state != 1 && this.state != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(this.source.r());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e);
            throw iOException;
        }
    }

    public Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String r = this.source.r();
            if (r.length() != 0) {
                Internal.instance.addLenient(builder, r);
            } else {
                return builder.build();
            }
        }
    }

    public s newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public s newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public t newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public t newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public t newUnknownLengthSource() {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        } else if (this.streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.state = 5;
            this.streamAllocation.noNewStreams();
            return new UnknownLengthSource();
        }
    }

    void detachTimeout(i iVar) {
        u a2 = iVar.a();
        iVar.a(u.NONE);
        a2.clearDeadline();
        a2.clearTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class FixedLengthSink implements s {
        private long bytesRemaining;
        private boolean closed;
        private final i timeout;

        FixedLengthSink(long j) {
            this.timeout = new i(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // c.s
        public u timeout() {
            return this.timeout;
        }

        @Override // c.s
        public void write(c cVar, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            Util.checkOffsetAndCount(cVar.a(), 0L, j);
            if (j > this.bytesRemaining) {
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            Http1Codec.this.sink.write(cVar, j);
            this.bytesRemaining -= j;
        }

        @Override // c.s, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.bytesRemaining > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements s {
        private boolean closed;
        private final i timeout;

        ChunkedSink() {
            this.timeout = new i(Http1Codec.this.sink.timeout());
        }

        @Override // c.s
        public u timeout() {
            return this.timeout;
        }

        @Override // c.s
        public void write(c cVar, long j) {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            Http1Codec.this.sink.m(j);
            Http1Codec.this.sink.b("\r\n");
            Http1Codec.this.sink.write(cVar, j);
            Http1Codec.this.sink.b("\r\n");
        }

        @Override // c.s, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.b("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements t {
        protected boolean closed;
        protected final i timeout;

        private AbstractSource() {
            this.timeout = new i(Http1Codec.this.source.timeout());
        }

        @Override // c.t
        public u timeout() {
            return this.timeout;
        }

        protected final void endOfInput(boolean z) {
            if (Http1Codec.this.state == 6) {
                return;
            }
            if (Http1Codec.this.state != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 6;
            if (Http1Codec.this.streamAllocation == null) {
                return;
            }
            Http1Codec.this.streamAllocation.streamFinished(!z, Http1Codec.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true);
            }
        }

        @Override // c.t
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                if (this.bytesRemaining == 0) {
                    return -1L;
                }
                long read = Http1Codec.this.source.read(cVar, Math.min(this.bytesRemaining, j));
                if (read == -1) {
                    endOfInput(false);
                    throw new ProtocolException("unexpected end of stream");
                }
                this.bytesRemaining -= read;
                if (this.bytesRemaining == 0) {
                    endOfInput(true);
                }
                return read;
            }
        }

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class ChunkedSource extends AbstractSource {
        private static final long NO_CHUNK_YET = -1;
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        ChunkedSource(HttpUrl httpUrl) {
            super();
            this.bytesRemainingInChunk = NO_CHUNK_YET;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        @Override // c.t
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                if (!this.hasMoreChunks) {
                    return NO_CHUNK_YET;
                }
                if (this.bytesRemainingInChunk == 0 || this.bytesRemainingInChunk == NO_CHUNK_YET) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return NO_CHUNK_YET;
                    }
                }
                long read = Http1Codec.this.source.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                if (read == NO_CHUNK_YET) {
                    endOfInput(false);
                    throw new ProtocolException("unexpected end of stream");
                }
                this.bytesRemainingInChunk -= read;
                return read;
            }
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != NO_CHUNK_YET) {
                Http1Codec.this.source.r();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.o();
                String trim = Http1Codec.this.source.r().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                } else if (this.bytesRemainingInChunk != 0) {
                } else {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false);
            }
            this.closed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // c.t
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                if (this.inputExhausted) {
                    return -1L;
                }
                long read = Http1Codec.this.source.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true);
                return -1L;
            }
        }

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false);
            }
            this.closed = true;
        }
    }
}
