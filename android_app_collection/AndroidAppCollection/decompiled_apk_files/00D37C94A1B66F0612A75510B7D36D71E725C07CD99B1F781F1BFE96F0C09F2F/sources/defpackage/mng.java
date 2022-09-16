package defpackage;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
/* compiled from: PG */
/* renamed from: mng  reason: default package */
/* loaded from: classes3.dex */
public final class mng extends ajtt {
    private final axnm b;
    private boolean c = false;
    private ValueAnimator d;
    private long e;
    private long f;
    private long g;

    public mng(axnm axnmVar) {
        this.b = axnmVar;
    }

    @Override // defpackage.ajsr
    public final void a() {
        if (this.c) {
            ((ajtm) this.b.get()).a();
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        } else {
            c();
        }
    }

    public final void c() {
        this.d = null;
        ajtl ajtlVar = ((ajtt) this).a;
        mnh mnhVar = (mnh) ajtlVar.a;
        mnhVar.b.l(0);
        mnhVar.a.setAlpha(1.0f);
        ajtlVar.d.run();
    }

    @Override // defpackage.ajtt
    protected final void d() {
        long j;
        ajtl ajtlVar = ((ajtt) this).a;
        mnh mnhVar = (mnh) ajtlVar.a;
        aqml aqmlVar = mnhVar.d;
        if (!mnhVar.b.p() || aqmlVar == null || aqmlVar.b != 1) {
            this.c = true;
            ajtk a = ajtl.a();
            a.e(ajtlVar.a);
            a.b(ajtlVar.b);
            a.d(ajtlVar.c);
            a.c(ajtlVar.d);
            ((ajtm) this.b.get()).e(a.a());
            return;
        }
        if (mnhVar.b.e == 0) {
            long j2 = ajtlVar.b;
            j = j2 + j2;
        } else {
            j = 0;
        }
        this.e = j;
        long j3 = ajtlVar.b;
        long j4 = ((float) j3) * 2.5f;
        this.f = j4;
        long j5 = j4 - j3;
        this.g = j5;
        g(j + j5);
    }

    @Override // defpackage.ajsr
    public final void b() {
        if (!this.c) {
            ajtl ajtlVar = ((ajtt) this).a;
            final mnh mnhVar = (mnh) ajtlVar.a;
            final SwipeLayout swipeLayout = mnhVar.b;
            float alpha = mnhVar.a.getAlpha();
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, alpha), Keyframe.ofFloat(((float) this.g) / ((float) this.f), alpha), Keyframe.ofFloat(1.0f, 0.0f)), PropertyValuesHolder.ofInt("displacement", swipeLayout.e, -swipeLayout.getWidth()));
            this.d = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setStartDelay(this.e);
            this.d.setDuration(this.f);
            this.d.setInterpolator(new LinearInterpolator());
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: mne
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    mnh mnhVar2 = mnh.this;
                    SwipeLayout swipeLayout2 = swipeLayout;
                    mnhVar2.a.setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
                    swipeLayout2.l(((Integer) valueAnimator.getAnimatedValue("displacement")).intValue());
                }
            });
            this.d.addListener(new mnf(this, ajtlVar));
            this.d.start();
            return;
        }
        ((ajtm) this.b.get()).b();
    }
}
