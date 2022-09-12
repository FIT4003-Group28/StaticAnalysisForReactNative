package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
/* compiled from: PG */
/* renamed from: coro  reason: default package */
/* loaded from: classes5.dex */
public final class coro implements Parcelable.Creator<SyncOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncOptions createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        while (parcel.dataPosition() < f) {
            cnwm.d(parcel, parcel.readInt());
        }
        cnwm.B(parcel, f);
        return new SyncOptions();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SyncOptions[] newArray(int i) {
        return new SyncOptions[i];
    }
}
