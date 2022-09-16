package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: copb  reason: default package */
/* loaded from: classes5.dex */
public final class copb implements Parcelable.Creator<HierarchicalPlaceLikelihoodEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HierarchicalPlaceLikelihoodEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PlaceEntity placeEntity = null;
        ArrayList<String> arrayList = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                placeEntity = (PlaceEntity) cnwm.q(parcel, readInt, PlaceEntity.CREATOR);
            } else if (b == 2) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 3) {
                f3 = cnwm.m(parcel, readInt);
            } else if (b == 4) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.y(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity, f2, f3, i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HierarchicalPlaceLikelihoodEntity[] newArray(int i) {
        return new HierarchicalPlaceLikelihoodEntity[i];
    }
}
