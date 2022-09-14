package okhttp3.internal.ws;

import h.c;
import h.e;
import h.f;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class WebSocketReader {
    boolean closed;
    final FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final c.C0204c maskCursor;
    private final byte[] maskKey;
    int opcode;
    final e source;
    private final c controlFrameBuffer = new c();
    private final c messageFrameBuffer = new c();

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
        if (eVar != null) {
            if (frameCallback == null) {
                throw new NullPointerException("frameCallback == null");
            }
            this.isClient = z;
            this.source = eVar;
            this.frameCallback = frameCallback;
            c.C0204c c0204c = null;
            this.maskKey = z ? null : new byte[4];
            this.maskCursor = !z ? new c.C0204c() : c0204c;
            return;
        }
        throw new NullPointerException("source == null");
    }

    private void readControlFrame() {
        String str;
        long j = this.frameLength;
        if (j > 0) {
            this.source.a(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.a(this.maskCursor);
                this.maskCursor.a(0L);
                WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long e2 = this.controlFrameBuffer.e();
                if (e2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (e2 != 0) {
                    s = this.controlFrameBuffer.readShort();
                    str = this.controlFrameBuffer.d();
                    String closeCodeExceptionMessage = WebSocketProtocol.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                } else {
                    str = "";
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.c());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.c());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.opcode));
        }
    }

    /* JADX WARN: Finally extract failed */
    private void readHeader() {
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int readByte = this.source.readByte() & 255;
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.opcode = readByte & 15;
                boolean z = true;
                this.isFinalFrame = (readByte & 128) != 0;
                this.isControlFrame = (readByte & 8) != 0;
                if (this.isControlFrame && !this.isFinalFrame) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z2 = (readByte & 64) != 0;
                boolean z3 = (readByte & 32) != 0;
                boolean z4 = (readByte & 16) != 0;
                if (z2 || z3 || z4) {
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                int readByte2 = this.source.readByte() & 255;
                if ((readByte2 & 128) == 0) {
                    z = false;
                }
                boolean z5 = this.isClient;
                if (z == z5) {
                    throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                }
                this.frameLength = readByte2 & 127;
                long j = this.frameLength;
                if (j == 126) {
                    this.frameLength = this.source.readShort() & 65535;
                } else if (j == 127) {
                    this.frameLength = this.source.readLong();
                    if (this.frameLength < 0) {
                        throw new ProtocolException("Frame length 0x" + Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                    }
                }
                if (this.isControlFrame && this.frameLength > 125) {
                    throw new ProtocolException("Control frame must be less than 125B.");
                }
                if (!z) {
                    return;
                }
                this.source.readFully(this.maskKey);
                return;
            } catch (Throwable th) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }

    private void readMessage() {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.a(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.a(this.maskCursor);
                    this.maskCursor.a(this.messageFrameBuffer.e() - this.frameLength);
                    WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private void readMessageFrame() {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        readMessage();
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.d());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.c());
        }
    }

    private void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
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
}
