package com.google.android.material.datepicker;

import a.g.m.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f8025a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f8026b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f8027c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f8028d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8029e;

    /* renamed from: f  reason: collision with root package name */
    private final c.e.a.c.a0.k f8030f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, c.e.a.c.a0.k kVar, Rect rect) {
        androidx.core.util.g.a(rect.left);
        androidx.core.util.g.a(rect.top);
        androidx.core.util.g.a(rect.right);
        androidx.core.util.g.a(rect.bottom);
        this.f8025a = rect;
        this.f8026b = colorStateList2;
        this.f8027c = colorStateList;
        this.f8028d = colorStateList3;
        this.f8029e = i;
        this.f8030f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b a(Context context, int i) {
        androidx.core.util.g.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c.e.a.c.k.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(c.e.a.c.k.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(c.e.a.c.k.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(c.e.a.c.k.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(c.e.a.c.k.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a2 = c.e.a.c.x.c.a(context, obtainStyledAttributes, c.e.a.c.k.MaterialCalendarItem_itemFillColor);
        ColorStateList a3 = c.e.a.c.x.c.a(context, obtainStyledAttributes, c.e.a.c.k.MaterialCalendarItem_itemTextColor);
        ColorStateList a4 = c.e.a.c.x.c.a(context, obtainStyledAttributes, c.e.a.c.k.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(c.e.a.c.k.MaterialCalendarItem_itemStrokeWidth, 0);
        c.e.a.c.a0.k a5 = c.e.a.c.a0.k.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, a5, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f8025a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TextView textView) {
        c.e.a.c.a0.g gVar = new c.e.a.c.a0.g();
        c.e.a.c.a0.g gVar2 = new c.e.a.c.a0.g();
        gVar.setShapeAppearanceModel(this.f8030f);
        gVar2.setShapeAppearanceModel(this.f8030f);
        gVar.a(this.f8027c);
        gVar.a(this.f8029e, this.f8028d);
        textView.setTextColor(this.f8026b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f8026b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f8025a;
        v.a(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f8025a.top;
    }
}
