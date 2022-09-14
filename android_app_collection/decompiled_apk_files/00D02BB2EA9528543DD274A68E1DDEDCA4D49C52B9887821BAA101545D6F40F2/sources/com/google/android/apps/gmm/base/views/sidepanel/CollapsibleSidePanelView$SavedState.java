package com.google.android.apps.gmm.base.views.sidepanel;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CollapsibleSidePanelView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<CollapsibleSidePanelView$SavedState> CREATOR = new jje();
    public final boolean a;

    public CollapsibleSidePanelView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt() != 1 ? false : true;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public CollapsibleSidePanelView$SavedState(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }
}
