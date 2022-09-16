package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alpz  reason: default package */
/* loaded from: classes.dex */
public final class alpz extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ TextView b;
    final /* synthetic */ int c;
    final /* synthetic */ TextView d;
    final /* synthetic */ alqa e;

    public alpz(alqa alqaVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = alqaVar;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        alqa alqaVar = this.e;
        alqaVar.d = this.a;
        alqaVar.c = null;
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.c == 1 && (textView = this.e.h) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.d.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
