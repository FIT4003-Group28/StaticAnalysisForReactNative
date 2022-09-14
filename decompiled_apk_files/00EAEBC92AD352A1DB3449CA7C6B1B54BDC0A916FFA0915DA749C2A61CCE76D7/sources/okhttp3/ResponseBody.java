package okhttp3;

import h.c;
import h.e;
import h.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {
    private Reader reader;

    /* loaded from: classes.dex */
    static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final e source;

        BomAwareReader(e eVar, Charset charset) {
            this.source = eVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.source.v(), Util.bomAwareCharset(this.source, this.charset));
                    this.delegate = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset charset() {
        MediaType contentType = contentType();
        return contentType != null ? contentType.charset(Util.UTF_8) : Util.UTF_8;
    }

    public static ResponseBody create(final MediaType mediaType, final long j, final e eVar) {
        if (eVar != null) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody.1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public e source() {
                    return eVar;
                }
            };
        }
        throw new NullPointerException("source == null");
    }

    public static ResponseBody create(MediaType mediaType, f fVar) {
        c cVar = new c();
        cVar.mo330a(fVar);
        return create(mediaType, fVar.g(), cVar);
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        c cVar = new c();
        cVar.a(str, charset);
        return create(mediaType, cVar.e(), cVar);
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        c cVar = new c();
        cVar.mo337write(bArr);
        return create(mediaType, bArr.length, cVar);
    }

    public final InputStream byteStream() {
        return source().v();
    }

    public final byte[] bytes() {
        long contentLength = contentLength();
        if (contentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
        e source = source();
        try {
            byte[] o = source.o();
            Util.closeQuietly(source);
            if (contentLength == -1 || contentLength == o.length) {
                return o;
            }
            throw new IOException("Content-Length (" + contentLength + ") and stream length (" + o.length + ") disagree");
        } catch (Throwable th) {
            Util.closeQuietly(source);
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
        this.reader = bomAwareReader;
        return bomAwareReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract e source();

    public final String string() {
        e source = source();
        try {
            return source.a(Util.bomAwareCharset(source, charset()));
        } finally {
            Util.closeQuietly(source);
        }
    }
}
