package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: PG */
/* renamed from: cyb  reason: default package */
/* loaded from: classes3.dex */
final class cyb implements axja {
    final /* synthetic */ long a;
    final /* synthetic */ axja b;

    public cyb(long j, axja axjaVar) {
        this.a = j;
        this.b = axjaVar;
    }

    @Override // defpackage.axja
    public final int a(ByteBuffer byteBuffer) {
        if (this.a == this.b.b()) {
            return -1;
        }
        if (byteBuffer.remaining() > this.a - this.b.b()) {
            ByteBuffer allocate = ByteBuffer.allocate(axds.p(this.a - this.b.b()));
            this.b.a(allocate);
            byteBuffer.put((ByteBuffer) allocate.rewind());
            return allocate.capacity();
        }
        return this.b.a(byteBuffer);
    }

    @Override // defpackage.axja
    public final long b() {
        return this.b.b();
    }

    @Override // defpackage.axja
    public final long c() {
        return this.a;
    }

    @Override // defpackage.axja, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.axja
    public final long d(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.d(j, j2, writableByteChannel);
    }

    @Override // defpackage.axja
    public final ByteBuffer e(long j, long j2) {
        return this.b.e(j, j2);
    }

    @Override // defpackage.axja
    public final void f(long j) {
        this.b.f(j);
    }
}
