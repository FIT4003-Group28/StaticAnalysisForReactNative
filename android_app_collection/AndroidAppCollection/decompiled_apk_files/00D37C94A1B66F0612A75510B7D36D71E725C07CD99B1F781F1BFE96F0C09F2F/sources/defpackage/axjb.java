package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: axjb  reason: default package */
/* loaded from: classes2.dex */
public final class axjb implements axja {
    final ByteBuffer a;

    public axjb(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    @Override // defpackage.axja
    public final int a(ByteBuffer byteBuffer) {
        if (this.a.remaining() != 0 || byteBuffer.remaining() == 0) {
            int min = Math.min(byteBuffer.remaining(), this.a.remaining());
            byte[] bArr = new byte[min];
            this.a.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // defpackage.axja
    public final long b() {
        return this.a.position();
    }

    @Override // defpackage.axja
    public final long c() {
        return this.a.capacity();
    }

    @Override // defpackage.axja, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.axja
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.a.position(axds.p(j))).slice().limit(axds.p(j2)));
    }

    @Override // defpackage.axja
    public final ByteBuffer e(long j, long j2) {
        int position = this.a.position();
        this.a.position(axds.p(j));
        ByteBuffer slice = this.a.slice();
        slice.limit(axds.p(j2));
        this.a.position(position);
        return slice;
    }

    @Override // defpackage.axja
    public final void f(long j) {
        this.a.position(axds.p(j));
    }
}
