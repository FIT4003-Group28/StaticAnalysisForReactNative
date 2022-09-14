package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
/* compiled from: PG */
/* renamed from: cpao  reason: default package */
/* loaded from: classes5.dex */
public final class cpao implements Parcelable.Creator<IssuerInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IssuerInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    str7 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    str8 = cnwm.o(parcel, readInt);
                    break;
                case 10:
                    str9 = cnwm.o(parcel, readInt);
                    break;
                case 11:
                    str10 = cnwm.o(parcel, readInt);
                    break;
                case 12:
                    str11 = cnwm.o(parcel, readInt);
                    break;
                case 13:
                    str12 = cnwm.o(parcel, readInt);
                    break;
                case 14:
                    str13 = cnwm.o(parcel, readInt);
                    break;
                case 15:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 16:
                    str14 = cnwm.o(parcel, readInt);
                    break;
                case 17:
                    str15 = cnwm.o(parcel, readInt);
                    break;
                case 18:
                    str16 = cnwm.o(parcel, readInt);
                    break;
                case 19:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 20:
                    str17 = cnwm.o(parcel, readInt);
                    break;
                case 21:
                    str18 = cnwm.o(parcel, readInt);
                    break;
                case 22:
                    str19 = cnwm.o(parcel, readInt);
                    break;
                case 23:
                    str20 = cnwm.o(parcel, readInt);
                    break;
                case 24:
                    i = cnwm.i(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new IssuerInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j, str14, str15, str16, str17, str18, str19, str20, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IssuerInfo[] newArray(int i) {
        return new IssuerInfo[i];
    }
}
