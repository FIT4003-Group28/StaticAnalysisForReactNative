package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
/* compiled from: PG */
/* renamed from: bwzq  reason: default package */
/* loaded from: classes4.dex */
public final class bwzq implements Parcelable.Creator<UserOrientation> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserOrientation createFromParcel(Parcel parcel) {
        return new UserOrientation(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserOrientation[] newArray(int i) {
        return new UserOrientation[i];
    }
}
