package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coov  reason: default package */
/* loaded from: classes5.dex */
public final class coov implements Parcelable.Creator<PlaceOpeningHoursEntity.ExceptionalHours> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity.ExceptionalHours createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    i5 = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    i6 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    arrayList = cnwm.A(parcel, readInt, PlaceOpeningHoursEntity.BusinessHoursInterval.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new PlaceOpeningHoursEntity.ExceptionalHours(i, i2, i3, i4, i5, i6, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity.ExceptionalHours[] newArray(int i) {
        return new PlaceOpeningHoursEntity.ExceptionalHours[i];
    }
}
