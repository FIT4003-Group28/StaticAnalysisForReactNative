package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
/* compiled from: PG */
/* renamed from: cmjc  reason: default package */
/* loaded from: classes5.dex */
public final class cmjc implements Parcelable.Creator<DefaultTrackSelector$Parameters> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DefaultTrackSelector$Parameters createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$Parameters(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DefaultTrackSelector$Parameters[] newArray(int i) {
        return new DefaultTrackSelector$Parameters[i];
    }
}
