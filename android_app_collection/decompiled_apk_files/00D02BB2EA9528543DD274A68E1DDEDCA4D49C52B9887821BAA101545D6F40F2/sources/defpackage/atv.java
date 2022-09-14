package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;
/* compiled from: PG */
/* renamed from: atv  reason: default package */
/* loaded from: classes2.dex */
public final class atv implements Parcelable.Creator<MultiSelectListPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MultiSelectListPreference.SavedState createFromParcel(Parcel parcel) {
        return new MultiSelectListPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MultiSelectListPreference.SavedState[] newArray(int i) {
        return new MultiSelectListPreference.SavedState[i];
    }
}
