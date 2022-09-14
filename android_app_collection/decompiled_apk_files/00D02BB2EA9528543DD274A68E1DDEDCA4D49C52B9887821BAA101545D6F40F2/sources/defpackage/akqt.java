package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: akqt  reason: default package */
/* loaded from: classes.dex */
public final class akqt extends akqj {
    @Override // defpackage.akqj
    public final int a() {
        return 16;
    }

    @Override // defpackage.akqn
    public final void e(dspd dspdVar, int i, int i2, int[] iArr) {
        ByteBuffer k = dspdVar.k();
        k.order(ByteOrder.LITTLE_ENDIAN);
        akra akraVar = new akra();
        int i3 = i2 + i2;
        for (int i4 = 0; i4 < i; i4++) {
            akraVar.u(k.getDouble(), k.getDouble());
            int i5 = i3 + 1;
            iArr[i3] = akraVar.a;
            i3 = i5 + 1;
            iArr[i5] = akraVar.b;
        }
    }

    @Override // defpackage.akqn
    public final void g(dspd dspdVar, int i, int i2, float[] fArr) {
        throw new UnsupportedOperationException("Floats do not have enough precision to represent LatLng data.");
    }
}
