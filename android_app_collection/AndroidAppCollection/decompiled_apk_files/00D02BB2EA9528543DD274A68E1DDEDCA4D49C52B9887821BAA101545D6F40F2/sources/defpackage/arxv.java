package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: arxv  reason: default package */
/* loaded from: classes2.dex */
public class arxv implements aryi {
    public int a;
    private final cqtd b;
    @dzsi
    private ValueAnimator c;

    public arxv(cqhn cqhnVar, cqss cqssVar) {
        this.b = new cqut(cqta.f(), cqssVar, cqrp.d(dcyn.a));
    }

    private final void c() {
        this.c = null;
        this.a = 0;
    }

    public void a(long j, long j2, float f, boolean z) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (j2 <= 0) {
            this.c = null;
            return;
        }
        int i = (int) ((5000 * j) / j2);
        this.a = i;
        if (!z) {
            this.c = null;
        } else if (f <= 0.0f) {
            c();
            return;
        } else {
            long j3 = ((float) (j2 - j)) / f;
            if (j3 >= 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(i, 5000);
                ofInt.setDuration(j3);
                ofInt.setInterpolator(new LinearInterpolator());
                ofInt.addUpdateListener(new arxu(this));
                this.c = ofInt;
                ofInt.start();
            } else {
                c();
                return;
            }
        }
        cqkx.p(this);
    }

    @Override // defpackage.aryi
    public cqtd b() {
        return this.b;
    }

    @Override // defpackage.jbv
    public Integer e() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.jbv
    public Integer f() {
        return 5000;
    }

    @Override // defpackage.jbv
    public Boolean g() {
        return true;
    }

    @Override // defpackage.jbv
    public Boolean l() {
        return false;
    }

    @Override // defpackage.jbv
    @dzsi
    public cjtd m() {
        return null;
    }

    @Override // defpackage.jbv
    public cqtc u() {
        return cqrp.d(2.0d);
    }
}
