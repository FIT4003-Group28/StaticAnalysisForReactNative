package defpackage;
/* compiled from: PG */
/* renamed from: nqc  reason: default package */
/* loaded from: classes7.dex */
final class nqc extends nsd {
    public final cqrp a;
    public final cqrp b;
    public final cqrp c;
    public final cqrp d;

    public nqc(cqrp cqrpVar, cqrp cqrpVar2, cqrp cqrpVar3, cqrp cqrpVar4) {
        if (cqrpVar != null) {
            this.a = cqrpVar;
            if (cqrpVar2 != null) {
                this.b = cqrpVar2;
                if (cqrpVar3 != null) {
                    this.c = cqrpVar3;
                    if (cqrpVar4 != null) {
                        this.d = cqrpVar4;
                        return;
                    }
                    throw new NullPointerException("Null bottomLeftRadius");
                }
                throw new NullPointerException("Null bottomRightRadius");
            }
            throw new NullPointerException("Null topRightRadius");
        }
        throw new NullPointerException("Null topLeftRadius");
    }

    @Override // defpackage.nsd
    public final cqrp a() {
        return this.a;
    }

    @Override // defpackage.nsd
    public final cqrp b() {
        return this.b;
    }

    @Override // defpackage.nsd
    public final cqrp c() {
        return this.c;
    }

    @Override // defpackage.nsd
    public final cqrp d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsd) {
            nsd nsdVar = (nsd) obj;
            if (this.a.equals(nsdVar.a()) && this.b.equals(nsdVar.b()) && this.c.equals(nsdVar.c()) && this.d.equals(nsdVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.a ^ 1000003) * 1000003) ^ this.b.a) * 1000003) ^ this.c.a) * 1000003) ^ this.d.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 88 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ComponentCorners{topLeftRadius=");
        sb.append(valueOf);
        sb.append(", topRightRadius=");
        sb.append(valueOf2);
        sb.append(", bottomRightRadius=");
        sb.append(valueOf3);
        sb.append(", bottomLeftRadius=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
