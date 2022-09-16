package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
/* compiled from: PG */
/* renamed from: cphl  reason: default package */
/* loaded from: classes5.dex */
public final class cphl implements Parcelable.Creator<AmsEntityUpdateParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AmsEntityUpdateParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        byte b = 0;
        String str = null;
        byte b2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b3 = cnwm.b(readInt);
            if (b3 == 2) {
                b = cnwm.h(parcel, readInt);
            } else if (b3 == 3) {
                b2 = cnwm.h(parcel, readInt);
            } else if (b3 != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new AmsEntityUpdateParcelable(b, b2, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AmsEntityUpdateParcelable[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }
}
