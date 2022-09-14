package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
/* compiled from: PG */
/* renamed from: cmci  reason: default package */
/* loaded from: classes5.dex */
public final class cmci implements Parcelable.Creator<IcyHeaders> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IcyHeaders createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IcyHeaders[] newArray(int i) {
        return new IcyHeaders[i];
    }
}
