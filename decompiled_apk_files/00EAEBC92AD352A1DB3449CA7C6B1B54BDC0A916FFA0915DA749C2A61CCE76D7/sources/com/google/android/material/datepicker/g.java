package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
class g extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    private static final int f8040e;

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f8041b = o.d();

    /* renamed from: c  reason: collision with root package name */
    private final int f8042c = this.f8041b.getMaximum(7);

    /* renamed from: d  reason: collision with root package name */
    private final int f8043d = this.f8041b.getFirstDayOfWeek();

    static {
        f8040e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    private int a(int i) {
        int i2 = i + this.f8043d;
        int i3 = this.f8042c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8042c;
    }

    @Override // android.widget.Adapter
    /* renamed from: getItem */
    public Integer mo277getItem(int i) {
        if (i >= this.f8042c) {
            return null;
        }
        return Integer.valueOf(a(i));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.e.a.c.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f8041b.set(7, a(i));
        textView.setText(this.f8041b.getDisplayName(7, f8040e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(c.e.a.c.i.mtrl_picker_day_of_week_column_header), this.f8041b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
