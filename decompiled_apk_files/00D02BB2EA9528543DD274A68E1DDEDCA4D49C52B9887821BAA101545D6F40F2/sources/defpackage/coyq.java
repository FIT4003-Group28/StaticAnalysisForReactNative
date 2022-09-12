package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
/* compiled from: PG */
/* renamed from: coyq  reason: default package */
/* loaded from: classes5.dex */
public final class coyq implements Parcelable.Creator<PseudonymousIdToken> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PseudonymousIdToken createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PseudonymousIdToken(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PseudonymousIdToken[] newArray(int i) {
        return new PseudonymousIdToken[i];
    }
}
