package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
/* compiled from: PG */
/* renamed from: cpaw  reason: default package */
/* loaded from: classes5.dex */
public final class cpaw implements Parcelable.Creator<TokenReference> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenReference createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TokenReference(str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenReference[] newArray(int i) {
        return new TokenReference[i];
    }
}
