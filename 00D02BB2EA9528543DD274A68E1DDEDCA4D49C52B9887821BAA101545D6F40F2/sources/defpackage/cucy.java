package defpackage;
/* compiled from: PG */
/* renamed from: cucy  reason: default package */
/* loaded from: classes5.dex */
public final class cucy extends cufh {
    private final cugu a;
    private final dcdc<cufb> b;
    private final dbsg<Boolean> c;

    public cucy(cugu cuguVar, dcdc<cufb> dcdcVar, dbsg<Boolean> dbsgVar) {
        this.a = cuguVar;
        this.b = dcdcVar;
        this.c = dbsgVar;
    }

    @Override // defpackage.cufh
    public final cugu a() {
        return this.a;
    }

    @Override // defpackage.cufh
    public final dcdc<cufb> b() {
        return this.b;
    }

    @Override // defpackage.cufh
    public final dbsg<Boolean> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cufh) {
            cufh cufhVar = (cufh) obj;
            if (this.a.equals(cufhVar.a()) && dchl.m(this.b, cufhVar.b()) && this.c.equals(cufhVar.c())) {
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
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CloudMessage{message=");
        sb.append(valueOf);
        sb.append(", annotations=");
        sb.append(valueOf2);
        sb.append(", needsDeliveryReceipt=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
