package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
/* compiled from: PG */
/* renamed from: copr  reason: default package */
/* loaded from: classes5.dex */
public final class copr implements Parcelable.Creator<PlaceLikelihoodEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceLikelihoodEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PlaceEntity placeEntity = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                placeEntity = (PlaceEntity) cnwm.q(parcel, readInt, PlaceEntity.CREATOR);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                f2 = cnwm.m(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PlaceLikelihoodEntity(placeEntity, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceLikelihoodEntity[] newArray(int i) {
        return new PlaceLikelihoodEntity[i];
    }
}
