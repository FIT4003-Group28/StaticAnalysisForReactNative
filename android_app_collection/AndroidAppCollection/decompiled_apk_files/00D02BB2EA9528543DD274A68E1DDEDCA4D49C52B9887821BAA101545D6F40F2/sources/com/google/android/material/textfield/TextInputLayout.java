package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.maps.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout {
    private ColorStateList A;
    private ColorStateList B;
    private CharSequence C;
    private final TextView D;
    private final TextView E;
    private boolean F;
    private CharSequence G;
    private dadr H;
    private dadx I;
    private final int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private final Rect P;
    private final Rect Q;
    private final RectF R;
    private Typeface S;
    private final CheckableImageButton T;
    private ColorStateList U;
    private boolean V;
    private PorterDuff.Mode W;
    public EditText a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private ValueAnimator aH;
    private boolean aI;
    private boolean aa;
    private Drawable ab;
    private int ac;
    private View.OnLongClickListener ad;
    private final LinkedHashSet<dahw> ae;
    private int af;
    private final SparseArray<dahf> ag;
    private final LinkedHashSet<dahx> ah;
    private ColorStateList ai;
    private boolean aj;
    private PorterDuff.Mode ak;
    private boolean al;
    private Drawable am;
    private int an;
    private Drawable ao;
    private View.OnLongClickListener ap;
    private View.OnLongClickListener aq;
    private final CheckableImageButton ar;
    private ColorStateList as;
    private ColorStateList at;
    private ColorStateList au;
    private int av;
    private int aw;
    private int ax;
    private ColorStateList ay;
    private int az;
    public boolean b;
    public int c;
    public boolean d;
    public TextView e;
    public boolean f;
    public CharSequence g;
    public boolean h;
    public dadr i;
    public int j;
    public int k;
    public final CheckableImageButton l;
    public final daaj m;
    public boolean n;
    private final FrameLayout o;
    private final LinearLayout p;
    private final LinearLayout q;
    private final FrameLayout r;
    private CharSequence s;
    private final dahh t;
    private int u;
    private int v;
    private CharSequence w;
    private TextView x;
    private ColorStateList y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final void A() {
        TextView textView = this.D;
        int i = 8;
        if (this.C != null && !this.aE) {
            i = 0;
        }
        textView.setVisibility(i);
        Q();
    }

    private final void B() {
        if (this.a == null) {
            return;
        }
        od.y(this.D, i() ? 0 : od.w(this.a), this.a.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.getCompoundPaddingBottom());
    }

    private final void C() {
        int visibility = this.E.getVisibility();
        int i = 0;
        boolean z = this.g != null && !this.aE;
        TextView textView = this.E;
        if (true != z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.E.getVisibility()) {
            M().b(z);
        }
        Q();
    }

    private final void D() {
        if (this.a == null) {
            return;
        }
        int i = 0;
        if (!l() && this.ar.getVisibility() != 0) {
            i = od.x(this.a);
        }
        od.y(this.E, getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.getPaddingTop(), i, this.a.getPaddingBottom());
    }

    private static void E(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                E((ViewGroup) childAt, z);
            }
        }
    }

    private final int G() {
        float h;
        if (!this.F) {
            return 0;
        }
        int i = this.j;
        if (i == 0 || i == 1) {
            h = this.m.h();
        } else if (i != 2) {
            return 0;
        } else {
            h = this.m.h() / 2.0f;
        }
        return (int) h;
    }

    private final int H(int i, boolean z) {
        int compoundPaddingLeft = i + this.a.getCompoundPaddingLeft();
        return (this.C == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.D.getMeasuredWidth()) + this.D.getPaddingLeft();
    }

    private final int I(int i, boolean z) {
        int compoundPaddingRight = i - this.a.getCompoundPaddingRight();
        return (this.C == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.D.getMeasuredWidth() - this.D.getPaddingRight());
    }

    private final boolean J() {
        return this.j == 1 && this.a.getMinLines() <= 1;
    }

    private final void K() {
        dadr dadrVar = this.i;
        if (dadrVar == null) {
            return;
        }
        dadrVar.setShapeAppearanceModel(this.I);
        if (this.j == 2 && L()) {
            this.i.S(this.L, this.O);
        }
        int i = this.k;
        if (this.j == 1) {
            i = kc.a(this.k, czxb.a(getContext(), R.attr.colorSurface, 0));
        }
        this.k = i;
        this.i.Q(ColorStateList.valueOf(i));
        if (this.af == 3) {
            this.a.getBackground().invalidateSelf();
        }
        if (this.H != null) {
            if (L()) {
                this.H.Q(ColorStateList.valueOf(this.O));
            }
            invalidate();
        }
        invalidate();
    }

    private final boolean L() {
        return this.L >= 0 && this.O != 0;
    }

    private final dahf M() {
        dahf dahfVar = this.ag.get(this.af);
        return dahfVar != null ? dahfVar : this.ag.get(0);
    }

    private final void N() {
        Z(this.T, this.V, this.U, this.aa, this.W);
    }

    private final boolean O() {
        return this.af != 0;
    }

    private final void P() {
        Z(this.l, this.aj, this.ai, this.al, this.ak);
    }

    private final boolean Q() {
        boolean z;
        if (this.a != null) {
            CheckableImageButton checkableImageButton = null;
            boolean z2 = true;
            if ((this.T.getDrawable() != null || this.C != null) && this.p.getMeasuredWidth() > 0) {
                int measuredWidth = this.p.getMeasuredWidth() - this.a.getPaddingLeft();
                if (this.ab == null || this.ac != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.ab = colorDrawable;
                    this.ac = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                Drawable drawable2 = this.ab;
                if (drawable != drawable2) {
                    this.a.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                }
                z = false;
            } else {
                if (this.ab != null) {
                    Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                    this.a.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    this.ab = null;
                    z = true;
                }
                z = false;
            }
            if ((this.ar.getVisibility() == 0 || ((O() && l()) || this.g != null)) && this.q.getMeasuredWidth() > 0) {
                int measuredWidth2 = this.E.getMeasuredWidth() - this.a.getPaddingRight();
                if (this.ar.getVisibility() == 0) {
                    checkableImageButton = this.ar;
                } else if (O() && l()) {
                    checkableImageButton = this.l;
                }
                if (checkableImageButton != null) {
                    measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
                }
                Drawable[] compoundDrawablesRelative3 = this.a.getCompoundDrawablesRelative();
                Drawable drawable3 = this.am;
                if (drawable3 == null || this.an == measuredWidth2) {
                    if (drawable3 == null) {
                        ColorDrawable colorDrawable2 = new ColorDrawable();
                        this.am = colorDrawable2;
                        this.an = measuredWidth2;
                        colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                    }
                    Drawable drawable4 = compoundDrawablesRelative3[2];
                    Drawable drawable5 = this.am;
                    if (drawable4 != drawable5) {
                        this.ao = drawable4;
                        this.a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                        return true;
                    }
                } else {
                    this.an = measuredWidth2;
                    drawable3.setBounds(0, 0, measuredWidth2, 1);
                    this.a.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.am, compoundDrawablesRelative3[3]);
                    return true;
                }
            } else if (this.am != null) {
                Drawable[] compoundDrawablesRelative4 = this.a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative4[2] == this.am) {
                    this.a.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.ao, compoundDrawablesRelative4[3]);
                } else {
                    z2 = z;
                }
                this.am = null;
                return z2;
            }
            return z;
        }
        return false;
    }

    private static void R(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        T(checkableImageButton, onLongClickListener);
    }

    private static void S(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        T(checkableImageButton, onLongClickListener);
    }

    private static void T(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean al = od.al(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (al || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(al);
        checkableImageButton.setPressable(al);
        checkableImageButton.setLongClickable(z2);
        if (true != z) {
            i = 2;
        }
        od.m(checkableImageButton, i);
    }

    private final boolean U() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.i instanceof dags);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.V():void");
    }

    private final void W(boolean z, boolean z2) {
        int defaultColor = this.ay.getDefaultColor();
        int colorForState = this.ay.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.ay.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.O = colorForState2;
        } else if (z2) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    private final void X(boolean z) {
        int i = 8;
        this.ar.setVisibility(true != z ? 8 : 0);
        FrameLayout frameLayout = this.r;
        if (true != z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
        D();
        if (!O()) {
            Q();
        }
    }

    private final void Y(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = ks.b(drawable).mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private static final void Z(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            if (!z) {
                if (z2) {
                    z2 = true;
                }
            }
            drawable = ks.b(drawable).mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private final void t() {
        if (this.j != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o.getLayoutParams();
            int G = G();
            if (G == layoutParams.topMargin) {
                return;
            }
            layoutParams.topMargin = G;
            this.o.requestLayout();
        }
    }

    private final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.a;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.a;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean h = this.t.h();
        ColorStateList colorStateList2 = this.at;
        if (colorStateList2 != null) {
            this.m.c(colorStateList2);
            this.m.d(this.at);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.at;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.aD);
            } else {
                i = this.aD;
            }
            this.m.c(ColorStateList.valueOf(i));
            this.m.d(ColorStateList.valueOf(i));
        } else if (h) {
            daaj daajVar = this.m;
            TextView textView2 = this.t.h;
            daajVar.c(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.d && (textView = this.e) != null) {
            this.m.c(textView.getTextColors());
        } else if (z4 && (colorStateList = this.au) != null) {
            this.m.c(colorStateList);
        }
        if (z3 || !this.aF || (isEnabled() && z4)) {
            if (!z2 && !this.aE) {
                return;
            }
            ValueAnimator valueAnimator = this.aH;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.aH.cancel();
            }
            if (!z || !this.aG) {
                this.m.q(1.0f);
            } else {
                r(1.0f);
            }
            this.aE = false;
            if (U()) {
                V();
            }
            y();
            A();
            C();
        } else if (!z2 && this.aE) {
        } else {
            ValueAnimator valueAnimator2 = this.aH;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aH.cancel();
            }
            if (!z || !this.aG) {
                this.m.q(0.0f);
            } else {
                r(0.0f);
            }
            if (U() && !((dags) this.i).a.isEmpty() && U()) {
                ((dags) this.i).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.aE = true;
            z();
            A();
            C();
        }
    }

    private final void v(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.G)) {
            this.G = charSequence;
            this.m.w(charSequence);
            if (this.aE) {
                return;
            }
            V();
        }
    }

    private final void w() {
        if (this.e != null) {
            EditText editText = this.a;
            d(editText == null ? 0 : editText.getText().length());
        }
    }

    private final void x(boolean z) {
        if (this.f == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.x = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            od.v(this.x, 1);
            setPlaceholderTextAppearance(this.z);
            setPlaceholderTextColor(this.y);
            TextView textView = this.x;
            if (textView != null) {
                this.o.addView(textView);
                this.x.setVisibility(0);
            }
        } else {
            TextView textView2 = this.x;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.x = null;
        }
        this.f = z;
    }

    private final void y() {
        EditText editText = this.a;
        e(editText == null ? 0 : editText.getText().length());
    }

    private final void z() {
        TextView textView = this.x;
        if (textView == null || !this.f) {
            return;
        }
        textView.setText((CharSequence) null);
        this.x.setVisibility(4);
    }

    public final void a(boolean z) {
        u(z, false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.o.addView(view, layoutParams2);
            this.o.setLayoutParams(layoutParams);
            t();
            EditText editText = (EditText) view;
            if (this.a == null) {
                this.a = editText;
                s();
                setTextInputAccessibilityDelegate(new dahv(this));
                this.m.p(this.a.getTypeface());
                this.m.b(this.a.getTextSize());
                int gravity = this.a.getGravity();
                this.m.k((gravity & (-113)) | 48);
                this.m.j(gravity);
                this.a.addTextChangedListener(new dahr(this));
                if (this.at == null) {
                    this.at = this.a.getHintTextColors();
                }
                if (this.F) {
                    if (TextUtils.isEmpty(this.G)) {
                        CharSequence hint = this.a.getHint();
                        this.s = hint;
                        setHint(hint);
                        this.a.setHint((CharSequence) null);
                    }
                    this.h = true;
                }
                if (this.e != null) {
                    d(this.a.getText().length());
                }
                g();
                this.t.e();
                this.p.bringToFront();
                this.q.bringToFront();
                this.r.bringToFront();
                this.ar.bringToFront();
                Iterator<dahw> it = this.ae.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
                B();
                D();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                u(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public final CharSequence b() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final boolean c() {
        return this.t.m;
    }

    public final void d(int i) {
        boolean z = this.d;
        int i2 = this.c;
        if (i2 == -1) {
            this.e.setText(String.valueOf(i));
            this.e.setContentDescription(null);
            this.d = false;
        } else {
            this.d = i > i2;
            Context context = getContext();
            TextView textView = this.e;
            int i3 = this.c;
            int i4 = true != this.d ? R.string.character_counter_content_description : R.string.character_counter_overflowed_content_description;
            Integer valueOf = Integer.valueOf(i);
            textView.setContentDescription(context.getString(i4, valueOf, Integer.valueOf(i3)));
            if (z != this.d) {
                F();
            }
            this.e.setText(alp.a().b(getContext().getString(R.string.character_counter_pattern, valueOf, Integer.valueOf(this.c))));
        }
        if (this.a == null || z == this.d) {
            return;
        }
        a(false);
        q();
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.a;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.s != null) {
            boolean z = this.h;
            this.h = false;
            CharSequence hint = editText.getHint();
            this.a.setHint(this.s);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.a.setHint(hint);
                this.h = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.o.getChildCount());
        for (int i2 = 0; i2 < this.o.getChildCount(); i2++) {
            View childAt = this.o.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.a) {
                newChild.setHint(b());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.n = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.n = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.F) {
            this.m.t(canvas);
        }
        dadr dadrVar = this.H;
        if (dadrVar != null) {
            Rect bounds = dadrVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.H.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aI) {
            return;
        }
        boolean z = true;
        this.aI = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        daaj daajVar = this.m;
        boolean r = daajVar != null ? daajVar.r(drawableState) : false;
        if (this.a != null) {
            if (!od.ae(this) || !isEnabled()) {
                z = false;
            }
            a(z);
        }
        g();
        q();
        if (r) {
            invalidate();
        }
        this.aI = false;
    }

    public final void f(TextView textView, int i) {
        try {
            qf.a(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            qf.a(textView, com.google.android.filament.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(akm.c(getContext(), R.color.design_error));
        }
    }

    public final void g() {
        Drawable background;
        TextView textView;
        EditText editText = this.a;
        if (editText == null || this.j != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (ze.c(background)) {
            background = background.mutate();
        }
        if (this.t.h()) {
            background.setColorFilter(xi.f(this.t.i(), PorterDuff.Mode.SRC_IN));
        } else if (!this.d || (textView = this.e) == null) {
            ks.a(background);
            this.a.refreshDrawableState();
        } else {
            background.setColorFilter(xi.f(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.a;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + G();
        }
        return super.getBaseline();
    }

    public final CharSequence h() {
        dahh dahhVar = this.t;
        if (dahhVar.g) {
            return dahhVar.f;
        }
        return null;
    }

    public final boolean i() {
        return this.T.getVisibility() == 0;
    }

    public final void j() {
        Y(this.T, this.U);
    }

    public final void k() {
        Y(this.ar, this.as);
    }

    public final boolean l() {
        return this.r.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final void m() {
        Y(this.l, this.ai);
    }

    public final Drawable n() {
        return this.l.getDrawable();
    }

    public final void o(dahx dahxVar) {
        this.ah.add(dahxVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.a;
        if (editText != null) {
            Rect rect = this.P;
            daak.a(this, editText, rect);
            if (this.H != null) {
                this.H.setBounds(rect.left, rect.bottom - this.N, rect.right, rect.bottom);
            }
            if (!this.F) {
                return;
            }
            this.m.b(this.a.getTextSize());
            int gravity = this.a.getGravity();
            this.m.k((gravity & (-113)) | 48);
            this.m.j(gravity);
            daaj daajVar = this.m;
            if (this.a != null) {
                Rect rect2 = this.Q;
                boolean z2 = od.s(this) == 1;
                rect2.bottom = rect.bottom;
                int i5 = this.j;
                if (i5 == 1) {
                    rect2.left = H(rect.left, z2);
                    rect2.top = rect.top + this.K;
                    rect2.right = I(rect.right, z2);
                } else if (i5 == 2) {
                    rect2.left = rect.left + this.a.getPaddingLeft();
                    rect2.top = rect.top - G();
                    rect2.right = rect.right - this.a.getPaddingRight();
                } else {
                    rect2.left = H(rect.left, z2);
                    rect2.top = getPaddingTop();
                    rect2.right = I(rect.right, z2);
                }
                daajVar.f(rect2.left, rect2.top, rect2.right, rect2.bottom);
                daaj daajVar2 = this.m;
                if (this.a != null) {
                    Rect rect3 = this.Q;
                    TextPaint textPaint = daajVar2.h;
                    textPaint.setTextSize(daajVar2.c);
                    textPaint.setTypeface(daajVar2.e);
                    textPaint.setLetterSpacing(daajVar2.j);
                    float f = -daajVar2.h.ascent();
                    rect3.left = rect.left + this.a.getCompoundPaddingLeft();
                    if (J()) {
                        compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                    } else {
                        compoundPaddingTop = rect.top + this.a.getCompoundPaddingTop();
                    }
                    rect3.top = compoundPaddingTop;
                    rect3.right = rect.right - this.a.getCompoundPaddingRight();
                    if (J()) {
                        compoundPaddingBottom = (int) (rect3.top + f);
                    } else {
                        compoundPaddingBottom = rect.bottom - this.a.getCompoundPaddingBottom();
                    }
                    rect3.bottom = compoundPaddingBottom;
                    daajVar2.e(rect3.left, rect3.top, rect3.right, rect3.bottom);
                    this.m.v();
                    if (!U() || this.aE) {
                        return;
                    }
                    V();
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.a != null && this.a.getMeasuredHeight() < (max = Math.max(this.q.getMeasuredHeight(), this.p.getMeasuredHeight()))) {
            this.a.setMinimumHeight(max);
            z = true;
        }
        boolean Q = Q();
        if (z || Q) {
            this.a.post(new daht(this));
        }
        if (this.x != null && (editText = this.a) != null) {
            this.x.setGravity(editText.getGravity());
            this.x.setPadding(this.a.getCompoundPaddingLeft(), this.a.getCompoundPaddingTop(), this.a.getCompoundPaddingRight(), this.a.getCompoundPaddingBottom());
        }
        B();
        D();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setError(savedState.a);
        if (savedState.b) {
            this.l.post(new dahs(this));
        }
        setHint(savedState.e);
        setHelperText(savedState.f);
        setPlaceholderText(savedState.g);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.t.h()) {
            savedState.a = h();
        }
        boolean z = false;
        if (O() && this.l.a) {
            z = true;
        }
        savedState.b = z;
        savedState.e = b();
        dahh dahhVar = this.t;
        CharSequence charSequence = null;
        savedState.f = dahhVar.m ? dahhVar.l : null;
        if (this.f) {
            charSequence = this.w;
        }
        savedState.g = charSequence;
        return savedState;
    }

    public final void p(dahw dahwVar) {
        this.ae.add(dahwVar);
        if (this.a != null) {
            dahwVar.a(this);
        }
    }

    public final void q() {
        int i;
        TextView textView;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.i == null || this.j == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.a) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.a) != null && editText.isHovered());
        if (!isEnabled()) {
            this.O = this.aD;
        } else if (!this.t.h()) {
            if (!this.d || (textView = this.e) == null) {
                i = z2 ? this.ax : z3 ? this.aw : this.av;
            } else if (this.ay != null) {
                W(z2, z3);
            } else {
                i = textView.getCurrentTextColor();
            }
            this.O = i;
        } else if (this.ay != null) {
            W(z2, z3);
        } else {
            this.O = this.t.i();
        }
        if (this.ar.getDrawable() != null) {
            dahh dahhVar = this.t;
            if (dahhVar.g && dahhVar.h()) {
                z = true;
            }
        }
        X(z);
        k();
        j();
        m();
        if (M().l()) {
            if (!this.t.h() || n() == null) {
                P();
            } else {
                Drawable mutate = ks.b(n()).mutate();
                mutate.setTint(this.t.i());
                this.l.setImageDrawable(mutate);
            }
        }
        if (!z2 || !isEnabled()) {
            this.L = this.M;
        } else {
            this.L = this.N;
        }
        if (this.j == 1) {
            if (!isEnabled()) {
                this.k = this.aA;
            } else {
                if (!z3 || z2) {
                    i2 = z2 ? this.aB : this.az;
                } else {
                    i2 = this.aC;
                }
                this.k = i2;
            }
        }
        K();
    }

    final void r(float f) {
        if (this.m.a == f) {
            return;
        }
        if (this.aH == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aH = valueAnimator;
            valueAnimator.setInterpolator(czum.b);
            this.aH.setDuration(167L);
            this.aH.addUpdateListener(new dahu(this));
        }
        this.aH.setFloatValues(this.m.a, f);
        this.aH.start();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.k != i) {
            this.k = i;
            this.az = i;
            this.aB = i;
            this.aC = i;
            K();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(akm.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.az = defaultColor;
        this.k = defaultColor;
        this.aA = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.aB = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.aC = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        K();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.j) {
            return;
        }
        this.j = i;
        if (this.a == null) {
            return;
        }
        s();
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        dadr dadrVar = this.i;
        if (dadrVar != null && dadrVar.ah() == f && this.i.ai() == f2 && this.i.ak() == f4 && this.i.aj() == f3) {
            return;
        }
        dadw e = this.I.e();
        e.f(f);
        e.h(f2);
        e.d(f4);
        e.c(f3);
        this.I = e.b();
        K();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.ax != i) {
            this.ax = i;
            q();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.av = colorStateList.getDefaultColor();
            this.aD = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.aw = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.ax = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.ax != colorStateList.getDefaultColor()) {
            this.ax = colorStateList.getDefaultColor();
        }
        q();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.ay != colorStateList) {
            this.ay = colorStateList;
            q();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.M = i;
        q();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.N = i;
        q();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.b != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.e = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.S;
                if (typeface != null) {
                    this.e.setTypeface(typeface);
                }
                this.e.setMaxLines(1);
                this.t.f(this.e, 2);
                ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                F();
                w();
            } else {
                this.t.g(this.e, 2);
                this.e = null;
            }
            this.b = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.c != i) {
            if (i > 0) {
                this.c = i;
            } else {
                this.c = -1;
            }
            if (!this.b) {
                return;
            }
            w();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.u != i) {
            this.u = i;
            F();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            F();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.v != i) {
            this.v = i;
            F();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            F();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.at = colorStateList;
        this.au = colorStateList;
        if (this.a != null) {
            a(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        E(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? sl.b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.af;
        this.af = i;
        Iterator<dahx> it = this.ah.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (M().m(this.j)) {
            M().a();
            P();
            return;
        }
        int i3 = this.j;
        StringBuilder sb = new StringBuilder(93);
        sb.append("The current box background mode ");
        sb.append(i3);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        R(this.l, onClickListener, this.ap);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ap = onLongClickListener;
        S(this.l, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.ai != colorStateList) {
            this.ai = colorStateList;
            this.aj = true;
            P();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.ak != mode) {
            this.ak = mode;
            this.al = true;
            P();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (l() != z) {
            this.l.setVisibility(true != z ? 8 : 0);
            D();
            Q();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.t.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            dahh dahhVar = this.t;
            dahhVar.d();
            dahhVar.f = charSequence;
            dahhVar.h.setText(charSequence);
            int i = dahhVar.d;
            if (i != 1) {
                dahhVar.e = 1;
            }
            dahhVar.c(i, dahhVar.e, dahhVar.b(dahhVar.h, charSequence));
            return;
        }
        this.t.a();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.t.l(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        dahh dahhVar = this.t;
        if (dahhVar.g == z) {
            return;
        }
        dahhVar.d();
        if (z) {
            dahhVar.h = new AppCompatTextView(dahhVar.a);
            dahhVar.h.setId(R.id.textinput_error);
            dahhVar.h.setTextAlignment(5);
            Typeface typeface = dahhVar.q;
            if (typeface != null) {
                dahhVar.h.setTypeface(typeface);
            }
            dahhVar.k(dahhVar.j);
            dahhVar.j(dahhVar.k);
            dahhVar.l(dahhVar.i);
            dahhVar.h.setVisibility(4);
            od.v(dahhVar.h, 1);
            dahhVar.f(dahhVar.h, 0);
        } else {
            dahhVar.a();
            dahhVar.g(dahhVar.h, 0);
            dahhVar.h = null;
            dahhVar.b.g();
            dahhVar.b.q();
        }
        dahhVar.g = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? sl.b(getContext(), i) : null);
        k();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        R(this.ar, onClickListener, this.aq);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.aq = onLongClickListener;
        S(this.ar, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.as = colorStateList;
        Drawable drawable = this.ar.getDrawable();
        if (drawable != null) {
            drawable = ks.b(drawable).mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.ar.getDrawable() != drawable) {
            this.ar.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.ar.getDrawable();
        if (drawable != null) {
            drawable = ks.b(drawable).mutate();
            drawable.setTintMode(mode);
        }
        if (this.ar.getDrawable() != drawable) {
            this.ar.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.t.k(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.t.j(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.aF != z) {
            this.aF = z;
            a(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (!c()) {
                return;
            }
            setHelperTextEnabled(false);
            return;
        }
        if (!c()) {
            setHelperTextEnabled(true);
        }
        dahh dahhVar = this.t;
        dahhVar.d();
        dahhVar.l = charSequence;
        dahhVar.n.setText(charSequence);
        int i = dahhVar.d;
        if (i != 2) {
            dahhVar.e = 2;
        }
        dahhVar.c(i, dahhVar.e, dahhVar.b(dahhVar.n, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.t.m(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        dahh dahhVar = this.t;
        if (dahhVar.m == z) {
            return;
        }
        dahhVar.d();
        if (z) {
            dahhVar.n = new AppCompatTextView(dahhVar.a);
            dahhVar.n.setId(R.id.textinput_helper_text);
            dahhVar.n.setTextAlignment(5);
            Typeface typeface = dahhVar.q;
            if (typeface != null) {
                dahhVar.n.setTypeface(typeface);
            }
            dahhVar.n.setVisibility(4);
            od.v(dahhVar.n, 1);
            dahhVar.n(dahhVar.o);
            dahhVar.m(dahhVar.p);
            dahhVar.f(dahhVar.n, 1);
        } else {
            dahhVar.d();
            int i = dahhVar.d;
            if (i == 2) {
                dahhVar.e = 0;
            }
            dahhVar.c(i, dahhVar.e, dahhVar.b(dahhVar.n, null));
            dahhVar.g(dahhVar.n, 1);
            dahhVar.n = null;
            dahhVar.b.g();
            dahhVar.b.q();
        }
        dahhVar.m = z;
    }

    public void setHelperTextTextAppearance(int i) {
        this.t.n(i);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.aG = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.F) {
            this.F = z;
            if (!z) {
                this.h = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.a.getHint())) {
                    this.a.setHint(this.G);
                }
                v(null);
            } else {
                CharSequence hint = this.a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.a.setHint((CharSequence) null);
                }
                this.h = true;
            }
            if (this.a == null) {
                return;
            }
            t();
        }
    }

    public void setHintTextAppearance(int i) {
        this.m.l(i);
        this.au = this.m.d;
        if (this.a != null) {
            a(false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.au != colorStateList) {
            if (this.at == null) {
                this.m.c(colorStateList);
            }
            this.au = colorStateList;
            if (this.a == null) {
                return;
            }
            a(false);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? sl.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.ai = colorStateList;
        this.aj = true;
        P();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.ak = mode;
        this.al = true;
        P();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f && TextUtils.isEmpty(charSequence)) {
            x(false);
        } else {
            if (!this.f) {
                x(true);
            }
            this.w = charSequence;
        }
        y();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.z = i;
        TextView textView = this.x;
        if (textView != null) {
            qf.a(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            TextView textView = this.x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.C = true != TextUtils.isEmpty(charSequence) ? charSequence : null;
        this.D.setText(charSequence);
        A();
    }

    public void setPrefixTextAppearance(int i) {
        qf.a(this.D, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.T.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? sl.b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        R(this.T, onClickListener, this.ad);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.ad = onLongClickListener;
        S(this.T, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            this.V = true;
            N();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.W != mode) {
            this.W = mode;
            this.aa = true;
            N();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (i() != z) {
            this.T.setVisibility(true != z ? 8 : 0);
            B();
            Q();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.g = true != TextUtils.isEmpty(charSequence) ? charSequence : null;
        this.E.setText(charSequence);
        C();
    }

    public void setSuffixTextAppearance(int i) {
        qf.a(this.E, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(dahv dahvVar) {
        EditText editText = this.a;
        if (editText != null) {
            od.c(editText, dahvVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.S) {
            this.S = typeface;
            this.m.p(typeface);
            dahh dahhVar = this.t;
            if (typeface != dahhVar.q) {
                dahhVar.q = typeface;
                dahh.p(dahhVar.h, typeface);
                dahh.p(dahhVar.n, typeface);
            }
            TextView textView = this.e;
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public final void e(int i) {
        if (i != 0 || this.aE) {
            z();
            return;
        }
        TextView textView = this.x;
        if (textView == null || !this.f) {
            return;
        }
        textView.setText(this.w);
        this.x.setVisibility(0);
        this.x.bringToFront();
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (this.l.getContentDescription() != charSequence) {
            this.l.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.l.setImageDrawable(drawable);
        m();
    }

    public void setHint(CharSequence charSequence) {
        if (this.F) {
            v(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (!z) {
            setEndIconMode(0);
        } else if (this.af == 1) {
        } else {
            setEndIconMode(1);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (this.T.getContentDescription() != charSequence) {
            this.T.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.T.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            j();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(daib.a(context, attributeSet, i, 2132018545), attributeSet, i);
        int i2;
        this.t = new dahh(this);
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new RectF();
        this.ae = new LinkedHashSet<>();
        this.af = 0;
        SparseArray<dahf> sparseArray = new SparseArray<>();
        this.ag = sparseArray;
        this.ah = new LinkedHashSet<>();
        daaj daajVar = new daaj(this);
        this.m = daajVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.o = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.p = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.q = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.r = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        daajVar.a(czum.a);
        daajVar.i = czum.a;
        daajVar.v();
        daajVar.k(8388659);
        int[] iArr = dahq.c;
        daaz.b(context2, attributeSet, i, 2132018545);
        daaz.c(context2, attributeSet, iArr, i, 2132018545, 18, 16, 31, 36, 40);
        aeq b = aeq.b(context2, attributeSet, iArr, i, 2132018545);
        this.F = b.h(39, true);
        setHint(b.f(2));
        this.aG = b.h(38, true);
        this.aF = b.h(33, true);
        this.I = dadx.b(context2, attributeSet, i, 2132018545).b();
        this.J = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.K = b.l(5, 0);
        this.M = b.m(12, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.N = b.m(13, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.L = this.M;
        float r = b.r(9);
        float r2 = b.r(8);
        float r3 = b.r(6);
        float r4 = b.r(7);
        dadw e = this.I.e();
        if (r >= 0.0f) {
            e.f(r);
        }
        if (r2 >= 0.0f) {
            e.h(r2);
        }
        if (r3 >= 0.0f) {
            e.d(r3);
        }
        if (r4 >= 0.0f) {
            e.c(r4);
        }
        this.I = e.b();
        ColorStateList b2 = dada.b(context2, b, 3);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.az = defaultColor;
            this.k = defaultColor;
            if (b2.isStateful()) {
                i2 = -1;
                this.aA = b2.getColorForState(new int[]{-16842910}, -1);
                this.aB = b2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.aC = b2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                i2 = -1;
                this.aB = this.az;
                ColorStateList a = sl.a(context2, R.color.mtrl_filled_background_color);
                this.aA = a.getColorForState(new int[]{-16842910}, -1);
                this.aC = a.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            i2 = -1;
            this.k = 0;
            this.az = 0;
            this.aA = 0;
            this.aB = 0;
            this.aC = 0;
        }
        if (b.p(1)) {
            ColorStateList j = b.j(1);
            this.au = j;
            this.at = j;
        }
        ColorStateList b3 = dada.b(context2, b, 10);
        this.ax = b.s(10);
        this.av = akm.c(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.aD = akm.c(context2, R.color.mtrl_textinput_disabled_color);
        this.aw = akm.c(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b3 != null) {
            setBoxStrokeColorStateList(b3);
        }
        if (b.p(11)) {
            setBoxStrokeErrorColor(dada.b(context2, b, 11));
        }
        if (b.o(40, i2) != i2) {
            setHintTextAppearance(b.o(40, 0));
        }
        int o = b.o(31, 0);
        CharSequence f = b.f(26);
        boolean h = b.h(27, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) linearLayout2, false);
        this.ar = checkableImageButton;
        checkableImageButton.setId(R.id.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (dada.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        if (b.p(28)) {
            setErrorIconDrawable(b.d(28));
        }
        if (b.p(29)) {
            setErrorIconTintList(dada.b(context2, b, 29));
        }
        if (b.p(30)) {
            setErrorIconTintMode(dabd.a(b.i(30, i2), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        od.m(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int o2 = b.o(36, 0);
        boolean h2 = b.h(35, false);
        CharSequence f2 = b.f(34);
        int o3 = b.o(48, 0);
        CharSequence f3 = b.f(47);
        int o4 = b.o(51, 0);
        CharSequence f4 = b.f(50);
        int o5 = b.o(61, 0);
        CharSequence f5 = b.f(60);
        boolean h3 = b.h(14, false);
        setCounterMaxLength(b.i(15, -1));
        this.v = b.o(18, 0);
        this.u = b.o(16, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) linearLayout, false);
        this.T = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (dada.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (b.p(57)) {
            setStartIconDrawable(b.d(57));
            if (b.p(56)) {
                setStartIconContentDescription(b.f(56));
            }
            setStartIconCheckable(b.h(55, true));
        }
        if (b.p(58)) {
            setStartIconTintList(dada.b(context2, b, 58));
        }
        if (b.p(59)) {
            setStartIconTintMode(dabd.a(b.i(59, -1), null));
        }
        setBoxBackgroundMode(b.i(4, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout2, false);
        this.l = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        if (dada.d(context2)) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton3.getLayoutParams()).setMarginStart(0);
        }
        sparseArray.append(-1, new dagr(this));
        sparseArray.append(0, new dahk(this));
        sparseArray.append(1, new dahp(this));
        sparseArray.append(2, new dagq(this));
        sparseArray.append(3, new dahe(this));
        if (b.p(23)) {
            setEndIconMode(b.i(23, 0));
            if (b.p(22)) {
                setEndIconDrawable(b.d(22));
            }
            if (b.p(21)) {
                setEndIconContentDescription(b.f(21));
            }
            setEndIconCheckable(b.h(20, true));
        } else if (b.p(44)) {
            setEndIconMode(b.h(44, false) ? 1 : 0);
            setEndIconDrawable(b.d(43));
            setEndIconContentDescription(b.f(42));
            if (b.p(45)) {
                setEndIconTintList(dada.b(context2, b, 45));
            }
            if (b.p(46)) {
                setEndIconTintMode(dabd.a(b.i(46, -1), null));
            }
        }
        if (!b.p(44)) {
            if (b.p(24)) {
                setEndIconTintList(dada.b(context2, b, 24));
            }
            if (b.p(25)) {
                setEndIconTintMode(dabd.a(b.i(25, -1), null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.D = appCompatTextView;
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        od.v(appCompatTextView, 1);
        linearLayout.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.E = appCompatTextView2;
        appCompatTextView2.setId(R.id.textinput_suffix_text);
        appCompatTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        od.v(appCompatTextView2, 1);
        linearLayout2.addView(appCompatTextView2);
        linearLayout2.addView(checkableImageButton);
        linearLayout2.addView(frameLayout2);
        setHelperTextEnabled(h2);
        setHelperText(f2);
        setHelperTextTextAppearance(o2);
        setErrorEnabled(h);
        setErrorTextAppearance(o);
        setErrorContentDescription(f);
        setCounterTextAppearance(this.v);
        setCounterOverflowTextAppearance(this.u);
        setPlaceholderText(f3);
        setPlaceholderTextAppearance(o3);
        setPrefixText(f4);
        setPrefixTextAppearance(o4);
        setSuffixText(f5);
        setSuffixTextAppearance(o5);
        if (b.p(32)) {
            setErrorTextColor(b.j(32));
        }
        if (b.p(37)) {
            setHelperTextColor(b.j(37));
        }
        if (b.p(41)) {
            setHintTextColor(b.j(41));
        }
        if (b.p(19)) {
            setCounterTextColor(b.j(19));
        }
        if (b.p(17)) {
            setCounterOverflowTextColor(b.j(17));
        }
        if (b.p(49)) {
            setPlaceholderTextColor(b.j(49));
        }
        if (b.p(52)) {
            setPrefixTextColor(b.j(52));
        }
        if (b.p(62)) {
            setSuffixTextColor(b.j(62));
        }
        setCounterEnabled(h3);
        setEnabled(b.h(0, true));
        b.q();
        od.m(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            od.e(this, 1);
        }
    }

    private final void F() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.e;
        if (textView != null) {
            f(textView, this.d ? this.u : this.v);
            if (!this.d && (colorStateList2 = this.A) != null) {
                this.e.setTextColor(colorStateList2);
            }
            if (!this.d || (colorStateList = this.B) == null) {
                return;
            }
            this.e.setTextColor(colorStateList);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.ar.setImageDrawable(drawable);
        boolean z = false;
        if (drawable != null && this.t.g) {
            z = true;
        }
        X(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.l.setImageDrawable(drawable);
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new dahy();
        CharSequence a;
        boolean b;
        CharSequence e;
        CharSequence f;
        CharSequence g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() != 1 ? false : true;
            this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String valueOf = String.valueOf(this.a);
            String valueOf2 = String.valueOf(this.e);
            String valueOf3 = String.valueOf(this.f);
            String valueOf4 = String.valueOf(this.g);
            int length = String.valueOf(hexString).length();
            int length2 = String.valueOf(valueOf).length();
            int length3 = String.valueOf(valueOf2).length();
            StringBuilder sb = new StringBuilder(length + 70 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
            sb.append("TextInputLayout.SavedState{");
            sb.append(hexString);
            sb.append(" error=");
            sb.append(valueOf);
            sb.append(" hint=");
            sb.append(valueOf2);
            sb.append(" helperText=");
            sb.append(valueOf3);
            sb.append(" placeholderText=");
            sb.append(valueOf4);
            sb.append("}");
            return sb.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
            TextUtils.writeToParcel(this.e, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private final void s() {
        int i = this.j;
        if (i == 0) {
            this.i = null;
            this.H = null;
        } else if (i == 1) {
            this.i = new dadr(this.I);
            this.H = new dadr();
        } else if (i == 2) {
            if (!this.F || (this.i instanceof dags)) {
                this.i = new dadr(this.I);
            } else {
                this.i = new dags(this.I);
            }
            this.H = null;
        } else {
            StringBuilder sb = new StringBuilder(72);
            sb.append(i);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        EditText editText = this.a;
        if (editText != null && this.i != null && editText.getBackground() == null && this.j != 0) {
            od.U(this.a, this.i);
        }
        q();
        if (this.j == 1) {
            if (dada.e(getContext())) {
                this.K = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (dada.d(getContext())) {
                this.K = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.a != null && this.j == 1) {
            if (dada.e(getContext())) {
                EditText editText2 = this.a;
                od.y(editText2, od.w(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), od.x(this.a), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (dada.d(getContext())) {
                EditText editText3 = this.a;
                od.y(editText3, od.w(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), od.x(this.a), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.j != 0) {
            t();
        }
    }
}
