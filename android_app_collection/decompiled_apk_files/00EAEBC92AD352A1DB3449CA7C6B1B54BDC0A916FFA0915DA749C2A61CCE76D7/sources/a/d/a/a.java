package a.d.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    private static final f f98f;

    /* renamed from: b  reason: collision with root package name */
    private boolean f99b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f100c;

    /* renamed from: d  reason: collision with root package name */
    final Rect f101d;

    /* renamed from: e  reason: collision with root package name */
    private final e f102e;

    static {
        new int[1][0] = 16842801;
        int i = Build.VERSION.SDK_INT;
        f98f = i >= 21 ? new c() : i >= 17 ? new b() : new d();
        f98f.a();
    }

    public ColorStateList getCardBackgroundColor() {
        return f98f.b(this.f102e);
    }

    public float getCardElevation() {
        return f98f.c(this.f102e);
    }

    public int getContentPaddingBottom() {
        return this.f101d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f101d.left;
    }

    public int getContentPaddingRight() {
        return this.f101d.right;
    }

    public int getContentPaddingTop() {
        return this.f101d.top;
    }

    public float getMaxCardElevation() {
        return f98f.a(this.f102e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f100c;
    }

    public float getRadius() {
        return f98f.d(this.f102e);
    }

    public boolean getUseCompatPadding() {
        return this.f99b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (!(f98f instanceof c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f98f.f(this.f102e)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f98f.e(this.f102e)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f98f.a(this.f102e, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f98f.a(this.f102e, colorStateList);
    }

    public void setCardElevation(float f2) {
        f98f.b(this.f102e, f2);
    }

    public void setMaxCardElevation(float f2) {
        f98f.c(this.f102e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f100c) {
            this.f100c = z;
            f98f.h(this.f102e);
        }
    }

    public void setRadius(float f2) {
        f98f.a(this.f102e, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f99b != z) {
            this.f99b = z;
            f98f.g(this.f102e);
        }
    }
}
