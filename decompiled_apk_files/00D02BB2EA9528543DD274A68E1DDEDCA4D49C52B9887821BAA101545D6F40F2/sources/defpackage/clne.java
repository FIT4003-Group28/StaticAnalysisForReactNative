package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
/* compiled from: PG */
/* renamed from: clne  reason: default package */
/* loaded from: classes5.dex */
public final class clne implements Parcelable.Creator<Format> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Format createFromParcel(Parcel parcel) {
        return new Format(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Format[] newArray(int i) {
        return new Format[i];
    }
}
