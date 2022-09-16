package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: coz  reason: default package */
/* loaded from: classes3.dex */
final class coz implements cpb {
    private final ByteBuffer a;

    public coz(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.cpb
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.cpb
    public final int b(byte[] bArr, int i) {
        int min = Math.min(i, this.a.remaining());
        if (min == 0) {
            return -1;
        }
        this.a.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.cpb
    public final long c(long j) {
        int min = (int) Math.min(this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // defpackage.cpb
    public final short d() {
        if (this.a.remaining() <= 0) {
            throw new cpa();
        }
        return (short) (this.a.get() & 255);
    }
}
