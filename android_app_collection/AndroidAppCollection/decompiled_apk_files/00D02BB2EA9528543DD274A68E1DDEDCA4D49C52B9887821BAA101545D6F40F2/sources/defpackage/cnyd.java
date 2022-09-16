package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.ContextData;
/* compiled from: PG */
/* renamed from: cnyd  reason: default package */
/* loaded from: classes5.dex */
public final class cnyd implements Parcelable.Creator<ContextData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextData createFromParcel(Parcel parcel) {
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
        return new ContextData(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ContextData[] newArray(int i) {
        return new ContextData[i];
    }
}
