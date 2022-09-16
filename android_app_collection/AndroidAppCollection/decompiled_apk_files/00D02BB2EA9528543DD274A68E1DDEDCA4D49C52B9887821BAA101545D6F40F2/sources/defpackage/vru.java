package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: vru  reason: default package */
/* loaded from: classes7.dex */
public final class vru implements Parcelable.Creator<Maneuvers$Maneuver> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Maneuvers$Maneuver createFromParcel(Parcel parcel) {
        return new Maneuvers$Maneuver(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Maneuvers$Maneuver[] newArray(int i) {
        return new Maneuvers$Maneuver[i];
    }
}
