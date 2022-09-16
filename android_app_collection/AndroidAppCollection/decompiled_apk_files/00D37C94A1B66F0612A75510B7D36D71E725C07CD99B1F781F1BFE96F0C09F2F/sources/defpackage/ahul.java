package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: ahul  reason: default package */
/* loaded from: classes.dex */
public final class ahul implements Animation.AnimationListener {
    private final View a;
    private final /* synthetic */ int b;

    public ahul(View view) {
        this.a = view;
    }

    public ahul(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            this.a.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            ahum.a((ViewGroup) this.a);
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(4);
    }
}
