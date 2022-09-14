package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.SyncStatus;
/* compiled from: PG */
/* renamed from: cowi  reason: default package */
/* loaded from: classes5.dex */
public final class cowi implements Parcelable.Creator<SyncStatus> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncStatus createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SyncStatus(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncStatus[] newArray(int i) {
        return new SyncStatus[i];
    }
}
