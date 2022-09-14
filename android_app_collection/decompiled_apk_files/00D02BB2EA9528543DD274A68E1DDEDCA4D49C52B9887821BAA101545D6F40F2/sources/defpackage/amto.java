package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.map.model.directions.LaneGuidance;
/* compiled from: PG */
/* renamed from: amto  reason: default package */
/* loaded from: classes2.dex */
public final class amto implements Parcelable.Creator<LaneGuidance> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaneGuidance createFromParcel(Parcel parcel) {
        return new LaneGuidance(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LaneGuidance[] newArray(int i) {
        return new LaneGuidance[i];
    }
}
