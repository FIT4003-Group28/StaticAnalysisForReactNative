package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dytm  reason: default package */
/* loaded from: classes6.dex */
final class dytm extends dykm {
    final ByteBuffer a;

    public dytm(ByteBuffer byteBuffer) {
        dbsk.t(byteBuffer, "bytes");
        this.a = byteBuffer;
    }

    @Override // defpackage.dytj
    public final int c() {
        return this.a.remaining();
    }

    @Override // defpackage.dytj
    public final int d() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.dytj
    public final void e(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.dytj
    public final /* bridge */ /* synthetic */ dytj g(int i) {
        a(i);
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.limit(this.a.position() + i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
        return new dytm(duplicate);
    }
}
