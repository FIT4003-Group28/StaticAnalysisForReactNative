package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;
/* compiled from: PG */
/* renamed from: atr  reason: default package */
/* loaded from: classes2.dex */
public final class atr implements Parcelable.Creator<ListPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ListPreference.SavedState createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ListPreference.SavedState[] newArray(int i) {
        return new ListPreference.SavedState[i];
    }
}
