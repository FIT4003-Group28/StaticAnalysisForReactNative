package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpjp  reason: default package */
/* loaded from: classes5.dex */
public final class cpjp implements Parcelable.Creator<StorageInfoResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StorageInfoResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        long j = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                j = cnwm.k(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, PackageStorageInfo.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new StorageInfoResponse(i, j, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StorageInfoResponse[] newArray(int i) {
        return new StorageInfoResponse[i];
    }
}
