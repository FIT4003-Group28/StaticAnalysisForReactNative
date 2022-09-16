package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dahh  reason: default package */
/* loaded from: classes5.dex */
public final class dahh {
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public ColorStateList k;
    public CharSequence l;
    public boolean m;
    public TextView n;
    public int o;
    public ColorStateList p;
    public Typeface q;
    private LinearLayout r;
    private int s;
    private FrameLayout t;
    private final float u;

    public dahh(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.u = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    static final boolean o(int i) {
        return i == 0 || i == 1;
    }

    public static final void p(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private final void q(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i != i3 && i != i2) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 != i ? 0.0f : 1.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(czum.a);
        list.add(ofFloat);
        if (i3 != i) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.u, 0.0f);
        ofFloat2.setDuration(217L);
        ofFloat2.setInterpolator(czum.d);
        list.add(ofFloat2);
    }

    private final TextView r(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.n;
            }
            return null;
        }
        return this.h;
    }

    private final int s(boolean z, int i, int i2) {
        return z ? this.a.getResources().getDimensionPixelSize(i) : i2;
    }

    public final void a() {
        this.f = null;
        d();
        if (this.d == 1) {
            if (!this.m || TextUtils.isEmpty(this.l)) {
                this.e = 0;
            } else {
                this.e = 2;
            }
        }
        c(this.d, this.e, b(this.h, null));
    }

    public final boolean b(TextView textView, CharSequence charSequence) {
        return od.ae(this.b) && this.b.isEnabled() && (this.e != this.d || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void c(int i, int i2, boolean z) {
        TextView r;
        TextView r2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            q(arrayList, this.m, this.n, 2, i, i2);
            q(arrayList, this.g, this.h, 1, i, i2);
            czun.a(animatorSet, arrayList);
            animatorSet.addListener(new dahg(this, i2, r(i), i, r(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (r2 = r(i2)) != null) {
                r2.setVisibility(0);
                r2.setAlpha(1.0f);
            }
            if (i != 0 && (r = r(i)) != null) {
                r.setVisibility(4);
                if (i == 1) {
                    r.setText((CharSequence) null);
                }
            }
            this.d = i2;
        }
        this.b.g();
        this.b.a(z);
        this.b.q();
    }

    public final void d() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void e() {
        EditText editText;
        if (this.r == null || (editText = this.b.a) == null) {
            return;
        }
        boolean d = dada.d(this.a);
        od.y(this.r, s(d, R.dimen.material_helper_text_font_1_3_padding_horizontal, od.w(editText)), s(d, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), s(d, R.dimen.material_helper_text_font_1_3_padding_horizontal, od.x(editText)), 0);
    }

    public final void f(TextView textView, int i) {
        if (this.r == null && this.t == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.r = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.r, -1, -2);
            this.t = new FrameLayout(this.a);
            this.r.addView(this.t, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.a != null) {
                e();
            }
        }
        if (o(i)) {
            this.t.setVisibility(0);
            this.t.addView(textView);
        } else {
            this.r.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.r.setVisibility(0);
        this.s++;
    }

    public final boolean h() {
        return this.e == 1 && this.h != null && !TextUtils.isEmpty(this.f);
    }

    public final int i() {
        TextView textView = this.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final void j(ColorStateList colorStateList) {
        this.k = colorStateList;
        TextView textView = this.h;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void k(int i) {
        this.j = i;
        TextView textView = this.h;
        if (textView != null) {
            this.b.f(textView, i);
        }
    }

    public final void l(CharSequence charSequence) {
        this.i = charSequence;
        TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void m(ColorStateList colorStateList) {
        this.p = colorStateList;
        TextView textView = this.n;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void n(int i) {
        this.o = i;
        TextView textView = this.n;
        if (textView != null) {
            qf.a(textView, i);
        }
    }

    public final void g(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.r == null) {
            return;
        }
        if (!o(i) || (frameLayout = this.t) == null) {
            this.r.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.s - 1;
        this.s = i2;
        LinearLayout linearLayout = this.r;
        if (i2 != 0) {
            return;
        }
        linearLayout.setVisibility(8);
    }
}
