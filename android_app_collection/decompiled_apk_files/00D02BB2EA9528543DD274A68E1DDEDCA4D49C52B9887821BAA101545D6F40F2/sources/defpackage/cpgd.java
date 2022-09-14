package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
/* compiled from: PG */
/* renamed from: cpgd  reason: default package */
/* loaded from: classes5.dex */
public final class cpgd implements Parcelable.Creator<ImageLabelerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ImageLabelerOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i3 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ImageLabelerOptions(i, i2, f2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ImageLabelerOptions[] newArray(int i) {
        return new ImageLabelerOptions[i];
    }
}
