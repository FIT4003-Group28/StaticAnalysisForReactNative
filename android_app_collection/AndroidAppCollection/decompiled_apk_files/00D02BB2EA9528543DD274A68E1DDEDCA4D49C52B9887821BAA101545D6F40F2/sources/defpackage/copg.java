package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.NearbyLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
/* compiled from: PG */
/* renamed from: copg  reason: default package */
/* loaded from: classes5.dex */
public final class copg implements Parcelable.Creator<NearbyLikelihoodEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyLikelihoodEntity createFromParcel(Parcel parcel) {
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
        return new NearbyLikelihoodEntity(placeEntity, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyLikelihoodEntity[] newArray(int i) {
        return new NearbyLikelihoodEntity[i];
    }
}
