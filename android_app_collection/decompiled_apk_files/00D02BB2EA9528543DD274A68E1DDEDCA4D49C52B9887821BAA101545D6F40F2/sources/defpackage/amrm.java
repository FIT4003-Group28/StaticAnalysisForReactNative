package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: amrm  reason: default package */
/* loaded from: classes2.dex */
public final class amrm implements amri {
    private final amsa a;
    private final amkz b;
    private final amkz c;

    public amrm() {
        amsa amsaVar = new amsa();
        this.b = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.c = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.a = amsaVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        akzh akzhVar = amrkVar.e;
        akyy akyyVar = akzhVar.b;
        if (akyyVar != null) {
            amsa amsaVar = this.a;
            alne alneVar = amrkVar.h;
            if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.c)) {
                return 0.5f;
            }
            Rect c = akyyVar.c();
            this.b.a(c.left, c.top, c.right, c.bottom);
            float b = 1.0f - amsa.b(this.b, this.c);
            dcdc<amkz> e = akyyVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                b += amsa.b(e.get(i), this.c);
            }
            return Math.min(b, 1.0f);
        }
        return 0.5f;
    }
}
