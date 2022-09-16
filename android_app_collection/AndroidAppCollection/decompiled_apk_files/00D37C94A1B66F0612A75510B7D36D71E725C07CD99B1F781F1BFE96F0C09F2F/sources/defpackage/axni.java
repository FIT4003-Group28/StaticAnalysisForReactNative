package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axni  reason: default package */
/* loaded from: classes2.dex */
public final class axni extends aodt {
    public static axni aH(ByteBuffer byteBuffer) {
        axni axniVar = new axni();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axniVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axniVar;
    }

    public final float aG() {
        int b = b(12);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final boolean aI() {
        int b = b(16);
        return b == 0 || this.b.get(b + this.a) != 0;
    }

    public final aodt aJ() {
        aodt aodtVar = new aodt();
        int b = b(20);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }
}
