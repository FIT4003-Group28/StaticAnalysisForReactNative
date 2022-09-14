package okhttp3.internal.huc;

import h.d;
import h.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class OutputStreamRequestBody extends RequestBody {
    boolean closed;
    private long expectedContentLength;
    private OutputStream outputStream;
    private w timeout;

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.expectedContentLength;
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initOutputStream(final d dVar, final long j) {
        this.timeout = dVar.timeout();
        this.expectedContentLength = j;
        this.outputStream = new OutputStream() { // from class: okhttp3.internal.huc.OutputStreamRequestBody.1
            private long bytesReceived;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                OutputStreamRequestBody.this.closed = true;
                long j2 = j;
                if (j2 == -1 || this.bytesReceived >= j2) {
                    dVar.close();
                    return;
                }
                throw new ProtocolException("expected " + j + " bytes but received " + this.bytesReceived);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
                if (OutputStreamRequestBody.this.closed) {
                    return;
                }
                dVar.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                if (!OutputStreamRequestBody.this.closed) {
                    long j2 = j;
                    if (j2 == -1 || this.bytesReceived + i2 <= j2) {
                        this.bytesReceived += i2;
                        try {
                            dVar.mo338write(bArr, i, i2);
                            return;
                        } catch (InterruptedIOException e2) {
                            throw new SocketTimeoutException(e2.getMessage());
                        }
                    }
                    throw new ProtocolException("expected " + j + " bytes but received " + this.bytesReceived + i2);
                }
                throw new IOException("closed");
            }
        };
    }

    public final boolean isClosed() {
        return this.closed;
    }

    public final OutputStream outputStream() {
        return this.outputStream;
    }

    public Request prepareToSendRequest(Request request) {
        return request;
    }

    public final w timeout() {
        return this.timeout;
    }
}
