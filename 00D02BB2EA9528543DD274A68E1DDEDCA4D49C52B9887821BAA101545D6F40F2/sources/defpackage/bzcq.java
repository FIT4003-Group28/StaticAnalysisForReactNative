package defpackage;
/* compiled from: PG */
/* renamed from: bzcq  reason: default package */
/* loaded from: classes4.dex */
final class bzcq extends bzcx {
    private final bzdg b;

    public bzcq(bzdg bzdgVar) {
        if (bzdgVar != null) {
            this.b = bzdgVar;
            return;
        }
        throw new NullPointerException("Null stage");
    }

    @Override // defpackage.bzdh
    public final bzdg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzcx) {
            bzcx bzcxVar = (bzcx) obj;
            if (this.b.equals(bzcxVar.b()) && !bzcxVar.o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    @Override // defpackage.bzdh
    public final boolean o() {
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("InitialState{stage=");
        sb.append(valueOf);
        sb.append(", toFinalDestination=");
        sb.append(false);
        sb.append("}");
        return sb.toString();
    }
}
