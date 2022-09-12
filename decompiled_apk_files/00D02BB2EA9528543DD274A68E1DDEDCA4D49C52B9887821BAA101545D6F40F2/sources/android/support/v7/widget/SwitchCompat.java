package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private final TextPaint H;
    private ColorStateList I;
    private Layout J;
    private Layout K;
    private TransformationMethod L;
    private final yh M;
    private final Rect N;
    public float a;
    ObjectAnimator b;
    private Drawable d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private boolean g;
    private boolean h;
    private Drawable i;
    private ColorStateList j;
    private PorterDuff.Mode k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private CharSequence r;
    private CharSequence s;
    private boolean t;
    private int u;
    private int v;
    private float w;
    private float x;
    private VelocityTracker y;
    private int z;
    private static final Property<SwitchCompat, Float> c = new aek(Float.class);
    private static final int[] O = {16842912};

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final void b() {
        Drawable drawable = this.i;
        if (drawable != null) {
            if (!this.l && !this.m) {
                return;
            }
            Drawable mutate = ks.b(drawable).mutate();
            this.i = mutate;
            if (this.l) {
                mutate.setTintList(this.j);
            }
            if (this.m) {
                this.i.setTintMode(this.k);
            }
            if (!this.i.isStateful()) {
                return;
            }
            this.i.setState(getDrawableState());
        }
    }

    private final void c() {
        Drawable drawable = this.d;
        if (drawable != null) {
            if (!this.g && !this.h) {
                return;
            }
            Drawable mutate = ks.b(drawable).mutate();
            this.d = mutate;
            if (this.g) {
                mutate.setTintList(this.e);
            }
            if (this.h) {
                this.d.setTintMode(this.f);
            }
            if (!this.d.isStateful()) {
                return;
            }
            this.d.setState(getDrawableState());
        }
    }

    private final Layout d(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.H;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final boolean e() {
        return this.a > 0.5f;
    }

    private final int f() {
        return (int) (((afm.a(this) ? 1.0f - this.a : this.a) * g()) + 0.5f);
    }

    private final int g() {
        Rect rect;
        Drawable drawable = this.i;
        if (drawable != null) {
            Rect rect2 = this.N;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.d;
            if (drawable2 != null) {
                rect = ze.a(drawable2);
            } else {
                rect = ze.a;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private final void h() {
        CharSequence charSequence = this.r;
        if (charSequence == null) {
            charSequence = getResources().getString(R.string.abc_capital_on);
        }
        od.r(this, charSequence);
    }

    private final void i() {
        CharSequence charSequence = this.s;
        if (charSequence == null) {
            charSequence = getResources().getString(R.string.abc_capital_off);
        }
        od.r(this, charSequence);
    }

    public final void a(float f) {
        this.a = f;
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.N;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int f = f() + i3;
        Drawable drawable = this.d;
        if (drawable != null) {
            rect = ze.a(drawable);
        } else {
            rect = ze.a;
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            f += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = f - rect2.left;
            int i8 = f + this.C + rect2.right;
            this.d.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!afm.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (afm.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.p : compoundPaddingRight;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.b.end();
        this.b = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, O);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.d;
        if (drawable != null) {
            if (!this.q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = ze.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = e() ? this.J : this.K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.I;
            if (colorStateList != null) {
                this.H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.d != null) {
            Rect rect = this.N;
            Drawable drawable = this.i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = ze.a(this.d);
            i5 = Math.max(0, a.left - rect.left);
            i9 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (afm.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.A) + i5 + i9;
        }
        int gravity = getGravity() & com.google.android.filament.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i10 = this.B;
            i7 = (((paddingTop + height) - paddingBottom) / 2) - (i10 / 2);
            i8 = i7 + i10;
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            i7 = i8 - this.B;
        } else {
            i7 = getPaddingTop();
            i8 = this.B + i7;
        }
        this.D = i6;
        this.E = i7;
        this.G = i8;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.t) {
            if (this.J == null) {
                this.J = d(this.r);
            }
            if (this.K == null) {
                this.K = d(this.s);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.d;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.d.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.d.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.t) {
            int max = Math.max(this.J.getWidth(), this.K.getWidth());
            int i7 = this.n;
            i5 = max + i7 + i7;
        } else {
            i5 = 0;
        }
        this.C = Math.max(i5, i3);
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            Rect a = ze.a(drawable3);
            i8 = Math.max(i8, a.left);
            i9 = Math.max(i9, a.right);
        }
        int i10 = this.o;
        int i11 = this.C;
        int max2 = Math.max(i10, i11 + i11 + i8 + i9);
        int max3 = Math.max(i6, i4);
        this.A = max2;
        this.B = max3;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r : this.s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            h();
        } else {
            i();
        }
        float f = 0.0f;
        if (getWindowToken() == null || !od.ae(this)) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (true == isChecked) {
                f = 1.0f;
            }
            a(f);
            return;
        }
        if (true == isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, c, f);
        this.b = ofFloat;
        ofFloat.setDuration(250L);
        this.b.setAutoCancel(true);
        this.b.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qf.c(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.t != z) {
            this.t = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.p = i;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i) {
        Typeface typeface;
        aeq c2 = aeq.c(context, i, sj.w);
        ColorStateList j = c2.j(3);
        if (j != null) {
            this.I = j;
        } else {
            this.I = getTextColors();
        }
        int m = c2.m(0, 0);
        if (m != 0) {
            float f = m;
            if (f != this.H.getTextSize()) {
                this.H.setTextSize(f);
                requestLayout();
            }
        }
        int i2 = c2.i(1, -1);
        int i3 = c2.i(2, -1);
        if (i2 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i2 != 2) {
            typeface = i2 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i3);
        if (c2.h(14, false)) {
            this.L = new tl(getContext());
        } else {
            this.L = null;
        }
        c2.q();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.H.getTypeface() == null || this.H.getTypeface().equals(typeface)) && (this.H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.s = charSequence;
        requestLayout();
        i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.r = charSequence;
        requestLayout();
        h();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(sl.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.n = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.e = colorStateList;
        this.g = true;
        c();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f = mode;
        this.h = true;
        c();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(sl.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.l = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.k = mode;
        this.m = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d || drawable == this.i;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.y = VelocityTracker.obtain();
        this.N = new Rect();
        ael.d(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        aeq b = aeq.b(context, attributeSet, sj.v, i, 0);
        od.a(this, context, sj.v, attributeSet, b.b, i, 0);
        Drawable d = b.d(2);
        this.d = d;
        if (d != null) {
            d.setCallback(this);
        }
        Drawable d2 = b.d(11);
        this.i = d2;
        if (d2 != null) {
            d2.setCallback(this);
        }
        this.r = b.f(0);
        this.s = b.f(1);
        this.t = b.h(3, true);
        this.n = b.m(8, 0);
        this.o = b.m(5, 0);
        this.p = b.m(6, 0);
        this.q = b.h(4, false);
        ColorStateList j = b.j(9);
        if (j != null) {
            this.e = j;
            this.g = true;
        }
        PorterDuff.Mode d3 = ze.d(b.i(10, -1), null);
        if (this.f != d3) {
            this.f = d3;
            this.h = true;
        }
        if (this.g || this.h) {
            c();
        }
        ColorStateList j2 = b.j(12);
        if (j2 != null) {
            this.j = j2;
            this.l = true;
        }
        PorterDuff.Mode d4 = ze.d(b.i(13, -1), null);
        if (this.k != d4) {
            this.k = d4;
            this.m = true;
        }
        if (this.l || this.m) {
            b();
        }
        int o = b.o(7, 0);
        if (o != 0) {
            setSwitchTextAppearance(context, o);
        }
        yh yhVar = new yh(this);
        this.M = yhVar;
        yhVar.a(attributeSet, i);
        b.q();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.v = viewConfiguration.getScaledTouchSlop();
        this.z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface create;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int style = ((create != null ? create.getStyle() : 0) ^ (-1)) & i;
            TextPaint textPaint = this.H;
            if (1 == (style & 1)) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.H;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.H.setFakeBoldText(false);
        this.H.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }
}
