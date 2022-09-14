package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: akrt  reason: default package */
/* loaded from: classes.dex */
public final class akrt extends akqj {
    @Override // defpackage.akqj
    public final int a() {
        return 8;
    }

    @Override // defpackage.akqn
    public final int[] d(dspd dspdVar, int i) {
        return new int[0];
    }

    @Override // defpackage.akqn
    public final void e(dspd dspdVar, int i, int i2, int[] iArr) {
        throw new UnsupportedOperationException("Float-precision would be lost.");
    }

    @Override // defpackage.akqn
    public final void g(dspd dspdVar, int i, int i2, float[] fArr) {
        ByteBuffer k = dspdVar.k();
        k.order(ByteOrder.LITTLE_ENDIAN);
        int i3 = i2 + i2;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            fArr[i3] = k.getFloat();
            i3 = i5 + 1;
            fArr[i5] = k.getFloat();
        }
    }
}
