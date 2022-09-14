package org.spongycastle.crypto.tls;

import java.io.OutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TlsOutputStream extends OutputStream {
    private byte[] buf = new byte[1];
    private TlsProtocol handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TlsOutputStream(TlsProtocol tlsProtocol) {
        this.handler = tlsProtocol;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.handler.writeData(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.buf[0] = (byte) i;
        write(this.buf, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.handler.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.handler.flush();
    }
}
