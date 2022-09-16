package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemParcelable;
/* compiled from: PG */
/* renamed from: cpic  reason: default package */
/* loaded from: classes5.dex */
public final class cpic implements Parcelable.Creator<DataItemParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataItemParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Uri uri = null;
        Bundle bundle = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                uri = (Uri) cnwm.q(parcel, readInt, Uri.CREATOR);
            } else if (b == 4) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DataItemParcelable(uri, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataItemParcelable[] newArray(int i) {
        return new DataItemParcelable[i];
    }
}
