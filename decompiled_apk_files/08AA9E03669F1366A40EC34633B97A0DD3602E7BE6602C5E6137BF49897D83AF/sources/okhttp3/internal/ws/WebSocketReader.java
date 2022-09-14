package okhttp3.internal.ws;

import c.c;
import c.e;
import c.f;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.asn1.eac.CertificateBody;
/* loaded from: classes.dex */
final class WebSocketReader {
    boolean closed;
    long frameBytesRead;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    boolean isMasked;
    int opcode;
    final e source;
    final byte[] maskKey = new byte[4];
    final byte[] maskBuffer = new byte[PKIFailureInfo.certRevoked];

    /* loaded from: classes.dex */
    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(f fVar);

        void onReadMessage(String str);

        void onReadPing(f fVar);

        void onReadPong(f fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSocketReader(boolean z, e eVar, FrameCallback frameCallback) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        }
        if (frameCallback == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.isClient = z;
        this.source = eVar;
        this.frameCallback = frameCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() {
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int h = this.source.h() & 255;
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            this.opcode = h & 15;
            boolean z = false;
            this.isFinalFrame = (h & 128) != 0;
            this.isControlFrame = (h & 8) != 0;
            if (this.isControlFrame && !this.isFinalFrame) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z2 = (h & 64) != 0;
            boolean z3 = (h & 32) != 0;
            boolean z4 = (h & 16) != 0;
            if (z2 || z3 || z4) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            int h2 = this.source.h() & 255;
            if ((h2 & 128) != 0) {
                z = true;
            }
            this.isMasked = z;
            if (this.isMasked == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            this.frameLength = h2 & CertificateBody.profileType;
            if (this.frameLength == 126) {
                this.frameLength = this.source.i() & 65535;
            } else if (this.frameLength == 127) {
                this.frameLength = this.source.k();
                if (this.frameLength < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            this.frameBytesRead = 0L;
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!this.isMasked) {
                return;
            }
            this.source.a(this.maskKey);
        } catch (Throwable th) {
            this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void readControlFrame() {
        c cVar = new c();
        if (this.frameBytesRead < this.frameLength) {
            if (this.isClient) {
                this.source.a(cVar, this.frameLength);
            } else {
                while (this.frameBytesRead < this.frameLength) {
                    int a2 = this.source.a(this.maskBuffer, 0, (int) Math.min(this.frameLength - this.frameBytesRead, this.maskBuffer.length));
                    if (a2 == -1) {
                        throw new EOFException();
                    }
                    long j = a2;
                    WebSocketProtocol.toggleMask(this.maskBuffer, j, this.maskKey, this.frameBytesRead);
                    cVar.c(this.maskBuffer, 0, a2);
                    this.frameBytesRead += j;
                }
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                String str = "";
                long a3 = cVar.a();
                if (a3 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (a3 != 0) {
                    s = cVar.i();
                    str = cVar.q();
                    String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(cVar.p());
                return;
            case 10:
                this.frameCallback.onReadPong(cVar.p());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    private void readMessageFrame() {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        c cVar = new c();
        readMessage(cVar);
        if (i == 1) {
            this.frameCallback.onReadMessage(cVar.q());
        } else {
            this.frameCallback.onReadMessage(cVar.p());
        }
    }

    void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
    }

    private void readMessage(c cVar) {
        long read;
        while (!this.closed) {
            if (this.frameBytesRead == this.frameLength) {
                if (this.isFinalFrame) {
                    return;
                }
                readUntilNonControlFrame();
                if (this.opcode != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
                } else if (this.isFinalFrame && this.frameLength == 0) {
                    return;
                }
            }
            long j = this.frameLength - this.frameBytesRead;
            if (this.isMasked) {
                read = this.source.a(this.maskBuffer, 0, (int) Math.min(j, this.maskBuffer.length));
                if (read == -1) {
                    throw new EOFException();
                }
                WebSocketProtocol.toggleMask(this.maskBuffer, read, this.maskKey, this.frameBytesRead);
                cVar.c(this.maskBuffer, 0, (int) read);
            } else {
                read = this.source.read(cVar, j);
                if (read == -1) {
                    throw new EOFException();
                }
            }
            this.frameBytesRead += read;
        }
        throw new IOException("closed");
    }
}
