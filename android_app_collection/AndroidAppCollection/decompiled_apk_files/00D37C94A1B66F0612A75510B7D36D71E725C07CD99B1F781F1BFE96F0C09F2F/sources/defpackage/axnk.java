package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axnk  reason: default package */
/* loaded from: classes2.dex */
public final class axnk extends aodt {
    public static int aG(aodq aodqVar, int i, long j, int i2, int i3) {
        aodqVar.p(4);
        aodqVar.u(3, i3);
        aodqVar.u(2, i2);
        aodqVar.t(1, (int) j);
        aodqVar.u(0, i);
        return aodqVar.c();
    }

    public static axnk aK(ByteBuffer byteBuffer) {
        axnk axnkVar = new axnk();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axnkVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axnkVar;
    }

    public final long aH() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a) & 4294967295L;
        }
        return 0L;
    }

    public final axmn aI() {
        axmn axmnVar = new axmn();
        int b = b(4);
        if (b != 0) {
            axmnVar.f(a(b + this.a), this.b);
            return axmnVar;
        }
        return null;
    }

    public final axmn aJ() {
        axmn axmnVar = new axmn();
        int b = b(8);
        if (b != 0) {
            axmnVar.f(a(b + this.a), this.b);
            return axmnVar;
        }
        return null;
    }
}
