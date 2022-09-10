package defpackage;
/* compiled from: PG */
/* renamed from: cliw  reason: default package */
/* loaded from: classes5.dex */
final class cliw extends clkq {
    private final cljw a;
    private final deho<?> b;
    private final defw<cljx> c;

    public cliw(cljw cljwVar, deho<?> dehoVar, defw<cljx> defwVar) {
        this.a = cljwVar;
        this.b = dehoVar;
        this.c = defwVar;
    }

    @Override // defpackage.clkq
    public final cljw a() {
        return this.a;
    }

    @Override // defpackage.clkq
    public final deho<?> b() {
        return this.b;
    }

    @Override // defpackage.clkq
    public final defw<cljx> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clkq) {
            clkq clkqVar = (clkq) obj;
            if (this.a.equals(clkqVar.a()) && this.b.equals(clkqVar.b()) && this.c.equals(clkqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 46 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("QueuedDownload{request=");
        sb.append(valueOf);
        sb.append(", task=");
        sb.append(valueOf2);
        sb.append(", resultFuture=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
