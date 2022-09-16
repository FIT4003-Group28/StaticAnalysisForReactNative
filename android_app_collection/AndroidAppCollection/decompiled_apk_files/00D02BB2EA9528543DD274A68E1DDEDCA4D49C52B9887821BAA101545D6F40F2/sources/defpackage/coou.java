package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
/* compiled from: PG */
/* renamed from: coou  reason: default package */
/* loaded from: classes5.dex */
public final class coou implements Parcelable.Creator<PlaceOpeningHoursEntity.BusinessHoursInterval> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity.BusinessHoursInterval createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceOpeningHoursEntity.BusinessHoursInterval(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity.BusinessHoursInterval[] newArray(int i) {
        return new PlaceOpeningHoursEntity.BusinessHoursInterval[i];
    }
}
