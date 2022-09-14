package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.home.views.HomeBottomSheetView$SavedState;
/* compiled from: PG */
/* renamed from: aeft  reason: default package */
/* loaded from: classes2.dex */
public final class aeft implements Parcelable.Creator<HomeBottomSheetView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HomeBottomSheetView$SavedState createFromParcel(Parcel parcel) {
        return new HomeBottomSheetView$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HomeBottomSheetView$SavedState[] newArray(int i) {
        return new HomeBottomSheetView$SavedState[i];
    }
}
