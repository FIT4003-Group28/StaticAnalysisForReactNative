package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.base.views.sidepanel.CollapsibleSidePanelView$SavedState;
/* compiled from: PG */
/* renamed from: jje  reason: default package */
/* loaded from: classes7.dex */
public final class jje implements Parcelable.Creator<CollapsibleSidePanelView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CollapsibleSidePanelView$SavedState createFromParcel(Parcel parcel) {
        return new CollapsibleSidePanelView$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CollapsibleSidePanelView$SavedState[] newArray(int i) {
        return new CollapsibleSidePanelView$SavedState[i];
    }
}
