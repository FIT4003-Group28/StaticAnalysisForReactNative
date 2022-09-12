package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.DeviceOrientation;
/* compiled from: PG */
/* renamed from: cojk  reason: default package */
/* loaded from: classes5.dex */
public final class cojk implements Parcelable.Creator<DeviceOrientation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientation createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        float[] fArr = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        byte b = 0;
        float f4 = 0.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    fArr = cnwm.v(parcel, readInt);
                    break;
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                case 5:
                    f3 = cnwm.m(parcel, readInt);
                    break;
                case 6:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 7:
                    b = cnwm.h(parcel, readInt);
                    break;
                case 8:
                    f4 = cnwm.m(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new DeviceOrientation(fArr, i, i2, f2, f3, j, b, f4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceOrientation[] newArray(int i) {
        return new DeviceOrientation[i];
    }
}
