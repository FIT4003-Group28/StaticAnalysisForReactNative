package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InAppTrainingConstraints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InAppTrainingConstraints> CREATOR = new cogk();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public InAppTrainingConstraints(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppTrainingConstraints)) {
            return false;
        }
        InAppTrainingConstraints inAppTrainingConstraints = (InAppTrainingConstraints) obj;
        return this.a == inAppTrainingConstraints.a && this.b == inAppTrainingConstraints.b && this.c == inAppTrainingConstraints.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
