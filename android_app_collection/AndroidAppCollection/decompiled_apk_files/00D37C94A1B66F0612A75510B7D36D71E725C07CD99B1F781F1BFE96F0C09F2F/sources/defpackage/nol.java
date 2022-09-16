package defpackage;

import android.view.animation.Animation;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nol  reason: default package */
/* loaded from: classes3.dex */
public final class nol implements Animation.AnimationListener {
    final /* synthetic */ nom a;

    public nol(nom nomVar) {
        this.a = nomVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        TextView textView = this.a.f;
        if (textView == null) {
            return;
        }
        textView.post(new Runnable() { // from class: nok
            @Override // java.lang.Runnable
            public final void run() {
                nol.this.a.c(false);
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
