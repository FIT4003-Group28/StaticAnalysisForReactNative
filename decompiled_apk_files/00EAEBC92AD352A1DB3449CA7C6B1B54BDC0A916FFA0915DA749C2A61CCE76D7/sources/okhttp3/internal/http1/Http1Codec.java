package okhttp3.internal.http1;

import h.c;
import h.d;
import h.e;
import h.i;
import h.l;
import h.u;
import h.v;
import h.w;
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
    private static final int HEADER_LIMIT = 262144;
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
    final StreamAllocation streamAllocation;
    int state = 0;
    private long headerLimit = 262144;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements v {
        protected long bytesRead;
        protected boolean closed;
        protected final i timeout;

        private AbstractSource() {
            this.timeout = new i(Http1Codec.this.source.timeout());
            this.bytesRead = 0L;
        }

        protected final void endOfInput(boolean z, IOException iOException) {
            Http1Codec http1Codec = Http1Codec.this;
            int i = http1Codec.state;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + Http1Codec.this.state);
            }
            http1Codec.detachTimeout(this.timeout);
            Http1Codec http1Codec2 = Http1Codec.this;
            http1Codec2.state = 6;
            StreamAllocation streamAllocation = http1Codec2.streamAllocation;
            if (streamAllocation == null) {
                return;
            }
            streamAllocation.streamFinished(!z, http1Codec2, this.bytesRead, iOException);
        }

        @Override // h.v
        public long read(c cVar, long j) {
            try {
                long read = Http1Codec.this.source.read(cVar, j);
                if (read > 0) {
                    this.bytesRead += read;
                }
                return read;
            } catch (IOException e2) {
                endOfInput(false, e2);
                throw e2;
            }
        }

        @Override // h.v
        public w timeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class ChunkedSink implements u {
        private boolean closed;
        private final i timeout;

        ChunkedSink() {
            this.timeout = new i(Http1Codec.this.sink.timeout());
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1Codec.this.sink.mo331a("0\r\n\r\n");
            Http1Codec.this.detachTimeout(this.timeout);
            Http1Codec.this.state = 3;
        }

        @Override // h.u, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // h.u
        public w timeout() {
            return this.timeout;
        }

        @Override // h.u
        public void write(c cVar, long j) {
            if (!this.closed) {
                if (j == 0) {
                    return;
                }
                Http1Codec.this.sink.mo333c(j);
                Http1Codec.this.sink.mo331a("\r\n");
                Http1Codec.this.sink.write(cVar, j);
                Http1Codec.this.sink.mo331a("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
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
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
            this.url = httpUrl;
        }

        private void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                Http1Codec.this.source.n();
            }
            try {
                this.bytesRemainingInChunk = Http1Codec.this.source.u();
                String trim = Http1Codec.this.source.n().trim();
                if (this.bytesRemainingInChunk < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + trim + "\"");
                } else if (this.bytesRemainingInChunk != 0) {
                } else {
                    this.hasMoreChunks = false;
                    HttpHeaders.receiveHeaders(Http1Codec.this.client.cookieJar(), this.url, Http1Codec.this.readHeaders());
                    endOfInput(true, null);
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, h.v
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                if (!this.hasMoreChunks) {
                    return -1L;
                }
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1L;
                    }
                }
                long read = super.read(cVar, Math.min(j, this.bytesRemainingInChunk));
                if (read != -1) {
                    this.bytesRemainingInChunk -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                endOfInput(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class FixedLengthSink implements u {
        private long bytesRemaining;
        private boolean closed;
        private final i timeout;

        FixedLengthSink(long j) {
            this.timeout = new i(Http1Codec.this.sink.timeout());
            this.bytesRemaining = j;
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
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

        @Override // h.u, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1Codec.this.sink.flush();
        }

        @Override // h.u
        public w timeout() {
            return this.timeout;
        }

        @Override // h.u
        public void write(c cVar, long j) {
            if (!this.closed) {
                Util.checkOffsetAndCount(cVar.e(), 0L, j);
                if (j <= this.bytesRemaining) {
                    Http1Codec.this.sink.write(cVar, j);
                    this.bytesRemaining -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.bytesRemaining + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (this.bytesRemaining == 0) {
                endOfInput(true, null);
            }
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, h.v
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1L;
                }
                long read = super.read(cVar, Math.min(j2, j));
                if (read == -1) {
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    endOfInput(false, protocolException);
                    throw protocolException;
                }
                this.bytesRemaining -= read;
                if (this.bytesRemaining == 0) {
                    endOfInput(true, null);
                }
                return read;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        UnknownLengthSource() {
            super();
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            if (!this.inputExhausted) {
                endOfInput(false, null);
            }
            this.closed = true;
        }

        @Override // okhttp3.internal.http1.Http1Codec.AbstractSource, h.v
        public long read(c cVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.closed) {
                throw new IllegalStateException("closed");
            } else {
                if (this.inputExhausted) {
                    return -1L;
                }
                long read = super.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                endOfInput(true, null);
                return -1L;
            }
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, e eVar, d dVar) {
        this.client = okHttpClient;
        this.streamAllocation = streamAllocation;
        this.source = eVar;
        this.sink = dVar;
    }

    private String readHeaderLine() {
        String h2 = this.source.h(this.headerLimit);
        this.headerLimit -= h2.length();
        return h2;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void cancel() {
        RealConnection connection = this.streamAllocation.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public u createRequestBody(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        return newFixedLengthSink(j);
    }

    void detachTimeout(i iVar) {
        w a2 = iVar.a();
        iVar.a(w.NONE);
        a2.clearDeadline();
        a2.clearTimeout();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void flushRequest() {
        this.sink.flush();
    }

    public boolean isClosed() {
        return this.state == 6;
    }

    public u newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public v newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public u newFixedLengthSink(long j) {
        if (this.state == 1) {
            this.state = 2;
            return new FixedLengthSink(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public v newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException("state: " + this.state);
    }

    public v newUnknownLengthSource() {
        if (this.state != 4) {
            throw new IllegalStateException("state: " + this.state);
        }
        StreamAllocation streamAllocation = this.streamAllocation;
        if (streamAllocation == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.state = 5;
        streamAllocation.noNewStreams();
        return new UnknownLengthSource();
    }

    @Override // okhttp3.internal.http.HttpCodec
    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation = this.streamAllocation;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0L, l.a(newFixedLengthSource(0L)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1L, l.a(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? new RealResponseBody(header, contentLength, l.a(newFixedLengthSource(contentLength))) : new RealResponseBody(header, -1L, l.a(newUnknownLengthSource()));
    }

    public Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readHeaderLine = readHeaderLine();
            if (readHeaderLine.length() != 0) {
                Internal.instance.addLenient(builder, readHeaderLine);
            } else {
                return builder.build();
            }
        }
    }

    @Override // okhttp3.internal.http.HttpCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.state);
        }
        try {
            StatusLine parse = StatusLine.parse(readHeaderLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
            if (z && parse.code == 100) {
                return null;
            }
            if (parse.code == 100) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.streamAllocation);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public void writeRequest(Headers headers, String str) {
        if (this.state != 0) {
            throw new IllegalStateException("state: " + this.state);
        }
        this.sink.mo331a(str).mo331a("\r\n");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            this.sink.mo331a(headers.name(i)).mo331a(": ").mo331a(headers.value(i)).mo331a("\r\n");
        }
        this.sink.mo331a("\r\n");
        this.state = 1;
    }

    @Override // okhttp3.internal.http.HttpCodec
    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.streamAllocation.connection().route().proxy().type()));
    }
}
