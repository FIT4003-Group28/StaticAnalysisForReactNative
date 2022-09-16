package defpackage;
/* compiled from: PG */
/* renamed from: crik  reason: default package */
/* loaded from: classes5.dex */
public final class crik extends crij {
    private final akra a;
    private final auei b;
    private final Integer c;

    public crik(akra akraVar, auei aueiVar, @dzsi Integer num) {
        this.a = akraVar;
        this.b = aueiVar;
        this.c = num;
    }

    @Override // defpackage.crij
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.crij
    public final auei b() {
        return this.b;
    }

    @Override // defpackage.crij
    @dzsi
    public final Integer c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof crij) {
            crij crijVar = (crij) obj;
            if (this.a.equals(crijVar.a()) && this.b.equals(crijVar.b()) && ((num = this.c) != null ? num.equals(crijVar.c()) : crijVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Integer num = this.c;
        return hashCode ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AddIncidentReportCalloutEvent{location=");
        sb.append(valueOf);
        sb.append(", iconUrl=");
        sb.append(valueOf2);
        sb.append(", titleResourceId=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
