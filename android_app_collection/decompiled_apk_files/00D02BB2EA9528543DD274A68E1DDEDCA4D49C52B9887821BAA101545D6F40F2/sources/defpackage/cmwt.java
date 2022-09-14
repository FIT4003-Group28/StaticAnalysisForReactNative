package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarSensorEvent;
/* compiled from: PG */
/* renamed from: cmwt  reason: default package */
/* loaded from: classes5.dex */
public final class cmwt implements Parcelable.Creator<CarSensorEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarSensorEvent createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        float[] fArr = null;
        byte[] bArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 3) {
                fArr = cnwm.v(parcel, readInt);
            } else if (b == 4) {
                bArr = cnwm.s(parcel, readInt);
            } else if (b != 1000) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new CarSensorEvent(i, i2, j, fArr, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarSensorEvent[] newArray(int i) {
        return new CarSensorEvent[i];
    }
}
