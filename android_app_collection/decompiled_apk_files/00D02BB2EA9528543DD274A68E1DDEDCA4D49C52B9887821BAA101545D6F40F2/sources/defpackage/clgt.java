package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clgt  reason: default package */
/* loaded from: classes5.dex */
public final class clgt extends clgz {
    private final long a;
    private final clew b;
    private final cles c;

    public clgt(long j, clew clewVar, cles clesVar) {
        this.a = j;
        if (clewVar != null) {
            this.b = clewVar;
            if (clesVar != null) {
                this.c = clesVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // defpackage.clgz
    public final long a() {
        return this.a;
    }

    @Override // defpackage.clgz
    public final clew b() {
        return this.b;
    }

    @Override // defpackage.clgz
    public final cles c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clgz) {
            clgz clgzVar = (clgz) obj;
            if (this.a == clgzVar.a() && this.b.equals(clgzVar.b()) && this.c.equals(clgzVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66 + String.valueOf(valueOf2).length());
        sb.append("PersistedEvent{id=");
        sb.append(j);
        sb.append(", transportContext=");
        sb.append(valueOf);
        sb.append(", event=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
