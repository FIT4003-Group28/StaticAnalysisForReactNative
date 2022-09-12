package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;
/* compiled from: PG */
/* renamed from: cpik  reason: default package */
/* loaded from: classes5.dex */
public final class cpik implements Parcelable.Creator<GetCloudSyncOptInStatusResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCloudSyncOptInStatusResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                z2 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetCloudSyncOptInStatusResponse(i, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCloudSyncOptInStatusResponse[] newArray(int i) {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
