package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
/* compiled from: PG */
/* renamed from: amo  reason: default package */
/* loaded from: classes2.dex */
public final class amo implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    public static final AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }
}
