package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: botz  reason: default package */
/* loaded from: classes3.dex */
public final class botz extends bovp {
    public final String a;
    public final dnvs b;
    public final bbvh c;

    public botz(@dzsi String str, @dzsi dnvs dnvsVar, @dzsi bbvh bbvhVar) {
        this.a = str;
        this.b = dnvsVar;
        this.c = bbvhVar;
    }

    @Override // defpackage.bovp
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bovp
    @dzsi
    public final dnvs b() {
        return this.b;
    }

    @Override // defpackage.bovp
    @dzsi
    public final bbvh c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bovp) {
            bovp bovpVar = (bovp) obj;
            String str = this.a;
            if (str != null ? str.equals(bovpVar.a()) : bovpVar.a() == null) {
                dnvs dnvsVar = this.b;
                if (dnvsVar != null ? dnvsVar.equals(bovpVar.b()) : bovpVar.b() == null) {
                    bbvh bbvhVar = this.c;
                    if (bbvhVar != null ? bbvhVar.equals(bovpVar.c()) : bovpVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        dnvs dnvsVar = this.b;
        if (dnvsVar == null) {
            i = 0;
        } else {
            i = dnvsVar.bC;
            if (i == 0) {
                i = dsst.a.b(dnvsVar).c(dnvsVar);
                dnvsVar.bC = i;
            }
        }
        int i3 = (hashCode ^ i) * 1000003;
        bbvh bbvhVar = this.c;
        if (bbvhVar != null) {
            i2 = bbvhVar.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 62 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Params{proposalId=");
        sb.append(str);
        sb.append(", pendingEditChange=");
        sb.append(valueOf);
        sb.append(", uploadLocationOption=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
