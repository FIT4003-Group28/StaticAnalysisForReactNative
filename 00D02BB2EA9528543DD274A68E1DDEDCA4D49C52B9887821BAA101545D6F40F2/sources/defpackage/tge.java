package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: tge  reason: default package */
/* loaded from: classes7.dex */
public final class tge extends tgl {
    private final FetchState a;
    private final dbsg<amte> b;
    private final dcdc<amvh> c;

    public tge(FetchState fetchState, dbsg<amte> dbsgVar, dcdc<amvh> dcdcVar) {
        if (fetchState != null) {
            this.a = fetchState;
            this.b = dbsgVar;
            if (dcdcVar != null) {
                this.c = dcdcVar;
                return;
            }
            throw new NullPointerException("Null resolvedWaypoints");
        }
        throw new NullPointerException("Null fetchState");
    }

    @Override // defpackage.tgl
    public final FetchState a() {
        return this.a;
    }

    @Override // defpackage.tgl
    public final dbsg<amte> b() {
        return this.b;
    }

    @Override // defpackage.tgl
    public final dcdc<amvh> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgl) {
            tgl tglVar = (tgl) obj;
            if (this.a.equals(tglVar.a()) && this.b.equals(tglVar.b()) && dchl.m(this.c, tglVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 81 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MultiwaypointFetchResult{fetchState=");
        sb.append(valueOf);
        sb.append(", directionsStorageItem=");
        sb.append(valueOf2);
        sb.append(", resolvedWaypoints=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
