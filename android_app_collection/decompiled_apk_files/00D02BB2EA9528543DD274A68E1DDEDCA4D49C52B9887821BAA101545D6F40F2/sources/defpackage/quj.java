package defpackage;

import com.google.android.apps.gmm.directions.commute.hub.api.CommuteHubDirective$RouteInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: quj  reason: default package */
/* loaded from: classes7.dex */
public final class quj extends qup {
    private final dndr a;
    private final domy b;
    private final dcdc<CommuteHubDirective$RouteInfo> c;
    private final quq d;
    private final long e;

    public quj(dndr dndrVar, domy domyVar, dcdc<CommuteHubDirective$RouteInfo> dcdcVar, @dzsi quq quqVar, long j) {
        if (dndrVar != null) {
            this.a = dndrVar;
            if (domyVar != null) {
                this.b = domyVar;
                if (dcdcVar != null) {
                    this.c = dcdcVar;
                    this.d = quqVar;
                    this.e = j;
                    return;
                }
                throw new NullPointerException("Null routeInfoList");
            }
            throw new NullPointerException("Null travelMode");
        }
        throw new NullPointerException("Null destinationType");
    }

    @Override // defpackage.qup
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.qup
    public final domy b() {
        return this.b;
    }

    @Override // defpackage.qup
    public final dcdc<CommuteHubDirective$RouteInfo> c() {
        return this.c;
    }

    @Override // defpackage.qup
    @dzsi
    public final quq d() {
        return this.d;
    }

    @Override // defpackage.qup
    public final long e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        long j = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("CommuteHubDirective{destinationType=");
        sb.append(valueOf);
        sb.append(", travelMode=");
        sb.append(valueOf2);
        sb.append(", routeInfoList=");
        sb.append(valueOf3);
        sb.append(", errorType=");
        sb.append(valueOf4);
        sb.append(", creationTimeMillisSinceBoot=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
