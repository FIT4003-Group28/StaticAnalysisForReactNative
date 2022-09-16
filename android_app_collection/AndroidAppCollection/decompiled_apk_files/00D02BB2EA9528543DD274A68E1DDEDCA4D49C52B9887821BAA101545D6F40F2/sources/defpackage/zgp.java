package defpackage;
/* compiled from: PG */
/* renamed from: zgp  reason: default package */
/* loaded from: classes7.dex */
final class zgp extends zqn {
    public final dqvj a;
    public final String b;
    public final cqtd c;

    public zgp(@dzsi dqvj dqvjVar, @dzsi String str, @dzsi cqtd cqtdVar) {
        this.a = dqvjVar;
        this.b = str;
        this.c = cqtdVar;
    }

    @Override // defpackage.zqn
    @dzsi
    public final dqvj a() {
        return this.a;
    }

    @Override // defpackage.zqn
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.zqn
    @dzsi
    public final cqtd c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zqn) {
            zqn zqnVar = (zqn) obj;
            dqvj dqvjVar = this.a;
            if (dqvjVar != null ? dqvjVar.equals(zqnVar.a()) : zqnVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(zqnVar.b()) : zqnVar.b() == null) {
                    cqtd cqtdVar = this.c;
                    if (cqtdVar != null ? cqtdVar.equals(zqnVar.c()) : zqnVar.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dqvj dqvjVar = this.a;
        int i = 0;
        int hashCode = ((dqvjVar == null ? 0 : dqvjVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        cqtd cqtdVar = this.c;
        if (cqtdVar != null) {
            i = cqtdVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("TravelModeRenderable{travelMode=");
        sb.append(valueOf);
        sb.append(", label=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
