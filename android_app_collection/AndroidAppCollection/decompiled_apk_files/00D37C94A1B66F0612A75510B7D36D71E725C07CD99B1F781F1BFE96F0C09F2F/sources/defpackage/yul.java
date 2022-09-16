package defpackage;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: yul  reason: default package */
/* loaded from: classes4.dex */
public final class yul extends ByteArrayInputStream implements yum {
    public yul(byte[] bArr, int i) {
        super(bArr, 0, i);
    }

    @Override // defpackage.yum
    public final int a(ByteBuffer byteBuffer, int i) {
        if (this.pos >= this.count) {
            return -1;
        }
        int min = Math.min(this.count - this.pos, i);
        if (min == 0) {
            return 0;
        }
        byteBuffer.put(this.buf, this.pos, min);
        this.pos += min;
        return min;
    }
}
