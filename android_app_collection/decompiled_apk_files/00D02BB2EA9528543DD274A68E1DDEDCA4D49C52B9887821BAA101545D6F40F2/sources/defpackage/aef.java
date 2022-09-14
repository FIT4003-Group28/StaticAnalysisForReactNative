package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.StaggeredGridLayoutManager$SavedState;
/* compiled from: PG */
/* renamed from: aef  reason: default package */
/* loaded from: classes2.dex */
public final class aef implements Parcelable.Creator<StaggeredGridLayoutManager$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager$SavedState createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager$SavedState[] newArray(int i) {
        return new StaggeredGridLayoutManager$SavedState[i];
    }
}
