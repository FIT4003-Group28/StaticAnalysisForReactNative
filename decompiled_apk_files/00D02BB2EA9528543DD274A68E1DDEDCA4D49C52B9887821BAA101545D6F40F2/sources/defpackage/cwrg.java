package defpackage;
/* compiled from: PG */
/* renamed from: cwrg  reason: default package */
/* loaded from: classes5.dex */
final class cwrg extends cwts {
    private final cwwz a;
    private final dbsg<cxcq> b;
    private final dbsg<cxbj> c;
    private final dbsg<cxbi> d;

    public cwrg(cwwz cwwzVar, dbsg<cxcq> dbsgVar, dbsg<cxbj> dbsgVar2, dbsg<cxbi> dbsgVar3) {
        this.a = cwwzVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
    }

    @Override // defpackage.cwts
    public final cwwz a() {
        return this.a;
    }

    @Override // defpackage.cwts
    public final dbsg<cxcq> b() {
        return this.b;
    }

    @Override // defpackage.cwts
    public final dbsg<cxbj> c() {
        return this.c;
    }

    @Override // defpackage.cwts
    public final dbsg<cxbi> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwts) {
            cwts cwtsVar = (cwts) obj;
            if (this.a.equals(cwtsVar.a()) && this.b.equals(cwtsVar.b()) && this.c.equals(cwtsVar.c()) && this.d.equals(cwtsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 157 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("PrimesExperimentalConfigurations{profilingConfigurations=");
        sb.append(valueOf);
        sb.append(", strictModeConfigurations=");
        sb.append(valueOf2);
        sb.append(", startupMetricExtensionProvider=");
        sb.append(valueOf3);
        sb.append(", startupMetricCustomTimestampProvider=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
