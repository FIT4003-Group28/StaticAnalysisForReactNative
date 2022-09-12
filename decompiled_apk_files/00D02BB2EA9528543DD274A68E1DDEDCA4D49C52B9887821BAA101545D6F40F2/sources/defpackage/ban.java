package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
/* compiled from: PG */
/* renamed from: ban  reason: default package */
/* loaded from: classes3.dex */
public final class ban implements Parcelable.Creator<ParcelImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
