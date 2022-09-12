package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
/* compiled from: PG */
/* renamed from: cpft  reason: default package */
/* loaded from: classes5.dex */
public final class cpft implements Parcelable.Creator<LandmarkParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LandmarkParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 3) {
                f3 = cnwm.m(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LandmarkParcel(i, f2, f3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LandmarkParcel[] newArray(int i) {
        return new LandmarkParcel[i];
    }
}
