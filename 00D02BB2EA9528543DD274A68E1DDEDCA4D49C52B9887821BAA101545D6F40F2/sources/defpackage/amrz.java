package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: amrz  reason: default package */
/* loaded from: classes2.dex */
public final class amrz implements amri {
    private final akse a = new akse();
    private final float[] b = new float[8];
    private final amkz c = new amkz(0.0f, 0.0f, 0.0f, 0.0f);

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        akzh akzhVar = amrkVar.e;
        akyy akyyVar = akzhVar.b;
        if (akyyVar == null || !akyx.p(akzhVar, akraVar, this.a, this.b)) {
            return 0.5f;
        }
        Rect c = akyyVar.c();
        this.c.a(c.left, c.top, c.right, c.bottom);
        if (!this.c.e(this.a)) {
            return 1.0f;
        }
        dcdc<amkz> e = akyyVar.e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (e.get(i).e(this.a)) {
                return 1.0f;
            }
            i = i2;
        }
        return 0.0f;
    }
}
