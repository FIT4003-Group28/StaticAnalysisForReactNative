package defpackage;

import com.google.android.apps.gmm.base.views.scalebar.ScalebarView;
/* compiled from: PG */
/* renamed from: jit  reason: default package */
/* loaded from: classes.dex */
public final class jit implements Runnable {
    final /* synthetic */ ScalebarView a;

    public jit(ScalebarView scalebarView) {
        this.a = scalebarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        final float f = this.a.a.a().p().k;
        final double f2 = akyx.f(this.a.a.a());
        this.a.c.b(this);
        if (this.a.r == f) {
            double d2 = this.a.q;
            int intValue = this.a.m.intValue();
            int intValue2 = this.a.m.intValue();
            float c = ScalebarView.c(this.a.l.intValue(), d2);
            float c2 = ScalebarView.c(this.a.l.intValue(), f2);
            double d3 = intValue2;
            Double.isNaN(d3);
            float f3 = (float) (d3 * f2);
            Double.isNaN(intValue);
            if (Math.abs(f3 - ((float) (d * d2))) < 1.0d && Math.abs(c2 - c) < 1.0d) {
                return;
            }
        }
        this.a.post(new Runnable(this, f, f2) { // from class: jis
            private final jit a;
            private final float b;
            private final double c;

            {
                this.a = this;
                this.b = f;
                this.c = f2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jit jitVar = this.a;
                float f4 = this.b;
                double d4 = this.c;
                ScalebarView scalebarView = jitVar.a;
                double d5 = f4;
                if (scalebarView.r != d5) {
                    scalebarView.setAlpha(1.0f);
                }
                scalebarView.r = d5;
                scalebarView.q = d4;
                scalebarView.d();
                if (scalebarView.getAlpha() != 0.0f) {
                    scalebarView.invalidate();
                }
            }
        });
    }
}
