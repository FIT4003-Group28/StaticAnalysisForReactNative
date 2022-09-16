package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
/* compiled from: PG */
/* renamed from: mj  reason: default package */
/* loaded from: classes7.dex */
public final class mj implements Parcelable.Creator<MediaSessionCompat$QueueItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$QueueItem createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$QueueItem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$QueueItem[] newArray(int i) {
        return new MediaSessionCompat$QueueItem[i];
    }
}
