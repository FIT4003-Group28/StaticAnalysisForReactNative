package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amsl  reason: default package */
/* loaded from: classes2.dex */
public final class amsl extends amtn {
    private final String a;
    private final akqi b;
    private final akra c;
    private final long d;
    private final long e;

    public amsl(String str, akqi akqiVar, akra akraVar, long j, long j2) {
        if (str != null) {
            this.a = str;
            this.b = akqiVar;
            this.c = akraVar;
            this.d = j;
            this.e = j2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // defpackage.amtn
    public final String a() {
        return this.a;
    }

    @Override // defpackage.amtn
    public final akqi b() {
        return this.b;
    }

    @Override // defpackage.amtn
    public final akra c() {
        return this.c;
    }

    @Override // defpackage.amtn
    public final long d() {
        return this.d;
    }

    @Override // defpackage.amtn
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amtn) {
            amtn amtnVar = (amtn) obj;
            if (this.a.equals(amtnVar.a()) && this.b.equals(amtnVar.b()) && this.c.equals(amtnVar.c()) && this.d == amtnVar.d() && this.e == amtnVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        long j = this.d;
        long j2 = this.e;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 98 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("Landmark{name=");
        sb.append(str);
        sb.append(", featureId=");
        sb.append(valueOf);
        sb.append(", point=");
        sb.append(valueOf2);
        sb.append(", pinStyle=");
        sb.append(j);
        sb.append(", textStyle=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
