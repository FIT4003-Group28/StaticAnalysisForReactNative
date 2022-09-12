package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
/* compiled from: PG */
/* renamed from: deop  reason: default package */
/* loaded from: classes6.dex */
public final class deop implements Parcelable.Creator<Thing> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Thing createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Bundle bundle = null;
        Thing.Metadata metadata = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b == 2) {
                metadata = (Thing.Metadata) cnwm.q(parcel, readInt, Thing.Metadata.CREATOR);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 1000) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new Thing(i, bundle, metadata, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Thing[] newArray(int i) {
        return new Thing[i];
    }
}
