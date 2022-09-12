package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
/* compiled from: PG */
/* renamed from: lk  reason: default package */
/* loaded from: classes7.dex */
public final class lk implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat$MediaItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaBrowserCompat$MediaItem[] newArray(int i) {
        return new MediaBrowserCompat$MediaItem[i];
    }
}
