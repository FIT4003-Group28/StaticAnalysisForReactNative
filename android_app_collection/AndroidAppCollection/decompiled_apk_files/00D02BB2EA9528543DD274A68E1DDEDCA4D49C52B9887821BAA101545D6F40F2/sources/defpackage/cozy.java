package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.CardRewardsInfo;
/* compiled from: PG */
/* renamed from: cozy  reason: default package */
/* loaded from: classes5.dex */
public final class cozy implements Parcelable.Creator<CardRewardsInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardRewardsInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                str3 = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                str4 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new CardRewardsInfo(j, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CardRewardsInfo[] newArray(int i) {
        return new CardRewardsInfo[i];
    }
}
