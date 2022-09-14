package androidx.appcompat.widget;

import a.g.e.f.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1417a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1418b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1419c;

    private x0(Context context, TypedArray typedArray) {
        this.f1417a = context;
        this.f1418b = typedArray;
    }

    public static x0 a(Context context, int i, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f2) {
        return this.f1418b.getDimension(i, f2);
    }

    public int a(int i, int i2) {
        return this.f1418b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b2;
        return (!this.f1418b.hasValue(i) || (resourceId = this.f1418b.getResourceId(i, 0)) == 0 || (b2 = a.a.k.a.a.b(this.f1417a, resourceId)) == null) ? this.f1418b.getColorStateList(i) : b2;
    }

    public Typeface a(int i, int i2, f.a aVar) {
        int resourceId = this.f1418b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1419c == null) {
            this.f1419c = new TypedValue();
        }
        return a.g.e.f.f.a(this.f1417a, resourceId, this.f1419c, i2, aVar);
    }

    public void a() {
        this.f1418b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.f1418b.getBoolean(i, z);
    }

    public float b(int i, float f2) {
        return this.f1418b.getFloat(i, f2);
    }

    public int b(int i, int i2) {
        return this.f1418b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.f1418b.hasValue(i) || (resourceId = this.f1418b.getResourceId(i, 0)) == 0) ? this.f1418b.getDrawable(i) : a.a.k.a.a.c(this.f1417a, resourceId);
    }

    public int c(int i, int i2) {
        return this.f1418b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f1418b.hasValue(i) || (resourceId = this.f1418b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().a(this.f1417a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f1418b.getInt(i, i2);
    }

    public String d(int i) {
        return this.f1418b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f1418b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.f1418b.getText(i);
    }

    public int f(int i, int i2) {
        return this.f1418b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.f1418b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.f1418b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.f1418b.hasValue(i);
    }
}
