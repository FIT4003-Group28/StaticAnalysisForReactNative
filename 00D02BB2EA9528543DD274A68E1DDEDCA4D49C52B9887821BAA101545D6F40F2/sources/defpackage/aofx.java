package defpackage;
/* compiled from: PG */
/* renamed from: aofx  reason: default package */
/* loaded from: classes2.dex */
public final class aofx extends aogq {
    private final aogp a;
    private final aogp b;

    public aofx(aogp aogpVar, aogp aogpVar2) {
        if (aogpVar != null) {
            this.a = aogpVar;
            if (aogpVar2 != null) {
                this.b = aogpVar2;
                return;
            }
            throw new NullPointerException("Null end");
        }
        throw new NullPointerException("Null start");
    }

    @Override // defpackage.aogq
    public final aogp a() {
        return this.a;
    }

    @Override // defpackage.aogq
    public final aogp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogq) {
            aogq aogqVar = (aogq) obj;
            if (this.a.equals(aogqVar.a()) && this.b.equals(aogqVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34 + String.valueOf(valueOf2).length());
        sb.append("PartialLocalDuration{start=");
        sb.append(valueOf);
        sb.append(", end=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
