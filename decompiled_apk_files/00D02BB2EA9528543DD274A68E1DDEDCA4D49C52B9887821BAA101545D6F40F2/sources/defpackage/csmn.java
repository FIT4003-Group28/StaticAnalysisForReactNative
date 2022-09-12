package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.productlockup.ProductLockupView$SavedState;
/* compiled from: PG */
/* renamed from: csmn  reason: default package */
/* loaded from: classes5.dex */
public final class csmn implements Parcelable.Creator<ProductLockupView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProductLockupView$SavedState createFromParcel(Parcel parcel) {
        return new ProductLockupView$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProductLockupView$SavedState[] newArray(int i) {
        return new ProductLockupView$SavedState[i];
    }
}
