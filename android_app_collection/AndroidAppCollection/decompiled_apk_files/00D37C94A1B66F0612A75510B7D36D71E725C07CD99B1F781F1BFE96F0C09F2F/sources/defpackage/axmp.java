package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axmp  reason: default package */
/* loaded from: classes2.dex */
public final class axmp extends aodt {
    public static axmp aH(ByteBuffer byteBuffer) {
        axmp axmpVar = new axmp();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axmpVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axmpVar;
    }

    public final float aG() {
        int b = b(8);
        if (b != 0) {
            return this.b.getFloat(b + this.a);
        }
        return 0.0f;
    }

    public final aodt aI() {
        aodt aodtVar = new aodt();
        int b = b(12);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aJ() {
        aodt aodtVar = new aodt();
        int b = b(14);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aK() {
        aodt aodtVar = new aodt();
        int b = b(16);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }
}
