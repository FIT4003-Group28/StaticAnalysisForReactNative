package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.label.internal.client.ImageLabelParcel;
/* compiled from: PG */
/* renamed from: cpgc  reason: default package */
/* loaded from: classes5.dex */
public final class cpgc implements Parcelable.Creator<ImageLabelParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ImageLabelParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ImageLabelParcel(str, str2, f2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ImageLabelParcel[] newArray(int i) {
        return new ImageLabelParcel[i];
    }
}
