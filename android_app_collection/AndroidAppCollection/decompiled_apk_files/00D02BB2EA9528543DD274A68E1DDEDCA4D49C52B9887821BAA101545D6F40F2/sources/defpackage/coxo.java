package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
/* compiled from: PG */
/* renamed from: coxo  reason: default package */
/* loaded from: classes5.dex */
public final class coxo implements Parcelable.Creator<FlagOverride> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlagOverride createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        Flag flag = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                flag = (Flag) cnwm.q(parcel, readInt, Flag.CREATOR);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new FlagOverride(str, str2, flag, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlagOverride[] newArray(int i) {
        return new FlagOverride[i];
    }
}
