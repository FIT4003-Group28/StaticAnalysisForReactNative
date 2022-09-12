package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarUiInfo;
/* compiled from: PG */
/* renamed from: cmww  reason: default package */
/* loaded from: classes5.dex */
public final class cmww implements Parcelable.Creator<CarUiInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarUiInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 2:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 3:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    z4 = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    iArr = cnwm.u(parcel, readInt);
                    break;
                case 6:
                    z5 = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 8:
                    z6 = cnwm.g(parcel, readInt);
                    break;
                case 9:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 10:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new CarUiInfo(z, z2, z3, z4, iArr, z5, i, z6, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarUiInfo[] newArray(int i) {
        return new CarUiInfo[i];
    }
}
