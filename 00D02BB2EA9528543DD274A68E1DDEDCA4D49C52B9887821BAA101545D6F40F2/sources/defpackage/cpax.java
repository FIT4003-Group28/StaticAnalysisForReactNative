package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
/* compiled from: PG */
/* renamed from: cpax  reason: default package */
/* loaded from: classes5.dex */
public final class cpax implements Parcelable.Creator<TokenStatus> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenStatus createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        TokenReference tokenReference = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                tokenReference = (TokenReference) cnwm.q(parcel, readInt, TokenReference.CREATOR);
            } else if (b == 3) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TokenStatus(tokenReference, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenStatus[] newArray(int i) {
        return new TokenStatus[i];
    }
}
