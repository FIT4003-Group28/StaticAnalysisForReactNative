package org.spongycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.modes.AEADBlockCipher;
/* loaded from: classes.dex */
public class CipherOutputStream extends FilterOutputStream {
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private BufferedBlockCipher bufferedBlockCipher;
    private final byte[] oneByte;
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.bufferedBlockCipher = bufferedBlockCipher;
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.streamCipher = streamCipher;
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.aeadBlockCipher = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        byte b2 = (byte) i;
        this.oneByte[0] = b2;
        if (this.streamCipher != null) {
            this.out.write(this.streamCipher.returnByte(b2));
        } else {
            write(this.oneByte, 0, 1);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ensureCapacity(i2, false);
        if (this.bufferedBlockCipher != null) {
            int processBytes = this.bufferedBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (processBytes == 0) {
                return;
            }
            this.out.write(this.buf, 0, processBytes);
        } else if (this.aeadBlockCipher != null) {
            int processBytes2 = this.aeadBlockCipher.processBytes(bArr, i, i2, this.buf, 0);
            if (processBytes2 == 0) {
                return;
            }
            this.out.write(this.buf, 0, processBytes2);
        } else {
            this.streamCipher.processBytes(bArr, i, i2, this.buf, 0);
            this.out.write(this.buf, 0, i2);
        }
    }

    private void ensureCapacity(int i, boolean z) {
        if (z) {
            if (this.bufferedBlockCipher != null) {
                i = this.bufferedBlockCipher.getOutputSize(i);
            } else if (this.aeadBlockCipher != null) {
                i = this.aeadBlockCipher.getOutputSize(i);
            }
        } else if (this.bufferedBlockCipher != null) {
            i = this.bufferedBlockCipher.getUpdateOutputSize(i);
        } else if (this.aeadBlockCipher != null) {
            i = this.aeadBlockCipher.getUpdateOutputSize(i);
        }
        if (this.buf == null || this.buf.length < i) {
            this.buf = new byte[i];
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r1 != null) goto L11;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r4.ensureCapacity(r0, r1)
            org.spongycastle.crypto.BufferedBlockCipher r1 = r4.bufferedBlockCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            if (r1 == 0) goto L1b
            org.spongycastle.crypto.BufferedBlockCipher r1 = r4.bufferedBlockCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            int r1 = r1.doFinal(r2, r0)     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            if (r1 == 0) goto L3a
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            r2.write(r3, r0, r1)     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            goto L3a
        L1b:
            org.spongycastle.crypto.modes.AEADBlockCipher r1 = r4.aeadBlockCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            if (r1 == 0) goto L31
            org.spongycastle.crypto.modes.AEADBlockCipher r1 = r4.aeadBlockCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            byte[] r2 = r4.buf     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            int r1 = r1.doFinal(r2, r0)     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            if (r1 == 0) goto L3a
            java.io.OutputStream r2 = r4.out     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            byte[] r3 = r4.buf     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            r2.write(r3, r0, r1)     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            goto L3a
        L31:
            org.spongycastle.crypto.StreamCipher r0 = r4.streamCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            if (r0 == 0) goto L3a
            org.spongycastle.crypto.StreamCipher r0 = r4.streamCipher     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
            r0.reset()     // Catch: java.lang.Exception -> L3d org.spongycastle.crypto.InvalidCipherTextException -> L46
        L3a:
            r0 = 0
            r1 = r0
            goto L4e
        L3d:
            r0 = move-exception
            org.spongycastle.crypto.io.CipherIOException r1 = new org.spongycastle.crypto.io.CipherIOException
            java.lang.String r2 = "Error closing stream: "
            r1.<init>(r2, r0)
            goto L4e
        L46:
            r0 = move-exception
            org.spongycastle.crypto.io.InvalidCipherTextIOException r1 = new org.spongycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error finalising cipher data"
            r1.<init>(r2, r0)
        L4e:
            r4.flush()     // Catch: java.io.IOException -> L57
            java.io.OutputStream r0 = r4.out     // Catch: java.io.IOException -> L57
            r0.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            if (r0 == 0) goto L5f
            throw r0
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.io.CipherOutputStream.close():void");
    }
}
