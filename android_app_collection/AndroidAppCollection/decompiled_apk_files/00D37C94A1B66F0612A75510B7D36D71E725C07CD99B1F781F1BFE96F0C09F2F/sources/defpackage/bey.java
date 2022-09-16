package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bey  reason: default package */
/* loaded from: classes2.dex */
final class bey implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ bfl a;

    public bey(bfl bflVar) {
        this.a = bflVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.o.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        bfl bflVar = this.a;
        Set set = bflVar.r;
        if (set == null || set.size() == 0) {
            bflVar.ne(true);
            return;
        }
        bfe bfeVar = new bfe(bflVar, 1);
        int firstVisiblePosition = bflVar.o.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < bflVar.o.getChildCount(); i++) {
            View childAt = bflVar.o.getChildAt(i);
            if (bflVar.r.contains((bhc) bflVar.p.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(bflVar.S);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(bfeVar);
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
                z = true;
            }
        }
    }
}
