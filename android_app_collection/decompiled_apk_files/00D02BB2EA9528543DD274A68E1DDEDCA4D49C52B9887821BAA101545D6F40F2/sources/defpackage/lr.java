package defpackage;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
/* compiled from: PG */
/* renamed from: lr  reason: default package */
/* loaded from: classes7.dex */
public final class lr implements Parcelable.Creator<MediaDescriptionCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaDescriptionCompat[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
