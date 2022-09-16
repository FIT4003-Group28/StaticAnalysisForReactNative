package org.spongycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.spongycastle.crypto.Mac;
/* loaded from: classes.dex */
public class MacInputStream extends FilterInputStream {
    protected Mac mac;

    public MacInputStream(InputStream inputStream, Mac mac) {
        super(inputStream);
        this.mac = mac;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = this.in.read();
        if (read >= 0) {
            this.mac.update((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read >= 0) {
            this.mac.update(bArr, i, read);
        }
        return read;
    }

    public Mac getMac() {
        return this.mac;
    }
}
