package defpackage;

import android.animation.TypeEvaluator;
import android.widget.Scroller;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrp  reason: default package */
/* loaded from: classes6.dex */
public final class dfrp implements TypeEvaluator<Float> {
    public final Scroller a;
    final /* synthetic */ dfrr b;
    private final dhjx c;

    public dfrp(dfrr dfrrVar, dhjx dhjxVar, float f, float f2) {
        this.b = dfrrVar;
        this.c = dhjxVar;
        dhkb dhkbVar = dhjxVar.c;
        float f3 = 90.0f - (dhkbVar == null ? dhkb.e : dhkbVar).c;
        float f4 = 0.75f;
        if ((f2 >= 0.0f || f3 >= 0.0f) && (f2 <= 0.0f || f3 <= 0.0f)) {
            f4 = 0.5f;
        }
        Scroller scroller = new Scroller(dfrrVar.g);
        this.a = scroller;
        scroller.fling(0, 0, (int) f, (int) (f4 * f2), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static final boolean a(float f) {
        return !Float.isNaN(f) && !Float.isInfinite(f);
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        if (this.a.computeScrollOffset()) {
            int currX = this.a.getCurrX();
            int currY = this.a.getCurrY();
            dhjx dhjxVar = this.c;
            float f4 = dhjxVar.e;
            dhkd dhkdVar = dhjxVar.d;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            float f5 = f4 / dhkdVar.b;
            dhkb dhkbVar = this.c.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            float f6 = dhkbVar.b - (currX * f5);
            dhkb dhkbVar2 = this.c.c;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            float f7 = dhkbVar2.c + (currY * f5);
            if (a(f6) && a(f7)) {
                dfrr dfrrVar = this.b;
                float e = dfug.e(f6);
                float d = dfug.d(f7, 0.0f, 180.0f);
                dhkb dhkbVar3 = ((dhjx) this.b.d.b).c;
                if (dhkbVar3 == null) {
                    dhkbVar3 = dhkb.e;
                }
                dfrrVar.e(e, d, dhkbVar3.d);
            }
        }
        return Float.valueOf(f);
    }
}
