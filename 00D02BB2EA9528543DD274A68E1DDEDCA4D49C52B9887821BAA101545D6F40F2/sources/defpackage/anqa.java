package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: anqa  reason: default package */
/* loaded from: classes2.dex */
public final class anqa implements cqfc {
    public final int a;
    public final anqo b;
    private final cqtv c;

    public anqa(int i, cqtv cqtvVar, anqo anqoVar) {
        this.a = i;
        this.c = cqtvVar;
        this.b = anqoVar;
    }

    private final void b(final View view, int i, final int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, view, i2) { // from class: anpz
            private final anqa a;
            private final View b;
            private final int c;

            {
                this.a = this;
                this.b = view;
                this.c = i2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                anqa anqaVar = this.a;
                View view2 = this.b;
                int i3 = this.c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = intValue;
                view2.setLayoutParams(layoutParams);
                if (intValue == i3) {
                    anqo anqoVar = anqaVar.b;
                    if (anqaVar.a == 1) {
                        anqoVar.a.p(1);
                    } else {
                        anqoVar.a.p(3);
                    }
                }
            }
        });
        ofInt.start();
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        if (!z) {
            int e = this.c.e(view.getContext());
            View findViewById = view.findViewById(anql.b);
            View findViewById2 = view.findViewById(anql.c);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            if (this.a == 1) {
                if (findViewById.getMeasuredWidth() == e) {
                    return;
                }
                b(findViewById, findViewById2.getMeasuredWidth(), e);
            } else if (findViewById.getMeasuredWidth() == findViewById2.getMeasuredWidth()) {
            } else {
                b(findViewById, e, findViewById2.getMeasuredWidth());
            }
        }
    }
}
