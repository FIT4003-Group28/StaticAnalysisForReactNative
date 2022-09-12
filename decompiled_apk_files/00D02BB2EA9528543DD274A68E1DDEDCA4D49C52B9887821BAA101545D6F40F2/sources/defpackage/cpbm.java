package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;
/* compiled from: PG */
/* renamed from: cpbm  reason: default package */
/* loaded from: classes5.dex */
public final class cpbm implements Parcelable.Creator<GetAllCardsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAllCardsRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        Account account = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new GetAllCardsRequest(z, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetAllCardsRequest[] newArray(int i) {
        return new GetAllCardsRequest[i];
    }
}
