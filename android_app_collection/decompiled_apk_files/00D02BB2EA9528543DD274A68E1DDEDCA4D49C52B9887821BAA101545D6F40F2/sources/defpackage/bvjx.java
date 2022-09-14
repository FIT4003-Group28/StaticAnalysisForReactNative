package defpackage;
/* compiled from: PG */
/* renamed from: bvjx  reason: default package */
/* loaded from: classes4.dex */
public final class bvjx extends bvjz {
    public final durz a;
    private final afid b;

    public bvjx(@dzsi afid afidVar, @dzsi durz durzVar) {
        this.b = afidVar;
        this.a = durzVar;
    }

    @Override // defpackage.bvjz
    @dzsi
    public final afid a() {
        return this.b;
    }

    @Override // defpackage.bvjz
    @dzsi
    public final durz b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvjz) {
            bvjz bvjzVar = (bvjz) obj;
            afid afidVar = this.b;
            if (afidVar != null ? afidVar.equals(bvjzVar.a()) : bvjzVar.a() == null) {
                durz durzVar = this.a;
                if (durzVar != null ? durzVar.equals(bvjzVar.b()) : bvjzVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        afid afidVar = this.b;
        int i = 0;
        int hashCode = ((afidVar == null ? 0 : afidVar.hashCode()) ^ 1000003) * 1000003;
        durz durzVar = this.a;
        if (durzVar != null) {
            i = durzVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("IntentStartupType{intentType=");
        sb.append(valueOf);
        sb.append(", externalInvocationType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
