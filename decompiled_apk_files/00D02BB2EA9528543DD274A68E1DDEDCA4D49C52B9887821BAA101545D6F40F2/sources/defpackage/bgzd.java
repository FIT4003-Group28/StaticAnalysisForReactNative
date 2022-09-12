package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: bgzd  reason: default package */
/* loaded from: classes3.dex */
final class bgzd implements cqfc {
    final /* synthetic */ bgze a;

    public bgzd(bgze bgzeVar) {
        this.a = bgzeVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        final View o = cqkx.o(this.a.c);
        if (o == null) {
            return;
        }
        boolean z2 = this.a.d;
        int i = true != z2 ? 250 : cpnx.a;
        int i2 = true != z2 ? 100 : 133;
        float f = 0.0f;
        o.setTranslationY(z2 ? -view.getMeasuredHeight() : 0.0f);
        o.animate().setDuration(i).translationY(this.a.d ? 0.0f : -view.getMeasuredHeight()).setInterpolator(bgze.b).withEndAction(new Runnable(this, o) { // from class: bgzc
            private final bgzd a;
            private final View b;

            {
                this.a = this;
                this.b = o;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bgzd bgzdVar = this.a;
                bgzdVar.a.l(this.b);
            }
        }).start();
        view.setAlpha(true != this.a.d ? 1.0f : 0.0f);
        ViewPropertyAnimator duration = view.animate().setInterpolator(bgze.a).setDuration(i2);
        if (true == this.a.d) {
            f = 1.0f;
        }
        duration.alpha(f).start();
    }
}
