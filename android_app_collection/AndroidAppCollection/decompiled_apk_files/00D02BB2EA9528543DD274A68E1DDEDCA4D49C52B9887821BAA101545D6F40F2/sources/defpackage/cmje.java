package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
/* compiled from: PG */
/* renamed from: cmje  reason: default package */
/* loaded from: classes5.dex */
public final class cmje implements Parcelable.Creator<DefaultTrackSelector$SelectionOverride> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DefaultTrackSelector$SelectionOverride createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$SelectionOverride(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DefaultTrackSelector$SelectionOverride[] newArray(int i) {
        return new DefaultTrackSelector$SelectionOverride[i];
    }
}
