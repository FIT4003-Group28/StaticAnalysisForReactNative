package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abou  reason: default package */
/* loaded from: classes.dex */
public final class abou extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ abow b;

    public abou(abow abowVar, boolean z) {
        this.b = abowVar;
        this.a = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.g.setVisibility(8);
        if (this.a) {
            this.b.f.removeAllViews();
            abow abowVar = this.b;
            abowVar.q = false;
            abhd abhdVar = abowVar.m;
            if (abhdVar != null) {
                abic abicVar = (abic) abhdVar;
                asqg asqgVar = abicVar.d;
                if (asqgVar != null) {
                    abicVar.c(asqgVar.c);
                }
                abhd abhdVar2 = abicVar.c;
                if (abhdVar2 != null) {
                    noy noyVar = (noy) abhdVar2;
                    noyVar.k = false;
                    noyVar.D();
                }
            }
            abow abowVar2 = this.b;
            if (abowVar2.s) {
                return;
            }
            abowVar2.l.a(abowVar2);
        }
    }
}
