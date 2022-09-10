package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
/* compiled from: PG */
/* renamed from: coms  reason: default package */
/* loaded from: classes5.dex */
public final class coms implements Parcelable.Creator<FusedLocationProviderResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FusedLocationProviderResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Status status = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                status = (Status) cnwm.q(parcel, readInt, Status.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new FusedLocationProviderResult(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FusedLocationProviderResult[] newArray(int i) {
        return new FusedLocationProviderResult[i];
    }
}
