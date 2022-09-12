package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bptr  reason: default package */
/* loaded from: classes4.dex */
public final class bptr extends bptw {
    public final bokk a;
    public final dcdc<akqi> b;
    public final bokk c;
    public final dbsg<akqi> d;
    public final bptv e;

    public bptr(bokk bokkVar, dcdc<akqi> dcdcVar, bokk bokkVar2, dbsg<akqi> dbsgVar, bptv bptvVar) {
        this.a = bokkVar;
        this.b = dcdcVar;
        this.c = bokkVar2;
        this.d = dbsgVar;
        this.e = bptvVar;
    }

    @Override // defpackage.bptw
    public final bokk a() {
        return this.a;
    }

    @Override // defpackage.bptw
    public final dcdc<akqi> b() {
        return this.b;
    }

    @Override // defpackage.bptw
    public final bokk c() {
        return this.c;
    }

    @Override // defpackage.bptw
    public final dbsg<akqi> d() {
        return this.d;
    }

    @Override // defpackage.bptw
    public final bptv e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bptw) {
            bptw bptwVar = (bptw) obj;
            if (this.a.equals(bptwVar.a()) && dchl.m(this.b, bptwVar.b()) && this.c.equals(bptwVar.c()) && this.d.equals(bptwVar.d()) && this.e.equals(bptwVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bptw
    public final bptu f() {
        return new bptq(this);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 85 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("EditRoadNameModel{nameModel=");
        sb.append(valueOf);
        sb.append(", featureIds=");
        sb.append(valueOf2);
        sb.append(", noteModel=");
        sb.append(valueOf3);
        sb.append(", selectedParentRouteId=");
        sb.append(valueOf4);
        sb.append(", mode=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
