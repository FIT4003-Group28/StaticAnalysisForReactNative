package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final ahv f;
    private static final int[] g = {16842801};
    public static final ahw e = new ahw();

    public CardView(Context context) {
        this(context, null);
    }

    public int Sy() {
        return this.c.left;
    }

    public int b() {
        return this.c.right;
    }

    public int c() {
        return this.c.top;
    }

    public int d() {
        return this.c.bottom;
    }

    public float e() {
        return ahw.d(this.f);
    }

    public final float f() {
        return ahw.c(this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ahw.e(this.f, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        this.f.b.setElevation(f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        e.b(this.f);
    }

    public void setMaxCardElevation(float f) {
        e.a(this.f, f);
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
        if (z != this.b) {
            this.b = z;
            ahw ahwVar = e;
            ahv ahvVar = this.f;
            ahwVar.a(ahvVar, ahw.c(ahvVar));
        }
    }

    public void setRadius(float f) {
        ahx ahxVar = (ahx) this.f.a;
        if (f == ahxVar.a) {
            return;
        }
        ahxVar.a = f;
        ahxVar.b(null);
        ahxVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            ahw ahwVar = e;
            ahv ahvVar = this.f;
            ahwVar.a(ahvVar, ahw.c(ahvVar));
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ahw.e(this.f, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        ahv ahvVar = new ahv(this);
        this.f = ahvVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ahu.a, i, R.style.CardView);
        od.a(this, context, ahu.a, attributeSet, obtainStyledAttributes, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(g);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        ahw ahwVar = e;
        ahx ahxVar = new ahx(valueOf, dimension);
        ahvVar.a = ahxVar;
        ahvVar.b.setBackgroundDrawable(ahxVar);
        CardView cardView = ahvVar.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ahwVar.a(ahvVar, dimension3);
    }
}
