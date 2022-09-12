package com.google.android.apps.gmm.directions.commute.hub.api;
/* compiled from: PG */
/* loaded from: classes5.dex */
final class AutoValue_CommuteHubDirective_RouteInfo extends CommuteHubDirective$RouteInfo {
    private final int a;
    private final dspd b;

    public AutoValue_CommuteHubDirective_RouteInfo(int i, dspd dspdVar) {
        this.a = i;
        this.b = dspdVar;
    }

    @Override // com.google.android.apps.gmm.directions.commute.hub.api.CommuteHubDirective$RouteInfo
    public final dspd a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CommuteHubDirective$RouteInfo) {
            CommuteHubDirective$RouteInfo commuteHubDirective$RouteInfo = (CommuteHubDirective$RouteInfo) obj;
            if (this.a == commuteHubDirective$RouteInfo.describeContents() && this.b.equals(commuteHubDirective$RouteInfo.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("RouteInfo{describeContents=");
        sb.append(i);
        sb.append(", routeToken=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
