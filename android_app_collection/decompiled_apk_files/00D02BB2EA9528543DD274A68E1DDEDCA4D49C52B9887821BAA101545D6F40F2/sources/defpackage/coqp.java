package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.UploadRequest;
/* compiled from: PG */
/* renamed from: coqp  reason: default package */
/* loaded from: classes5.dex */
public final class coqp implements Parcelable.Creator<UploadRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UploadRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Account account = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    account = (Account) cnwm.q(parcel, readInt, Account.CREATOR);
                    break;
                case 3:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 5:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 6:
                    j3 = cnwm.k(parcel, readInt);
                    break;
                case 7:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new UploadRequest(account, str, j, j2, j3, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UploadRequest[] newArray(int i) {
        return new UploadRequest[i];
    }
}
