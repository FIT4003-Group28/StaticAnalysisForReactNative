package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: ddav  reason: default package */
/* loaded from: classes5.dex */
public final class ddav extends FilterInputStream implements DataInput {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddav(InputStream inputStream) {
        super(inputStream);
        dbsk.s(inputStream);
    }

    private final byte a() {
        int read = this.in.read();
        if (read != -1) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        return readUnsignedByte() != 0;
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        return (byte) readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        ddak.d(this, bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        byte a = a();
        byte a2 = a();
        return decl.k(a(), a(), a2, a);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @Override // java.io.DataInput
    public final long readLong() {
        byte a = a();
        byte a2 = a();
        byte a3 = a();
        byte a4 = a();
        byte a5 = a();
        byte a6 = a();
        return decn.g(a(), a(), a6, a5, a4, a3, a2, a);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        return (short) readUnsignedShort();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        return new DataInputStream(this.in).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return decl.k((byte) 0, (byte) 0, a(), a());
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        return (int) this.in.skip(i);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        ddak.e(this, bArr, i, i2);
    }
}
