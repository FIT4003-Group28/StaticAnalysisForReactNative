package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;
/* compiled from: PG */
/* renamed from: mn  reason: default package */
/* loaded from: classes7.dex */
public final class mn implements Parcelable.Creator<ParcelableVolumeInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
