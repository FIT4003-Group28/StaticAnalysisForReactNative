package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atcs  reason: default package */
/* loaded from: classes2.dex */
public final class atcs implements cqfd {
    public static final cqtv a = cqrp.d(88.0d);
    public boolean b;
    @dzsi
    public Animator c;
    public final int d;
    private final boolean e;
    private final boolean f;
    private boolean g;

    public atcs(int i, atnf atnfVar, @dzsi atnf atnfVar2) {
        boolean z = false;
        this.b = i == 1;
        this.d = i;
        this.e = atnfVar.Q().booleanValue();
        this.f = atnfVar.L().booleanValue();
        if (i == 2) {
            this.g = (atnfVar2 == null || atnfVar.Q().equals(atnfVar2.Q())) ? true : z;
        }
    }

    private static Animator b(View view, float f) {
        if (view.getAlpha() == f) {
            return ValueAnimator.ofInt(0).setDuration(0L);
        }
        return ObjectAnimator.ofFloat(view, "alpha", f).setDuration(165L);
    }

    private static Animator c(final View view, int i) {
        int measuredWidth = view.getMeasuredWidth();
        if (measuredWidth == i) {
            return ValueAnimator.ofInt(0).setDuration(0L);
        }
        ValueAnimator e = e(measuredWidth, i);
        e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: atcq
            private final View a;

            {
                this.a = view;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = this.a;
                cqtv cqtvVar = atcs.a;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = intValue;
                view2.setLayoutParams(layoutParams);
            }
        });
        return e;
    }

    private static Animator d(final TextView textView, int i) {
        int width = textView.getWidth();
        if (width == i) {
            return ValueAnimator.ofInt(0).setDuration(0L);
        }
        ValueAnimator e = e(width, i);
        e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(textView) { // from class: atcr
            private final TextView a;

            {
                this.a = textView;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TextView textView2 = this.a;
                cqtv cqtvVar = atcs.a;
                textView2.setMaxWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        return e;
    }

    private static ValueAnimator e(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(165L);
        ofInt.setInterpolator(new aoo());
        return ofInt;
    }

    @Override // defpackage.cqfd
    public final synchronized boolean a(View view) {
        View findViewById;
        if (this.b) {
            return true;
        }
        this.b = true;
        if (this.d == 2) {
            Context context = view.getContext();
            View findViewById2 = view.findViewById(R.id.step_cue_header_primary_card);
            View findViewById3 = view.findViewById(R.id.step_cue_icon_panel);
            if (this.f) {
                findViewById = view.findViewById(R.id.long_step_cue_text);
            } else {
                findViewById = view.findViewById(R.id.step_cue_text);
            }
            View findViewById4 = view.findViewById(R.id.lane_guidance_secondary_card);
            TextView textView = (TextView) view.findViewById(R.id.then_instruction_secondary_card);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (this.g) {
                animatorSet.setDuration(0L);
            }
            if (this.e) {
                int NR = a.NR(context);
                if (this.f && !this.g) {
                    findViewById3.setAlpha(0.0f);
                }
                animatorSet.playSequentially(b(findViewById, 0.0f), animatorSet2);
                animatorSet2.playTogether(c(findViewById4, NR), c(findViewById2, NR), d(textView, NR), b(findViewById3, 1.0f));
            } else {
                int measuredWidth = view.getMeasuredWidth();
                animatorSet2.playTogether(c(findViewById2, measuredWidth), c(findViewById4, measuredWidth), d(textView, measuredWidth));
                animatorSet.playSequentially(animatorSet2, b(findViewById, 1.0f));
            }
            this.c = animatorSet;
            animatorSet.start();
        }
        return true;
    }
}
