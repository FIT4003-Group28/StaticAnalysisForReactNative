package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: ajn  reason: default package */
/* loaded from: classes2.dex */
public final class ajn implements Parcelable.ClassLoaderCreator<CoordinatorLayout.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ CoordinatorLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CoordinatorLayout.SavedState[i];
    }
}
