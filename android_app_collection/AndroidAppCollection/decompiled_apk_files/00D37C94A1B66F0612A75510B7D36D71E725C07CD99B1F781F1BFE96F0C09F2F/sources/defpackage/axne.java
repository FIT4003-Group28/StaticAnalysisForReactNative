package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axne  reason: default package */
/* loaded from: classes2.dex */
public final class axne extends aodt {
    public static axne aJ(ByteBuffer byteBuffer) {
        axne axneVar = new axne();
        aO(byteBuffer, axneVar);
        return axneVar;
    }

    public static void aO(ByteBuffer byteBuffer, axne axneVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axneVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public final int aG() {
        int b = b(26);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aH() {
        int b = b(28);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aI() {
        int b = b(22);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final aodr aK() {
        aodr aodrVar = new aodr();
        int b = b(34);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr aL(aodr aodrVar) {
        int b = b(6);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodr aM(aodr aodrVar) {
        int b = b(8);
        if (b != 0) {
            aodrVar.a(b + this.a, this.b);
            return aodrVar;
        }
        return null;
    }

    public final aodt aN(aodt aodtVar) {
        int b = b(18);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }
}
