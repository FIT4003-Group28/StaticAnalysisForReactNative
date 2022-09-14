package com.google.android.material.textfield;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.e.a.c.a0.k;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d extends com.google.android.material.textfield.e {
    private static final boolean o;

    /* renamed from: d  reason: collision with root package name */
    private final TextWatcher f8198d;

    /* renamed from: e  reason: collision with root package name */
    private final TextInputLayout.e f8199e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f8200f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8201g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8202h;
    private long i;
    private StateListDrawable j;
    private c.e.a.c.a0.g k;
    private AccessibilityManager l;
    private ValueAnimator m;
    private ValueAnimator n;

    /* loaded from: classes.dex */
    class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0160a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f8204b;

            RunnableC0160a(AutoCompleteTextView autoCompleteTextView) {
                this.f8204b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f8204b.isPopupShowing();
                d.this.a(isPopupShowing);
                d.this.f8201g = isPopupShowing;
            }
        }

        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a(dVar.f8215a.getEditText());
            a2.post(new RunnableC0160a(a2));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    class b extends TextInputLayout.e {
        b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            cVar.a((CharSequence) Spinner.class.getName());
            if (cVar.u()) {
                cVar.d((CharSequence) null);
            }
        }

        @Override // a.g.m.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            d dVar = d.this;
            AutoCompleteTextView a2 = dVar.a(dVar.f8215a.getEditText());
            if (accessibilityEvent.getEventType() != 1 || !d.this.l.isTouchExplorationEnabled()) {
                return;
            }
            d.this.d(a2);
        }
    }

    /* loaded from: classes.dex */
    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a2 = d.this.a(textInputLayout.getEditText());
            d.this.b(a2);
            d.this.a(a2);
            d.this.c(a2);
            a2.setThreshold(0);
            a2.removeTextChangedListener(d.this.f8198d);
            a2.addTextChangedListener(d.this.f8198d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f8199e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnClickListenerC0161d implements View.OnClickListener {
        View$OnClickListenerC0161d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.d((AutoCompleteTextView) d.this.f8215a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f8209b;

        e(AutoCompleteTextView autoCompleteTextView) {
            this.f8209b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.d()) {
                    d.this.f8201g = false;
                }
                d.this.d(this.f8209b);
                view.performClick();
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements View.OnFocusChangeListener {
        f() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f8215a.setEndIconActivated(z);
            if (!z) {
                d.this.a(false);
                d.this.f8201g = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements AutoCompleteTextView.OnDismissListener {
        g() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f8201g = true;
            d.this.i = System.currentTimeMillis();
            d.this.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f8217c.setChecked(dVar.f8202h);
            d.this.n.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f8217c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    static {
        o = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f8198d = new a();
        this.f8199e = new b(this.f8215a);
        this.f8200f = new c();
        this.f8201g = false;
        this.f8202h = false;
        this.i = Long.MAX_VALUE;
    }

    private ValueAnimator a(int i2, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(c.e.a.c.l.a.f4733a);
        ofFloat.setDuration(i2);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AutoCompleteTextView a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private c.e.a.c.a0.g a(float f2, float f3, float f4, int i2) {
        k.b n = k.n();
        n.d(f2);
        n.e(f2);
        n.b(f3);
        n.c(f3);
        k a2 = n.a();
        c.e.a.c.a0.g a3 = c.e.a.c.a0.g.a(this.f8216b, f4);
        a3.setShapeAppearanceModel(a2);
        a3.a(0, i2, 0, i2);
        return a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() != null) {
            return;
        }
        int boxBackgroundMode = this.f8215a.getBoxBackgroundMode();
        c.e.a.c.a0.g boxBackground = this.f8215a.getBoxBackground();
        int a2 = c.e.a.c.q.a.a(autoCompleteTextView, c.e.a.c.b.colorControlHighlight);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            b(autoCompleteTextView, a2, iArr, boxBackground);
        } else if (boxBackgroundMode != 1) {
        } else {
            a(autoCompleteTextView, a2, iArr, boxBackground);
        }
    }

    private void a(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.e.a.c.a0.g gVar) {
        int boxBackgroundColor = this.f8215a.getBoxBackgroundColor();
        int[] iArr2 = {c.e.a.c.q.a.a(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (o) {
            v.a(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        c.e.a.c.a0.g gVar2 = new c.e.a.c.a0.g(gVar.k());
        gVar2.a(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int u = v.u(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int t = v.t(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        v.a(autoCompleteTextView, layerDrawable);
        v.a(autoCompleteTextView, u, paddingTop, t, paddingBottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.f8202h != z) {
            this.f8202h = z;
            this.n.cancel();
            this.m.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (o) {
            int boxBackgroundMode = this.f8215a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.k;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.j;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    private void b(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.e.a.c.a0.g gVar) {
        LayerDrawable layerDrawable;
        int a2 = c.e.a.c.q.a.a(autoCompleteTextView, c.e.a.c.b.colorSurface);
        c.e.a.c.a0.g gVar2 = new c.e.a.c.a0.g(gVar.k());
        int a3 = c.e.a.c.q.a.a(i2, a2, 0.1f);
        gVar2.a(new ColorStateList(iArr, new int[]{a3, 0}));
        if (o) {
            gVar2.setTint(a2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a3, a2});
            c.e.a.c.a0.g gVar3 = new c.e.a.c.a0.g(gVar.k());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        v.a(autoCompleteTextView, layerDrawable);
    }

    private void c() {
        this.n = a(67, 0.0f, 1.0f);
        this.m = a(50, 1.0f, 0.0f);
        this.m.addListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new e(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(new f());
        if (o) {
            autoCompleteTextView.setOnDismissListener(new g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (d()) {
            this.f8201g = false;
        }
        if (this.f8201g) {
            this.f8201g = false;
            return;
        }
        if (o) {
            a(!this.f8202h);
        } else {
            this.f8202h = !this.f8202h;
            this.f8217c.toggle();
        }
        if (!this.f8202h) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        long currentTimeMillis = System.currentTimeMillis() - this.i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f8216b.getResources().getDimensionPixelOffset(c.e.a.c.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f8216b.getResources().getDimensionPixelOffset(c.e.a.c.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f8216b.getResources().getDimensionPixelOffset(c.e.a.c.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        c.e.a.c.a0.g a2 = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        c.e.a.c.a0.g a3 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = a2;
        this.j = new StateListDrawable();
        this.j.addState(new int[]{16842922}, a2);
        this.j.addState(new int[0], a3);
        this.f8215a.setEndIconDrawable(a.a.k.a.a.c(this.f8216b, o ? c.e.a.c.e.mtrl_dropdown_arrow : c.e.a.c.e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f8215a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c.e.a.c.i.exposed_dropdown_menu_content_description));
        this.f8215a.setEndIconOnClickListener(new View$OnClickListenerC0161d());
        this.f8215a.a(this.f8200f);
        c();
        v.h(this.f8217c, 2);
        this.l = (AccessibilityManager) this.f8216b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean a(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b() {
        return true;
    }
}
