package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;
/* compiled from: PG */
/* renamed from: atn  reason: default package */
/* loaded from: classes2.dex */
public final class atn implements Parcelable.Creator<EditTextPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EditTextPreference.SavedState createFromParcel(Parcel parcel) {
        return new EditTextPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EditTextPreference.SavedState[] newArray(int i) {
        return new EditTextPreference.SavedState[i];
    }
}
