package defpackage;
/* compiled from: PG */
/* renamed from: rlz  reason: default package */
/* loaded from: classes7.dex */
final class rlz extends rnf {
    private final ror a;
    private final rnh b;

    public rlz(ror rorVar, rnh rnhVar) {
        if (rorVar != null) {
            this.a = rorVar;
            if (rnhVar != null) {
                this.b = rnhVar;
                return;
            }
            throw new NullPointerException("Null launchAction");
        }
        throw new NullPointerException("Null screen");
    }

    @Override // defpackage.rnf
    public final ror a() {
        return this.a;
    }

    @Override // defpackage.rnf
    public final rnh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rnf) {
            rnf rnfVar = (rnf) obj;
            if (this.a.equals(rnfVar.a()) && this.b.equals(rnfVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("Entry{screen=");
        sb.append(valueOf);
        sb.append(", launchAction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
