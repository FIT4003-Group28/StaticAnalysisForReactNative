package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: ccy  reason: default package */
/* loaded from: classes.dex */
final class ccy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(ByteBuffer byteBuffer) {
        return byteBuffer.remaining();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b(int i, ByteBuffer byteBuffer) {
        if (d(i, 4, byteBuffer)) {
            return byteBuffer.getInt(i);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final short c(int i, ByteBuffer byteBuffer) {
        if (d(i, 2, byteBuffer)) {
            return byteBuffer.getShort(i);
        }
        return (short) -1;
    }

    private static final boolean d(int i, int i2, ByteBuffer byteBuffer) {
        return byteBuffer.remaining() - i >= i2;
    }
}
