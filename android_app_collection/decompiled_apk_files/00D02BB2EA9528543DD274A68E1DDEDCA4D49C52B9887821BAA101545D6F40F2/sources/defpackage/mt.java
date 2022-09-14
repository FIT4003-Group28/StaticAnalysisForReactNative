package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
/* compiled from: PG */
/* renamed from: mt  reason: default package */
/* loaded from: classes7.dex */
public final class mt implements Parcelable.Creator<ResultReceiver> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResultReceiver createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ResultReceiver[] newArray(int i) {
        return new ResultReceiver[i];
    }
}
