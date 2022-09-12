package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.WifiScan;
/* compiled from: PG */
/* renamed from: cols  reason: default package */
/* loaded from: classes5.dex */
public final class cols implements Parcelable.Creator<WifiScan> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WifiScan createFromParcel(Parcel parcel) {
        long[] jArr;
        int f = cnwm.f(parcel);
        long[] jArr2 = WifiScan.a;
        int[] iArr = WifiScan.b;
        int[] iArr2 = WifiScan.b;
        int[] iArr3 = WifiScan.b;
        long[] jArr3 = jArr2;
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int[] iArr6 = iArr3;
        int[] iArr7 = WifiScan.b;
        int[] iArr8 = WifiScan.b;
        int[] iArr9 = WifiScan.b;
        long j = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 2:
                    int c = cnwm.c(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (c == 0) {
                        jArr = null;
                    } else {
                        long[] createLongArray = parcel.createLongArray();
                        parcel.setDataPosition(dataPosition + c);
                        jArr = createLongArray;
                    }
                    jArr3 = jArr;
                    break;
                case 3:
                    iArr4 = cnwm.u(parcel, readInt);
                    break;
                case 4:
                    iArr5 = cnwm.u(parcel, readInt);
                    break;
                case 5:
                    iArr6 = cnwm.u(parcel, readInt);
                    break;
                case 6:
                    iArr7 = cnwm.u(parcel, readInt);
                    break;
                case 7:
                    iArr8 = cnwm.u(parcel, readInt);
                    break;
                case 8:
                    iArr9 = cnwm.u(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new WifiScan(j, jArr3, iArr4, iArr5, iArr6, iArr7, iArr8, iArr9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WifiScan[] newArray(int i) {
        return new WifiScan[i];
    }
}
