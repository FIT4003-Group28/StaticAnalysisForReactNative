package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.commute.hub.api.CommuteHubDirective$RouteInfo;
/* compiled from: PG */
/* renamed from: quo  reason: default package */
/* loaded from: classes7.dex */
public final class quo implements Parcelable.Creator<CommuteHubDirective$RouteInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CommuteHubDirective$RouteInfo createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return CommuteHubDirective$RouteInfo.b(dspd.x(bArr));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CommuteHubDirective$RouteInfo[] newArray(int i) {
        return new CommuteHubDirective$RouteInfo[i];
    }
}
