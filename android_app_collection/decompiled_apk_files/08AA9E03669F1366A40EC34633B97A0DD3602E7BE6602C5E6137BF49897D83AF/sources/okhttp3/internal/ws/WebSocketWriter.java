package okhttp3.internal.ws;

import c.c;
import c.d;
import c.f;
import c.s;
import c.u;
import java.io.IOException;
import java.util.Random;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.eac.CertificateBody;
import org.spongycastle.asn1.eac.EACTags;
/* loaded from: classes.dex */
final class WebSocketWriter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    boolean activeWriter;
    final c buffer = new c();
    final FrameSink frameSink = new FrameSink();
    final boolean isClient;
    final byte[] maskBuffer;
    final byte[] maskKey;
    final Random random;
    final d sink;
    boolean writerClosed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketWriter(boolean z, d dVar, Random random) {
        if (dVar == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.isClient = z;
        this.sink = dVar;
        this.random = random;
        byte[] bArr = null;
        this.maskKey = z ? new byte[4] : null;
        this.maskBuffer = z ? new byte[PKIFailureInfo.certRevoked] : bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePing(f fVar) {
        synchronized (this) {
            writeControlFrameSynchronized(9, fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writePong(f fVar) {
        synchronized (this) {
            writeControlFrameSynchronized(10, fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeClose(int i, f fVar) {
        f fVar2 = f.f1286b;
        if (i != 0 || fVar != null) {
            if (i != 0) {
                WebSocketProtocol.validateCloseCode(i);
            }
            c cVar = new c();
            cVar.h(i);
            if (fVar != null) {
                cVar.b(fVar);
            }
            fVar2 = cVar.p();
        }
        synchronized (this) {
            try {
                writeControlFrameSynchronized(8, fVar2);
                this.writerClosed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void writeControlFrameSynchronized(int i, f fVar) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int h = fVar.h();
        if (h > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sink.i(i | 128);
        if (this.isClient) {
            this.sink.i(h | 128);
            this.random.nextBytes(this.maskKey);
            this.sink.c(this.maskKey);
            byte[] i2 = fVar.i();
            WebSocketProtocol.toggleMask(i2, i2.length, this.maskKey, 0L);
            this.sink.c(i2);
        } else {
            this.sink.i(h);
            this.sink.b(fVar);
        }
        this.sink.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s newMessageSink(int i, long j) {
        if (this.activeWriter) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.activeWriter = true;
        this.frameSink.formatOpcode = i;
        this.frameSink.contentLength = j;
        this.frameSink.isFirstFrame = true;
        this.frameSink.closed = false;
        return this.frameSink;
    }

    void writeMessageFrameSynchronized(int i, long j, boolean z, boolean z2) {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.sink.i(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sink.i(i2 | ((int) j));
        } else if (j <= 65535) {
            this.sink.i(i2 | EACTags.NON_INTERINDUSTRY_DATA_OBJECT_NESTING_TEMPLATE);
            this.sink.h((int) j);
        } else {
            this.sink.i(i2 | CertificateBody.profileType);
            this.sink.o(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sink.c(this.maskKey);
            long j2 = 0;
            while (j2 < j) {
                int a2 = this.buffer.a(this.maskBuffer, 0, (int) Math.min(j, this.maskBuffer.length));
                if (a2 == -1) {
                    throw new AssertionError();
                }
                long j3 = a2;
                WebSocketProtocol.toggleMask(this.maskBuffer, j3, this.maskKey, j2);
                this.sink.c(this.maskBuffer, 0, a2);
                j2 += j3;
            }
        } else {
            this.sink.write(this.buffer, j);
        }
        this.sink.d();
    }

    /* loaded from: classes.dex */
    final class FrameSink implements s {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // c.s
        public void write(c cVar, long j) {
            if (this.closed) {
                throw new IOException("closed");
            }
            WebSocketWriter.this.buffer.write(cVar, j);
            boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.buffer.a() > this.contentLength - 8192;
            long g = WebSocketWriter.this.buffer.g();
            if (g <= 0 || z) {
                return;
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, g, this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }

        @Override // c.s, java.io.Flushable
        public void flush() {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.a(), this.isFirstFrame, false);
            }
            this.isFirstFrame = false;
        }

        @Override // c.s
        public u timeout() {
            return WebSocketWriter.this.sink.timeout();
        }

        @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                throw new IOException("closed");
            }
            synchronized (WebSocketWriter.this) {
                WebSocketWriter.this.writeMessageFrameSynchronized(this.formatOpcode, WebSocketWriter.this.buffer.a(), this.isFirstFrame, true);
            }
            this.closed = true;
            WebSocketWriter.this.activeWriter = false;
        }
    }
}
