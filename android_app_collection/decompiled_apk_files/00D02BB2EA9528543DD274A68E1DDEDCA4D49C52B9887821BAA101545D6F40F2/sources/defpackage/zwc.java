package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: zwc  reason: default package */
/* loaded from: classes7.dex */
public final class zwc extends cpph<zwg, zwh> implements ValueAnimator.AnimatorUpdateListener {
    public static final cqrp a = cqrp.d(6.0d);
    private final ValueAnimator d;
    private final boolean e;

    static {
        cqrp.d(12.0d);
        cqrp.d(1.0d);
    }

    public zwc(Context context) {
        super(context);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5000L);
        this.e = true;
    }

    public static zwc a(Context context, boolean z) {
        cppi cppiVar = new cppi(context);
        cppiVar.b = new zvz(context);
        cppiVar.a();
        zwc zwcVar = new zwc(context, cppiVar, z);
        zwcVar.setLegendSymbolRenderer(new zwa());
        HashMap hashMap = new HashMap();
        int[] b = dpfj.b();
        for (int i = 0; i < 4; i++) {
            int i2 = b[i];
            String a2 = dpfj.a(i2);
            if (i2 == 0) {
                throw null;
            }
            hashMap.put(a2, new zwp(context, i2, zwcVar.d));
        }
        zwcVar.setBarDrawer(new cput(hashMap));
        return zwcVar;
    }

    @Override // defpackage.cpph
    protected final cpqn<zwg, zwh> b() {
        return new zwb();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.e) {
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e) {
            this.d.start();
            this.d.addUpdateListener(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (this.e) {
            this.d.cancel();
            this.d.removeAllUpdateListeners();
        }
        super.onDetachedFromWindow();
    }

    public zwc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zwc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5000L);
        this.e = true;
    }

    public zwc(Context context, cppi cppiVar, boolean z) {
        super(context, cppiVar);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(5000L);
        this.e = z;
    }
}
