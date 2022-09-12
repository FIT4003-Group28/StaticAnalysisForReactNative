package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
/* compiled from: PG */
/* renamed from: lu  reason: default package */
/* loaded from: classes7.dex */
public final class lu implements Parcelable.Creator<RatingCompat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RatingCompat[] newArray(int i) {
        return new RatingCompat[i];
    }
}
