package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axml  reason: default package */
/* loaded from: classes2.dex */
public final class axml extends aodt {
    public static void aH(ByteBuffer byteBuffer, axml axmlVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axmlVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    @Override // defpackage.aodt
    public final String X() {
        int b = b(10);
        if (b != 0) {
            return e(b + this.a);
        }
        return null;
    }

    public final boolean aG() {
        int b = b(14);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }
}
