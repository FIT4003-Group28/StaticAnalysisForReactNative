package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
/* compiled from: PG */
/* renamed from: corx  reason: default package */
/* loaded from: classes5.dex */
public final class corx implements Parcelable.Creator<SyncRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        byte[] bArr = null;
        SyncOptions syncOptions = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                bArr = cnwm.s(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                syncOptions = (SyncOptions) cnwm.q(parcel, readInt, SyncOptions.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new SyncRequest(i, bArr, syncOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncRequest[] newArray(int i) {
        return new SyncRequest[i];
    }
}
