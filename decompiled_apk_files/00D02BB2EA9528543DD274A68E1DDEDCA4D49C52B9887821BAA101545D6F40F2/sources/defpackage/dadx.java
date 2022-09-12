package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: PG */
/* renamed from: dadx  reason: default package */
/* loaded from: classes.dex */
public final class dadx {
    public static final dadk a = new dadu(0.5f);
    public final dadl b;
    public final dadl c;
    public final dadl d;
    public final dadl e;
    public final dadk f;
    final dadk g;
    final dadk h;
    final dadk i;
    final dadn j;
    final dadn k;
    final dadn l;
    final dadn m;

    public dadx() {
        this.b = dads.b();
        this.c = dads.b();
        this.d = dads.b();
        this.e = dads.b();
        this.f = new dadi(0.0f);
        this.g = new dadi(0.0f);
        this.h = new dadi(0.0f);
        this.i = new dadi(0.0f);
        this.j = dads.c();
        this.k = dads.c();
        this.l = dads.c();
        this.m = dads.c();
    }

    public dadx(dadw dadwVar) {
        this.b = dadwVar.a;
        this.c = dadwVar.b;
        this.d = dadwVar.c;
        this.e = dadwVar.d;
        this.f = dadwVar.e;
        this.g = dadwVar.f;
        this.h = dadwVar.g;
        this.i = dadwVar.h;
        this.j = dadwVar.i;
        this.k = dadwVar.j;
        this.l = dadwVar.k;
        this.m = dadwVar.l;
    }

    public static dadw a() {
        return new dadw();
    }

    public static dadw b(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new dadi(0.0f));
    }

    public static dadw c(Context context, AttributeSet attributeSet, int i, int i2, dadk dadkVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dadt.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return h(context, resourceId, resourceId2, dadkVar);
    }

    public static dadw d(Context context, int i, int i2) {
        return h(context, i, i2, new dadi(0.0f));
    }

    private static dadw h(Context context, int i, int i2, dadk dadkVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, dadt.b);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            dadk i8 = i(obtainStyledAttributes, 5, dadkVar);
            dadk i9 = i(obtainStyledAttributes, 8, i8);
            dadk i10 = i(obtainStyledAttributes, 9, i8);
            dadk i11 = i(obtainStyledAttributes, 7, i8);
            dadk i12 = i(obtainStyledAttributes, 6, i8);
            dadw dadwVar = new dadw();
            dadwVar.e(dads.a(i4));
            dadwVar.e = i9;
            dadwVar.g(dads.a(i5));
            dadwVar.f = i10;
            dadl a2 = dads.a(i6);
            dadwVar.c = a2;
            dadw.a(a2);
            dadwVar.g = i11;
            dadl a3 = dads.a(i7);
            dadwVar.d = a3;
            dadw.a(a3);
            dadwVar.h = i12;
            return dadwVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static dadk i(TypedArray typedArray, int i, dadk dadkVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return dadkVar;
        }
        if (peekValue.type == 5) {
            return new dadi(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new dadu(peekValue.getFraction(1.0f, 1.0f)) : dadkVar;
    }

    public final dadw e() {
        return new dadw(this);
    }

    public final dadx f(float f) {
        dadw e = e();
        e.i(f);
        return e.b();
    }

    public final boolean g(RectF rectF) {
        boolean z = this.m.getClass().equals(dadn.class) && this.k.getClass().equals(dadn.class) && this.j.getClass().equals(dadn.class) && this.l.getClass().equals(dadn.class);
        float a2 = this.f.a(rectF);
        return z && ((this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0 && (this.i.a(rectF) > a2 ? 1 : (this.i.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.c instanceof dadv) && (this.b instanceof dadv) && (this.d instanceof dadv) && (this.e instanceof dadv));
    }
}
