package com.google.android.apps.gmm.home.views;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class HomeBottomSheetView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<HomeBottomSheetView$SavedState> CREATOR = new aeft();
    public final int a;
    public final int b;

    public HomeBottomSheetView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public HomeBottomSheetView$SavedState(Parcelable parcelable, int i, int i2) {
        super(parcelable);
        this.a = i;
        this.b = i2;
    }
}
