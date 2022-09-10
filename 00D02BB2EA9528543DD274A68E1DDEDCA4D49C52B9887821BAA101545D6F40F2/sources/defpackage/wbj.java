package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.routepreview.routefetching.RoutePreviewLauncherParameters;
/* compiled from: PG */
/* renamed from: wbj  reason: default package */
/* loaded from: classes7.dex */
public final class wbj implements Parcelable.Creator<RoutePreviewLauncherParameters> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RoutePreviewLauncherParameters createFromParcel(Parcel parcel) {
        return new RoutePreviewLauncherParameters(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RoutePreviewLauncherParameters[] newArray(int i) {
        return new RoutePreviewLauncherParameters[i];
    }
}
