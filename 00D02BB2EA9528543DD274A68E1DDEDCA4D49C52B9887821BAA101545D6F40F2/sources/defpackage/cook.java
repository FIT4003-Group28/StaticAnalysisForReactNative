package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceRequest;
/* compiled from: PG */
/* renamed from: cook  reason: default package */
/* loaded from: classes5.dex */
public final class cook implements Parcelable.Creator<PlaceRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PlaceFilter placeFilter = null;
        long j = -1;
        long j2 = Long.MAX_VALUE;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    placeFilter = (PlaceFilter) cnwm.q(parcel, readInt, PlaceFilter.CREATOR);
                    break;
                case 3:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 4:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 6:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new PlaceRequest(placeFilter, j, i, j2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceRequest[] newArray(int i) {
        return new PlaceRequest[i];
    }
}
