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
import android.os.Build;
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
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property g = new zx(Float.class);
    private static final int[] h = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final TextPaint I;

    /* renamed from: J  reason: collision with root package name */
    private ColorStateList f68J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    private final uz N;
    private final Rect O;
    public ColorStateList a;
    public boolean b;
    public CharSequence c;
    public CharSequence d;
    public float e;
    ObjectAnimator f;
    private Drawable i;
    private ColorStateList j;
    private PorterDuff.Mode k;
    private boolean l;
    private boolean m;
    private Drawable n;
    private PorterDuff.Mode o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private float x;
    private float y;
    private VelocityTracker z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private final int g() {
        return (int) (((aav.b(this) ? 1.0f - this.e : this.e) * h()) + 0.5f);
    }

    private final int h() {
        Rect rect;
        Drawable drawable = this.n;
        if (drawable != null) {
            Rect rect2 = this.O;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.i;
            if (drawable2 != null) {
                rect = vs.b(drawable2);
            } else {
                rect = vs.a;
            }
            return ((((this.B - this.D) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private final Layout i(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private final boolean j() {
        return this.e > 0.5f;
    }

    public final void a() {
        Drawable drawable = this.n;
        if (drawable != null) {
            if (!this.b && !this.p) {
                return;
            }
            Drawable mutate = iy.l(drawable).mutate();
            this.n = mutate;
            if (this.b) {
                mutate.setTintList(this.a);
            }
            if (this.p) {
                this.n.setTintMode(this.o);
            }
            if (!this.n.isStateful()) {
                return;
            }
            this.n.setState(getDrawableState());
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.d;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_off);
            }
            lj.aa(this, charSequence);
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.c;
            if (charSequence == null) {
                charSequence = getResources().getString(R.string.abc_capital_on);
            }
            lj.aa(this, charSequence);
        }
    }

    public final void d(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.O;
        int i3 = this.E;
        int i4 = this.F;
        int i5 = this.G;
        int i6 = this.H;
        int g2 = g() + i3;
        Drawable drawable = this.i;
        if (drawable != null) {
            rect = vs.b(drawable);
        } else {
            rect = vs.a;
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            g2 += rect2.left;
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
                    this.n.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.n.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = g2 - rect2.left;
            int i8 = g2 + this.D + rect2.right;
            this.i.setBounds(i7, i4, i8, i6);
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
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e(Drawable drawable) {
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

    public final void f(float f) {
        this.e = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!aav.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.s : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (aav.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.s : compoundPaddingRight;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f.end();
        this.f = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.O;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.F;
        int i2 = this.H;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.i;
        if (drawable != null) {
            if (!this.t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = vs.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
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
        Layout layout = j() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f68J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
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
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.c : this.d;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
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
        if (this.i != null) {
            Rect rect = this.O;
            Drawable drawable = this.n;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = vs.b(this.i);
            i5 = Math.max(0, b.left - rect.left);
            i9 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (aav.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.B + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.B) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i10 = this.C;
            i7 = (((paddingTop + height) - paddingBottom) / 2) - (i10 / 2);
            i8 = i7 + i10;
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            i7 = i8 - this.C;
        } else {
            i7 = getPaddingTop();
            i8 = this.C + i7;
        }
        this.E = i6;
        this.F = i7;
        this.H = i8;
        this.G = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.u) {
            if (this.K == null) {
                this.K = i(this.c);
            }
            if (this.L == null) {
                this.L = i(this.d);
            }
        }
        Rect rect = this.O;
        Drawable drawable = this.i;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.i.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.i.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.u) {
            int max = Math.max(this.K.getWidth(), this.L.getWidth());
            int i7 = this.q;
            i5 = max + i7 + i7;
        } else {
            i5 = 0;
        }
        this.D = Math.max(i5, i3);
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.n.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.i;
        if (drawable3 != null) {
            Rect b = vs.b(drawable3);
            i8 = Math.max(i8, b.left);
            i9 = Math.max(i9, b.right);
        }
        int i10 = this.r;
        int i11 = this.D;
        int max2 = Math.max(i10, i11 + i11 + i8 + i9);
        int max3 = Math.max(i6, i4);
        this.B = max2;
        this.C = max3;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.c : this.d;
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
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            c();
        } else {
            b();
        }
        float f = 0.0f;
        if (getWindowToken() == null || !lj.al(this)) {
            ObjectAnimator objectAnimator = this.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (true == isChecked) {
                f = 1.0f;
            }
            f(f);
            return;
        }
        if (true == isChecked) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, f);
        this.f = ofFloat;
        ofFloat.setDuration(250L);
        this.f.setAutoCancel(true);
        this.f.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kz.o(this, callback));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i || drawable == this.n;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        Typeface typeface;
        Typeface create;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.a = null;
        this.o = null;
        this.b = false;
        this.p = false;
        this.z = VelocityTracker.obtain();
        this.O = new Rect();
        zy.d(this, getContext());
        boolean z = true;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        aad l = aad.l(context, attributeSet, pm.v, i, 0);
        lj.L(this, context, pm.v, attributeSet, l.b, i, 0);
        Drawable h2 = l.h(2);
        this.i = h2;
        if (h2 != null) {
            h2.setCallback(this);
        }
        Drawable h3 = l.h(11);
        this.n = h3;
        if (h3 != null) {
            h3.setCallback(this);
        }
        this.c = l.m(0);
        this.d = l.m(1);
        this.u = l.p(3, true);
        this.q = l.b(8, 0);
        this.r = l.b(5, 0);
        this.s = l.b(6, 0);
        this.t = l.p(4, false);
        ColorStateList g2 = l.g(9);
        if (g2 != null) {
            this.j = g2;
            this.l = true;
        }
        PorterDuff.Mode a = vs.a(l.c(10, -1), null);
        if (this.k != a) {
            this.k = a;
            this.m = true;
        }
        boolean z2 = this.l;
        if ((z2 || this.m) && (drawable = this.i) != null && (z2 || this.m)) {
            Drawable mutate = iy.l(drawable).mutate();
            this.i = mutate;
            if (this.l) {
                mutate.setTintList(this.j);
            }
            if (this.m) {
                this.i.setTintMode(this.k);
            }
            if (this.i.isStateful()) {
                this.i.setState(getDrawableState());
            }
        }
        ColorStateList g3 = l.g(12);
        if (g3 != null) {
            this.a = g3;
            this.b = true;
        }
        PorterDuff.Mode a2 = vs.a(l.c(13, -1), null);
        if (this.o != a2) {
            this.o = a2;
            this.p = true;
        }
        if (this.b || this.p) {
            a();
        }
        int f = l.f(7, 0);
        if (f != 0) {
            aad j = aad.j(context, f, pm.w);
            ColorStateList g4 = j.g(3);
            if (g4 != null) {
                this.f68J = g4;
            } else {
                this.f68J = getTextColors();
            }
            int b = j.b(0, 0);
            if (b != 0) {
                float f2 = b;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int c = j.c(1, -1);
            int c2 = j.c(2, -1);
            if (c == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (c != 2) {
                typeface = c != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            float f3 = 0.0f;
            if (c2 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(c2);
                } else {
                    create = Typeface.create(typeface, c2);
                }
                d(create);
                int style = ((create != null ? create.getStyle() : 0) ^ (-1)) & c2;
                textPaint.setFakeBoldText(1 != (style & 1) ? false : z);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : f3);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                d(typeface);
            }
            if (j.p(14, false)) {
                this.M = new qf(getContext());
            } else {
                this.M = null;
            }
            j.o();
        }
        uz uzVar = new uz(this);
        this.N = uzVar;
        uzVar.g(attributeSet, i);
        l.o();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.w = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
