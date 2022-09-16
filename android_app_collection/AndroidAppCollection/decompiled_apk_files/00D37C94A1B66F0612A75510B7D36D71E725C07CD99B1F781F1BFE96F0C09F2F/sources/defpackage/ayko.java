package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ayko  reason: default package */
/* loaded from: classes2.dex */
final class ayko extends aydr {
    final ByteBuffer a;

    public ayko(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.aydr, defpackage.aykl
    public final boolean d() {
        return true;
    }

    @Override // defpackage.aykl
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.aykl
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.aykl
    public final /* bridge */ /* synthetic */ aykl g(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
        return new ayko(duplicate);
    }

    @Override // defpackage.aykl
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        int limit = this.a.limit();
        ByteBuffer byteBuffer2 = this.a;
        byteBuffer2.limit(byteBuffer2.position() + remaining);
        byteBuffer.put(this.a);
        this.a.limit(limit);
    }

    @Override // defpackage.aykl
    public final void j(OutputStream outputStream, int i) {
        a(i);
        if (this.a.hasArray()) {
            outputStream.write(this.a.array(), this.a.arrayOffset() + this.a.position(), i);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
            return;
        }
        byte[] bArr = new byte[i];
        this.a.get(bArr);
        outputStream.write(bArr);
    }

    @Override // defpackage.aykl
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.aykl
    public final void l(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
