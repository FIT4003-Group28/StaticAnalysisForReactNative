package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.android.concurrent.ParcelableFuture;
/* compiled from: PG */
/* renamed from: dbpv  reason: default package */
/* loaded from: classes5.dex */
public final class dbpv implements Parcelable.Creator<ParcelableFuture> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableFuture createFromParcel(Parcel parcel) {
        return new ParcelableFuture(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelableFuture[] newArray(int i) {
        return new ParcelableFuture[i];
    }
}
