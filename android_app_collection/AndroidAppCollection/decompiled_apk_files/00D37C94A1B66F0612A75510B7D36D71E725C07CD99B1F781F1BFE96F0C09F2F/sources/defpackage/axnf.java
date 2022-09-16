package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: axnf  reason: default package */
/* loaded from: classes2.dex */
public final class axnf extends aodt {
    public static axnf aH(ByteBuffer byteBuffer) {
        axnf axnfVar = new axnf();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        axnfVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return axnfVar;
    }

    @Override // defpackage.aodt
    public final int Q() {
        int b = b(6);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public final int aG() {
        int b = b(4);
        if (b != 0) {
            return d(b);
        }
        return 0;
    }

    public final void aI(axng axngVar, int i) {
        int b = b(4);
        if (b != 0) {
            axngVar.f(a(c(b) + (i * 4)), this.b);
        }
    }
}
