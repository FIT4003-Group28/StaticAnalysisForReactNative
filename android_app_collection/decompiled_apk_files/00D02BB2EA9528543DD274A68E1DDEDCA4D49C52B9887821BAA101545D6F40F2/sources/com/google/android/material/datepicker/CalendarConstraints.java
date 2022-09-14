package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new czxc();
    public final Month a;
    public final Month b;
    public final DateValidator c;
    public Month d;
    public final int e;
    public final int f;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public interface DateValidator extends Parcelable {
        boolean a(long j);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.a = month;
        this.b = month2;
        this.d = month3;
        this.c = dateValidator;
        if (month3 == null || month.compareTo(month3) <= 0) {
            if (month3 == null || month3.compareTo(month2) <= 0) {
                this.f = month.f(month2) + 1;
                this.e = (month2.c - month.c) + 1;
                return;
            }
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.a.equals(calendarConstraints.a) && this.b.equals(calendarConstraints.b) && Objects.equals(this.d, calendarConstraints.d) && this.c.equals(calendarConstraints.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
