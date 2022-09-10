package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cons  reason: default package */
/* loaded from: classes5.dex */
public final class cons implements Parcelable.Creator<LocationRequestInternal> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequestInternal createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = LocationRequestInternal.a;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b != 1) {
                switch (b) {
                    case 5:
                        arrayList = cnwm.A(parcel, readInt, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = cnwm.o(parcel, readInt);
                        continue;
                    case 7:
                        z = cnwm.g(parcel, readInt);
                        continue;
                    case 8:
                        z2 = cnwm.g(parcel, readInt);
                        continue;
                    case 9:
                        z3 = cnwm.g(parcel, readInt);
                        continue;
                    case 10:
                        str2 = cnwm.o(parcel, readInt);
                        continue;
                    case 11:
                        z4 = cnwm.g(parcel, readInt);
                        continue;
                    case 12:
                        z5 = cnwm.g(parcel, readInt);
                        continue;
                    case 13:
                        str3 = cnwm.o(parcel, readInt);
                        continue;
                    case 14:
                        j = cnwm.k(parcel, readInt);
                        continue;
                    default:
                        cnwm.d(parcel, readInt);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) cnwm.q(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new LocationRequestInternal(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequestInternal[] newArray(int i) {
        return new LocationRequestInternal[i];
    }
}
