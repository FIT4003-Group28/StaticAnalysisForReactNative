package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.InAppTrainingConstraints;
/* compiled from: PG */
/* renamed from: cogk  reason: default package */
/* loaded from: classes5.dex */
public final class cogk implements Parcelable.Creator<InAppTrainingConstraints> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InAppTrainingConstraints createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                z3 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new InAppTrainingConstraints(z, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InAppTrainingConstraints[] newArray(int i) {
        return new InAppTrainingConstraints[i];
    }
}
