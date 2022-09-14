package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
/* compiled from: PG */
/* renamed from: cpfq  reason: default package */
/* loaded from: classes5.dex */
public final class cpfq implements Parcelable.Creator<FaceSettingsParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FaceSettingsParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        float f2 = -1.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new FaceSettingsParcel(i, i2, i3, z, z2, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FaceSettingsParcel[] newArray(int i) {
        return new FaceSettingsParcel[i];
    }
}
