package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: PG */
/* renamed from: cei  reason: default package */
/* loaded from: classes.dex */
final class cei implements bty<Integer> {
    private final ByteBuffer a = ByteBuffer.allocate(4);

    @Override // defpackage.bty
    public final /* bridge */ /* synthetic */ void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
        Integer num2 = num;
        if (num2 == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putInt(num2.intValue()).array());
        }
    }
}
