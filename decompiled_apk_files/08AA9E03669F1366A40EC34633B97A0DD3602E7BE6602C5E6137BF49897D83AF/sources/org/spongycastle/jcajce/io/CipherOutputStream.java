package org.spongycastle.jcajce.io;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher cipher;
    private final byte[] oneByte;

    public CipherOutputStream(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.oneByte = new byte[1];
        this.cipher = cipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) {
        this.oneByte[0] = (byte) i;
        write(this.oneByte, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        byte[] update = this.cipher.update(bArr, i, i2);
        if (update != null) {
            this.out.write(update);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r1 != null) goto L9;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r4 = this;
            javax.crypto.Cipher r0 = r4.cipher     // Catch: java.lang.Exception -> L10 java.security.GeneralSecurityException -> L28
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> L10 java.security.GeneralSecurityException -> L28
            if (r0 == 0) goto Ld
            java.io.OutputStream r1 = r4.out     // Catch: java.lang.Exception -> L10 java.security.GeneralSecurityException -> L28
            r1.write(r0)     // Catch: java.lang.Exception -> L10 java.security.GeneralSecurityException -> L28
        Ld:
            r0 = 0
            r1 = r0
            goto L30
        L10:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing stream: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            goto L30
        L28:
            r0 = move-exception
            org.spongycastle.crypto.io.InvalidCipherTextIOException r1 = new org.spongycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error during cipher finalisation"
            r1.<init>(r2, r0)
        L30:
            r4.flush()     // Catch: java.io.IOException -> L39
            java.io.OutputStream r0 = r4.out     // Catch: java.io.IOException -> L39
            r0.close()     // Catch: java.io.IOException -> L39
            goto L3d
        L39:
            r0 = move-exception
            if (r1 != 0) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L41
            throw r0
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jcajce.io.CipherOutputStream.close():void");
    }
}
