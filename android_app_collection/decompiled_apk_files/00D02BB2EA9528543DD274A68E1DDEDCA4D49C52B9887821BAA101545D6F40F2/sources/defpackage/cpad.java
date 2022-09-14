package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetActiveTokensForAccountResponse;
import com.google.android.gms.tapandpay.firstparty.TokenInfo;
/* compiled from: PG */
/* renamed from: cpad  reason: default package */
/* loaded from: classes5.dex */
public final class cpad implements Parcelable.Creator<GetActiveTokensForAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveTokensForAccountResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        TokenInfo[] tokenInfoArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                tokenInfoArr = (TokenInfo[]) cnwm.z(parcel, readInt, TokenInfo.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetActiveTokensForAccountResponse(tokenInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveTokensForAccountResponse[] newArray(int i) {
        return new GetActiveTokensForAccountResponse[i];
    }
}
