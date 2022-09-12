package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: czwi  reason: default package */
/* loaded from: classes5.dex */
public final class czwi implements Parcelable.ClassLoaderCreator<MaterialButton.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MaterialButton.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ MaterialButton.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new MaterialButton.SavedState(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MaterialButton.SavedState[i];
    }
}
