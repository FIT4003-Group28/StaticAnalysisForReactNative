package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: trp  reason: default package */
/* loaded from: classes7.dex */
class trp extends trv {
    public final dbsg<tmd> a;
    public final dbsg<FetchState> b;
    private final btlu c;
    private final boolean d;

    public trp(btlu btluVar, dbsg<tmd> dbsgVar, dbsg<FetchState> dbsgVar2, boolean z) {
        if (btluVar != null) {
            this.c = btluVar;
            this.a = dbsgVar;
            this.b = dbsgVar2;
            this.d = z;
            return;
        }
        throw new NullPointerException("Null account");
    }

    @Override // defpackage.trv
    public final btlu a() {
        return this.c;
    }

    @Override // defpackage.trv
    public final dbsg<tmd> b() {
        return this.a;
    }

    @Override // defpackage.trv
    public final dbsg<FetchState> c() {
        return this.b;
    }

    @Override // defpackage.trv
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trv) {
            trv trvVar = (trv) obj;
            if (this.c.equals(trvVar.a()) && this.a.equals(trvVar.b()) && this.b.equals(trvVar.c()) && this.d == trvVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ResultListState{account=");
        sb.append(valueOf);
        sb.append(", storedDirections=");
        sb.append(valueOf2);
        sb.append(", fetchState=");
        sb.append(valueOf3);
        sb.append(", isSearchAlongTheRouteEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
