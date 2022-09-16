package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: czuy  reason: default package */
/* loaded from: classes5.dex */
public final class czuy implements Parcelable.ClassLoaderCreator<AppBarLayout.BaseBehavior.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ AppBarLayout.BaseBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppBarLayout.BaseBehavior.SavedState[i];
    }
}
