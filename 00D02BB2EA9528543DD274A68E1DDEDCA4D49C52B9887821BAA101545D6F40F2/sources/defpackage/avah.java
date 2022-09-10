package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: avah  reason: default package */
/* loaded from: classes2.dex */
final class avah implements WritableByteChannel {
    private final FileChannel a;
    private final FileChannel b;
    private boolean d = false;
    private final Object e = new Object();
    private final ByteBuffer c = ByteBuffer.allocate(131072);

    public avah(FileChannel fileChannel, FileChannel fileChannel2) {
        this.a = fileChannel;
        this.b = fileChannel2;
    }

    private final void a() {
        this.c.flip();
        dcza dczaVar = avai.a;
        ByteBuffer byteBuffer = this.c;
        dczb d = ((dcyp) dczaVar).d(byteBuffer.remaining());
        d.f(byteBuffer);
        dcyz p = d.p();
        this.c.flip();
        while (this.c.hasRemaining()) {
            this.a.write(this.c);
        }
        dluz bZ = dlva.d.bZ();
        bZ.b(dspd.x(p.b()));
        ByteBuffer wrap = ByteBuffer.wrap(bZ.bK().bS());
        while (wrap.hasRemaining()) {
            this.b.write(wrap);
        }
        this.c.clear();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.d) {
                return;
            }
            a();
            this.a.close();
            this.b.close();
            this.d = true;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        boolean z;
        synchronized (this.e) {
            z = !this.d;
        }
        return z;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int i;
        synchronized (this.e) {
            if (this.d) {
                throw new ClosedChannelException();
            }
            i = 0;
            while (byteBuffer.hasRemaining()) {
                dbsk.l(this.c.hasRemaining());
                ByteBuffer slice = byteBuffer.slice();
                if (slice.remaining() > this.c.remaining()) {
                    slice.limit(this.c.remaining());
                }
                this.c.put(slice);
                i += slice.limit();
                byteBuffer.position(byteBuffer.position() + slice.limit());
                if (!this.c.hasRemaining()) {
                    a();
                }
            }
        }
        return i;
    }
}
