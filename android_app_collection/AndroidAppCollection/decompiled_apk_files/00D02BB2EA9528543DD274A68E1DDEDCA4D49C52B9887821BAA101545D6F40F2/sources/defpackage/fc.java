package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
/* compiled from: PG */
/* renamed from: fc  reason: default package */
/* loaded from: classes6.dex */
public final class fc implements Parcelable.ClassLoaderCreator<Fragment$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Fragment$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Fragment$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment$SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Fragment$SavedState[i];
    }
}
