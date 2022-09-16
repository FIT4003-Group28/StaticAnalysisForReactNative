package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i implements Comparable<i>, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Calendar f8044b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8045c;

    /* renamed from: d  reason: collision with root package name */
    final int f8046d;

    /* renamed from: e  reason: collision with root package name */
    final int f8047e;

    /* renamed from: f  reason: collision with root package name */
    final int f8048f;

    /* renamed from: g  reason: collision with root package name */
    final int f8049g;

    /* renamed from: h  reason: collision with root package name */
    final long f8050h;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<i> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public i mo278createFromParcel(Parcel parcel) {
            return i.a(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public i[] mo279newArray(int i) {
            return new i[i];
        }
    }

    private i(Calendar calendar) {
        calendar.set(5, 1);
        this.f8044b = o.a(calendar);
        this.f8046d = this.f8044b.get(2);
        this.f8047e = this.f8044b.get(1);
        this.f8048f = this.f8044b.getMaximum(7);
        this.f8049g = this.f8044b.getActualMaximum(5);
        this.f8045c = o.e().format(this.f8044b.getTime());
        this.f8050h = this.f8044b.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i a(int i, int i2) {
        Calendar d2 = o.d();
        d2.set(1, i);
        d2.set(2, i2);
        return new i(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i c(long j) {
        Calendar d2 = o.d();
        d2.setTimeInMillis(j);
        return new i(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i p() {
        return new i(o.b());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(i iVar) {
        return this.f8044b.compareTo(iVar.f8044b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a(int i) {
        Calendar a2 = o.a(this.f8044b);
        a2.set(5, i);
        return a2.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(i iVar) {
        if (this.f8044b instanceof GregorianCalendar) {
            return ((iVar.f8047e - this.f8047e) * 12) + (iVar.f8046d - this.f8046d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i b(int i) {
        Calendar a2 = o.a(this.f8044b);
        a2.add(2, i);
        return new i(a2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8046d == iVar.f8046d && this.f8047e == iVar.f8047e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8046d), Integer.valueOf(this.f8047e)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        int firstDayOfWeek = this.f8044b.get(7) - this.f8044b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f8048f : firstDayOfWeek;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String n() {
        return this.f8045c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long o() {
        return this.f8044b.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8047e);
        parcel.writeInt(this.f8046d);
    }
}
