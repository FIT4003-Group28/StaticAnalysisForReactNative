package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;
/* compiled from: PG */
/* renamed from: daag  reason: default package */
/* loaded from: classes5.dex */
public final class daag implements Parcelable.ClassLoaderCreator<CheckableImageButton.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ CheckableImageButton.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CheckableImageButton.SavedState[i];
    }
}
