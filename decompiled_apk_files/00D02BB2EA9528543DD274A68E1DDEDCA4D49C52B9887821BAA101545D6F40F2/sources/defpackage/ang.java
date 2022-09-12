package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
/* compiled from: PG */
/* renamed from: ang  reason: default package */
/* loaded from: classes2.dex */
public final class ang implements Parcelable.ClassLoaderCreator<DrawerLayout$SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrawerLayout$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ DrawerLayout$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DrawerLayout$SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DrawerLayout$SavedState[i];
    }
}
