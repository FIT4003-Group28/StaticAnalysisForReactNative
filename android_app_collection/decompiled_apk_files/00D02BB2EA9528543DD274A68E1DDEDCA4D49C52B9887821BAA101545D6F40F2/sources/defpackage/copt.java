package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: copt  reason: default package */
/* loaded from: classes5.dex */
public final class copt implements Parcelable.Creator<PlaceOpeningHoursEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.A(parcel, readInt, PlaceOpeningHoursEntity.BusinessHoursInterval.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList2 = cnwm.A(parcel, readInt, PlaceOpeningHoursEntity.ExceptionalHours.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceOpeningHoursEntity(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceOpeningHoursEntity[] newArray(int i) {
        return new PlaceOpeningHoursEntity[i];
    }
}
