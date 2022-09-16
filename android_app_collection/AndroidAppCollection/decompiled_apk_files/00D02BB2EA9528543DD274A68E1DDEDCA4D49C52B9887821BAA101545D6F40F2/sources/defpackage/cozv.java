package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
/* compiled from: PG */
/* renamed from: cozv  reason: default package */
/* loaded from: classes5.dex */
public final class cozv implements Parcelable.Creator<AccountInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new AccountInfo(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountInfo[] newArray(int i) {
        return new AccountInfo[i];
    }
}
