package defpackage;
/* compiled from: PG */
/* renamed from: boxk  reason: default package */
/* loaded from: classes3.dex */
final class boxk extends boxy {
    private final dodb a;
    private final dcdc<dodb> b;
    private final int c;

    public boxk(dodb dodbVar, int i, dcdc<dodb> dcdcVar) {
        if (dodbVar != null) {
            this.a = dodbVar;
            this.c = i;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null rejectedParentRoute");
        }
        throw new NullPointerException("Null parentRoute");
    }

    @Override // defpackage.boxy
    public final dodb a() {
        return this.a;
    }

    @Override // defpackage.boxy
    public final dcdc<dodb> b() {
        return this.b;
    }

    @Override // defpackage.boxy
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof boxy) {
            boxy boxyVar = (boxy) obj;
            if (this.a.equals(boxyVar.a()) && this.c == boxyVar.c() && dchl.m(this.b, boxyVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dodb dodbVar = this.a;
        int i = dodbVar.bC;
        if (i == 0) {
            i = dsst.a.b(dodbVar).c(dodbVar);
            dodbVar.bC = i;
        }
        return this.b.hashCode() ^ ((((i ^ 1000003) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.c;
        String str = i != 1 ? i != 2 ? "CANCEL" : "NO" : "YES";
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + str.length() + String.valueOf(valueOf2).length());
        sb.append("RoutePickerDialogResult{parentRoute=");
        sb.append(valueOf);
        sb.append(", dialogExitState=");
        sb.append(str);
        sb.append(", rejectedParentRoute=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
