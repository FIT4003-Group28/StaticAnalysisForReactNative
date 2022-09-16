package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: ccx  reason: default package */
/* loaded from: classes.dex */
final class ccx implements cda {
    private final ByteBuffer a;

    public ccx(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.cda
    public final short a() {
        if (this.a.remaining() <= 0) {
            throw new ccz();
        }
        return (short) (this.a.get() & 255);
    }

    @Override // defpackage.cda
    public final int b() {
        return (a() << 8) | a();
    }

    @Override // defpackage.cda
    public final long c(long j) {
        int min = (int) Math.min(this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }
}
