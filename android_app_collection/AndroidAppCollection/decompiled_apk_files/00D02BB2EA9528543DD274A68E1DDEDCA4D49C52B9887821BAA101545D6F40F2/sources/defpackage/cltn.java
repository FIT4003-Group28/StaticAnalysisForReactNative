package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
/* compiled from: PG */
/* renamed from: cltn  reason: default package */
/* loaded from: classes5.dex */
public final class cltn implements Parcelable.Creator<DrmInitData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrmInitData createFromParcel(Parcel parcel) {
        return new DrmInitData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrmInitData[] newArray(int i) {
        return new DrmInitData[i];
    }
}
