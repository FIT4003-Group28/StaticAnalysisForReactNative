package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagq  reason: default package */
/* loaded from: classes5.dex */
public final class dagq extends dahf {
    public final TextWatcher a;
    public final View.OnFocusChangeListener b;
    private final dahw c;
    private final dahx d;
    private AnimatorSet e;
    private ValueAnimator f;

    public dagq(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.a = new dagh(this);
        this.b = new dagi(this);
        this.c = new dagj(this);
        this.d = new dagk(this);
    }

    public static boolean d(Editable editable) {
        return editable.length() > 0;
    }

    private final ValueAnimator e(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(czum.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new dago(this));
        return ofFloat;
    }

    @Override // defpackage.dahf
    public final void a() {
        this.k.setEndIconDrawable(sl.b(this.l, R.drawable.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.k;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.k.setEndIconOnClickListener(new dagl(this));
        this.k.p(this.c);
        this.k.o(this.d);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(czum.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new dagp(this));
        ValueAnimator e = e(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.playTogether(ofFloat, e);
        this.e.addListener(new dagm(this));
        ValueAnimator e2 = e(1.0f, 0.0f);
        this.f = e2;
        e2.addListener(new dagn(this));
    }

    @Override // defpackage.dahf
    public final void b(boolean z) {
        if (this.k.g == null) {
            return;
        }
        c(z);
    }

    public final void c(boolean z) {
        boolean l = this.k.l();
        if (!z) {
            this.e.cancel();
            this.f.start();
            if (l) {
                return;
            }
            this.f.end();
        } else if (this.e.isRunning()) {
        } else {
            this.f.cancel();
            this.e.start();
            if (!l) {
                return;
            }
            this.e.end();
        }
    }
}
