package defpackage;
/* compiled from: PG */
/* renamed from: aeup  reason: default package */
/* loaded from: classes2.dex */
final class aeup extends aexv {
    public final ilo a;
    private final aeuk b;

    public aeup(@dzsi aeuk aeukVar, @dzsi ilo iloVar) {
        this.b = aeukVar;
        this.a = iloVar;
    }

    @Override // defpackage.aexv
    @dzsi
    public final aeuk a() {
        return this.b;
    }

    @Override // defpackage.aexv
    @dzsi
    public final ilo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aexv) {
            aexv aexvVar = (aexv) obj;
            aeuk aeukVar = this.b;
            if (aeukVar != null ? aeukVar.equals(aexvVar.a()) : aexvVar.a() == null) {
                ilo iloVar = this.a;
                if (iloVar != null ? iloVar.equals(aexvVar.b()) : aexvVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aeuk aeukVar = this.b;
        int i = 0;
        int hashCode = ((aeukVar == null ? 0 : aeukVar.hashCode()) ^ 1000003) * 1000003;
        ilo iloVar = this.a;
        if (iloVar != null) {
            i = iloVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("UserLocation{revealedLocation=");
        sb.append(valueOf);
        sb.append(", confirmedPlace=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
