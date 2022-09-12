package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;
/* compiled from: PG */
/* renamed from: cpil  reason: default package */
/* loaded from: classes5.dex */
public final class cpil implements Parcelable.Creator<GetCloudSyncSettingResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCloudSyncSettingResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetCloudSyncSettingResponse(i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetCloudSyncSettingResponse[] newArray(int i) {
        return new GetCloudSyncSettingResponse[i];
    }
}
