package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.OptInRequest;
/* compiled from: PG */
/* renamed from: coqc  reason: default package */
/* loaded from: classes5.dex */
public final class coqc implements Parcelable.Creator<OptInRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OptInRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Account account = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new OptInRequest(account, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OptInRequest[] newArray(int i) {
        return new OptInRequest[i];
    }
}
