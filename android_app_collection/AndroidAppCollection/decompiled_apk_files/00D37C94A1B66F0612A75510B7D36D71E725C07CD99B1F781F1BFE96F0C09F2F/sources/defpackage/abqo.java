package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abqo  reason: default package */
/* loaded from: classes.dex */
public final class abqo extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ abqq c;

    public abqo(abqq abqqVar, boolean z, boolean z2) {
        this.c = abqqVar;
        this.a = z;
        this.b = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        abqq abqqVar = this.c;
        abqqVar.t = false;
        abqqVar.k.setVisibility(8);
        this.c.k.setTranslationY(0.0f);
        if (this.a) {
            this.c.d();
            abqq abqqVar2 = this.c;
            abqqVar2.e.a(abqqVar2);
        }
        if (!this.b) {
            this.c.f();
        }
    }
}
