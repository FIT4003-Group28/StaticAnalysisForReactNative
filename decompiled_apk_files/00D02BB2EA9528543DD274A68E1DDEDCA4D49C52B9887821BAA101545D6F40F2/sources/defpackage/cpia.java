package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
/* compiled from: PG */
/* renamed from: cpia  reason: default package */
/* loaded from: classes5.dex */
public final class cpia implements Parcelable.Creator<DataItemAssetParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataItemAssetParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DataItemAssetParcelable(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataItemAssetParcelable[] newArray(int i) {
        return new DataItemAssetParcelable[i];
    }
}
