package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: PG */
/* renamed from: alnc  reason: default package */
/* loaded from: classes.dex */
public final class alnc {
    public static final alms a = new almz(0.5f);
    public final alms b;
    final alms c;
    final alms d;
    final alms e;
    final almu f;
    final almu g;
    final almu h;
    final almu i;
    final anlz j;
    final anlz k;
    final anlz l;
    final anlz m;

    public alnc() {
        this.j = almu.C();
        this.k = almu.C();
        this.l = almu.C();
        this.m = almu.C();
        this.b = new almq(0.0f);
        this.c = new almq(0.0f);
        this.d = new almq(0.0f);
        this.e = new almq(0.0f);
        this.f = almu.a();
        this.g = almu.a();
        this.h = almu.a();
        this.i = almu.a();
    }

    public alnc(alnb alnbVar) {
        this.j = alnbVar.i;
        this.k = alnbVar.j;
        this.l = alnbVar.k;
        this.m = alnbVar.l;
        this.b = alnbVar.a;
        this.c = alnbVar.b;
        this.d = alnbVar.c;
        this.e = alnbVar.d;
        this.f = alnbVar.e;
        this.g = alnbVar.f;
        this.h = alnbVar.g;
        this.i = alnbVar.h;
    }

    public static alnb a() {
        return new alnb();
    }

    public static alnb b(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new almq(0.0f));
    }

    public static alnb c(Context context, AttributeSet attributeSet, int i, int i2, alms almsVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, almy.a, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            context = new ContextThemeWrapper(context, resourceId);
            resourceId = resourceId2;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, almy.b);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            alms f = f(obtainStyledAttributes2, 5, almsVar);
            alms f2 = f(obtainStyledAttributes2, 8, f);
            alms f3 = f(obtainStyledAttributes2, 9, f);
            alms f4 = f(obtainStyledAttributes2, 7, f);
            alms f5 = f(obtainStyledAttributes2, 6, f);
            alnb alnbVar = new alnb();
            alnbVar.f(almu.B(i4));
            alnbVar.a = f2;
            alnbVar.g(almu.B(i5));
            alnbVar.b = f3;
            anlz B = almu.B(i6);
            alnbVar.k = B;
            alnb.h(B);
            alnbVar.c = f4;
            anlz B2 = almu.B(i7);
            alnbVar.l = B2;
            alnb.h(B2);
            alnbVar.d = f5;
            return alnbVar;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    private static alms f(TypedArray typedArray, int i, alms almsVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return almsVar;
        }
        if (peekValue.type == 5) {
            return new almq(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return peekValue.type == 6 ? new almz(peekValue.getFraction(1.0f, 1.0f)) : almsVar;
    }

    public final alnb d() {
        return new alnb(this);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.i.getClass().equals(almu.class) && this.g.getClass().equals(almu.class) && this.f.getClass().equals(almu.class) && this.h.getClass().equals(almu.class);
        float a2 = this.b.a(rectF);
        return z && ((this.c.a(rectF) > a2 ? 1 : (this.c.a(rectF) == a2 ? 0 : -1)) == 0 && (this.e.a(rectF) > a2 ? 1 : (this.e.a(rectF) == a2 ? 0 : -1)) == 0 && (this.d.a(rectF) > a2 ? 1 : (this.d.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.k instanceof alna) && (this.j instanceof alna) && (this.l instanceof alna) && (this.m instanceof alna));
    }
}
