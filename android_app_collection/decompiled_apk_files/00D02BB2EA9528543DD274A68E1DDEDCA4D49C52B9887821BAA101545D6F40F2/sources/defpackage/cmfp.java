package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.TrackGroup;
/* compiled from: PG */
/* renamed from: cmfp  reason: default package */
/* loaded from: classes5.dex */
public final class cmfp implements Parcelable.Creator<TrackGroup> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackGroup createFromParcel(Parcel parcel) {
        return new TrackGroup(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackGroup[] newArray(int i) {
        return new TrackGroup[i];
    }
}
