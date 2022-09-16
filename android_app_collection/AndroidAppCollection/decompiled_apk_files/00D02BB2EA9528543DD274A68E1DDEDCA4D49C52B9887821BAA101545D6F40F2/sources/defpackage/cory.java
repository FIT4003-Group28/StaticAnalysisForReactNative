package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.internal.SyncResult;
/* compiled from: PG */
/* renamed from: cory  reason: default package */
/* loaded from: classes5.dex */
public final class cory implements Parcelable.Creator<SyncResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SyncResult(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncResult[] newArray(int i) {
        return new SyncResult[i];
    }
}
