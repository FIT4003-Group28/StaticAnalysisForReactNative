package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceExtendedDetailsEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: copp  reason: default package */
/* loaded from: classes5.dex */
public final class copp implements Parcelable.Creator<PlaceEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList2 = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        String str5 = null;
        Uri uri = null;
        PlaceOpeningHoursEntity placeOpeningHoursEntity = null;
        PlaceExtendedDetailsEntity placeExtendedDetailsEntity = null;
        String str6 = null;
        float f2 = 0.0f;
        boolean z = false;
        float f3 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                case 3:
                case 12:
                case 13:
                case 16:
                case 18:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) cnwm.q(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) cnwm.q(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
                    break;
                case 9:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 10:
                    f3 = cnwm.m(parcel, readInt);
                    break;
                case 11:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 14:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 15:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 17:
                    arrayList2 = cnwm.y(parcel, readInt);
                    break;
                case 19:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 20:
                    arrayList = cnwm.x(parcel, readInt);
                    break;
                case 21:
                    placeOpeningHoursEntity = (PlaceOpeningHoursEntity) cnwm.q(parcel, readInt, PlaceOpeningHoursEntity.CREATOR);
                    break;
                case 22:
                    placeExtendedDetailsEntity = (PlaceExtendedDetailsEntity) cnwm.q(parcel, readInt, PlaceExtendedDetailsEntity.CREATOR);
                    break;
                case 23:
                    str6 = cnwm.o(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new PlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f2, latLngBounds, str5, uri, z, f3, i, placeOpeningHoursEntity, placeExtendedDetailsEntity, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaceEntity[] newArray(int i) {
        return new PlaceEntity[i];
    }
}
