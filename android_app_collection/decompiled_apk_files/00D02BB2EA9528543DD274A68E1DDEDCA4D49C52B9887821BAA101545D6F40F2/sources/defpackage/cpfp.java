package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
/* compiled from: PG */
/* renamed from: cpfp  reason: default package */
/* loaded from: classes5.dex */
public final class cpfp implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        ContourParcel[] contourParcelArr = null;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = Float.MAX_VALUE;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = -1.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    f2 = cnwm.m(parcel, readInt);
                    break;
                case 4:
                    f3 = cnwm.m(parcel, readInt);
                    break;
                case 5:
                    f4 = cnwm.m(parcel, readInt);
                    break;
                case 6:
                    f5 = cnwm.m(parcel, readInt);
                    break;
                case 7:
                    f6 = cnwm.m(parcel, readInt);
                    break;
                case 8:
                    f7 = cnwm.m(parcel, readInt);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) cnwm.z(parcel, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f9 = cnwm.m(parcel, readInt);
                    break;
                case 11:
                    f10 = cnwm.m(parcel, readInt);
                    break;
                case 12:
                    f11 = cnwm.m(parcel, readInt);
                    break;
                case 13:
                    contourParcelArr = (ContourParcel[]) cnwm.z(parcel, readInt, ContourParcel.CREATOR);
                    break;
                case 14:
                    f8 = cnwm.m(parcel, readInt);
                    break;
                case 15:
                    f12 = cnwm.m(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new FaceParcel(i, i2, f2, f3, f4, f5, f6, f7, f8, landmarkParcelArr, f9, f10, f11, contourParcelArr, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FaceParcel[] newArray(int i) {
        return new FaceParcel[i];
    }
}
