package defpackage;
/* compiled from: PG */
/* renamed from: yvu  reason: default package */
/* loaded from: classes7.dex */
public final class yvu extends ywo {
    private final ddho a;
    private final ddho b;
    private final ddho c;
    private final ddho d;
    private final ddho e;

    public yvu(ddho ddhoVar, ddho ddhoVar2, ddho ddhoVar3, ddho ddhoVar4, ddho ddhoVar5) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.c = ddhoVar3;
        this.d = ddhoVar4;
        this.e = ddhoVar5;
    }

    @Override // defpackage.ywo
    public final boolean a() {
        return true;
    }

    @Override // defpackage.ywo
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ywo
    public final int c() {
        return 0;
    }

    @Override // defpackage.ywo
    public final ddho d() {
        return this.a;
    }

    @Override // defpackage.ywo
    public final ddho e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ywo) {
            ywo ywoVar = (ywo) obj;
            if (ywoVar.a() && !ywoVar.b() && ywoVar.c() == 0 && this.a.equals(ywoVar.d()) && this.b.equals(ywoVar.e()) && this.c.equals(ywoVar.f()) && this.d.equals(ywoVar.g()) && this.e.equals(ywoVar.h()) && ywoVar.i() == null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ywo
    public final ddho f() {
        return this.c;
    }

    @Override // defpackage.ywo
    public final ddho g() {
        return this.d;
    }

    @Override // defpackage.ywo
    public final ddho h() {
        return this.e;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 204235641) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
    }

    @Override // defpackage.ywo
    @dzsi
    public final ddho i() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 292 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + "null".length());
        sb.append("TransitLineViewModelConfig{initialExpandedCard=");
        sb.append(true);
        sb.append(", canFetchMoreStations=");
        sb.append(false);
        sb.append(", numberOfDepartureGroupsForMoreDeparturesButton=");
        sb.append(0);
        sb.append(", changeDirectionButtonVeType=");
        sb.append(valueOf);
        sb.append(", departureLinkVeType=");
        sb.append(valueOf2);
        sb.append(", moreDeparturesButtonVeType=");
        sb.append(valueOf3);
        sb.append(", noticeLinkVeType=");
        sb.append(valueOf4);
        sb.append(", stationCalloutVeType=");
        sb.append(valueOf5);
        sb.append(", starredExpandedCardVeType=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
