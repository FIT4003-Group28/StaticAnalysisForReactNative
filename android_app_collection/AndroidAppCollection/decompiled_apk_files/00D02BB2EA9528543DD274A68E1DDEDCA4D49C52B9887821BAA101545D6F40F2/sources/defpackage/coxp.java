package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coxp  reason: default package */
/* loaded from: classes5.dex */
public final class coxp implements Parcelable.Creator<FlagOverrides> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlagOverrides createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, FlagOverride.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new FlagOverrides(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlagOverrides[] newArray(int i) {
        return new FlagOverrides[i];
    }
}
