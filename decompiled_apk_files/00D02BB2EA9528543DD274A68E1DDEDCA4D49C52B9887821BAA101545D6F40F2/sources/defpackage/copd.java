package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
/* compiled from: PG */
/* renamed from: copd  reason: default package */
/* loaded from: classes5.dex */
public final class copd extends cla implements IInterface {
    public copd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IGooglePlacesService");
    }

    public final void e(List<String> list, PlacesParams placesParams, copf copfVar) {
        Parcel a = a();
        a.writeStringList(list);
        clc.e(a, placesParams);
        clc.f(a, copfVar);
        Sk(17, a);
    }

    public final void f(LatLngBounds latLngBounds, PlaceFilter placeFilter, PlacesParams placesParams, copf copfVar) {
        Parcel a = a();
        clc.e(a, latLngBounds);
        a.writeInt(10);
        a.writeString("");
        clc.e(a, placeFilter);
        clc.e(a, placesParams);
        clc.f(a, copfVar);
        Sk(2, a);
    }
}
