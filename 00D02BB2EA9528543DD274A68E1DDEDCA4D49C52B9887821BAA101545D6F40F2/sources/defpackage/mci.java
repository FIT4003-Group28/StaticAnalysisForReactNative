package defpackage;
/* compiled from: PG */
/* renamed from: mci  reason: default package */
/* loaded from: classes7.dex */
final class mci extends mco {
    private final dcdc<mck> a;
    private final boolean b;
    private final bsjm c;

    public mci(dcdc<mck> dcdcVar, boolean z, @dzsi bsjm bsjmVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            this.b = z;
            this.c = bsjmVar;
            return;
        }
        throw new NullPointerException("Null results");
    }

    @Override // defpackage.mco
    public final dcdc<mck> a() {
        return this.a;
    }

    @Override // defpackage.mco
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.mco
    @dzsi
    public final bsjm c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        bsjm bsjmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof mco) {
            mco mcoVar = (mco) obj;
            if (dchl.m(this.a, mcoVar.a()) && this.b == mcoVar.b() && ((bsjmVar = this.c) != null ? bsjmVar.equals(mcoVar.c()) : mcoVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        bsjm bsjmVar = this.c;
        return hashCode ^ (bsjmVar == null ? 0 : bsjmVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
        sb.append("ResultSet{results=");
        sb.append(valueOf);
        sb.append(", fromOffline=");
        sb.append(z);
        sb.append(", refinementsModel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
