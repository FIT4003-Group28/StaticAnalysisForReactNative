package com.google.android.libraries.material.productlockup;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ProductLockupView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ProductLockupView$SavedState> CREATOR = new csmn();
    public String a;
    public boolean b;

    public ProductLockupView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readString();
        this.b = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public ProductLockupView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
