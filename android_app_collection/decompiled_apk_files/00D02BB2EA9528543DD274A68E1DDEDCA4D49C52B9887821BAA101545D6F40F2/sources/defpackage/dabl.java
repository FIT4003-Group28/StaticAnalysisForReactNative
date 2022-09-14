package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dabl  reason: default package */
/* loaded from: classes5.dex */
public final class dabl extends AnimatorListenerAdapter {
    final /* synthetic */ dabq a;

    public dabl(dabq dabqVar) {
        this.a = dabqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dabq dabqVar = this.a;
        if (dabqVar.j) {
            float[] fArr = dabqVar.n;
            if (fArr[0] == fArr[1]) {
                dabqVar.k.b();
                this.a.j = false;
                return;
            }
        }
        if (dabqVar.m.isVisible()) {
            dabq dabqVar2 = this.a;
            dabqVar2.m(0.0f);
            dabqVar2.n(0.0f);
            float f = dabqVar2.f + 360.0f + 250.0f;
            int i = (int) (f / 360.0f);
            if (Math.signum(f) * 360.0f < 0.0f && i * 360 != f) {
                i--;
            }
            dabqVar2.l(f - (i * 360));
            int i2 = dabqVar2.i();
            dabqVar2.d = i2;
            int c = czxb.c(dabqVar2.a.c[i2], dabqVar2.m.i);
            dabqVar2.c.setIntValues(c, czxb.c(dabqVar2.a.c[dabqVar2.i()], dabqVar2.m.i));
            dabqVar2.k(c);
            this.a.b();
        }
    }
}
