package c.e.a.c.n;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import c.e.a.c.a0.k;
import c.e.a.c.a0.n;
/* loaded from: classes.dex */
public class a extends a.d.a.a implements Checkable, n {
    private static final int[] l = {16842911};
    private static final int[] m = {16842912};
    private static final int[] n = {c.e.a.c.b.state_dragged};

    /* renamed from: g  reason: collision with root package name */
    private final b f4756g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4757h;
    private boolean i;
    private boolean j;
    private InterfaceC0101a k;

    /* renamed from: c.e.a.c.n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0101a {
        void a(a aVar, boolean z);
    }

    private void e() {
        if (Build.VERSION.SDK_INT <= 26) {
            return;
        }
        this.f4756g.a();
        throw null;
    }

    public boolean c() {
        b bVar = this.f4756g;
        if (bVar == null) {
            return false;
        }
        bVar.o();
        throw null;
    }

    public boolean d() {
        return this.j;
    }

    @Override // a.d.a.a
    public ColorStateList getCardBackgroundColor() {
        this.f4756g.c();
        throw null;
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.f4756g.d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.f4756g.e();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingBottom() {
        this.f4756g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingLeft() {
        this.f4756g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingRight() {
        this.f4756g.m();
        throw null;
    }

    @Override // a.d.a.a
    public int getContentPaddingTop() {
        this.f4756g.m();
        throw null;
    }

    public float getProgress() {
        this.f4756g.g();
        throw null;
    }

    @Override // a.d.a.a
    public float getRadius() {
        this.f4756g.f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.f4756g.h();
        throw null;
    }

    public k getShapeAppearanceModel() {
        this.f4756g.i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.f4756g.j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.f4756g.k();
        throw null;
    }

    public int getStrokeWidth() {
        this.f4756g.l();
        throw null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4756g.b();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, m);
        }
        if (d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(a.d.a.a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(a.d.a.a.class.getName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // a.d.a.a, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f4756g.a(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!this.f4757h) {
            return;
        }
        this.f4756g.n();
        throw null;
    }

    void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // a.d.a.a
    public void setCardBackgroundColor(int i) {
        this.f4756g.a(ColorStateList.valueOf(i));
        throw null;
    }

    @Override // a.d.a.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f4756g.a(colorStateList);
        throw null;
    }

    @Override // a.d.a.a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f4756g.q();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.f4756g.a(z);
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f4756g.a(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i) {
        this.f4756g.a(a.a.k.a.a.c(getContext(), i));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f4756g.b(colorStateList);
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f4756g.p();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            e();
            invalidate();
        }
    }

    @Override // a.d.a.a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f4756g.r();
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0101a interfaceC0101a) {
        this.k = interfaceC0101a;
    }

    @Override // a.d.a.a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f4756g.r();
        throw null;
    }

    public void setProgress(float f2) {
        this.f4756g.b(f2);
        throw null;
    }

    @Override // a.d.a.a
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f4756g.a(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f4756g.c(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i) {
        this.f4756g.c(a.a.k.a.a.b(getContext(), i));
        throw null;
    }

    @Override // c.e.a.c.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f4756g.a(kVar);
        throw null;
    }

    public void setStrokeColor(int i) {
        this.f4756g.d(ColorStateList.valueOf(i));
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f4756g.d(colorStateList);
        throw null;
    }

    public void setStrokeWidth(int i) {
        this.f4756g.a(i);
        throw null;
    }

    @Override // a.d.a.a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f4756g.r();
        throw null;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (!c() || !isEnabled()) {
            return;
        }
        this.i = !this.i;
        refreshDrawableState();
        e();
        InterfaceC0101a interfaceC0101a = this.k;
        if (interfaceC0101a == null) {
            return;
        }
        interfaceC0101a.a(this, this.i);
    }
}
