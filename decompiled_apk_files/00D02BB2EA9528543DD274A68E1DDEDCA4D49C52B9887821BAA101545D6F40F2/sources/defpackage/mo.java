package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: mo  reason: default package */
/* loaded from: classes7.dex */
public final class mo implements Parcelable.Creator<PlaybackStateCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
