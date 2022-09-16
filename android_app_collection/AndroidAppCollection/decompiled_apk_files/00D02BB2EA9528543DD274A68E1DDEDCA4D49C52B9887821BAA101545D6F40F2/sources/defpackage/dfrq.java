package defpackage;

import android.animation.TypeEvaluator;
import android.widget.Scroller;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrq  reason: default package */
/* loaded from: classes6.dex */
public final class dfrq implements TypeEvaluator<Float> {
    public final Scroller a;
    final /* synthetic */ dfrr b;
    private final dhjx c;

    public dfrq(dfrr dfrrVar, dhjx dhjxVar, float f) {
        this.b = dfrrVar;
        this.c = dhjxVar;
        Scroller scroller = new Scroller(dfrrVar.g);
        this.a = scroller;
        scroller.fling(0, 0, (int) (f * 1000.0f), 0, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
        if (this.a.computeScrollOffset()) {
            this.b.f(dfug.d(this.c.e * ((this.a.getCurrX() / 1000.0f) + 1.0f), 15.0f, 90.0f));
        }
        return Float.valueOf(f);
    }
}
