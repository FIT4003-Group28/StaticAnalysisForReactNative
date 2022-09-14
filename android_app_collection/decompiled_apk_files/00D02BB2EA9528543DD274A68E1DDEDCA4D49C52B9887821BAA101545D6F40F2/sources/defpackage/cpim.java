package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigResponse;
/* compiled from: PG */
/* renamed from: cpim  reason: default package */
/* loaded from: classes5.dex */
public final class cpim implements Parcelable.Creator<GetConfigResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConfigResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                connectionConfiguration = (ConnectionConfiguration) cnwm.q(parcel, readInt, ConnectionConfiguration.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetConfigResponse(i, connectionConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetConfigResponse[] newArray(int i) {
        return new GetConfigResponse[i];
    }
}
