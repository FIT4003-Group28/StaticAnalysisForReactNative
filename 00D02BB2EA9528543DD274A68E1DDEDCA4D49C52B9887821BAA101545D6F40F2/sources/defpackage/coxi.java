package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;
/* compiled from: PG */
/* renamed from: coxi  reason: default package */
/* loaded from: classes5.dex */
public final class coxi implements Parcelable.Creator<Configuration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Configuration createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Flag[] flagArr = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                flagArr = (Flag[]) cnwm.z(parcel, readInt, Flag.CREATOR);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                strArr = cnwm.w(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new Configuration(i, flagArr, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Configuration[] newArray(int i) {
        return new Configuration[i];
    }
}
