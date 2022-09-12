package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
/* compiled from: PG */
/* renamed from: cnwd  reason: default package */
/* loaded from: classes5.dex */
public final class cnwd implements Parcelable.Creator<ResolveAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResolveAccountRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) cnwm.q(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
