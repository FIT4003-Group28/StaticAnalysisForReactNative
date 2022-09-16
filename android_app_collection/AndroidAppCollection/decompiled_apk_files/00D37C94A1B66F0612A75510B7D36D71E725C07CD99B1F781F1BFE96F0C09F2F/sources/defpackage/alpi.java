package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: alpi  reason: default package */
/* loaded from: classes.dex */
public final class alpi extends alpy {
    public final TextWatcher a;
    public final View.OnFocusChangeListener b;
    private final alqp c;
    private final alqq d;
    private AnimatorSet e;
    private ValueAnimator f;

    public alpi(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
        this.a = new aloz(this);
        this.b = new alpa(this);
        this.c = new alpb(this);
        this.d = new alpd(this);
    }

    private final ValueAnimator e(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(alhv.a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new alph(this, 1));
        return ofFloat;
    }

    public final void a(boolean z) {
        boolean T = this.k.T();
        if (!z) {
            this.e.cancel();
            this.f.start();
            if (T) {
                return;
            }
            this.f.end();
        } else if (this.e.isRunning()) {
        } else {
            this.f.cancel();
            this.e.start();
            if (!T) {
                return;
            }
            this.e.end();
        }
    }

    @Override // defpackage.alpy
    public final void b() {
        TextInputLayout textInputLayout = this.k;
        int i = this.n;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.o(i);
        TextInputLayout textInputLayout2 = this.k;
        textInputLayout2.n(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.k.r(new alpe(this));
        this.k.e(this.c);
        this.k.f(this.d);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(alhv.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new alph(this));
        ValueAnimator e = e(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.e = animatorSet;
        animatorSet.playTogether(ofFloat, e);
        this.e.addListener(new alpf(this));
        ValueAnimator e2 = e(1.0f, 0.0f);
        this.f = e2;
        e2.addListener(new alpg(this));
    }

    @Override // defpackage.alpy
    public final void c(boolean z) {
        if (this.k.g == null) {
            return;
        }
        a(z);
    }

    public final boolean d() {
        EditText editText = this.k.a;
        if (editText != null) {
            return (editText.hasFocus() || this.m.hasFocus()) && editText.getText().length() > 0;
        }
        return false;
    }
}
