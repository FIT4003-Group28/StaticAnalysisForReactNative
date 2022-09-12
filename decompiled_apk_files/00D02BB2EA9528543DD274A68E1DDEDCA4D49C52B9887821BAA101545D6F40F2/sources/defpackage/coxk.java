package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.DogfoodsToken;
/* compiled from: PG */
/* renamed from: coxk  reason: default package */
/* loaded from: classes5.dex */
public final class coxk implements Parcelable.Creator<DogfoodsToken> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DogfoodsToken createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DogfoodsToken(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DogfoodsToken[] newArray(int i) {
        return new DogfoodsToken[i];
    }
}
