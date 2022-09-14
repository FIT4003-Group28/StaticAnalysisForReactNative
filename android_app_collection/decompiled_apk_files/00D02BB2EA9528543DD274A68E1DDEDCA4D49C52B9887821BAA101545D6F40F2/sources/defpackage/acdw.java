package defpackage;
/* compiled from: PG */
/* renamed from: acdw  reason: default package */
/* loaded from: classes2.dex */
public final class acdw extends aced {
    private final akra a;
    private final akqs b;
    private final acej c;
    private final int d;

    public acdw(akra akraVar, akqs akqsVar, acej acejVar, int i) {
        this.a = akraVar;
        this.b = akqsVar;
        if (acejVar != null) {
            this.c = acejVar;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null photo");
    }

    @Override // defpackage.aced
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.aced
    public final akqs b() {
        return this.b;
    }

    @Override // defpackage.aced
    public final acej c() {
        return this.c;
    }

    @Override // defpackage.aced
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aced) {
            aced acedVar = (aced) obj;
            if (this.a.equals(acedVar.a()) && this.b.equals(acedVar.b()) && this.c.equals(acedVar.c()) && this.d == acedVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Cluster{centroid=");
        sb.append(valueOf);
        sb.append(", bounds=");
        sb.append(valueOf2);
        sb.append(", photo=");
        sb.append(valueOf3);
        sb.append(", size=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
