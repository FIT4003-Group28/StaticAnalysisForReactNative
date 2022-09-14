package defpackage;
/* compiled from: PG */
/* renamed from: ckso  reason: default package */
/* loaded from: classes4.dex */
public final class ckso extends ckss {
    private final cksr a;
    private final cksr b;

    public ckso(@dzsi cksr cksrVar, @dzsi cksr cksrVar2) {
        this.a = cksrVar;
        this.b = cksrVar2;
    }

    @Override // defpackage.ckss
    @dzsi
    public final cksr a() {
        return this.a;
    }

    @Override // defpackage.ckss
    @dzsi
    public final cksr b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckss) {
            ckss ckssVar = (ckss) obj;
            cksr cksrVar = this.a;
            if (cksrVar != null ? cksrVar.equals(ckssVar.a()) : ckssVar.a() == null) {
                cksr cksrVar2 = this.b;
                if (cksrVar2 != null ? cksrVar2.equals(ckssVar.b()) : ckssVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cksr cksrVar = this.a;
        int i = 0;
        int hashCode = ((cksrVar == null ? 0 : cksrVar.hashCode()) ^ 1000003) * 1000003;
        cksr cksrVar2 = this.b;
        if (cksrVar2 != null) {
            i = cksrVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("TtsProviders{localProvider=");
        sb.append(valueOf);
        sb.append(", networkProvider=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
