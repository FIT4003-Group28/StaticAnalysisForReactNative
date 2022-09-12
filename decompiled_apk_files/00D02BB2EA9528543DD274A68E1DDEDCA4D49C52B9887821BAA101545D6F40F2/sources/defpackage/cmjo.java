package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
/* compiled from: PG */
/* renamed from: cmjo  reason: default package */
/* loaded from: classes5.dex */
public final class cmjo implements Parcelable.Creator<TrackSelectionParameters> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackSelectionParameters createFromParcel(Parcel parcel) {
        return new TrackSelectionParameters(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackSelectionParameters[] newArray(int i) {
        return new TrackSelectionParameters[i];
    }
}
