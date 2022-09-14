package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new czyc();
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    private String g;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = czyn.d(calendar);
        this.a = d;
        this.b = d.get(2);
        this.c = d.get(1);
        this.d = d.getMaximum(7);
        this.e = d.getActualMaximum(5);
        this.f = d.getTimeInMillis();
    }

    public static Month a(long j) {
        Calendar b = czyn.b();
        b.setTimeInMillis(j);
        return new Month(b);
    }

    public static Month b(int i, int i2) {
        Calendar b = czyn.b();
        b.set(1, i);
        b.set(2, i2);
        return new Month(b);
    }

    public static Month c() {
        return new Month(czyn.a());
    }

    public final int d() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.d : firstDayOfWeek;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public final int compareTo(Month month) {
        return this.a.compareTo(month.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.b == month.b && this.c == month.c;
    }

    public final int f(Month month) {
        if (this.a instanceof GregorianCalendar) {
            return ((month.c - this.c) * 12) + (month.b - this.b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final long g(int i) {
        Calendar d = czyn.d(this.a);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    public final Month h(int i) {
        Calendar d = czyn.d(this.a);
        d.add(2, i);
        return new Month(d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String i(Context context) {
        if (this.g == null) {
            long timeInMillis = this.a.getTimeInMillis();
            this.g = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
