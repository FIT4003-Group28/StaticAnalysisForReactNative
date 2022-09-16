package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.api.AutoValue_GmmNotice;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
/* compiled from: PG */
/* renamed from: qac  reason: default package */
/* loaded from: classes7.dex */
public final class qac implements Parcelable.Creator<AutoValue_GmmNotice> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_GmmNotice createFromParcel(Parcel parcel) {
        return new AutoValue_GmmNotice((ProtoParsers$ParcelableProto) parcel.readParcelable(GmmNotice.class.getClassLoader()), (ProtoParsers$ParcelableProto) parcel.readParcelable(GmmNotice.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_GmmNotice[] newArray(int i) {
        return new AutoValue_GmmNotice[i];
    }
}
