package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: ceh  reason: default package */
/* loaded from: classes.dex */
final class ceh implements bty<Long> {
    private final ByteBuffer a = ByteBuffer.allocate(8);

    @Override // defpackage.bty
    public final /* bridge */ /* synthetic */ void a(byte[] bArr, Long l, MessageDigest messageDigest) {
        Long l2 = l;
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l2.longValue()).array());
        }
    }
}
