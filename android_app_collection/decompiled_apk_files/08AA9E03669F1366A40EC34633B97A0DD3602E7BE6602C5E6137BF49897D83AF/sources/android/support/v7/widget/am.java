package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.b;
import android.util.AttributeSet;
import android.util.TypedValue;
/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class am {

    /* renamed from: a  reason: collision with root package name */
    private final Context f921a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f922b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f923c;

    public static am a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new am(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static am a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new am(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static am a(Context context, int i, int[] iArr) {
        return new am(context, context.obtainStyledAttributes(i, iArr));
    }

    private am(Context context, TypedArray typedArray) {
        this.f921a = context;
        this.f922b = typedArray;
    }

    public Drawable a(int i) {
        int resourceId;
        if (this.f922b.hasValue(i) && (resourceId = this.f922b.getResourceId(i, 0)) != 0) {
            return android.support.v7.b.a.b.b(this.f921a, resourceId);
        }
        return this.f922b.getDrawable(i);
    }

    public Typeface a(int i, int i2, b.a aVar) {
        int resourceId = this.f922b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f923c == null) {
            this.f923c = new TypedValue();
        }
        return android.support.v4.a.a.b.a(this.f921a, resourceId, this.f923c, i2, aVar);
    }

    public CharSequence b(int i) {
        return this.f922b.getText(i);
    }

    public String c(int i) {
        return this.f922b.getString(i);
    }

    public boolean a(int i, boolean z) {
        return this.f922b.getBoolean(i, z);
    }

    public int a(int i, int i2) {
        return this.f922b.getInt(i, i2);
    }

    public float a(int i, float f) {
        return this.f922b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.f922b.getColor(i, i2);
    }

    public ColorStateList d(int i) {
        int resourceId;
        ColorStateList a2;
        return (!this.f922b.hasValue(i) || (resourceId = this.f922b.getResourceId(i, 0)) == 0 || (a2 = android.support.v7.b.a.b.a(this.f921a, resourceId)) == null) ? this.f922b.getColorStateList(i) : a2;
    }

    public int c(int i, int i2) {
        return this.f922b.getInteger(i, i2);
    }

    public int d(int i, int i2) {
        return this.f922b.getDimensionPixelOffset(i, i2);
    }

    public int e(int i, int i2) {
        return this.f922b.getDimensionPixelSize(i, i2);
    }

    public int f(int i, int i2) {
        return this.f922b.getLayoutDimension(i, i2);
    }

    public int g(int i, int i2) {
        return this.f922b.getResourceId(i, i2);
    }

    public CharSequence[] e(int i) {
        return this.f922b.getTextArray(i);
    }

    public boolean f(int i) {
        return this.f922b.hasValue(i);
    }

    public void a() {
        this.f922b.recycle();
    }
}
