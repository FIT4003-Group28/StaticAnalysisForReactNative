package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
/* compiled from: PG */
/* renamed from: cozj  reason: default package */
/* loaded from: classes5.dex */
public final class cozj implements Parcelable.Creator<SignInRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) cnwm.q(parcel, readInt, ResolveAccountRequest.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new SignInRequest(i, resolveAccountRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInRequest[] newArray(int i) {
        return new SignInRequest[i];
    }
}
