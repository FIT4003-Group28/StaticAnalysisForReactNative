package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigsResponse;
/* compiled from: PG */
/* renamed from: cpin  reason: default package */
/* loaded from: classes5.dex */
public final class cpin implements Parcelable.Creator<GetConfigsResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConfigsResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                connectionConfigurationArr = (ConnectionConfiguration[]) cnwm.z(parcel, readInt, ConnectionConfiguration.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetConfigsResponse(i, connectionConfigurationArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConfigsResponse[] newArray(int i) {
        return new GetConfigsResponse[i];
    }
}
