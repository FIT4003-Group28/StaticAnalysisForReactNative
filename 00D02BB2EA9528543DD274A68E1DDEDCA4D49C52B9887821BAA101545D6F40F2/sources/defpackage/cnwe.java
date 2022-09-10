package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
/* compiled from: PG */
/* renamed from: cnwe  reason: default package */
/* loaded from: classes5.dex */
public final class cnwe implements Parcelable.Creator<ResolveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResolveAccountResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                iBinder = cnwm.p(parcel, readInt);
            } else if (b == 3) {
                connectionResult = (ConnectionResult) cnwm.q(parcel, readInt, ConnectionResult.CREATOR);
            } else if (b == 4) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z2 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResolveAccountResponse[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
