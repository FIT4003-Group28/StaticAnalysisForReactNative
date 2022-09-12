package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.Month;
/* compiled from: PG */
/* renamed from: czyc  reason: default package */
/* loaded from: classes5.dex */
public final class czyc implements Parcelable.Creator<Month> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Month createFromParcel(Parcel parcel) {
        return Month.b(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Month[] newArray(int i) {
        return new Month[i];
    }
}
