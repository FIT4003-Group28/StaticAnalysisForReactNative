package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: aaaa  reason: default package */
/* loaded from: classes.dex */
final class aaaa implements Animation.AnimationListener {
    final /* synthetic */ aaag a;
    private final /* synthetic */ int b;

    public aaaa(aaag aaagVar) {
        this.a = aaagVar;
    }

    public aaaa(aaag aaagVar, int i) {
        this.b = i;
        this.a = aaagVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            this.a.e.setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b == 0) {
            this.a.e.setVisibility(8);
            return;
        }
        aaag aaagVar = this.a;
        if (!aaagVar.g) {
            return;
        }
        aaagVar.e.sendAccessibilityEvent(8);
    }
}
