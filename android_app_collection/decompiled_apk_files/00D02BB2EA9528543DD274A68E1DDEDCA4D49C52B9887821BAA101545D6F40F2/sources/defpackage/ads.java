package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.SearchView$SavedState;
/* compiled from: PG */
/* renamed from: ads  reason: default package */
/* loaded from: classes2.dex */
public final class ads implements Parcelable.ClassLoaderCreator<SearchView$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ SearchView$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView$SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchView$SavedState[i];
    }
}
