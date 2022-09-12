package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: astq  reason: default package */
/* loaded from: classes2.dex */
public final class astq implements csao {
    @Override // defpackage.csao
    public final void a(long j, float[] fArr) {
        float f = (((float) j) % 400.0f) / 400.0f;
        double d = f + f;
        Double.isNaN(d);
        Arrays.fill(fArr, (float) ((Math.sin(d * 3.141592653589793d) * 0.25d) + 0.5d));
    }

    @Override // defpackage.csao
    public final void b() {
    }
}
