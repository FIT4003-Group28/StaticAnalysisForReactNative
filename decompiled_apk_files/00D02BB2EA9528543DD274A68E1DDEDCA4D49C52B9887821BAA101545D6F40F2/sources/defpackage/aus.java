package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;
/* compiled from: PG */
/* renamed from: aus  reason: default package */
/* loaded from: classes2.dex */
public final class aus implements Parcelable.Creator<PreferenceGroup.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PreferenceGroup.SavedState createFromParcel(Parcel parcel) {
        return new PreferenceGroup.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PreferenceGroup.SavedState[] newArray(int i) {
        return new PreferenceGroup.SavedState[i];
    }
}
