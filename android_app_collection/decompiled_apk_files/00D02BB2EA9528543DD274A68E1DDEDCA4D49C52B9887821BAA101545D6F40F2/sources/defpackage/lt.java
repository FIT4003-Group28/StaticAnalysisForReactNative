package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
/* compiled from: PG */
/* renamed from: lt  reason: default package */
/* loaded from: classes7.dex */
public final class lt implements Parcelable.Creator<MediaMetadataCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaMetadataCompat createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaMetadataCompat[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
