package okhttp3;

import h.d;
import h.f;
import h.l;
import h.v;
import java.io.File;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
/* loaded from: classes.dex */
public abstract class RequestBody {
    public static RequestBody create(final MediaType mediaType, final f fVar) {
        return new RequestBody() { // from class: okhttp3.RequestBody.1
            @Override // okhttp3.RequestBody
            public long contentLength() {
                return fVar.g();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(d dVar) {
                dVar.mo330a(fVar);
            }
        };
    }

    public static RequestBody create(final MediaType mediaType, final File file) {
        if (file != null) {
            return new RequestBody() { // from class: okhttp3.RequestBody.3
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(d dVar) {
                    v vVar = null;
                    try {
                        vVar = l.c(file);
                        dVar.a(vVar);
                    } finally {
                        Util.closeQuietly(vVar);
                    }
                }
            };
        }
        throw new NullPointerException("file == null");
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = Util.UTF_8;
        if (mediaType != null && (charset = mediaType.charset()) == null) {
            charset = Util.UTF_8;
            mediaType = MediaType.parse(mediaType + "; charset=utf-8");
        }
        return create(mediaType, str.getBytes(charset));
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(final MediaType mediaType, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            Util.checkOffsetAndCount(bArr.length, i, i2);
            return new RequestBody() { // from class: okhttp3.RequestBody.2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i2;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(d dVar) {
                    dVar.mo338write(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(d dVar);
}
