package android.support.v7.widget;

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
import android.support.v7.a.a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
/* compiled from: SwitchCompat.java */
/* loaded from: classes.dex */
public class ag extends CompoundButton {
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
    private final Rect M;

    /* renamed from: a  reason: collision with root package name */
    ObjectAnimator f905a;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f906c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f907d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;
    private Drawable h;
    private ColorStateList i;
    private PorterDuff.Mode j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    private float z;

    /* renamed from: b  reason: collision with root package name */
    private static final Property<ag, Float> f904b = new Property<ag, Float>(Float.class, "thumbPos") { // from class: android.support.v7.widget.ag.1
        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ag agVar) {
            return Float.valueOf(agVar.z);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(ag agVar, Float f) {
            agVar.setThumbPosition(f.floatValue());
        }
    };
    private static final int[] N = {16842912};

    private static float a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public ag(Context context) {
        this(context, null);
    }

    public ag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0020a.switchStyle);
    }

    public ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f907d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.x = VelocityTracker.obtain();
        this.M = new Rect();
        this.H = new TextPaint(1);
        Resources resources = getResources();
        this.H.density = resources.getDisplayMetrics().density;
        am a2 = am.a(context, attributeSet, a.j.SwitchCompat, i, 0);
        this.f906c = a2.a(a.j.SwitchCompat_android_thumb);
        if (this.f906c != null) {
            this.f906c.setCallback(this);
        }
        this.h = a2.a(a.j.SwitchCompat_track);
        if (this.h != null) {
            this.h.setCallback(this);
        }
        this.q = a2.b(a.j.SwitchCompat_android_textOn);
        this.r = a2.b(a.j.SwitchCompat_android_textOff);
        this.s = a2.a(a.j.SwitchCompat_showText, true);
        this.m = a2.e(a.j.SwitchCompat_thumbTextPadding, 0);
        this.n = a2.e(a.j.SwitchCompat_switchMinWidth, 0);
        this.o = a2.e(a.j.SwitchCompat_switchPadding, 0);
        this.p = a2.a(a.j.SwitchCompat_splitTrack, false);
        ColorStateList d2 = a2.d(a.j.SwitchCompat_thumbTint);
        if (d2 != null) {
            this.f907d = d2;
            this.f = true;
        }
        PorterDuff.Mode a3 = u.a(a2.a(a.j.SwitchCompat_thumbTintMode, -1), null);
        if (this.e != a3) {
            this.e = a3;
            this.g = true;
        }
        if (this.f || this.g) {
            b();
        }
        ColorStateList d3 = a2.d(a.j.SwitchCompat_trackTint);
        if (d3 != null) {
            this.i = d3;
            this.k = true;
        }
        PorterDuff.Mode a4 = u.a(a2.a(a.j.SwitchCompat_trackTintMode, -1), null);
        if (this.j != a4) {
            this.j = a4;
            this.l = true;
        }
        if (this.k || this.l) {
            a();
        }
        int g = a2.g(a.j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            a(context, g);
        }
        a2.a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void a(Context context, int i) {
        am a2 = am.a(context, i, a.j.TextAppearance);
        ColorStateList d2 = a2.d(a.j.TextAppearance_android_textColor);
        if (d2 != null) {
            this.I = d2;
        } else {
            this.I = getTextColors();
        }
        int e = a2.e(a.j.TextAppearance_android_textSize, 0);
        if (e != 0) {
            float f = e;
            if (f != this.H.getTextSize()) {
                this.H.setTextSize(f);
                requestLayout();
            }
        }
        a(a2.a(a.j.TextAppearance_android_typeface, -1), a2.a(a.j.TextAppearance_android_textStyle, -1));
        if (a2.a(a.j.TextAppearance_textAllCaps, false)) {
            this.L = new android.support.v7.d.a(getContext());
        } else {
            this.L = null;
        }
        a2.a();
    }

    private void a(int i, int i2) {
        Typeface typeface;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
            default:
                typeface = null;
                break;
        }
        a(typeface, i2);
    }

    public void a(Typeface typeface, int i) {
        Typeface create;
        float f = BitmapDescriptorFactory.HUE_RED;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i);
            } else {
                create = Typeface.create(typeface, i);
            }
            setSwitchTypeface(create);
            int i2 = (~(create != null ? create.getStyle() : 0)) & i;
            TextPaint textPaint = this.H;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.H;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.H.setFakeBoldText(false);
        this.H.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.H.getTypeface() == null || this.H.getTypeface().equals(typeface)) && (this.H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setSwitchPadding(int i) {
        this.o = i;
        requestLayout();
    }

    public int getSwitchPadding() {
        return this.o;
    }

    public void setSwitchMinWidth(int i) {
        this.n = i;
        requestLayout();
    }

    public int getSwitchMinWidth() {
        return this.n;
    }

    public void setThumbTextPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public int getThumbTextPadding() {
        return this.m;
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.h != null) {
            this.h.setCallback(null);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(android.support.v7.b.a.b.b(getContext(), i));
    }

    public Drawable getTrackDrawable() {
        return this.h;
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.i = colorStateList;
        this.k = true;
        a();
    }

    public ColorStateList getTrackTintList() {
        return this.i;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.j = mode;
        this.l = true;
        a();
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.j;
    }

    private void a() {
        if (this.h != null) {
            if (!this.k && !this.l) {
                return;
            }
            this.h = this.h.mutate();
            if (this.k) {
                android.support.v4.b.a.a.a(this.h, this.i);
            }
            if (this.l) {
                android.support.v4.b.a.a.a(this.h, this.j);
            }
            if (!this.h.isStateful()) {
                return;
            }
            this.h.setState(getDrawableState());
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f906c != null) {
            this.f906c.setCallback(null);
        }
        this.f906c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(android.support.v7.b.a.b.b(getContext(), i));
    }

    public Drawable getThumbDrawable() {
        return this.f906c;
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f907d = colorStateList;
        this.f = true;
        b();
    }

    public ColorStateList getThumbTintList() {
        return this.f907d;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.e = mode;
        this.g = true;
        b();
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.e;
    }

    private void b() {
        if (this.f906c != null) {
            if (!this.f && !this.g) {
                return;
            }
            this.f906c = this.f906c.mutate();
            if (this.f) {
                android.support.v4.b.a.a.a(this.f906c, this.f907d);
            }
            if (this.g) {
                android.support.v4.b.a.a.a(this.f906c, this.e);
            }
            if (!this.f906c.isStateful()) {
                return;
            }
            this.f906c.setState(getDrawableState());
        }
    }

    public void setSplitTrack(boolean z) {
        this.p = z;
        invalidate();
    }

    public boolean getSplitTrack() {
        return this.p;
    }

    public CharSequence getTextOn() {
        return this.q;
    }

    public void setTextOn(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
    }

    public CharSequence getTextOff() {
        return this.r;
    }

    public void setTextOff(CharSequence charSequence) {
        this.r = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
        }
    }

    public boolean getShowText() {
        return this.s;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.s) {
            if (this.J == null) {
                this.J = a(this.q);
            }
            if (this.K == null) {
                this.K = a(this.r);
            }
        }
        Rect rect = this.M;
        int i5 = 0;
        if (this.f906c != null) {
            this.f906c.getPadding(rect);
            i3 = (this.f906c.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f906c.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.C = Math.max(this.s ? Math.max(this.J.getWidth(), this.K.getWidth()) + (this.m * 2) : 0, i3);
        if (this.h != null) {
            this.h.getPadding(rect);
            i5 = this.h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f906c != null) {
            Rect a2 = u.a(this.f906c);
            i6 = Math.max(i6, a2.left);
            i7 = Math.max(i7, a2.right);
        }
        int max = Math.max(this.n, (this.C * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        this.A = max;
        this.B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    private Layout a(CharSequence charSequence) {
        if (this.L != null) {
            charSequence = this.L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.H, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, this.H)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    private boolean a(float f, float f2) {
        if (this.f906c == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f906c.getPadding(this.M);
        int i = this.E - this.u;
        int i2 = (this.D + thumbOffset) - this.u;
        return f > ((float) i2) && f < ((float) ((((this.C + i2) + this.M.left) + this.M.right) + this.u)) && f2 > ((float) i) && f2 < ((float) (this.G + this.u));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.x.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && a(x, y)) {
                    this.t = 1;
                    this.v = x;
                    this.w = y;
                    break;
                }
                break;
            case 1:
            case 3:
                if (this.t == 2) {
                    b(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.t = 0;
                this.x.clear();
                break;
            case 2:
                switch (this.t) {
                    case 2:
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x2 - this.v;
                        float f2 = thumbScrollRange != 0 ? f / thumbScrollRange : f > BitmapDescriptorFactory.HUE_RED ? 1.0f : -1.0f;
                        if (as.a(this)) {
                            f2 = -f2;
                        }
                        float a2 = a(this.z + f2, BitmapDescriptorFactory.HUE_RED, 1.0f);
                        if (a2 != this.z) {
                            this.v = x2;
                            setThumbPosition(a2);
                        }
                        return true;
                    case 1:
                        float x3 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x3 - this.v) > this.u || Math.abs(y2 - this.w) > this.u) {
                            this.t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.v = x3;
                            this.w = y2;
                            return true;
                        }
                        break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void b(MotionEvent motionEvent) {
        boolean z;
        this.t = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.x.computeCurrentVelocity(NetstatsParserPatterns.NEW_TS_TO_MILLIS);
            float xVelocity = this.x.getXVelocity();
            if (Math.abs(xVelocity) > this.y) {
                if (!as.a(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
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

    private void a(boolean z) {
        this.f905a = ObjectAnimator.ofFloat(this, f904b, z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        this.f905a.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f905a.setAutoCancel(true);
        }
        this.f905a.start();
    }

    private void c() {
        if (this.f905a != null) {
            this.f905a.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() != null && android.support.v4.j.s.p(this)) {
            a(isChecked);
            return;
        }
        c();
        setThumbPosition(isChecked ? 1.0f : BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int paddingTop;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        int i8 = 0;
        if (this.f906c != null) {
            Rect rect = this.M;
            if (this.h != null) {
                this.h.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a2 = u.a(this.f906c);
            int max = Math.max(0, a2.left - rect.left);
            i5 = Math.max(0, a2.right - rect.right);
            i8 = max;
        } else {
            i5 = 0;
        }
        if (as.a(this)) {
            i6 = getPaddingLeft() + i8;
            width = ((this.A + i6) - i8) - i5;
        } else {
            width = (getWidth() - getPaddingRight()) - i5;
            i6 = (width - this.A) + i8 + i5;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.B / 2);
            i7 = this.B + paddingTop;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.B + paddingTop;
        } else {
            i7 = getHeight() - getPaddingBottom();
            paddingTop = i7 - this.B;
        }
        this.D = i6;
        this.E = paddingTop;
        this.G = i7;
        this.F = width;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.M;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        if (this.f906c != null) {
            rect = u.a(this.f906c);
        } else {
            rect = u.f1015a;
        }
        if (this.h != null) {
            this.h.getPadding(rect2);
            thumbOffset += rect2.left;
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
                    this.h.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.h.setBounds(i3, i, i5, i2);
        }
        if (this.f906c != null) {
            this.f906c.getPadding(rect2);
            int i7 = thumbOffset - rect2.left;
            int i8 = thumbOffset + this.C + rect2.right;
            this.f906c.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                android.support.v4.b.a.a.a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.M;
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f906c;
        if (drawable != null) {
            if (this.p && drawable2 != null) {
                Rect a2 = u.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.J : this.K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.I != null) {
                this.H.setColor(this.I.getColorForState(drawableState, 0));
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

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!as.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.o : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (as.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.o : compoundPaddingRight;
    }

    private int getThumbOffset() {
        float f;
        if (as.a(this)) {
            f = 1.0f - this.z;
        } else {
            f = this.z;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        if (this.h != null) {
            Rect rect2 = this.M;
            this.h.getPadding(rect2);
            if (this.f906c != null) {
                rect = u.a(this.f906c);
            } else {
                rect = u.f1015a;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f906c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f906c != null) {
            android.support.v4.b.a.a.a(this.f906c, f, f2);
        }
        if (this.h != null) {
            android.support.v4.b.a.a.a(this.h, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f906c || drawable == this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f906c != null) {
            this.f906c.jumpToCurrentState();
        }
        if (this.h != null) {
            this.h.jumpToCurrentState();
        }
        if (this.f905a == null || !this.f905a.isStarted()) {
            return;
        }
        this.f905a.end();
        this.f905a = null;
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
        CharSequence charSequence = isChecked() ? this.q : this.r;
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
}
