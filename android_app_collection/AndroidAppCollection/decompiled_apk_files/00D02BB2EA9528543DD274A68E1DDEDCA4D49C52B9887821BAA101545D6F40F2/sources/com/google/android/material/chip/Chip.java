package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: PG */
/* loaded from: classes.dex */
public class Chip extends xe implements czwu, daei {
    private static final int a = 2132018733;
    public czwv d;
    public View.OnClickListener e;
    public CompoundButton.OnCheckedChangeListener f;
    public boolean g;
    private InsetDrawable i;
    private RippleDrawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private final czwt q;
    private final Rect r;
    private final RectF s;
    private final dadf t;
    public static final Rect c = new Rect();
    private static final int[] b = {16842913};
    private static final int[] h = {16842911};

    public Chip(Context context) {
        this(context, null);
    }

    private final void a() {
        if (!f() || !i() || this.e == null) {
            od.c(this, null);
        } else {
            od.c(this, this.q);
        }
    }

    private final void b() {
        czwv czwvVar;
        if (TextUtils.isEmpty(getText()) || (czwvVar = this.d) == null) {
            return;
        }
        int e = (int) (czwvVar.o + czwvVar.l + czwvVar.e());
        czwv czwvVar2 = this.d;
        int d = (int) (czwvVar2.j + czwvVar2.k + czwvVar2.d());
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            d += rect.left;
            e += rect.right;
        }
        od.y(this, d, getPaddingTop(), e, getPaddingBottom());
    }

    private final void l() {
        this.j = new RippleDrawable(dadg.a(this.d.c), c(), null);
        boolean z = this.d.r;
        od.U(this, this.j);
        b();
    }

    private final boolean m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = ams.class.getDeclaredField("l");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = ams.class.getDeclaredMethod("C", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.q, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    private final void n(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private final void o(boolean z) {
        if (this.m != z) {
            this.m = z;
            refreshDrawableState();
        }
    }

    private final void p() {
        TextPaint paint = getPaint();
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            paint.drawableState = czwvVar.getState();
        }
        czwv czwvVar2 = this.d;
        dade dadeVar = czwvVar2 != null ? czwvVar2.q.e : null;
        if (dadeVar != null) {
            dadeVar.d(getContext(), paint, this.t);
        }
    }

    private final void q() {
        if (this.i != null) {
            this.i = null;
            setMinWidth(0);
            czwv czwvVar = this.d;
            setMinHeight((int) (czwvVar != null ? czwvVar.b : 0.0f));
            int[] iArr = dadg.a;
            l();
        }
    }

    public final Drawable c() {
        InsetDrawable insetDrawable = this.i;
        return insetDrawable == null ? this.d : insetDrawable;
    }

    @Override // defpackage.czwu
    public final void d() {
        k(this.p);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m(motionEvent) || this.q.k(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.q.l(keyEvent) || this.q.e == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // defpackage.xe, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        czwv czwvVar = this.d;
        if (czwvVar == null || !czwv.h(czwvVar.f)) {
            return;
        }
        czwv czwvVar2 = this.d;
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.g) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.m) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.l) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.g) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.m) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.l) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (!czwvVar2.f(iArr)) {
            return;
        }
        invalidate();
    }

    public final boolean e() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.q.A(1, 1);
        return z;
    }

    public final boolean f() {
        czwv czwvVar = this.d;
        return (czwvVar == null || czwvVar.y() == null) ? false : true;
    }

    public final RectF g() {
        this.s.setEmpty();
        if (f() && this.e != null) {
            czwv czwvVar = this.d;
            RectF rectF = this.s;
            Rect bounds = czwvVar.getBounds();
            rectF.setEmpty();
            if (czwvVar.c()) {
                float f = czwvVar.o + czwvVar.n + czwvVar.g + czwvVar.m + czwvVar.l;
                if (ks.e(czwvVar) == 0) {
                    rectF.right = bounds.right;
                    rectF.left = rectF.right - f;
                } else {
                    rectF.left = bounds.left;
                    rectF.right = bounds.left + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return this.s;
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            return czwvVar.s;
        }
        return null;
    }

    public final Rect h() {
        RectF g = g();
        this.r.set((int) g.left, (int) g.top, (int) g.right, (int) g.bottom);
        return this.r;
    }

    public final boolean i() {
        czwv czwvVar = this.d;
        return czwvVar != null && czwvVar.e;
    }

    public final boolean j() {
        czwv czwvVar = this.d;
        return czwvVar != null && czwvVar.i;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dads.f(this, this.d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        if (j()) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.q.m(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            o(g().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            o(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (j() || isClickable()) {
            accessibilityNodeInfo.setClassName(true != j() ? "android.widget.Button" : "android.widget.CompoundButton");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            pc a2 = pc.a(accessibilityNodeInfo);
            int i2 = -1;
            if (chipGroup.i) {
                i = 0;
                for (int i3 = 0; i3 < chipGroup.getChildCount(); i3++) {
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i++;
                    }
                }
            }
            i = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            a2.I(pa.a(i2, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!g().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r0 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.g()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = 0
            goto L35
        L23:
            boolean r0 = r5.l
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.n(r2)
            return r3
        L2d:
            boolean r0 = r5.l
            if (r0 == 0) goto L21
            r5.e()
            r0 = 1
        L35:
            r5.n(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.n(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == c() || drawable == this.j) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // defpackage.xe, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == c() || drawable == this.j) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.xe, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.C(z);
        }
    }

    public void setCheckableResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.C(czwvVar.p.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        czwv czwvVar = this.d;
        if (czwvVar == null) {
            this.k = z;
        } else if (!czwvVar.i) {
        } else {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.E(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.E(sl.b(czwvVar.p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.F(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.F(sl.a(czwvVar.p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.D(czwvVar.p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.j(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.j(sl.a(czwvVar.p, i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.m(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.m(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(czwv czwvVar) {
        czwv czwvVar2 = this.d;
        if (czwvVar2 != czwvVar) {
            if (czwvVar2 != null) {
                czwvVar2.a(null);
            }
            this.d = czwvVar;
            czwvVar.t = false;
            czwvVar.a(this);
            k(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.N(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.N(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.u(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.u(sl.b(czwvVar.p, i));
        }
    }

    public void setChipIconSize(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.w(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.w(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.v(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.v(sl.a(czwvVar.p, i));
        }
    }

    public void setChipIconVisible(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.t(czwvVar.p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.k(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.k(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.G(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.G(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.n(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.n(sl.a(czwvVar.p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.o(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.o(czwvVar.p.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.z(drawable);
        }
        a();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        czwv czwvVar = this.d;
        if (czwvVar == null || czwvVar.h == charSequence) {
            return;
        }
        czwvVar.h = alp.a().c(charSequence);
        czwvVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.M(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.z(sl.b(czwvVar.p, i));
        }
        a();
    }

    public void setCloseIconSize(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.B(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.B(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.L(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.L(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.A(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.A(sl.a(czwvVar.p, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.aa(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        k(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(8388627);
    }

    public void setHideMotionSpec(czur czurVar) {
    }

    public void setHideMotionSpecResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czur.g(czwvVar.p, i);
        }
    }

    public void setIconEndPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.I(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.I(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.H(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.H(czwvVar.p.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.d == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.u = i;
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.e = onClickListener;
        a();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.p(colorStateList);
        }
        boolean z = this.d.r;
        l();
    }

    public void setRippleColorResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.p(sl.a(czwvVar.p, i));
            boolean z = this.d.r;
            l();
        }
    }

    @Override // defpackage.daei
    public void setShapeAppearanceModel(dadx dadxVar) {
        this.d.setShapeAppearanceModel(dadxVar);
    }

    public void setShowMotionSpec(czur czurVar) {
    }

    public void setShowMotionSpecResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czur.g(czwvVar.p, i);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        czwv czwvVar = this.d;
        if (czwvVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(true != czwvVar.t ? charSequence : null, bufferType);
        czwv czwvVar2 = this.d;
        if (czwvVar2 == null) {
            return;
        }
        czwvVar2.q(charSequence);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.r(i);
        }
        p();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.K(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.K(czwvVar.p.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.J(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.J(czwvVar.p.getResources().getDimension(i));
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        czwt czwtVar = this.q;
        if (czwtVar.e == 1 || czwtVar.d == 1) {
            rect.set(h());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public void setCloseIconVisible(boolean z) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.x(z);
        }
        a();
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.d == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        czwv czwvVar = this.d;
        if (czwvVar == null) {
            return;
        }
        czwvVar.s = truncateAt;
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void k(int i) {
        this.p = i;
        if (!this.n) {
            if (this.i == null) {
                int[] iArr = dadg.a;
                l();
                return;
            }
            q();
            return;
        }
        int max = Math.max(0, i - this.d.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.d.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.i == null) {
                int[] iArr2 = dadg.a;
                l();
                return;
            }
            q();
            return;
        }
        int i2 = max2 > 0 ? max2 >> 1 : 0;
        int i3 = max > 0 ? max >> 1 : 0;
        if (this.i != null) {
            Rect rect = new Rect();
            this.i.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr3 = dadg.a;
                l();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.i = new InsetDrawable((Drawable) this.d, i2, i3, i2, i3);
        int[] iArr4 = dadg.a;
        l();
    }

    public void setCheckedIconVisible(boolean z) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.D(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.t(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawables(null, drawable2, null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i == 0) {
            if (i3 != 0) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.r(i);
        }
        p();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 != null) {
                throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
            }
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public void setTextAppearance(dade dadeVar) {
        czwv czwvVar = this.d;
        if (czwvVar != null) {
            czwvVar.s(dadeVar);
        }
        p();
    }
}
