package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;
/* compiled from: PG */
/* renamed from: cozk  reason: default package */
/* loaded from: classes5.dex */
public final class cozk implements Parcelable.Creator<SignInResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                connectionResult = (ConnectionResult) cnwm.q(parcel, readInt, ConnectionResult.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) cnwm.q(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInResponse[] newArray(int i) {
        return new SignInResponse[i];
    }
}
