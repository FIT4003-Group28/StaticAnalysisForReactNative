package defpackage;
/* compiled from: PG */
/* renamed from: cxhk  reason: default package */
/* loaded from: classes5.dex */
final class cxhk extends cxhl {
    private final dslt a;
    private final dsld b;

    public cxhk(dslt dsltVar, dsld dsldVar) {
        if (dsltVar != null) {
            this.a = dsltVar;
            if (dsldVar != null) {
                this.b = dsldVar;
                return;
            }
            throw new NullPointerException("Null origin");
        }
        throw new NullPointerException("Null response");
    }

    @Override // defpackage.cxhl
    public final dslt a() {
        return this.a;
    }

    @Override // defpackage.cxhl
    public final dsld b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxhl) {
            cxhl cxhlVar = (cxhl) obj;
            if (this.a.equals(cxhlVar.a()) && this.b.equals(cxhlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dslt dsltVar = this.a;
        int i = dsltVar.bC;
        if (i == 0) {
            i = dsst.a.b(dsltVar).c(dsltVar);
            dsltVar.bC = i;
        }
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65 + String.valueOf(valueOf2).length());
        sb.append("GetActivityControlsSettingsResponseWithOrigin{response=");
        sb.append(valueOf);
        sb.append(", origin=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
