package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
/* compiled from: PG */
/* renamed from: aeq  reason: default package */
/* loaded from: classes.dex */
public final class aeq {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    private aeq(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static aeq a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new aeq(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static aeq b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new aeq(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static aeq c(Context context, int i, int[] iArr) {
        return new aeq(context, context.obtainStyledAttributes(i, iArr));
    }

    public final Drawable d(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return this.b.getDrawable(i);
        }
        return sl.b(this.a, resourceId);
    }

    public final Drawable e(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return xi.b().g(this.a, resourceId);
    }

    public final CharSequence f(int i) {
        return this.b.getText(i);
    }

    public final String g(int i) {
        return this.b.getString(i);
    }

    public final boolean h(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public final int i(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public final ColorStateList j(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a = sl.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a;
    }

    public final int k(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public final int l(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public final int m(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public final int n(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public final int o(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public final boolean p(int i) {
        return this.b.hasValue(i);
    }

    public final void q() {
        this.b.recycle();
    }

    public final float r(int i) {
        return this.b.getDimension(i, -1.0f);
    }

    public final int s(int i) {
        return this.b.getColor(i, 0);
    }
}
