package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
/* compiled from: PG */
/* renamed from: aex  reason: default package */
/* loaded from: classes2.dex */
public final class aex implements Parcelable.ClassLoaderCreator<Toolbar.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }
}
