package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: cmfq  reason: default package */
/* loaded from: classes5.dex */
public final class cmfq implements Parcelable.Creator<TrackGroupArray> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackGroupArray createFromParcel(Parcel parcel) {
        return new TrackGroupArray(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TrackGroupArray[] newArray(int i) {
        return new TrackGroupArray[i];
    }
}
