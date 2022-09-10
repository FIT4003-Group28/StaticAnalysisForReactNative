package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousDataLayer;
/* compiled from: PG */
/* renamed from: cxrw  reason: default package */
/* loaded from: classes5.dex */
public final class cxrw implements Parcelable.Creator<PopulousDataLayer> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousDataLayer createFromParcel(Parcel parcel) {
        return new PopulousDataLayer(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PopulousDataLayer[] newArray(int i) {
        return new PopulousDataLayer[i];
    }
}
