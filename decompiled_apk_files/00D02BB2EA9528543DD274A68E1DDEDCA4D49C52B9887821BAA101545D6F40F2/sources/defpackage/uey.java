package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: uey  reason: default package */
/* loaded from: classes7.dex */
public final class uey extends ufb {
    private final dcdc<Integer> a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final dbsg<ufa> e;
    private final dbsg<amte> f;

    public uey(dcdc<Integer> dcdcVar, boolean z, boolean z2, boolean z3, dbsg<ufa> dbsgVar, dbsg<amte> dbsgVar2) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            this.c = z2;
            this.d = z3;
            if (dbsgVar != null) {
                this.e = dbsgVar;
                if (dbsgVar2 != null) {
                    this.f = dbsgVar2;
                    return;
                }
                throw new NullPointerException("Null storageItem");
            }
            throw new NullPointerException("Null error");
        }
        throw new NullPointerException("Null waypointIndices");
    }

    @Override // defpackage.ufb
    public final dcdc<Integer> a() {
        return this.a;
    }

    @Override // defpackage.ufb
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ufb
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.ufb
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.ufb
    public final dbsg<ufa> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ufb) {
            ufb ufbVar = (ufb) obj;
            if (dchl.m(this.a, ufbVar.a()) && this.b == ufbVar.b() && this.c == ufbVar.c() && this.d == ufbVar.d() && this.e.equals(ufbVar.e()) && this.f.equals(ufbVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ufb
    public final dbsg<amte> f() {
        return this.f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 144 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ItineraryStatus{waypointIndices=");
        sb.append(valueOf);
        sb.append(", canCommitItinerary=");
        sb.append(z);
        sb.append(", canAddAdditionalWaypoints=");
        sb.append(z2);
        sb.append(", isValidationInProgress=");
        sb.append(z3);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append(", storageItem=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
