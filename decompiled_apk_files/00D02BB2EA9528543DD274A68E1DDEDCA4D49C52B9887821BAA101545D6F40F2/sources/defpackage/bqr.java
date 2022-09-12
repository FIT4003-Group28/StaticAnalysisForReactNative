package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: bqr  reason: default package */
/* loaded from: classes4.dex */
final class bqr implements bqs {
    private final ByteBuffer a;

    public bqr(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.bqs
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.bqs
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
