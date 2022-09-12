package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;
/* compiled from: PG */
/* renamed from: axa  reason: default package */
/* loaded from: classes3.dex */
public final class axa implements Parcelable.Creator<SwipeRefreshLayout$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SwipeRefreshLayout$SavedState createFromParcel(Parcel parcel) {
        return new SwipeRefreshLayout$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SwipeRefreshLayout$SavedState[] newArray(int i) {
        return new SwipeRefreshLayout$SavedState[i];
    }
}
