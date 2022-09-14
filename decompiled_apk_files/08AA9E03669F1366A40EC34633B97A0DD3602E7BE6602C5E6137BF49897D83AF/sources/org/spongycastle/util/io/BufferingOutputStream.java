package org.spongycastle.util.io;

import java.io.OutputStream;
import org.spongycastle.util.Arrays;
/* loaded from: classes2.dex */
public class BufferingOutputStream extends OutputStream {
    private final byte[] buf;
    private int bufOff;
    private final OutputStream other;

    public BufferingOutputStream(OutputStream outputStream) {
        this.other = outputStream;
        this.buf = new byte[4096];
    }

    public BufferingOutputStream(OutputStream outputStream, int i) {
        this.other = outputStream;
        this.buf = new byte[i];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i2 < this.buf.length - this.bufOff) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
            this.bufOff += i2;
            return;
        }
        int length = this.buf.length - this.bufOff;
        System.arraycopy(bArr, i, this.buf, this.bufOff, length);
        this.bufOff += length;
        flush();
        int i3 = i + length;
        while (true) {
            i2 -= length;
            if (i2 < this.buf.length) {
                break;
            }
            this.other.write(bArr, i3, this.buf.length);
            i3 += this.buf.length;
            length = this.buf.length;
        }
        if (i2 <= 0) {
            return;
        }
        System.arraycopy(bArr, i3, this.buf, this.bufOff, i2);
        this.bufOff += i2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        byte[] bArr = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr[i2] = (byte) i;
        if (this.bufOff == this.buf.length) {
            flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.other.write(this.buf, 0, this.bufOff);
        this.bufOff = 0;
        Arrays.fill(this.buf, (byte) 0);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
        this.other.close();
    }
}
