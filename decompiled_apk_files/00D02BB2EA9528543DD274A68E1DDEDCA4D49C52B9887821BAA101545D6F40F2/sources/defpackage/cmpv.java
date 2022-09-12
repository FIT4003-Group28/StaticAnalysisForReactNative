package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentId;
/* compiled from: PG */
/* renamed from: cmpv  reason: default package */
/* loaded from: classes5.dex */
public final class cmpv implements Parcelable.Creator<DocumentId> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentId createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str3 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DocumentId(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DocumentId[] newArray(int i) {
        return new DocumentId[i];
    }
}
