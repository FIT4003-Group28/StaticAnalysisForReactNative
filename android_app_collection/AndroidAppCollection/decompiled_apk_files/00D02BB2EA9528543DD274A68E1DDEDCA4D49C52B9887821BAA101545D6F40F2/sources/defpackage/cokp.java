package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cokp  reason: default package */
/* loaded from: classes5.dex */
public final class cokp implements Parcelable.Creator<GeofencingRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeofencingRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = "";
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                arrayList = cnwm.A(parcel, readInt, ParcelableGeofence.CREATOR);
            } else if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GeofencingRequest(arrayList, i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GeofencingRequest[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
