package org.spongycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class RecordStream {
    private static int DEFAULT_PLAINTEXT_LIMIT = 16384;
    static final int TLS_HEADER_LENGTH_OFFSET = 3;
    static final int TLS_HEADER_SIZE = 5;
    static final int TLS_HEADER_TYPE_OFFSET = 0;
    static final int TLS_HEADER_VERSION_OFFSET = 1;
    private int ciphertextLimit;
    private int compressedLimit;
    private TlsProtocol handler;
    private InputStream input;
    private OutputStream output;
    private int plaintextLimit;
    private TlsCompression readCompression;
    private TlsCompression writeCompression;
    private TlsCompression pendingCompression = null;
    private TlsCipher pendingCipher = null;
    private TlsCipher readCipher = null;
    private TlsCipher writeCipher = null;
    private long readSeqNo = 0;
    private long writeSeqNo = 0;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private TlsHandshakeHash handshakeHash = null;
    private ProtocolVersion readVersion = null;
    private ProtocolVersion writeVersion = null;
    private boolean restrictReadVersion = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecordStream(TlsProtocol tlsProtocol, InputStream inputStream, OutputStream outputStream) {
        this.readCompression = null;
        this.writeCompression = null;
        this.handler = tlsProtocol;
        this.input = inputStream;
        this.output = outputStream;
        this.readCompression = new TlsNullCompression();
        this.writeCompression = this.readCompression;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void init(TlsContext tlsContext) {
        this.readCipher = new TlsNullCipher(tlsContext);
        this.writeCipher = this.readCipher;
        this.handshakeHash = new DeferredHash();
        this.handshakeHash.init(tlsContext);
        setPlaintextLimit(DEFAULT_PLAINTEXT_LIMIT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getPlaintextLimit() {
        return this.plaintextLimit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaintextLimit(int i) {
        this.plaintextLimit = i;
        this.compressedLimit = this.plaintextLimit + 1024;
        this.ciphertextLimit = this.compressedLimit + 1024;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRestrictReadVersion(boolean z) {
        this.restrictReadVersion = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPendingConnectionState(TlsCompression tlsCompression, TlsCipher tlsCipher) {
        this.pendingCompression = tlsCompression;
        this.pendingCipher = tlsCipher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sentWriteCipherSpec() {
        if (this.pendingCompression == null || this.pendingCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.writeCompression = this.pendingCompression;
        this.writeCipher = this.pendingCipher;
        this.writeSeqNo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receivedReadCipherSpec() {
        if (this.pendingCompression == null || this.pendingCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.readCompression = this.pendingCompression;
        this.readCipher = this.pendingCipher;
        this.readSeqNo = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void finaliseHandshake() {
        if (this.readCompression != this.pendingCompression || this.writeCompression != this.pendingCompression || this.readCipher != this.pendingCipher || this.writeCipher != this.pendingCipher) {
            throw new TlsFatalAlert((short) 40);
        }
        this.pendingCompression = null;
        this.pendingCipher = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean readRecord() {
        byte[] readAllOrNothing = TlsUtils.readAllOrNothing(5, this.input);
        if (readAllOrNothing == null) {
            return false;
        }
        short readUint8 = TlsUtils.readUint8(readAllOrNothing, 0);
        checkType(readUint8, (short) 10);
        if (!this.restrictReadVersion) {
            if ((TlsUtils.readVersionRaw(readAllOrNothing, 1) & (-256)) != 768) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            ProtocolVersion readVersion = TlsUtils.readVersion(readAllOrNothing, 1);
            if (this.readVersion == null) {
                this.readVersion = readVersion;
            } else if (!readVersion.equals(this.readVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        byte[] decodeAndVerify = decodeAndVerify(readUint8, this.input, TlsUtils.readUint16(readAllOrNothing, 3));
        this.handler.processRecord(readUint8, decodeAndVerify, 0, decodeAndVerify.length);
        return true;
    }

    byte[] decodeAndVerify(short s, InputStream inputStream, int i) {
        checkLength(i, this.ciphertextLimit, (short) 22);
        byte[] readFully = TlsUtils.readFully(i, inputStream);
        TlsCipher tlsCipher = this.readCipher;
        long j = this.readSeqNo;
        this.readSeqNo = 1 + j;
        byte[] decodeCiphertext = tlsCipher.decodeCiphertext(j, s, readFully, 0, readFully.length);
        checkLength(decodeCiphertext.length, this.compressedLimit, (short) 22);
        OutputStream decompress = this.readCompression.decompress(this.buffer);
        if (decompress != this.buffer) {
            decompress.write(decodeCiphertext, 0, decodeCiphertext.length);
            decompress.flush();
            decodeCiphertext = getBufferContents();
        }
        checkLength(decodeCiphertext.length, this.plaintextLimit, (short) 30);
        if (decodeCiphertext.length >= 1 || s == 23) {
            return decodeCiphertext;
        }
        throw new TlsFatalAlert((short) 47);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeRecord(short s, byte[] bArr, int i, int i2) {
        byte[] encodePlaintext;
        if (this.writeVersion == null) {
            return;
        }
        checkType(s, (short) 80);
        checkLength(i2, this.plaintextLimit, (short) 80);
        if (i2 < 1 && s != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        if (s == 22) {
            updateHandshakeData(bArr, i, i2);
        }
        OutputStream compress = this.writeCompression.compress(this.buffer);
        if (compress == this.buffer) {
            TlsCipher tlsCipher = this.writeCipher;
            long j = this.writeSeqNo;
            this.writeSeqNo = 1 + j;
            encodePlaintext = tlsCipher.encodePlaintext(j, s, bArr, i, i2);
        } else {
            compress.write(bArr, i, i2);
            compress.flush();
            byte[] bufferContents = getBufferContents();
            checkLength(bufferContents.length, i2 + 1024, (short) 80);
            TlsCipher tlsCipher2 = this.writeCipher;
            long j2 = this.writeSeqNo;
            this.writeSeqNo = 1 + j2;
            encodePlaintext = tlsCipher2.encodePlaintext(j2, s, bufferContents, 0, bufferContents.length);
        }
        checkLength(encodePlaintext.length, this.ciphertextLimit, (short) 80);
        byte[] bArr2 = new byte[encodePlaintext.length + 5];
        TlsUtils.writeUint8(s, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(encodePlaintext.length, bArr2, 3);
        System.arraycopy(encodePlaintext, 0, bArr2, 5, encodePlaintext.length);
        this.output.write(bArr2);
        this.output.flush();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = this.handshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateHandshakeData(byte[] bArr, int i, int i2) {
        this.handshakeHash.update(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void safeClose() {
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void flush() {
        this.output.flush();
    }

    private byte[] getBufferContents() {
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        return byteArray;
    }

    private static void checkType(short s, short s2) {
        switch (s) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            default:
                throw new TlsFatalAlert(s2);
        }
    }

    private static void checkLength(int i, int i2, short s) {
        if (i > i2) {
            throw new TlsFatalAlert(s);
        }
    }
}
