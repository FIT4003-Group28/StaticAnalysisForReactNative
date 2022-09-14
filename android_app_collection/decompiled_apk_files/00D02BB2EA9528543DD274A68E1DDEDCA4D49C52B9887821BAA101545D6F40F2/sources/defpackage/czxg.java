package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateValidatorPointForward;
/* compiled from: PG */
/* renamed from: czxg  reason: default package */
/* loaded from: classes5.dex */
public final class czxg implements Parcelable.Creator<DateValidatorPointForward> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DateValidatorPointForward createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DateValidatorPointForward[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }
}
