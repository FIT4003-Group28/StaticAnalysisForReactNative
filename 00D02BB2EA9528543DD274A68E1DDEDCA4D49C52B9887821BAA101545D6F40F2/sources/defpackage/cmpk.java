package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager;
/* compiled from: PG */
/* renamed from: cmpk  reason: default package */
/* loaded from: classes5.dex */
public final class cmpk implements Parcelable.Creator<FlexboxLayoutManager.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new FlexboxLayoutManager.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FlexboxLayoutManager.SavedState[] newArray(int i) {
        return new FlexboxLayoutManager.SavedState[i];
    }
}
