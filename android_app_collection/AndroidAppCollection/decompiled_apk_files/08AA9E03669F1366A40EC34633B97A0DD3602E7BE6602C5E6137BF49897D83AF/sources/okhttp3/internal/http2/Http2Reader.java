package okhttp3.internal.http2;

import c.c;
import c.e;
import c.f;
import c.t;
import c.u;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {
    static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private final ContinuationSource continuation;
    final Hpack.Reader hpackReader;
    private final e source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int i, String str, f fVar, String str2, int i2, long j);

        void data(boolean z, int i, e eVar, int i2);

        void goAway(int i, ErrorCode errorCode, f fVar);

        void headers(boolean z, int i, int i2, List<Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<Header> list);

        void rstStream(int i, ErrorCode errorCode);

        void settings(boolean z, Settings settings);

        void windowUpdate(int i, long j);
    }

    public Http2Reader(e eVar, boolean z) {
        this.source = eVar;
        this.client = z;
        this.continuation = new ContinuationSource(this.source);
        this.hpackReader = new Hpack.Reader(4096, this.continuation);
    }

    public void readConnectionPreface(Handler handler) {
        if (this.client) {
            if (nextFrame(true, handler)) {
                return;
            }
            throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
        }
        f d2 = this.source.d(Http2.CONNECTION_PREFACE.h());
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.format("<< CONNECTION %s", d2.f()));
        }
        if (Http2.CONNECTION_PREFACE.equals(d2)) {
            return;
        }
        throw Http2.ioException("Expected a connection header but was %s", d2.a());
    }

    public boolean nextFrame(boolean z, Handler handler) {
        try {
            this.source.a(9L);
            int readMedium = readMedium(this.source);
            if (readMedium < 0 || readMedium > 16384) {
                throw Http2.ioException("FRAME_SIZE_ERROR: %s", Integer.valueOf(readMedium));
            }
            byte h = (byte) (this.source.h() & 255);
            if (z && h != 4) {
                throw Http2.ioException("Expected a SETTINGS frame but was %s", Byte.valueOf(h));
            }
            byte h2 = (byte) (this.source.h() & 255);
            int j = this.source.j() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.frameLog(true, j, readMedium, h, h2));
            }
            switch (h) {
                case 0:
                    readData(handler, readMedium, h2, j);
                    break;
                case 1:
                    readHeaders(handler, readMedium, h2, j);
                    break;
                case 2:
                    readPriority(handler, readMedium, h2, j);
                    break;
                case 3:
                    readRstStream(handler, readMedium, h2, j);
                    break;
                case 4:
                    readSettings(handler, readMedium, h2, j);
                    break;
                case 5:
                    readPushPromise(handler, readMedium, h2, j);
                    break;
                case 6:
                    readPing(handler, readMedium, h2, j);
                    break;
                case 7:
                    readGoAway(handler, readMedium, h2, j);
                    break;
                case 8:
                    readWindowUpdate(handler, readMedium, h2, j);
                    break;
                default:
                    this.source.i(readMedium);
                    break;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private void readHeaders(Handler handler, int i, byte b2, int i2) {
        short s = 0;
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b2 & 1) != 0;
        if ((b2 & 8) != 0) {
            s = (short) (this.source.h() & 255);
        }
        if ((b2 & 32) != 0) {
            readPriority(handler, i2);
            i -= 5;
        }
        handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b2, s), s, b2, i2));
    }

    private List<Header> readHeaderBlock(int i, short s, byte b2, int i2) {
        ContinuationSource continuationSource = this.continuation;
        this.continuation.left = i;
        continuationSource.length = i;
        this.continuation.padding = s;
        this.continuation.flags = b2;
        this.continuation.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readData(Handler handler, int i, byte b2, int i2) {
        boolean z = true;
        short s = 0;
        boolean z2 = (b2 & 1) != 0;
        if ((b2 & 32) == 0) {
            z = false;
        }
        if (z) {
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((b2 & 8) != 0) {
            s = (short) (this.source.h() & 255);
        }
        handler.data(z2, i2, this.source, lengthWithoutPadding(i, b2, s));
        this.source.i(s);
    }

    private void readPriority(Handler handler, int i, byte b2, int i2) {
        if (i != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        readPriority(handler, i2);
    }

    private void readPriority(Handler handler, int i) {
        int j = this.source.j();
        handler.priority(i, j & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.source.h() & 255) + 1, (Integer.MIN_VALUE & j) != 0);
    }

    private void readRstStream(Handler handler, int i, byte b2, int i2) {
        if (i != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int j = this.source.j();
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(j);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(j));
        }
        handler.rstStream(i2, fromHttp2);
    }

    private void readSettings(Handler handler, int i, byte b2, int i2) {
        if (i2 != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b2 & 1) != 0) {
            if (i != 0) {
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            handler.ackSettings();
        } else if (i % 6 != 0) {
            throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        } else {
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short i4 = this.source.i();
                int j = this.source.j();
                switch (i4) {
                    case 2:
                        if (j != 0 && j != 1) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 7;
                        if (j < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    case 5:
                        if (j < 16384 || j > 16777215) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(j));
                        }
                        break;
                        break;
                }
                settings.set(i4, j);
            }
            handler.settings(false, settings);
        }
    }

    private void readPushPromise(Handler handler, int i, byte b2, int i2) {
        short s = 0;
        if (i2 == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((b2 & 8) != 0) {
            s = (short) (this.source.h() & 255);
        }
        handler.pushPromise(i2, this.source.j() & Api.BaseClientBuilder.API_PRIORITY_OTHER, readHeaderBlock(lengthWithoutPadding(i - 4, b2, s), s, b2, i2));
    }

    private void readPing(Handler handler, int i, byte b2, int i2) {
        boolean z = false;
        if (i != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        int j = this.source.j();
        int j2 = this.source.j();
        if ((b2 & 1) != 0) {
            z = true;
        }
        handler.ping(z, j, j2);
    }

    private void readGoAway(Handler handler, int i, byte b2, int i2) {
        if (i < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int j = this.source.j();
        int j2 = this.source.j();
        int i3 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(j2);
        if (fromHttp2 == null) {
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(j2));
        }
        f fVar = f.f1286b;
        if (i3 > 0) {
            fVar = this.source.d(i3);
        }
        handler.goAway(j, fromHttp2, fVar);
    }

    private void readWindowUpdate(Handler handler, int i, byte b2, int i2) {
        if (i != 4) {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = this.source.j() & 2147483647L;
        if (j == 0) {
            throw Http2.ioException("windowSizeIncrement was 0", Long.valueOf(j));
        }
        handler.windowUpdate(i2, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements t {
        byte flags;
        int left;
        int length;
        short padding;
        private final e source;
        int streamId;

        @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public ContinuationSource(e eVar) {
            this.source = eVar;
        }

        @Override // c.t
        public long read(c cVar, long j) {
            while (this.left == 0) {
                this.source.i(this.padding);
                this.padding = (short) 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                readContinuationHeader();
            }
            long read = this.source.read(cVar, Math.min(j, this.left));
            if (read == -1) {
                return -1L;
            }
            this.left = (int) (this.left - read);
            return read;
        }

        @Override // c.t
        public u timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = Http2Reader.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            byte h = (byte) (this.source.h() & 255);
            this.flags = (byte) (this.source.h() & 255);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, h, this.flags));
            }
            this.streamId = this.source.j() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (h != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", Byte.valueOf(h));
            }
            if (this.streamId == i) {
                return;
            }
            throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
        }
    }

    static int readMedium(e eVar) {
        return (eVar.h() & 255) | ((eVar.h() & 255) << 16) | ((eVar.h() & 255) << 8);
    }

    static int lengthWithoutPadding(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s > i) {
            throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        }
        return (short) (i - s);
    }
}
