package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.account.disc.RingView;
/* compiled from: PG */
/* renamed from: cvwh  reason: default package */
/* loaded from: classes.dex */
public final class cvwh {
    public static final Property<RingView, Integer> d = new cvwg(Integer.class);
    public final RingView a;
    public final int b;
    public final int c;
    private final cvwc e;
    private AnimatorSet f = null;

    public cvwh(RingView ringView, int i) {
        this.a = ringView;
        cvwc cvwcVar = new cvwc(ringView.getResources());
        this.e = cvwcVar;
        int round = Math.round(cvwcVar.a(i));
        this.c = round;
        int d2 = cvwcVar.d(i);
        this.b = d2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d2, d2);
        layoutParams.gravity = 17;
        ringView.setLayoutParams(layoutParams);
        ringView.setRingThickness(round);
        ringView.setRingRadius(d2 / 2);
        ringView.setVisibility(0);
    }

    public final Drawable a(dbsg<cvvx> dbsgVar) {
        Drawable drawable;
        if (dbsgVar.a()) {
            cvwj a = dbsgVar.b().a();
            int i = this.b;
            cvwc cvwcVar = this.e;
            cvwcVar.getClass();
            drawable = a.a(i, new cvwd(cvwcVar));
        } else {
            drawable = null;
        }
        boolean z = true;
        if (!(drawable instanceof cvwi) && this.a.getPaddingTop() != 0) {
            z = false;
        }
        dbsk.m(z, "The ring diameter may only be manually set on RingViewHolder if the ring drawable is of type ScalableRing.");
        return drawable;
    }

    public final void b(AnimatorSet animatorSet) {
        czhz.b();
        AnimatorSet animatorSet2 = this.f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f = animatorSet;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
