package org.spongycastle.crypto.tls;
/* loaded from: classes.dex */
class DTLSRecordLayer implements DatagramTransport {
    private static final int MAX_FRAGMENT_LENGTH = 16384;
    private static final int RECORD_HEADER_LENGTH = 13;
    private static final long RETRANSMIT_TIMEOUT = 240000;
    private static final long TCP_MSL = 120000;
    private final TlsContext context;
    private DTLSEpoch currentEpoch;
    private final TlsPeer peer;
    private volatile int plaintextLimit;
    private DTLSEpoch readEpoch;
    private final DatagramTransport transport;
    private DTLSEpoch writeEpoch;
    private final ByteQueue recordQueue = new ByteQueue();
    private volatile boolean closed = false;
    private volatile boolean failed = false;
    private volatile ProtocolVersion readVersion = null;
    private volatile ProtocolVersion writeVersion = null;
    private DTLSHandshakeRetransmit retransmit = null;
    private DTLSEpoch retransmitEpoch = null;
    private long retransmitExpiry = 0;
    private volatile boolean inHandshake = true;
    private DTLSEpoch pendingEpoch = null;

    private static long getMacSequenceNumber(int i, long j) {
        return ((i & 4294967295L) << 48) | j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSRecordLayer(DatagramTransport datagramTransport, TlsContext tlsContext, TlsPeer tlsPeer, short s) {
        this.transport = datagramTransport;
        this.context = tlsContext;
        this.peer = tlsPeer;
        this.currentEpoch = new DTLSEpoch(0, new TlsNullCipher(tlsContext));
        this.readEpoch = this.currentEpoch;
        this.writeEpoch = this.currentEpoch;
        setPlaintextLimit(16384);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPlaintextLimit(int i) {
        this.plaintextLimit = i;
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
    public void initPendingEpoch(TlsCipher tlsCipher) {
        if (this.pendingEpoch != null) {
            throw new IllegalStateException();
        }
        this.pendingEpoch = new DTLSEpoch(this.writeEpoch.getEpoch() + 1, tlsCipher);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handshakeSuccessful(DTLSHandshakeRetransmit dTLSHandshakeRetransmit) {
        if (this.readEpoch == this.currentEpoch || this.writeEpoch == this.currentEpoch) {
            throw new IllegalStateException();
        }
        if (dTLSHandshakeRetransmit != null) {
            this.retransmit = dTLSHandshakeRetransmit;
            this.retransmitEpoch = this.currentEpoch;
            this.retransmitExpiry = System.currentTimeMillis() + RETRANSMIT_TIMEOUT;
        }
        this.inHandshake = false;
        this.currentEpoch = this.pendingEpoch;
        this.pendingEpoch = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetWriteEpoch() {
        if (this.retransmitEpoch != null) {
            this.writeEpoch = this.retransmitEpoch;
        } else {
            this.writeEpoch = this.currentEpoch;
        }
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return Math.min(this.plaintextLimit, this.readEpoch.getCipher().getPlaintextLimit(this.transport.getReceiveLimit() - 13));
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return Math.min(this.plaintextLimit, this.writeEpoch.getCipher().getPlaintextLimit(this.transport.getSendLimit() - 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[Catch: IOException -> 0x0149, TryCatch #0 {IOException -> 0x0149, blocks: (B:8:0x0018, B:10:0x001c, B:12:0x0026, B:13:0x002a, B:18:0x003e, B:21:0x0048, B:22:0x004c, B:24:0x0050, B:26:0x005d, B:38:0x0078, B:41:0x0088, B:44:0x0094, B:46:0x0098, B:49:0x00a1, B:52:0x00d5, B:54:0x00d9, B:55:0x00db, B:83:0x012d, B:85:0x0131, B:87:0x0135, B:88:0x013a, B:57:0x00df, B:60:0x00e4, B:62:0x00e8, B:64:0x00ec, B:65:0x00f4, B:67:0x00f8, B:69:0x0107, B:70:0x010f, B:72:0x0112, B:74:0x0118, B:76:0x011b, B:82:0x012a, B:79:0x0122, B:81:0x0126, B:30:0x0065, B:32:0x0069, B:34:0x0071), top: B:94:0x0018 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.spongycastle.crypto.tls.DTLSHandshakeRetransmit, org.spongycastle.crypto.tls.DTLSEpoch] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    @Override // org.spongycastle.crypto.tls.DatagramTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int receive(byte[] r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.DTLSRecordLayer.receive(byte[], int, int, int):int");
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i, int i2) {
        short s;
        if (this.inHandshake || this.writeEpoch == this.retransmitEpoch) {
            s = 22;
            if (TlsUtils.readUint8(bArr, i) == 20) {
                DTLSEpoch dTLSEpoch = null;
                if (this.inHandshake) {
                    dTLSEpoch = this.pendingEpoch;
                } else if (this.writeEpoch == this.retransmitEpoch) {
                    dTLSEpoch = this.currentEpoch;
                }
                if (dTLSEpoch == null) {
                    throw new IllegalStateException();
                }
                byte[] bArr2 = {1};
                sendRecord((short) 20, bArr2, 0, bArr2.length);
                this.writeEpoch = dTLSEpoch;
            }
        } else {
            s = 23;
        }
        sendRecord(s, bArr, i, i2);
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() {
        if (!this.closed) {
            if (this.inHandshake) {
                warn((short) 90, "User canceled handshake");
            }
            closeTransport();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fail(short s) {
        if (!this.closed) {
            try {
                raiseAlert((short) 2, s, null, null);
            } catch (Exception unused) {
            }
            this.failed = true;
            closeTransport();
        }
    }

    void failed() {
        if (!this.closed) {
            this.failed = true;
            closeTransport();
        }
    }

    void warn(short s, String str) {
        raiseAlert((short) 1, s, str, null);
    }

    private void closeTransport() {
        if (!this.closed) {
            try {
                if (!this.failed) {
                    warn((short) 0, null);
                }
                this.transport.close();
            } catch (Exception unused) {
            }
            this.closed = true;
        }
    }

    private void raiseAlert(short s, short s2, String str, Throwable th) {
        this.peer.notifyAlertRaised(s, s2, str, th);
        sendRecord((short) 21, new byte[]{(byte) s, (byte) s2}, 0, 2);
    }

    private int receiveRecord(byte[] bArr, int i, int i2, int i3) {
        int readUint16;
        int i4;
        if (this.recordQueue.available() > 0) {
            if (this.recordQueue.available() >= 13) {
                byte[] bArr2 = new byte[2];
                this.recordQueue.read(bArr2, 0, 2, 11);
                i4 = TlsUtils.readUint16(bArr2, 0);
            } else {
                i4 = 0;
            }
            int min = Math.min(this.recordQueue.available(), i4 + 13);
            this.recordQueue.removeData(bArr, i, min, 0);
            return min;
        }
        int receive = this.transport.receive(bArr, i, i2, i3);
        if (receive < 13 || receive <= (readUint16 = TlsUtils.readUint16(bArr, i + 11) + 13)) {
            return receive;
        }
        this.recordQueue.addData(bArr, i + readUint16, receive - readUint16);
        return readUint16;
    }

    private void sendRecord(short s, byte[] bArr, int i, int i2) {
        if (this.writeVersion == null) {
            return;
        }
        if (i2 > this.plaintextLimit) {
            throw new TlsFatalAlert((short) 80);
        }
        if (i2 < 1 && s != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        int epoch = this.writeEpoch.getEpoch();
        long allocateSequenceNumber = this.writeEpoch.allocateSequenceNumber();
        byte[] encodePlaintext = this.writeEpoch.getCipher().encodePlaintext(getMacSequenceNumber(epoch, allocateSequenceNumber), s, bArr, i, i2);
        byte[] bArr2 = new byte[encodePlaintext.length + 13];
        TlsUtils.writeUint8(s, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(epoch, bArr2, 3);
        TlsUtils.writeUint48(allocateSequenceNumber, bArr2, 5);
        TlsUtils.writeUint16(encodePlaintext.length, bArr2, 11);
        System.arraycopy(encodePlaintext, 0, bArr2, 13, encodePlaintext.length);
        this.transport.send(bArr2, 0, bArr2.length);
    }
}
