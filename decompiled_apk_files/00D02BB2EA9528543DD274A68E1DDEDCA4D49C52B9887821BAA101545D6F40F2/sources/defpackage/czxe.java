package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: czxe  reason: default package */
/* loaded from: classes5.dex */
public final class czxe {
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final dadx f;

    private czxe(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, dadx dadxVar, Rect rect) {
        nb.a(rect.left);
        nb.a(rect.top);
        nb.a(rect.right);
        nb.a(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = dadxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static czxe a(Context context, int i) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, czyj.b);
            Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            ColorStateList a = dada.a(context, obtainStyledAttributes, 4);
            ColorStateList a2 = dada.a(context, obtainStyledAttributes, 9);
            ColorStateList a3 = dada.a(context, obtainStyledAttributes, 7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            dadx b = dadx.d(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).b();
            obtainStyledAttributes.recycle();
            return new czxe(a, a2, a3, dimensionPixelSize, b, rect);
        }
        throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(TextView textView) {
        dadr dadrVar = new dadr();
        dadr dadrVar2 = new dadr();
        dadrVar.setShapeAppearanceModel(this.f);
        dadrVar2.setShapeAppearanceModel(this.f);
        dadrVar.Q(this.c);
        dadrVar.T(this.e, this.d);
        textView.setTextColor(this.b);
        od.U(textView, new InsetDrawable((Drawable) new RippleDrawable(this.b.withAlpha(30), dadrVar, dadrVar2), this.a.left, this.a.top, this.a.right, this.a.bottom));
    }

    public final int c() {
        return this.a.top;
    }

    public final int d() {
        return this.a.bottom;
    }
}
