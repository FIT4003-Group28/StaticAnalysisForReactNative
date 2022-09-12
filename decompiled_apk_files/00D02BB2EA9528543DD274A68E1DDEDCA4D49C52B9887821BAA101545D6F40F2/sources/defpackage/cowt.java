package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.model.AccountMetadata;
/* compiled from: PG */
/* renamed from: cowt  reason: default package */
/* loaded from: classes5.dex */
public final class cowt implements Parcelable.Creator<AccountMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountMetadata createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 4) {
                z3 = cnwm.g(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z4 = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new AccountMetadata(z, z2, z3, z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AccountMetadata[] newArray(int i) {
        return new AccountMetadata[i];
    }
}
