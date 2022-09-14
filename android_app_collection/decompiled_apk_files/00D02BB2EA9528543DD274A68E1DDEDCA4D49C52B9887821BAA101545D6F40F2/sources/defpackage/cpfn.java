package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
/* compiled from: PG */
/* renamed from: cpfn  reason: default package */
/* loaded from: classes5.dex */
public final class cpfn implements Parcelable.Creator<ContourParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContourParcel createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PointF[] pointFArr = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                pointFArr = (PointF[]) cnwm.z(parcel, readInt, PointF.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ContourParcel(pointFArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContourParcel[] newArray(int i) {
        return new ContourParcel[i];
    }
}
