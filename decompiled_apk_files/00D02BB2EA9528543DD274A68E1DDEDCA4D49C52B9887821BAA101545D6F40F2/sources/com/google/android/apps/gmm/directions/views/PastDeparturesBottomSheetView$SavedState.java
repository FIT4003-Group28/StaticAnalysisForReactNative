package com.google.android.apps.gmm.directions.views;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PastDeparturesBottomSheetView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PastDeparturesBottomSheetView$SavedState> CREATOR = new zur();
    public final int a;
    public final int b;
    public final int c;

    public PastDeparturesBottomSheetView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public PastDeparturesBottomSheetView$SavedState(Parcelable parcelable, int i, int i2, int i3) {
        super(parcelable);
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
