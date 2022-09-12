package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;
/* compiled from: PG */
/* renamed from: avi  reason: default package */
/* loaded from: classes2.dex */
public final class avi implements Parcelable.Creator<SeekBarPreference.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SeekBarPreference.SavedState createFromParcel(Parcel parcel) {
        return new SeekBarPreference.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SeekBarPreference.SavedState[] newArray(int i) {
        return new SeekBarPreference.SavedState[i];
    }
}
