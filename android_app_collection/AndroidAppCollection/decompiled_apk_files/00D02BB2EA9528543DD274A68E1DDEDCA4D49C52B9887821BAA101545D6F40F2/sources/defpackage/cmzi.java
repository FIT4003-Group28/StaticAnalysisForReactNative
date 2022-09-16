package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.TouchEventCompleteData;
/* compiled from: PG */
/* renamed from: cmzi  reason: default package */
/* loaded from: classes5.dex */
public final class cmzi implements Parcelable.Creator<TouchEventCompleteData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TouchEventCompleteData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        Rect rect = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                rect = (Rect) cnwm.q(parcel, readInt, Rect.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TouchEventCompleteData(i, rect, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TouchEventCompleteData[] newArray(int i) {
        return new TouchEventCompleteData[i];
    }
}
