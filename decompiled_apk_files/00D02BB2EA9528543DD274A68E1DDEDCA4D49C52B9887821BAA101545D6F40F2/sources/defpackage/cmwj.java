package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarInfo;
/* compiled from: PG */
/* renamed from: cmwj  reason: default package */
/* loaded from: classes5.dex */
public final class cmwj implements Parcelable.Creator<CarInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarInfo createFromParcel(Parcel parcel) {
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
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    z = cnwm.g(parcel, readInt);
                    break;
                case 8:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 9:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 10:
                    str6 = cnwm.o(parcel, readInt);
                    break;
                case 11:
                    str7 = cnwm.o(parcel, readInt);
                    break;
                case 12:
                    str8 = cnwm.o(parcel, readInt);
                    break;
                case 13:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 14:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 15:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case 16:
                    str9 = cnwm.o(parcel, readInt);
                    break;
                case 17:
                    str10 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new CarInfo(str, str2, str3, str4, i, i2, z, i3, str5, str6, str7, str8, z2, z3, z4, str9, str10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarInfo[] newArray(int i) {
        return new CarInfo[i];
    }
}
