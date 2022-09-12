package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
/* compiled from: PG */
/* renamed from: clto  reason: default package */
/* loaded from: classes5.dex */
public final class clto implements Parcelable.Creator<DrmInitData.SchemeData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrmInitData.SchemeData createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrmInitData.SchemeData[] newArray(int i) {
        return new DrmInitData.SchemeData[i];
    }
}
