package okhttp3.internal.http2;

import c.c;
import c.d;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
/* loaded from: classes.dex */
final class Http2Writer implements Closeable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final c hpackBuffer = new c();
    final Hpack.Writer hpackWriter = new Hpack.Writer(this.hpackBuffer);
    private int maxFrameSize = 16384;
    private final d sink;

    public Http2Writer(d dVar, boolean z) {
        this.sink = dVar;
        this.client = z;
    }

    public synchronized void connectionPreface() {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (!this.client) {
            return;
        }
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format(">> CONNECTION %s", Http2.CONNECTION_PREFACE.f()));
        }
        this.sink.c(Http2.CONNECTION_PREFACE.i());
        this.sink.flush();
    }

    public synchronized void applyAndAckSettings(Settings settings) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.maxFrameSize = settings.getMaxFrameSize(this.maxFrameSize);
        if (settings.getHeaderTableSize() != -1) {
            this.hpackWriter.setHeaderTableSizeSetting(settings.getHeaderTableSize());
        }
        frameHeader(0, 0, (byte) 4, (byte) 1);
        this.sink.flush();
    }

    public synchronized void pushPromise(int i, int i2, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long a2 = this.hpackBuffer.a();
        int min = (int) Math.min(this.maxFrameSize - 4, a2);
        long j = min;
        int i3 = (a2 > j ? 1 : (a2 == j ? 0 : -1));
        frameHeader(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : (byte) 0);
        this.sink.g(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.sink.write(this.hpackBuffer, j);
        if (i3 > 0) {
            writeContinuationFrames(i, a2 - j);
        }
    }

    public synchronized void flush() {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.sink.flush();
    }

    public synchronized void synStream(boolean z, int i, int i2, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(z, i, list);
    }

    public synchronized void synReply(boolean z, int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(z, i, list);
    }

    public synchronized void headers(int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        headers(false, i, list);
    }

    public synchronized void rstStream(int i, ErrorCode errorCode) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        frameHeader(i, 4, (byte) 3, (byte) 0);
        this.sink.g(errorCode.httpCode);
        this.sink.flush();
    }

    public int maxDataLength() {
        return this.maxFrameSize;
    }

    public synchronized void data(boolean z, int i, c cVar, int i2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        byte b2 = 0;
        if (z) {
            b2 = (byte) 1;
        }
        dataFrame(i, b2, cVar, i2);
    }

    void dataFrame(int i, byte b2, c cVar, int i2) {
        frameHeader(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.sink.write(cVar, i2);
        }
    }

    public synchronized void settings(Settings settings) {
        if (this.closed) {
            throw new IOException("closed");
        }
        int i = 0;
        frameHeader(0, settings.size() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (settings.isSet(i)) {
                this.sink.h(i == 4 ? 3 : i == 7 ? 4 : i);
                this.sink.g(settings.get(i));
            }
            i++;
        }
        this.sink.flush();
    }

    public synchronized void ping(boolean z, int i, int i2) {
        if (this.closed) {
            throw new IOException("closed");
        }
        frameHeader(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.sink.g(i);
        this.sink.g(i2);
        this.sink.flush();
    }

    public synchronized void goAway(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw Http2.illegalArgument("errorCode.httpCode == -1", new Object[0]);
        }
        frameHeader(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.sink.g(i);
        this.sink.g(errorCode.httpCode);
        if (bArr.length > 0) {
            this.sink.c(bArr);
        }
        this.sink.flush();
    }

    public synchronized void windowUpdate(int i, long j) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j != 0 && j <= 2147483647L) {
            frameHeader(i, 4, (byte) 8, (byte) 0);
            this.sink.g((int) j);
            this.sink.flush();
        }
        throw Http2.illegalArgument("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
    }

    public void frameHeader(int i, int i2, byte b2, byte b3) {
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.frameLog(false, i, i2, b2, b3));
        }
        if (i2 > this.maxFrameSize) {
            throw Http2.illegalArgument("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.maxFrameSize), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw Http2.illegalArgument("reserved bit set: %s", Integer.valueOf(i));
        }
        writeMedium(this.sink, i2);
        this.sink.i(b2 & 255);
        this.sink.i(b3 & 255);
        this.sink.g(i & Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    private static void writeMedium(d dVar, int i) {
        dVar.i((i >>> 16) & 255);
        dVar.i((i >>> 8) & 255);
        dVar.i(i & 255);
    }

    private void writeContinuationFrames(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.maxFrameSize, j);
            long j2 = min;
            j -= j2;
            frameHeader(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.sink.write(this.hpackBuffer, j2);
        }
    }

    void headers(boolean z, int i, List<Header> list) {
        if (this.closed) {
            throw new IOException("closed");
        }
        this.hpackWriter.writeHeaders(list);
        long a2 = this.hpackBuffer.a();
        int min = (int) Math.min(this.maxFrameSize, a2);
        long j = min;
        int i2 = (a2 > j ? 1 : (a2 == j ? 0 : -1));
        byte b2 = i2 == 0 ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        frameHeader(i, min, (byte) 1, b2);
        this.sink.write(this.hpackBuffer, j);
        if (i2 <= 0) {
            return;
        }
        writeContinuationFrames(i, a2 - j);
    }
}
