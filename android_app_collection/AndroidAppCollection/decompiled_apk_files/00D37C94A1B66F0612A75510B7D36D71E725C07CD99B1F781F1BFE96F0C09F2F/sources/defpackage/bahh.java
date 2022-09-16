package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bahh  reason: default package */
/* loaded from: classes2.dex */
final class bahh extends InputStream {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final bahf d;

    public bahh(bahf bahfVar) {
        this.d = bahfVar;
    }

    private final void a() {
        if (this.a) {
            IOException iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
        } else if (b()) {
        } else {
            if (this.b == null) {
                this.b = ByteBuffer.allocateDirect(32768);
            }
            this.b.clear();
            bahf bahfVar = this.d;
            bahfVar.b.read(this.b);
            bahfVar.a.b(bahfVar.getReadTimeout());
            IOException iOException2 = this.c;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer == null) {
                    return;
                }
                byteBuffer.flip();
                return;
            }
            throw iOException2;
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.a) {
            if (!b()) {
                return 0;
            }
            return this.b.remaining();
        }
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        if (b()) {
            return this.b.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        a();
        if (!b()) {
            return -1;
        }
        int min = Math.min(this.b.limit() - this.b.position(), i2);
        this.b.get(bArr, i, min);
        return min;
    }
}
