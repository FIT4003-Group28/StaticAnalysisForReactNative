package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.material.featurehighlight.IdViewFinder;
/* compiled from: PG */
/* renamed from: csmf  reason: default package */
/* loaded from: classes5.dex */
public final class csmf implements Parcelable.Creator<IdViewFinder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IdViewFinder createFromParcel(Parcel parcel) {
        return new IdViewFinder(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IdViewFinder[] newArray(int i) {
        return new IdViewFinder[i];
    }
}
