package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.versionedparcelable.ParcelImpl;
/* compiled from: PG */
/* renamed from: bpc  reason: default package */
/* loaded from: classes2.dex */
public final class bpc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public bpc() {
    }

    public bpc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (this.a == 0) {
            return new ParcelImpl(parcel);
        }
        return new ActivityResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        if (this.a == 0) {
            return new ParcelImpl[i];
        }
        return new ActivityResult[i];
    }
}
