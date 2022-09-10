package defpackage;
/* compiled from: PG */
/* renamed from: ayep  reason: default package */
/* loaded from: classes3.dex */
final class ayep extends ayfb {
    private final bnju a;
    private final diwb b;
    private final dqhy c;

    public ayep(@dzsi bnju bnjuVar, @dzsi diwb diwbVar, dqhy dqhyVar) {
        this.a = bnjuVar;
        this.b = diwbVar;
        if (dqhyVar != null) {
            this.c = dqhyVar;
            return;
        }
        throw new NullPointerException("Null statusCode");
    }

    @Override // defpackage.ayfb
    @dzsi
    public final bnju a() {
        return this.a;
    }

    @Override // defpackage.ayfb
    @dzsi
    public final diwb b() {
        return this.b;
    }

    @Override // defpackage.ayfb
    public final dqhy c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayfb) {
            ayfb ayfbVar = (ayfb) obj;
            bnju bnjuVar = this.a;
            if (bnjuVar != null ? bnjuVar.equals(ayfbVar.a()) : ayfbVar.a() == null) {
                diwb diwbVar = this.b;
                if (diwbVar != null ? diwbVar.equals(ayfbVar.b()) : ayfbVar.b() == null) {
                    if (this.c.equals(ayfbVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        bnju bnjuVar = this.a;
        int i = 0;
        int hashCode = ((bnjuVar == null ? 0 : bnjuVar.hashCode()) ^ 1000003) * 1000003;
        diwb diwbVar = this.b;
        if (diwbVar != null && (i = diwbVar.bC) == 0) {
            i = dsst.a.b(diwbVar).c(diwbVar);
            diwbVar.bC = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 46 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ItemMetadata{place=");
        sb.append(valueOf);
        sb.append(", experience=");
        sb.append(valueOf2);
        sb.append(", statusCode=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
