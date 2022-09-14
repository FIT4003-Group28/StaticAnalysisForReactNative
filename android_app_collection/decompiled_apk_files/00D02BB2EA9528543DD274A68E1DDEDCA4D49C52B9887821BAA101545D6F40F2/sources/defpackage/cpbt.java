package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig;
/* compiled from: PG */
/* renamed from: cpbt  reason: default package */
/* loaded from: classes5.dex */
public final class cpbt implements Parcelable.Creator<QuickAccessWalletConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QuickAccessWalletConfig createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String[] strArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                strArr = cnwm.w(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new QuickAccessWalletConfig(i, i2, i3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ QuickAccessWalletConfig[] newArray(int i) {
        return new QuickAccessWalletConfig[i];
    }
}
