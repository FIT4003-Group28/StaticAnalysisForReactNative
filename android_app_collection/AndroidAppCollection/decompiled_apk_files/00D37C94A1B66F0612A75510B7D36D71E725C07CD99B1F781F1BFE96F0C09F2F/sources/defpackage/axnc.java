package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axnc  reason: default package */
/* loaded from: classes2.dex */
public final class axnc extends aodt {
    public static axnc aH(ByteBuffer byteBuffer) {
        axnc axncVar = new axnc();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axncVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axncVar;
    }

    public final int aG() {
        int b = b(10);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final aodt aI() {
        aodt aodtVar = new aodt();
        int b = b(16);
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
        int b = b(6);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aL() {
        aodt aodtVar = new aodt();
        int b = b(8);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }

    public final aodt aM() {
        aodt aodtVar = new aodt();
        int b = b(4);
        if (b != 0) {
            aodtVar.f(a(b + this.a), this.b);
            return aodtVar;
        }
        return null;
    }
}
