package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tuj  reason: default package */
/* loaded from: classes4.dex */
public final class tuj {
    public final tqv a;
    public final tqm b;

    public tuj(tqv tqvVar, tqm tqmVar) {
        if (tqvVar != null) {
            this.a = tqvVar;
            this.b = tqmVar;
            return;
        }
        throw new NullPointerException("Null groupKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tuj) {
            tuj tujVar = (tuj) obj;
            if (this.a.equals(tujVar.a)) {
                tqm tqmVar = this.b;
                tqm tqmVar2 = tujVar.b;
                if (tqmVar != null ? tqmVar.equals(tqmVar2) : tqmVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        tqm tqmVar = this.b;
        return hashCode ^ (tqmVar == null ? 0 : tqmVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43 + String.valueOf(valueOf2).length());
        sb.append("GroupKeyAndGroup{groupKey=");
        sb.append(valueOf);
        sb.append(", dataFileGroup=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public tuj() {
    }
}
