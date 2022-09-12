package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
/* compiled from: PG */
/* renamed from: cpbr  reason: default package */
/* loaded from: classes5.dex */
public final class cpbr implements Parcelable.Creator<TokenInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 9:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new TokenInfo(str, str2, str3, str4, i, i2, i3, z, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenInfo[] newArray(int i) {
        return new TokenInfo[i];
    }
}
