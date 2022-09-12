package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.NestedScrollView;
/* compiled from: PG */
/* renamed from: qb  reason: default package */
/* loaded from: classes7.dex */
public final class qb implements Parcelable.Creator<NestedScrollView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NestedScrollView.SavedState createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NestedScrollView.SavedState[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }
}
