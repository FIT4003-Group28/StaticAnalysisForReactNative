package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.map.model.directions.LaneTurn;
/* compiled from: PG */
/* renamed from: amtp  reason: default package */
/* loaded from: classes2.dex */
public final class amtp implements Parcelable.Creator<LaneTurn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaneTurn createFromParcel(Parcel parcel) {
        return new LaneTurn(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaneTurn[] newArray(int i) {
        return new LaneTurn[i];
    }
}
