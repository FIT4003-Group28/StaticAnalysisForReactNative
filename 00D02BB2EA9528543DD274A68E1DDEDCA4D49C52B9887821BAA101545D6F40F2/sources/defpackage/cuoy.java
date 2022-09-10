package defpackage;
/* compiled from: PG */
/* renamed from: cuoy  reason: default package */
/* loaded from: classes5.dex */
final class cuoy extends cuqb {
    private final dcdc<cuqa> b;
    private final int c;
    private final dbsg<Integer> d;

    public cuoy(dcdc<cuqa> dcdcVar, int i, dbsg<Integer> dbsgVar) {
        this.b = dcdcVar;
        this.c = i;
        this.d = dbsgVar;
    }

    @Override // defpackage.cuqb
    public final dcdc<cuqa> a() {
        return this.b;
    }

    @Override // defpackage.cuqb
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cuqb
    public final dbsg<Integer> c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuqb) {
            cuqb cuqbVar = (cuqb) obj;
            if (dchl.m(this.b, cuqbVar.a()) && this.c == cuqbVar.b() && this.d.equals(cuqbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("RichCardButtons{buttons=");
        sb.append(valueOf);
        sb.append(", orientation=");
        sb.append(i);
        sb.append(", horizontalAlignment=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
