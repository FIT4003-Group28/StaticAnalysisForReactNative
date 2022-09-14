package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.streetview.model.PanoramaLevel;
/* compiled from: PG */
/* renamed from: bwzm  reason: default package */
/* loaded from: classes4.dex */
public final class bwzm implements Parcelable.Creator<PanoramaLevel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PanoramaLevel createFromParcel(Parcel parcel) {
        return new PanoramaLevel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PanoramaLevel[] newArray(int i) {
        return new PanoramaLevel[i];
    }
}
