package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.filament.R;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
/* compiled from: PG */
/* renamed from: conz  reason: default package */
/* loaded from: classes5.dex */
public final class conz implements Parcelable.Creator<NearbyAlertRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyAlertRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PlaceFilter placeFilter = null;
        NearbyAlertFilter nearbyAlertFilter = null;
        int i = 0;
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        int i4 = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
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
                    placeFilter = (PlaceFilter) cnwm.q(parcel, readInt, PlaceFilter.CREATOR);
                    break;
                case 4:
                    nearbyAlertFilter = (NearbyAlertFilter) cnwm.q(parcel, readInt, NearbyAlertFilter.CREATOR);
                    break;
                case 5:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    i4 = cnwm.i(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new NearbyAlertRequest(i, i2, placeFilter, nearbyAlertFilter, z, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NearbyAlertRequest[] newArray(int i) {
        return new NearbyAlertRequest[i];
    }
}
