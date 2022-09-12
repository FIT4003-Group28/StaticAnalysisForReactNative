package defpackage;
/* compiled from: PG */
/* renamed from: cwpf  reason: default package */
/* loaded from: classes5.dex */
public final class cwpf extends cwqh {
    private final cwqk a;
    private final cwqj b;
    private final cwla c;
    private final boolean d;

    public cwpf(cwqk cwqkVar, cwqj cwqjVar, cwla cwlaVar, boolean z) {
        this.a = cwqkVar;
        this.b = cwqjVar;
        this.c = cwlaVar;
        this.d = z;
    }

    @Override // defpackage.cwqh
    public final cwqk a() {
        return this.a;
    }

    @Override // defpackage.cwqh
    public final cwqj b() {
        return this.b;
    }

    @Override // defpackage.cwqh
    public final cwla c() {
        return this.c;
    }

    @Override // defpackage.cwqh
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwqh) {
            cwqh cwqhVar = (cwqh) obj;
            if (this.a.equals(cwqhVar.a()) && this.b.equals(cwqhVar.b()) && this.c.equals(cwqhVar.c()) && this.d == cwqhVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 96 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Configuration{onViewCreatedCallback=");
        sb.append(valueOf);
        sb.append(", onDismissCallback=");
        sb.append(valueOf2);
        sb.append(", visualElements=");
        sb.append(valueOf3);
        sb.append(", isExperimental=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
