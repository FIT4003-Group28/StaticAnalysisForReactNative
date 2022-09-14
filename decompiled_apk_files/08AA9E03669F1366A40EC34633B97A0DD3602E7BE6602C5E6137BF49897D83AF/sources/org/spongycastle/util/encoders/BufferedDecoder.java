package org.spongycastle.util.encoders;
/* loaded from: classes2.dex */
public class BufferedDecoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator, int i) {
        this.translator = translator;
        if (i % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i];
        this.bufOff = 0;
    }

    public int processByte(byte b2, byte[] bArr, int i) {
        byte[] bArr2 = this.buf;
        int i2 = this.bufOff;
        this.bufOff = i2 + 1;
        bArr2[i2] = b2;
        if (this.bufOff == this.buf.length) {
            int decode = this.translator.decode(this.buf, 0, this.buf.length, bArr, i);
            this.bufOff = 0;
            return decode;
        }
        return 0;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int length = this.buf.length - this.bufOff;
        int i4 = 0;
        if (i2 > length) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, length);
            int decode = this.translator.decode(this.buf, 0, this.buf.length, bArr2, i3) + 0;
            this.bufOff = 0;
            int i5 = i2 - length;
            int i6 = i + length;
            int i7 = i3 + decode;
            int length2 = i5 - (i5 % this.buf.length);
            i4 = decode + this.translator.decode(bArr, i6, length2, bArr2, i7);
            i2 = i5 - length2;
            i = i6 + length2;
        }
        if (i2 != 0) {
            System.arraycopy(bArr, i, this.buf, this.bufOff, i2);
            this.bufOff += i2;
        }
        return i4;
    }
}
