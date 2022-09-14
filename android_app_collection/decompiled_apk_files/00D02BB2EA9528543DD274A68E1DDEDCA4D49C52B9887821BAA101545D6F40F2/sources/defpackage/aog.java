package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: aog  reason: default package */
/* loaded from: classes2.dex */
final class aog extends InputStream implements DataInput {
    private static final ByteOrder d = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder e = ByteOrder.BIG_ENDIAN;
    public ByteOrder a;
    final int b;
    int c;
    private DataInputStream f;

    public aog(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.a = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f = dataInputStream;
        int available = dataInputStream.available();
        this.b = available;
        this.c = 0;
        this.f.mark(available);
        this.a = byteOrder;
    }

    public final void a(long j) {
        long j2 = this.c;
        if (j2 > j) {
            this.c = 0;
            this.f.reset();
            this.f.mark(this.b);
        } else {
            j -= j2;
        }
        int i = (int) j;
        if (skipBytes(i) == i) {
            return;
        }
        throw new IOException("Couldn't seek up to the byteCount");
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f.available();
    }

    public final long b() {
        return readInt() & 4294967295L;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f.mark(i);
    }

    @Override // java.io.InputStream
    public final int read() {
        this.c++;
        return this.f.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.c++;
        return this.f.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int i = this.c + 1;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        }
        int read = this.f.read();
        if (read < 0) {
            throw new EOFException();
        }
        return (byte) read;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.c += 2;
        return this.f.readChar();
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
        int i = this.c;
        int length = bArr.length;
        int i2 = i + length;
        this.c = i2;
        if (i2 > this.b) {
            throw new EOFException();
        }
        if (this.f.read(bArr, 0, length) != length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i = this.c + 4;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        }
        int read = this.f.read();
        int read2 = this.f.read();
        int read3 = this.f.read();
        int read4 = this.f.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.a;
            if (byteOrder == d) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.a);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        int i = this.c + 8;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        }
        int read = this.f.read();
        int read2 = this.f.read();
        int read3 = this.f.read();
        int read4 = this.f.read();
        int read5 = this.f.read();
        int read6 = this.f.read();
        int read7 = this.f.read();
        int read8 = this.f.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.a;
            if (byteOrder == d) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.a);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i = this.c + 2;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        }
        int read = this.f.read();
        int read2 = this.f.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.a;
            if (byteOrder == d) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == e) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.a);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.c += 2;
        return this.f.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.c++;
        return this.f.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int i = this.c + 2;
        this.c = i;
        if (i > this.b) {
            throw new EOFException();
        }
        int read = this.f.read();
        int read2 = this.f.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.a;
            if (byteOrder == d) {
                return (read2 << 8) + read;
            }
            if (byteOrder == e) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.a);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int min = Math.min(i, this.b - this.c);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.f.skipBytes(min - i2);
        }
        this.c += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f.read(bArr, i, i2);
        this.c += read;
        return read;
    }

    public aog(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.c + i2;
        this.c = i3;
        if (i3 > this.b) {
            throw new EOFException();
        }
        if (this.f.read(bArr, i, i2) != i2) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }
}
