package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
/* compiled from: PG */
/* renamed from: bfe  reason: default package */
/* loaded from: classes2.dex */
final class bfe implements Animation.AnimationListener {
    final /* synthetic */ bfl a;
    private final /* synthetic */ int b;

    public bfe(bfl bflVar) {
        this.a = bflVar;
    }

    public bfe(bfl bflVar, int i) {
        this.b = i;
        this.a = bflVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.b != 0) {
            this.a.ne(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (this.b != 0) {
            return;
        }
        OverlayListView overlayListView = this.a.o;
        for (bfp bfpVar : overlayListView.a) {
            if (!bfpVar.k) {
                bfpVar.j = overlayListView.getDrawingTime();
                bfpVar.k = true;
            }
        }
        bfl bflVar = this.a;
        bflVar.o.postDelayed(bflVar.W, bflVar.R);
    }
}
