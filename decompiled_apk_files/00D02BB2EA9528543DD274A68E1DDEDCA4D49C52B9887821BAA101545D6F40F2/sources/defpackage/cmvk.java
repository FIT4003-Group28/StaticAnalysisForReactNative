package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
/* compiled from: PG */
/* renamed from: cmvk  reason: default package */
/* loaded from: classes5.dex */
public final class cmvk implements Parcelable.Creator<WeatherImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WeatherImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 3) {
                f3 = cnwm.m(parcel, readInt);
            } else if (b == 4) {
                f4 = cnwm.m(parcel, readInt);
            } else if (b == 5) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 6) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new WeatherImpl(f2, f3, f4, i, iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ WeatherImpl[] newArray(int i) {
        return new WeatherImpl[i];
    }
}
