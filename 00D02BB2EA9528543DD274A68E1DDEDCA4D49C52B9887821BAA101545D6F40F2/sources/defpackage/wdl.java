package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: wdl  reason: default package */
/* loaded from: classes7.dex */
final class wdl extends wdp {
    private final amvh a;
    private final dcdc<SavedTrip> b;

    public wdl(amvh amvhVar, dcdc<SavedTrip> dcdcVar) {
        this.a = amvhVar;
        this.b = dcdcVar;
    }

    @Override // defpackage.wdp
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.wdp
    public final dcdc<SavedTrip> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdp) {
            wdp wdpVar = (wdp) obj;
            if (this.a.equals(wdpVar.a()) && dchl.m(this.b, wdpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("SavedDestination{destination=");
        sb.append(valueOf);
        sb.append(", trips=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
