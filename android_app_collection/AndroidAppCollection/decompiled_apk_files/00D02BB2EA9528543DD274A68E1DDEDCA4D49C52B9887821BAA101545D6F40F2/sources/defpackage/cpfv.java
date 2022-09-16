package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* compiled from: PG */
/* renamed from: cpfv  reason: default package */
/* loaded from: classes5.dex */
public final class cpfv implements Parcelable.Creator<FrameMetadataParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FrameMetadataParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b == 5) {
                j = cnwm.k(parcel, readInt);
            } else if (b != 6) {
                cnwm.d(parcel, readInt);
            } else {
                i4 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new FrameMetadataParcel(i, i2, i3, j, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FrameMetadataParcel[] newArray(int i) {
        return new FrameMetadataParcel[i];
    }
}
