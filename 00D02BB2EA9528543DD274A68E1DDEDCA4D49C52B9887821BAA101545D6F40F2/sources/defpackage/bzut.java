package defpackage;
/* compiled from: PG */
/* renamed from: bzut  reason: default package */
/* loaded from: classes4.dex */
final class bzut extends bzvx {
    private final bqkx a;
    private final bqkz b;
    private final String c;
    private final String d;
    private final dbsg<Runnable> e;
    private final String f;
    private final dbsg<Runnable> g;

    public bzut(bqkx bqkxVar, bqkz bqkzVar, String str, String str2, dbsg<Runnable> dbsgVar, String str3, dbsg<Runnable> dbsgVar2) {
        this.a = bqkxVar;
        this.b = bqkzVar;
        this.c = str;
        this.d = str2;
        this.e = dbsgVar;
        this.f = str3;
        this.g = dbsgVar2;
    }

    @Override // defpackage.bzvx
    public final bqkx a() {
        return this.a;
    }

    @Override // defpackage.bzvx
    public final bqkz b() {
        return this.b;
    }

    @Override // defpackage.bzvx
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bzvx
    public final String d() {
        return this.d;
    }

    @Override // defpackage.bzvx
    public final dbsg<Runnable> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzvx) {
            bzvx bzvxVar = (bzvx) obj;
            if (this.a.equals(bzvxVar.a()) && this.b.equals(bzvxVar.b()) && this.c.equals(bzvxVar.c()) && this.d.equals(bzvxVar.d()) && this.e.equals(bzvxVar.e()) && this.f.equals(bzvxVar.f()) && this.g.equals(bzvxVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzvx
    public final String f() {
        return this.f;
    }

    @Override // defpackage.bzvx
    public final dbsg<Runnable> g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        String str3 = this.f;
        String valueOf4 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + length5 + String.valueOf(str3).length() + String.valueOf(valueOf4).length());
        sb.append("SubmitReviewParams{review=");
        sb.append(valueOf);
        sb.append(", submitOptions=");
        sb.append(valueOf2);
        sb.append(", sendingMessage=");
        sb.append(str);
        sb.append(", successMessage=");
        sb.append(str2);
        sb.append(", successRunnable=");
        sb.append(valueOf3);
        sb.append(", failureMessage=");
        sb.append(str3);
        sb.append(", failureRunnable=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
