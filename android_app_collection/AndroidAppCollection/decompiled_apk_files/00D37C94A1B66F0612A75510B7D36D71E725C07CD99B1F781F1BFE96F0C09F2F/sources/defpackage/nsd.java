package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
/* compiled from: PG */
/* renamed from: nsd  reason: default package */
/* loaded from: classes3.dex */
public final class nsd {
    public static final zaq a = nrv.a;
    public final nsk b;
    public final nsv c;
    public final nsw d;
    public final int e;
    public final azpa f;
    public final aynx g;
    public int h;

    public nsd(Context context, nsk nskVar, nsv nsvVar, nsw nswVar) {
        this.e = context.getResources().getInteger(17694720);
        this.b = nskVar;
        this.c = nsvVar;
        this.d = nswVar;
        azpa as = azpa.as(false);
        this.f = as;
        this.g = as.A().n().L();
    }

    public final aynx a() {
        return this.b.d().C(new faz(this.b.a(), 4));
    }

    public final zar b(nmc nmcVar) {
        return new nsc(this, false, nmcVar);
    }

    public final aynx c(int i, int i2, long j, aynx aynxVar, zaq zaqVar) {
        if (i == i2) {
            return aynx.r();
        }
        final azpa ar = azpa.ar();
        final ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nru
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                azpa.this.c(Integer.valueOf(((Integer) valueAnimator.getAnimatedValue()).intValue()));
            }
        });
        ofInt.addListener(new nrz(ar, zaqVar));
        return ar.U(aynxVar, new aypx() { // from class: nrw
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                return Integer.valueOf(Math.min(((Integer) obj).intValue() + ((Integer) obj2).intValue(), nsd.this.b.b().bottom));
            }
        }).ap(new ayqb() { // from class: nrx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                bamf bamfVar = (bamf) obj;
                ofInt.start();
            }
        }, ayrb.c);
    }
}
