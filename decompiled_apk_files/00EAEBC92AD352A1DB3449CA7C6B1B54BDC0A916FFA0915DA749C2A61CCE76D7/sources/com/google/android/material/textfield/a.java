package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import c.e.a.c.i;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f8187d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.f f8188e;

    /* renamed from: f  reason: collision with root package name */
    private AnimatorSet f8189f;

    /* renamed from: g  reason: collision with root package name */
    private ValueAnimator f8190g;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0159a implements TextWatcher {
        C0159a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!a.b(editable)) {
                a.this.f8189f.cancel();
                a.this.f8190g.start();
            } else if (a.this.f8215a.a()) {
            } else {
                a.this.f8190g.cancel();
                a.this.f8189f.start();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.removeTextChangedListener(a.this.f8187d);
            editText.addTextChangedListener(a.this.f8187d);
        }
    }

    /* loaded from: classes.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f8215a.getEditText().setText((CharSequence) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f8215a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f8215a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f8217c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f8217c.setScaleX(floatValue);
            a.this.f8217c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f8187d = new C0159a();
        this.f8188e = new b();
    }

    private ValueAnimator a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c.e.a.c.l.a.f4733a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Editable editable) {
        return editable.length() > 0;
    }

    private ValueAnimator c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(c.e.a.c.l.a.f4736d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g());
        return ofFloat;
    }

    private void d() {
        ValueAnimator c2 = c();
        ValueAnimator a2 = a(0.0f, 1.0f);
        this.f8189f = new AnimatorSet();
        this.f8189f.playTogether(c2, a2);
        this.f8189f.addListener(new d());
        this.f8190g = a(1.0f, 0.0f);
        this.f8190g.addListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        this.f8215a.setEndIconDrawable(a.a.k.a.a.c(this.f8216b, c.e.a.c.e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f8215a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
        this.f8215a.setEndIconOnClickListener(new c());
        this.f8215a.a(this.f8188e);
        d();
    }
}
