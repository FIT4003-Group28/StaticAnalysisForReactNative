package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.GetActiveAccountResponse;
/* compiled from: PG */
/* renamed from: cpab  reason: default package */
/* loaded from: classes5.dex */
public final class cpab implements Parcelable.Creator<GetActiveAccountResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveAccountResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        AccountInfo accountInfo = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                accountInfo = (AccountInfo) cnwm.q(parcel, readInt, AccountInfo.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetActiveAccountResponse(accountInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetActiveAccountResponse[] newArray(int i) {
        return new GetActiveAccountResponse[i];
    }
}
