package defpackage;

import android.animation.Animator;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aaz  reason: default package */
/* loaded from: classes.dex */
public final class aaz extends abf {
    final /* synthetic */ int a;
    final /* synthetic */ yo b;
    final /* synthetic */ abh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaz(abh abhVar, yo yoVar, int i, float f, float f2, float f3, float f4, int i2, yo yoVar2) {
        super(yoVar, i, f, f2, f3, f4);
        this.c = abhVar;
        this.a = i2;
        this.b = yoVar2;
    }

    @Override // defpackage.abf, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        if (this.a <= 0) {
            abh abhVar = this.c;
            abhVar.j.f(abhVar.m, this.b);
        } else {
            this.c.a.add(this.b.a);
            this.k = true;
            if (this.a > 0) {
                abh abhVar2 = this.c;
                abhVar2.m.post(new aba(abhVar2, this));
            }
        }
        abh abhVar3 = this.c;
        View view = abhVar3.p;
        View view2 = this.b.a;
        if (view != view2) {
            return;
        }
        abhVar3.l(view2);
    }
}
