package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aofp  reason: default package */
/* loaded from: classes2.dex */
public final class aofp extends aogf {
    private final eaph a;
    private final eaph b;

    public aofp(eaph eaphVar, eaph eaphVar2) {
        if (eaphVar != null) {
            this.a = eaphVar;
            if (eaphVar2 != null) {
                this.b = eaphVar2;
                return;
            }
            throw new NullPointerException("Null end");
        }
        throw new NullPointerException("Null start");
    }

    @Override // defpackage.aogf
    public final eaph a() {
        return this.a;
    }

    @Override // defpackage.aogf
    public final eaph b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogf) {
            aogf aogfVar = (aogf) obj;
            if (this.a.equals(aogfVar.a()) && this.b.equals(aogfVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("LocalDuration{start=");
        sb.append(valueOf);
        sb.append(", end=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
