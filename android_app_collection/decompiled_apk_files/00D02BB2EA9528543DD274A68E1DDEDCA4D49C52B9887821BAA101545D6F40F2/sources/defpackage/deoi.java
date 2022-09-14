package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
/* compiled from: PG */
/* renamed from: deoi  reason: default package */
/* loaded from: classes6.dex */
public final class deoi implements Parcelable.Creator<Thing.Metadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Thing.Metadata createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                bundle2 = cnwm.r(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new Thing.Metadata(z, i, str, bundle, bundle2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Thing.Metadata[] newArray(int i) {
        return new Thing.Metadata[i];
    }
}
