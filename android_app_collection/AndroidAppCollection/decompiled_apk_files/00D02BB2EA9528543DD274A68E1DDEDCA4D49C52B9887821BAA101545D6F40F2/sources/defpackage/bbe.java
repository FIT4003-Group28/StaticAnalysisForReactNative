package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bbe  reason: default package */
/* loaded from: classes3.dex */
public final class bbe implements Parcelable.ClassLoaderCreator<ViewPager.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ViewPager.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ViewPager.SavedState[i];
    }
}
