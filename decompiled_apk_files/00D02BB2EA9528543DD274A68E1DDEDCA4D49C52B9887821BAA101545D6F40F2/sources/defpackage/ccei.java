package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.ugc.intent.AutoValue_ReviewIntent_MinimalPlacemark;
/* compiled from: PG */
/* renamed from: ccei  reason: default package */
/* loaded from: classes4.dex */
public final class ccei implements Parcelable.Creator<AutoValue_ReviewIntent_MinimalPlacemark> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewIntent_MinimalPlacemark createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_ReviewIntent_MinimalPlacemark(readString, readString2, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ReviewIntent_MinimalPlacemark[] newArray(int i) {
        return new AutoValue_ReviewIntent_MinimalPlacemark[i];
    }
}
