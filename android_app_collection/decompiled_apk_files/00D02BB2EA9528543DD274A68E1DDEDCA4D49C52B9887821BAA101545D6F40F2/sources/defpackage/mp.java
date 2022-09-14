package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
/* compiled from: PG */
/* renamed from: mp  reason: default package */
/* loaded from: classes7.dex */
public final class mp implements Parcelable.Creator<PlaybackStateCompat.CustomAction> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaybackStateCompat.CustomAction createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PlaybackStateCompat.CustomAction[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
