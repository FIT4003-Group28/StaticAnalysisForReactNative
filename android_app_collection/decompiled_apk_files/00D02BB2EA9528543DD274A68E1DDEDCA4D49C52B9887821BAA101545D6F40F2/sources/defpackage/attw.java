package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: attw  reason: default package */
/* loaded from: classes2.dex */
public final class attw implements cqfc {
    private static final dcqe c = dcqe.c("attw");
    public final Handler a;
    public final atsj b;
    private final AnimatorSet d;
    private boolean e;

    public attw(atsj atsjVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        Handler handler = new Handler();
        this.b = atsjVar;
        this.d = animatorSet;
        this.a = handler;
        this.e = false;
    }

    private final synchronized void b(View view) {
        if (this.e) {
            this.b.a();
            return;
        }
        this.e = true;
        View findViewById = view.findViewById(R.id.navigation_prompt);
        if (findViewById == null) {
            this.b.a();
            bvoo.h("Layout is badly formed. Cannot perform animation.", new Object[0]);
            return;
        }
        View findViewById2 = view.findViewById(R.id.navigation_prompt_confirmation);
        if (findViewById2 == null) {
            this.b.a();
            bvoo.h("Layout is badly formed. Cannot perform animation.", new Object[0]);
            return;
        }
        dccx F = dcdc.F();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationY", 0.0f, view.getHeight()));
        ofPropertyValuesHolder.setInterpolator(irf.c);
        ofPropertyValuesHolder.setStartDelay(0L);
        ofPropertyValuesHolder.setDuration(100L);
        ofPropertyValuesHolder.addListener(new attv(this, findViewById, findViewById2));
        F.g(ofPropertyValuesHolder);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("translationY", view.getHeight(), 0.0f));
        ofPropertyValuesHolder2.setInterpolator(irf.a);
        ofPropertyValuesHolder2.setStartDelay(0L);
        ofPropertyValuesHolder2.setDuration(250L);
        F.g(ofPropertyValuesHolder2);
        this.d.playSequentially(F.f());
        this.d.addListener(new attu(this));
        this.d.start();
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        b(view);
    }
}
