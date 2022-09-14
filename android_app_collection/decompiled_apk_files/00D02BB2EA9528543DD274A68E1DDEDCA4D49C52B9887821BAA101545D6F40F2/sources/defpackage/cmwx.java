package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
/* compiled from: PG */
/* renamed from: cmwx  reason: default package */
/* loaded from: classes5.dex */
public final class cmwx implements Parcelable.Creator<CarWindowManagerLayoutParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarWindowManagerLayoutParams createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new CarWindowManagerLayoutParams(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarWindowManagerLayoutParams[] newArray(int i) {
        return new CarWindowManagerLayoutParams[i];
    }
}
