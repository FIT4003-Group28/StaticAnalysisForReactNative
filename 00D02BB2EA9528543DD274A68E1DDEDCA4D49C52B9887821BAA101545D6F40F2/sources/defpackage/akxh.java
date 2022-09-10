package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
/* compiled from: PG */
/* renamed from: akxh  reason: default package */
/* loaded from: classes2.dex */
public final class akxh {
    public static dmls a(akra akraVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        IntBuffer asIntBuffer = allocate.asIntBuffer();
        asIntBuffer.put(akraVar.j());
        asIntBuffer.put(akraVar.n());
        dmlr bZ = dmls.c.bZ();
        dspd x = dspd.x(allocate.array());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmls dmlsVar = (dmls) bZ.b;
        x.getClass();
        dmlsVar.a |= 1;
        dmlsVar.b = x;
        return bZ.bK();
    }

    public static dspd b(double[] dArr) {
        ByteBuffer allocate = ByteBuffer.allocate(dArr.length * 8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.asDoubleBuffer().put(dArr);
        return dspd.A(allocate);
    }
}
