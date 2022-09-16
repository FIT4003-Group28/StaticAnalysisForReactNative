package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.reactnativecommunity.webview.RNCWebViewManager;
/* loaded from: classes.dex */
public class r0 extends CompoundButton {
    private static final Property<r0, Float> O = new a(Float.class, "thumbPos");
    private static final int[] P = {16842912};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private final TextPaint G;
    private ColorStateList H;
    private Layout I;
    private Layout J;
    private TransformationMethod K;
    ObjectAnimator L;
    private final y M;
    private final Rect N;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f1363b;

    /* renamed from: c  reason: collision with root package name */
    private ColorStateList f1364c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f1365d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1366e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1367f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1368g;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f1369h;
    private PorterDuff.Mode i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private CharSequence p;
    private CharSequence q;
    private boolean r;
    private int s;
    private int t;
    private float u;
    private float v;
    private VelocityTracker w;
    private int x;
    float y;
    private int z;

    /* loaded from: classes.dex */
    static class a extends Property<r0, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(r0 r0Var) {
            return Float.valueOf(r0Var.y);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(r0 r0Var, Float f2) {
            r0Var.setThumbPosition(f2.floatValue());
        }
    }

    public r0(Context context) {
        this(context, null);
    }

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.switchStyle);
    }

    public r0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1364c = null;
        this.f1365d = null;
        this.f1366e = false;
        this.f1367f = false;
        this.f1369h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.w = VelocityTracker.obtain();
        this.N = new Rect();
        this.G = new TextPaint(1);
        Resources resources = getResources();
        this.G.density = resources.getDisplayMetrics().density;
        x0 a2 = x0.a(context, attributeSet, a.a.j.SwitchCompat, i, 0);
        this.f1363b = a2.b(a.a.j.SwitchCompat_android_thumb);
        Drawable drawable = this.f1363b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f1368g = a2.b(a.a.j.SwitchCompat_track);
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.p = a2.e(a.a.j.SwitchCompat_android_textOn);
        this.q = a2.e(a.a.j.SwitchCompat_android_textOff);
        this.r = a2.a(a.a.j.SwitchCompat_showText, true);
        this.l = a2.c(a.a.j.SwitchCompat_thumbTextPadding, 0);
        this.m = a2.c(a.a.j.SwitchCompat_switchMinWidth, 0);
        this.n = a2.c(a.a.j.SwitchCompat_switchPadding, 0);
        this.o = a2.a(a.a.j.SwitchCompat_splitTrack, false);
        ColorStateList a3 = a2.a(a.a.j.SwitchCompat_thumbTint);
        if (a3 != null) {
            this.f1364c = a3;
            this.f1366e = true;
        }
        PorterDuff.Mode a4 = e0.a(a2.d(a.a.j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1365d != a4) {
            this.f1365d = a4;
            this.f1367f = true;
        }
        if (this.f1366e || this.f1367f) {
            a();
        }
        ColorStateList a5 = a2.a(a.a.j.SwitchCompat_trackTint);
        if (a5 != null) {
            this.f1369h = a5;
            this.j = true;
        }
        PorterDuff.Mode a6 = e0.a(a2.d(a.a.j.SwitchCompat_trackTintMode, -1), null);
        if (this.i != a6) {
            this.i = a6;
            this.k = true;
        }
        if (this.j || this.k) {
            b();
        }
        int g2 = a2.g(a.a.j.SwitchCompat_switchTextAppearance, 0);
        if (g2 != 0) {
            a(context, g2);
        }
        this.M = new y(this);
        this.M.a(attributeSet, i);
        a2.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.t = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private static float a(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private Layout a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.G;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void a() {
        if (this.f1363b != null) {
            if (!this.f1366e && !this.f1367f) {
                return;
            }
            this.f1363b = androidx.core.graphics.drawable.a.i(this.f1363b).mutate();
            if (this.f1366e) {
                androidx.core.graphics.drawable.a.a(this.f1363b, this.f1364c);
            }
            if (this.f1367f) {
                androidx.core.graphics.drawable.a.a(this.f1363b, this.f1365d);
            }
            if (!this.f1363b.isStateful()) {
                return;
            }
            this.f1363b.setState(getDrawableState());
        }
    }

    private void a(int i, int i2) {
        a(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    private void a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void a(boolean z) {
        this.L = ObjectAnimator.ofFloat(this, O, z ? 1.0f : 0.0f);
        this.L.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.L.setAutoCancel(true);
        }
        this.L.start();
    }

    private boolean a(float f2, float f3) {
        if (this.f1363b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1363b.getPadding(this.N);
        int i = this.D;
        int i2 = this.t;
        int i3 = i - i2;
        int i4 = (this.C + thumbOffset) - i2;
        Rect rect = this.N;
        return f2 > ((float) i4) && f2 < ((float) ((((this.B + i4) + rect.left) + rect.right) + i2)) && f3 > ((float) i3) && f3 < ((float) (this.F + i2));
    }

    private void b() {
        if (this.f1368g != null) {
            if (!this.j && !this.k) {
                return;
            }
            this.f1368g = androidx.core.graphics.drawable.a.i(this.f1368g).mutate();
            if (this.j) {
                androidx.core.graphics.drawable.a.a(this.f1368g, this.f1369h);
            }
            if (this.k) {
                androidx.core.graphics.drawable.a.a(this.f1368g, this.i);
            }
            if (!this.f1368g.isStateful()) {
                return;
            }
            this.f1368g.setState(getDrawableState());
        }
    }

    private void b(MotionEvent motionEvent) {
        boolean z;
        this.s = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.w.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            float xVelocity = this.w.getXVelocity();
            if (Math.abs(xVelocity) > this.x) {
                if (!d1.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        a(motionEvent);
    }

    private void c() {
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((d1.a(this) ? 1.0f - this.y : this.y) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1368g;
        if (drawable != null) {
            Rect rect = this.N;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f1363b;
            Rect d2 = drawable2 != null ? e0.d(drawable2) : e0.f1240c;
            return ((((this.z - this.B) - rect.left) - rect.right) - d2.left) - d2.right;
        }
        return 0;
    }

    public void a(Context context, int i) {
        x0 a2 = x0.a(context, i, a.a.j.TextAppearance);
        ColorStateList a3 = a2.a(a.a.j.TextAppearance_android_textColor);
        if (a3 == null) {
            a3 = getTextColors();
        }
        this.H = a3;
        int c2 = a2.c(a.a.j.TextAppearance_android_textSize, 0);
        if (c2 != 0) {
            float f2 = c2;
            if (f2 != this.G.getTextSize()) {
                this.G.setTextSize(f2);
                requestLayout();
            }
        }
        a(a2.d(a.a.j.TextAppearance_android_typeface, -1), a2.d(a.a.j.TextAppearance_android_textStyle, -1));
        this.K = a2.a(a.a.j.TextAppearance_textAllCaps, false) ? new a.a.n.a(getContext()) : null;
        a2.a();
    }

    public void a(Typeface typeface, int i) {
        float f2 = 0.0f;
        boolean z = false;
        if (i <= 0) {
            this.G.setFakeBoldText(false);
            this.G.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
        setSwitchTypeface(defaultFromStyle);
        int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
        TextPaint textPaint = this.G;
        if ((i2 & 1) != 0) {
            z = true;
        }
        textPaint.setFakeBoldText(z);
        TextPaint textPaint2 = this.G;
        if ((i2 & 2) != 0) {
            f2 = -0.25f;
        }
        textPaint2.setTextSkewX(f2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.N;
        int i3 = this.C;
        int i4 = this.D;
        int i5 = this.E;
        int i6 = this.F;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1363b;
        Rect d2 = drawable != null ? e0.d(drawable) : e0.f1240c;
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d2 != null) {
                int i8 = d2.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d2.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d2.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d2.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1368g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1368g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1363b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.B + rect.right;
            this.f1363b.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f1363b;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.a(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1363b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!d1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (d1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.r;
    }

    public boolean getSplitTrack() {
        return this.o;
    }

    public int getSwitchMinWidth() {
        return this.m;
    }

    public int getSwitchPadding() {
        return this.n;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.p;
    }

    public Drawable getThumbDrawable() {
        return this.f1363b;
    }

    public int getThumbTextPadding() {
        return this.l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1364c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1365d;
    }

    public Drawable getTrackDrawable() {
        return this.f1368g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1369h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1363b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.L.end();
        this.L = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, P);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.f1368g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.D;
        int i2 = this.F;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f1363b;
        if (drawable != null) {
            if (!this.o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d2 = e0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
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
        Layout layout = getTargetCheckedState() ? this.I : this.J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.H;
            if (colorStateList != null) {
                this.G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.G.drawableState = drawableState;
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
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (!TextUtils.isEmpty(charSequence)) {
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
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f1363b != null) {
            Rect rect = this.N;
            Drawable drawable = this.f1368g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = e0.d(this.f1363b);
            i5 = Math.max(0, d2.left - rect.left);
            i9 = Math.max(0, d2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (d1.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.z + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.z) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity == 80) {
            i8 = getHeight() - getPaddingBottom();
            paddingTop = i8 - this.A;
            this.C = i6;
            this.D = paddingTop;
            this.F = i8;
            this.E = width;
        } else {
            paddingTop = getPaddingTop();
            i7 = this.A;
        }
        i8 = i7 + paddingTop;
        this.C = i6;
        this.D = paddingTop;
        this.F = i8;
        this.E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.r) {
            if (this.I == null) {
                this.I = a(this.p);
            }
            if (this.J == null) {
                this.J = a(this.q);
            }
        }
        Rect rect = this.N;
        Drawable drawable = this.f1363b;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f1363b.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f1363b.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.B = Math.max(this.r ? Math.max(this.I.getWidth(), this.J.getWidth()) + (this.l * 2) : 0, i3);
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1368g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1363b;
        if (drawable3 != null) {
            Rect d2 = e0.d(drawable3);
            i6 = Math.max(i6, d2.left);
            i7 = Math.max(i7, d2.right);
        }
        int max = Math.max(this.m, (this.B * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.z = max;
        this.A = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.p : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != 3) goto L8;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto La1
            r2 = 2
            if (r0 == r1) goto L8d
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8d
            goto Lbb
        L16:
            int r0 = r6.s
            if (r0 == 0) goto Lbb
            if (r0 == r1) goto L59
            if (r0 == r2) goto L20
            goto Lbb
        L20:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L34
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3f
        L34:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3f
        L3b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3f:
            boolean r0 = androidx.appcompat.widget.d1.a(r6)
            if (r0 == 0) goto L46
            float r2 = -r2
        L46:
            float r0 = r6.y
            float r0 = r0 + r2
            float r0 = a(r0, r4, r3)
            float r2 = r6.y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L58
            r6.u = r7
            r6.setThumbPosition(r0)
        L58:
            return r1
        L59:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7f
            float r4 = r6.v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lbb
        L7f:
            r6.s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.u = r0
            r6.v = r3
            return r1
        L8d:
            int r0 = r6.s
            if (r0 != r2) goto L98
            r6.b(r7)
            super.onTouchEvent(r7)
            return r1
        L98:
            r0 = 0
            r6.s = r0
            android.view.VelocityTracker r0 = r6.w
            r0.clear()
            goto Lbb
        La1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lbb
            boolean r3 = r6.a(r0, r2)
            if (r3 == 0) goto Lbb
            r6.s = r1
            r6.u = r0
            r6.v = r2
        Lbb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && a.g.m.v.I(this)) {
            a(isChecked);
            return;
        }
        c();
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.a(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.r != z) {
            this.r = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.G.getTypeface() == null || this.G.getTypeface().equals(typeface)) && (this.G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1363b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1363b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f2) {
        this.y = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(a.a.k.a.a.c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1364c = colorStateList;
        this.f1366e = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1365d = mode;
        this.f1367f = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1368g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1368g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(a.a.k.a.a.c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1369h = colorStateList;
        this.j = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        this.k = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1363b || drawable == this.f1368g;
    }
}
