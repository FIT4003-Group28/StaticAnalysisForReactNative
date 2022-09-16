package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dxes  reason: default package */
/* loaded from: classes6.dex */
public final class dxes implements Closeable {
    public ByteBuffer a;
    private ByteBuffer b;

    public dxes(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.b = byteBuffer;
            byteBuffer.rewind();
            try {
                a(0L);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw new NullPointerException("bb");
    }

    public final void a(long j) {
        ByteBuffer slice = this.b.slice();
        this.a = slice;
        if (j > slice.limit()) {
            throw new IOException("pos " + j + " cannot seek " + this.a.limit());
        }
        this.a.position((int) j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = null;
        this.a = null;
    }

    public final String toString() {
        return "BBSeekable bb=" + this.b.position() + "-" + this.b.limit() + " cur=" + this.a.position() + "-" + this.a.limit();
    }
}
