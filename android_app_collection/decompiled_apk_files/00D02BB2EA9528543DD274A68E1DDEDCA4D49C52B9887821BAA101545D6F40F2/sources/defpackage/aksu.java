package defpackage;
/* compiled from: PG */
/* renamed from: aksu  reason: default package */
/* loaded from: classes.dex */
public final class aksu extends akvv {
    public final dcep<akvw> a;
    public final dcep<akvw> b;

    public aksu(dcep<akvw> dcepVar, dcep<akvw> dcepVar2) {
        if (dcepVar != null) {
            this.a = dcepVar;
            if (dcepVar2 != null) {
                this.b = dcepVar2;
                return;
            }
            throw new NullPointerException("Null leaving");
        }
        throw new NullPointerException("Null entering");
    }

    @Override // defpackage.akvv
    public final dcep<akvw> a() {
        return this.a;
    }

    @Override // defpackage.akvv
    public final dcep<akvw> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akvv) {
            akvv akvvVar = (akvv) obj;
            if (this.a.equals(akvvVar.a()) && this.b.equals(akvvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("LabelDelta{entering=");
        sb.append(valueOf);
        sb.append(", leaving=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
