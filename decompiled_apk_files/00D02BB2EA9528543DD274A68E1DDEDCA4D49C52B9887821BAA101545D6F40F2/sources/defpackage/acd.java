package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: acd  reason: default package */
/* loaded from: classes2.dex */
public final class acd implements Parcelable.ClassLoaderCreator<RecyclerView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }
}
