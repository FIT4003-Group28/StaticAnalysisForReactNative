package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f8031a;

    /* renamed from: b  reason: collision with root package name */
    final b f8032b;

    /* renamed from: c  reason: collision with root package name */
    final b f8033c;

    /* renamed from: d  reason: collision with root package name */
    final b f8034d;

    /* renamed from: e  reason: collision with root package name */
    final b f8035e;

    /* renamed from: f  reason: collision with root package name */
    final b f8036f;

    /* renamed from: g  reason: collision with root package name */
    final b f8037g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f8038h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.e.a.c.x.b.a(context, c.e.a.c.b.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), c.e.a.c.k.MaterialCalendar);
        this.f8031a = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_dayStyle, 0));
        this.f8037g = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_dayInvalidStyle, 0));
        this.f8032b = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_daySelectedStyle, 0));
        this.f8033c = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = c.e.a.c.x.c.a(context, obtainStyledAttributes, c.e.a.c.k.MaterialCalendar_rangeFillColor);
        this.f8034d = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_yearStyle, 0));
        this.f8035e = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_yearSelectedStyle, 0));
        this.f8036f = b.a(context, obtainStyledAttributes.getResourceId(c.e.a.c.k.MaterialCalendar_yearTodayStyle, 0));
        this.f8038h = new Paint();
        this.f8038h.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
