package defpackage;
/* compiled from: PG */
/* renamed from: acdy  reason: default package */
/* loaded from: classes2.dex */
public final class acdy extends acef {
    private final dcdc<acef> a;
    private final dbsg<acej> b;
    private final dbsg<aceg> c;

    public acdy(dcdc<acef> dcdcVar, dbsg<acej> dbsgVar, dbsg<aceg> dbsgVar2) {
        this.a = dcdcVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.acef
    public final dcdc<acef> a() {
        return this.a;
    }

    @Override // defpackage.acef
    public final dbsg<acej> b() {
        return this.b;
    }

    @Override // defpackage.acef
    public final dbsg<aceg> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acef) {
            acef acefVar = (acef) obj;
            if (dchl.m(this.a, acefVar.a()) && this.b.equals(acefVar.b()) && this.c.equals(acefVar.c())) {
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
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Element{childElements=");
        sb.append(valueOf);
        sb.append(", photo=");
        sb.append(valueOf2);
        sb.append(", groupingMetadata=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
