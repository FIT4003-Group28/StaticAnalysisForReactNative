package okhttp3.internal.ws;

import h.c;
import h.d;
import h.f;
import h.u;
import h.w;
import java.io.IOException;
import java.util.Random;
/* loaded from: classes.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final c buffer = new c();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    private final c.C0204c maskCursor;
    private final byte[] maskKey;
    final Random random;
    final d sink;
    final c sinkBuffer;
    boolean writerClosed;

    /* loaded from: classes.dex */
    final class FrameSink implements u {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.e(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.activeWriter = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // h.u, java.io.Flushable
        public void flush() {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.e(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // h.u
        public w timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // h.u
        public void write(c cVar, long j) {
            if (!this.closed) {
                WebSocketWriter.this.buffer.write(cVar, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.e() > this.contentLength - 8192;
                long b2 = WebSocketWriter.this.buffer.b();
                if (b2 <= 0 || z) {
                    return;
                }
                WebSocketWriter.this.writeMessageFrame(this.formatOpcode, b2, this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, d dVar, Random random) {
        if (dVar != null) {
            if (random == null) {
                throw new NullPointerException("random == null");
            }
            this.isClient = z;
            this.sink = dVar;
            this.sinkBuffer = dVar.j();
            this.random = random;
            c.C0204c c0204c = null;
            this.maskKey = z ? new byte[4] : null;
            this.maskCursor = z ? new c.C0204c() : c0204c;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private void writeControlFrame(int i, f fVar) {
        if (!this.writerClosed) {
            int g2 = fVar.g();
            if (g2 > 125) {
                throw new IllegalArgumentException("Payload size must be less than or equal to 125");
            }
            this.sinkBuffer.mo339writeByte(i | 128);
            if (this.isClient) {
                this.sinkBuffer.mo339writeByte(g2 | 128);
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.mo337write(this.maskKey);
                if (g2 > 0) {
                    long e2 = this.sinkBuffer.e();
                    this.sinkBuffer.mo330a(fVar);
                    this.sinkBuffer.a(this.maskCursor);
                    this.maskCursor.a(e2);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.mo339writeByte(g2);
                this.sinkBuffer.mo330a(fVar);
            }
            this.sink.flush();
            return;
        }
        throw new IOException("closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            FrameSink frameSink = this.frameSink;
            frameSink.formatOpcode = i;
            frameSink.contentLength = j;
            frameSink.isFirstFrame = true;
            frameSink.closed = false;
            return frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeClose(int i, f fVar) {
        f fVar2 = f.f10145f;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            c cVar = new c();
            cVar.mo341writeShort(i);
            if (fVar != null) {
                cVar.mo330a(fVar);
            }
            fVar2 = cVar.c();
        }
        try {
            writeControlFrame(8, fVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    void writeMessageFrame(int i, long j, boolean z, boolean z2) {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.mo339writeByte(i);
            if (this.isClient) {
                i2 = 128;
            }
            if (j <= 125) {
                this.sinkBuffer.mo339writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.sinkBuffer.mo339writeByte(i2 | 126);
                this.sinkBuffer.mo341writeShort((int) j);
            } else {
                this.sinkBuffer.mo339writeByte(i2 | 127);
                this.sinkBuffer.k(j);
            }
            if (this.isClient) {
                this.random.nextBytes(this.maskKey);
                this.sinkBuffer.mo337write(this.maskKey);
                if (j > 0) {
                    long e2 = this.sinkBuffer.e();
                    this.sinkBuffer.write(this.buffer, j);
                    this.sinkBuffer.a(this.maskCursor);
                    this.maskCursor.a(e2);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.k();
            return;
        }
        throw new IOException("closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePing(f fVar) {
        writeControlFrame(9, fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePong(f fVar) {
        writeControlFrame(10, fVar);
    }
}
