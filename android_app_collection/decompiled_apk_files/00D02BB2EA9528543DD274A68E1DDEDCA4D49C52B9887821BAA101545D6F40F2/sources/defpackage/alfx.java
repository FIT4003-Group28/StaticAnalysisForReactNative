package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: alfx  reason: default package */
/* loaded from: classes2.dex */
public final class alfx implements amri {
    private final List<amvh> a;
    private final Rect b;
    private final amsa c;
    private final amkz d;
    private final amkz e;
    private final akse f;
    private final float[] g;

    public alfx(Rect rect, List<amvh> list) {
        amsa amsaVar = new amsa();
        this.d = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.e = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.f = new akse();
        this.g = new float[8];
        this.c = amsaVar;
        this.b = rect;
        this.a = list;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        amsa amsaVar = this.c;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, this.d)) {
            return 0.5f;
        }
        int i = 0;
        for (amvh amvhVar : this.a) {
            akqq akqqVar = amvhVar.e;
            if (akqqVar != null && akyx.p(amrkVar.e, akra.f(akqqVar), this.f, this.g)) {
                this.e.a(this.f.b - (this.b.width() / 2.0f), this.f.c - this.b.height(), this.f.b + (this.b.width() / 2.0f), this.f.c);
                if (this.d.d(this.e)) {
                    i++;
                }
            }
        }
        if (!this.a.isEmpty()) {
            return i / this.a.size();
        }
        return 0.0f;
    }
}
