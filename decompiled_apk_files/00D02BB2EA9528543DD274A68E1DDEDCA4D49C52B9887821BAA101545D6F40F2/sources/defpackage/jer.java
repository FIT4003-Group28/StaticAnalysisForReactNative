package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.base.views.expandingscrollview.ExpandingScrollView;
/* compiled from: PG */
/* renamed from: jer  reason: default package */
/* loaded from: classes7.dex */
public final class jer implements Parcelable.Creator<ExpandingScrollView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExpandingScrollView.SavedState createFromParcel(Parcel parcel) {
        return new ExpandingScrollView.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ExpandingScrollView.SavedState[] newArray(int i) {
        return new ExpandingScrollView.SavedState[i];
    }
}
