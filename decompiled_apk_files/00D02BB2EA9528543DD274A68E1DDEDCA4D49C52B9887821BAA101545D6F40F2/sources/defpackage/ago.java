package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
/* compiled from: PG */
/* renamed from: ago  reason: default package */
/* loaded from: classes2.dex */
public final class ago implements Parcelable.Creator<ActivityResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityResult createFromParcel(Parcel parcel) {
        return new ActivityResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActivityResult[] newArray(int i) {
        return new ActivityResult[i];
    }
}
