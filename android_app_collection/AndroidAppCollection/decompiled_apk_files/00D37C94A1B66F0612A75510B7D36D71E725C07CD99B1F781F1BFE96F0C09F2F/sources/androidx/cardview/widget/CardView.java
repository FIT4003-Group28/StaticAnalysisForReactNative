package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final afn e;
    private static final int[] g = {16842801};
    public static final aec f = new aec();

    public CardView(Context context) {
        this(context, null);
    }

    public final void b(int i) {
        afn afnVar = this.e;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        afo afoVar = (afo) afnVar.a;
        afoVar.a(valueOf);
        afoVar.invalidateSelf();
    }

    public final void c(float f2) {
        afo afoVar = (afo) this.e.a;
        if (f2 == afoVar.a) {
            return;
        }
        afoVar.a = f2;
        afoVar.b(null);
        afoVar.invalidateSelf();
    }

    public final void d() {
        this.e.b.setElevation(0.0f);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        afn afnVar = new afn(this);
        this.e = afnVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afm.a, i, R.style.CardView);
        lj.L(this, context, afm.a, attributeSet, obtainStyledAttributes, i, R.style.CardView);
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
        afo afoVar = new afo(valueOf, dimension);
        afnVar.a = afoVar;
        afnVar.b.setBackgroundDrawable(afoVar);
        CardView cardView = afnVar.b;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        aec.h(afnVar, dimension3);
    }
}
