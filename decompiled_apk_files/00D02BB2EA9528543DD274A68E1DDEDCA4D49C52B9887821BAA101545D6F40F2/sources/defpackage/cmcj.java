package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
/* compiled from: PG */
/* renamed from: cmcj  reason: default package */
/* loaded from: classes5.dex */
public final class cmcj implements Parcelable.Creator<IcyInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IcyInfo createFromParcel(Parcel parcel) {
        return new IcyInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IcyInfo[] newArray(int i) {
        return new IcyInfo[i];
    }
}
