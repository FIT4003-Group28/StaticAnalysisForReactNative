package com.google.android.material.textfield;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.z;
import androidx.core.widget.i;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8218a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f8219b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f8220c;

    /* renamed from: d  reason: collision with root package name */
    private int f8221d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f8222e;

    /* renamed from: f  reason: collision with root package name */
    private int f8223f;

    /* renamed from: g  reason: collision with root package name */
    private Animator f8224g;

    /* renamed from: h  reason: collision with root package name */
    private final float f8225h;
    private int i;
    private int j;
    private CharSequence k;
    private boolean l;
    private TextView m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f8226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f8227b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f8228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f8229d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f8226a = i;
            this.f8227b = textView;
            this.f8228c = i2;
            this.f8229d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.i = this.f8226a;
            f.this.f8224g = null;
            TextView textView = this.f8227b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8228c == 1 && f.this.m != null) {
                    f.this.m.setText((CharSequence) null);
                }
                TextView textView2 = this.f8229d;
                if (textView2 == null) {
                    return;
                }
                textView2.setTranslationY(0.0f);
                this.f8229d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8229d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        this.f8218a = textInputLayout.getContext();
        this.f8219b = textInputLayout;
        this.f8225h = this.f8218a.getResources().getDimensionPixelSize(c.e.a.c.d.design_textinput_caption_translate_y);
    }

    private ObjectAnimator a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f8225h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(c.e.a.c.l.a.f4736d);
        return ofFloat;
    }

    private ObjectAnimator a(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(c.e.a.c.l.a.f4733a);
        return ofFloat;
    }

    private void a(int i, int i2) {
        TextView d2;
        TextView d3;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (d3 = d(i2)) != null) {
            d3.setVisibility(0);
            d3.setAlpha(1.0f);
        }
        if (i != 0 && (d2 = d(i)) != null) {
            d2.setVisibility(4);
            if (i == 1) {
                d2.setText((CharSequence) null);
            }
        }
        this.i = i2;
    }

    private void a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8224g = animatorSet;
            ArrayList arrayList = new ArrayList();
            a(arrayList, this.q, this.r, 2, i, i2);
            a(arrayList, this.l, this.m, 1, i, i2);
            c.e.a.c.l.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, d(i), i, d(i2)));
            animatorSet.start();
        } else {
            a(i, i2);
        }
        this.f8219b.e();
        this.f8219b.a(z);
        this.f8219b.f();
    }

    private void a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i != i3 && i != i2) {
            return;
        }
        list.add(a(textView, i3 == i));
        if (i3 != i) {
            return;
        }
        list.add(a(textView));
    }

    private boolean a(TextView textView, CharSequence charSequence) {
        return v.I(this.f8219b) && this.f8219b.isEnabled() && (this.j != this.i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    private TextView d(int i) {
        if (i != 1) {
            if (i == 2) {
                return this.r;
            }
            return null;
        }
        return this.m;
    }

    private boolean e(int i) {
        return i == 1 && this.m != null && !TextUtils.isEmpty(this.k);
    }

    private boolean m() {
        return (this.f8220c == null || this.f8219b.getEditText() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (m()) {
            v.a(this.f8220c, v.u(this.f8219b.getEditText()), 0, v.t(this.f8219b.getEditText()), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            a(this.m, typeface);
            a(this.r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TextView textView, int i) {
        if (this.f8220c == null && this.f8222e == null) {
            this.f8220c = new LinearLayout(this.f8218a);
            this.f8220c.setOrientation(0);
            this.f8219b.addView(this.f8220c, -1, -2);
            this.f8222e = new FrameLayout(this.f8218a);
            this.f8220c.addView(this.f8222e, -1, new FrameLayout.LayoutParams(-2, -2));
            this.f8220c.addView(new Space(this.f8218a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f8219b.getEditText() != null) {
                a();
            }
        }
        if (a(i)) {
            this.f8222e.setVisibility(0);
            this.f8222e.addView(textView);
            this.f8223f++;
        } else {
            this.f8220c.addView(textView, i);
        }
        this.f8220c.setVisibility(0);
        this.f8221d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        b();
        this.k = charSequence;
        this.m.setText(charSequence);
        if (this.i != 1) {
            this.j = 1;
        }
        a(this.i, this.j, a(this.m, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        if (this.l == z) {
            return;
        }
        b();
        if (z) {
            this.m = new z(this.f8218a);
            this.m.setId(c.e.a.c.f.textinput_error);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.m.setTypeface(typeface);
            }
            b(this.n);
            a(this.o);
            this.m.setVisibility(4);
            v.g(this.m, 1);
            a(this.m, 0);
        } else {
            i();
            b(this.m, 0);
            this.m = null;
            this.f8219b.e();
            this.f8219b.f();
        }
        this.l = z;
    }

    boolean a(int i) {
        return i == 0 || i == 1;
    }

    void b() {
        Animator animator = this.f8224g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.n = i;
        TextView textView = this.m;
        if (textView != null) {
            this.f8219b.a(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f8220c == null) {
            return;
        }
        if (!a(i) || (frameLayout = this.f8222e) == null) {
            this.f8220c.removeView(textView);
        } else {
            this.f8223f--;
            a(frameLayout, this.f8223f);
            this.f8222e.removeView(textView);
        }
        this.f8221d--;
        a(this.f8220c, this.f8221d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(CharSequence charSequence) {
        b();
        this.p = charSequence;
        this.r.setText(charSequence);
        if (this.i != 2) {
            this.j = 2;
        }
        a(this.i, this.j, a(this.r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        if (this.q == z) {
            return;
        }
        b();
        if (z) {
            this.r = new z(this.f8218a);
            this.r.setId(c.e.a.c.f.textinput_helper_text);
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            v.g(this.r, 1);
            c(this.s);
            b(this.t);
            a(this.r, 1);
        } else {
            j();
            b(this.r, 1);
            this.r = null;
            this.f8219b.e();
            this.f8219b.f();
        }
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        this.s = i;
        TextView textView = this.r;
        if (textView != null) {
            i.d(textView, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return e(this.j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        TextView textView = this.m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence g() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        this.k = null;
        b();
        if (this.i == 1) {
            this.j = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        a(this.i, this.j, a(this.m, (CharSequence) null));
    }

    void j() {
        b();
        if (this.i == 2) {
            this.j = 0;
        }
        a(this.i, this.j, a(this.r, (CharSequence) null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.q;
    }
}
