package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
/* compiled from: PG */
/* renamed from: czxc  reason: default package */
/* loaded from: classes5.dex */
public final class czxc implements Parcelable.Creator<CalendarConstraints> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CalendarConstraints createFromParcel(Parcel parcel) {
        return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CalendarConstraints[] newArray(int i) {
        return new CalendarConstraints[i];
    }
}
