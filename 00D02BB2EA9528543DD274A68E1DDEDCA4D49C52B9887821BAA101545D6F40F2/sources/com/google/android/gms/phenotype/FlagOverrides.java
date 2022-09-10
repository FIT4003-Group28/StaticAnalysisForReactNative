package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FlagOverrides extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FlagOverrides> CREATOR = new coxp();
    public final List<FlagOverride> a;

    public FlagOverrides(List<FlagOverride> list) {
        this.a = list;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlagOverrides) {
            return this.a.equals(((FlagOverrides) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (FlagOverride flagOverride : this.a) {
            if (!z) {
                sb.append(", ");
            }
            flagOverride.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
