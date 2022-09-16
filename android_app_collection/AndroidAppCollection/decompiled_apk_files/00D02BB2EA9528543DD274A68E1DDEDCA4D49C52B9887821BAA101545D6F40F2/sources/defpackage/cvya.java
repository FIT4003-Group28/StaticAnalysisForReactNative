package defpackage;
/* compiled from: PG */
/* renamed from: cvya  reason: default package */
/* loaded from: classes5.dex */
public final class cvya<AccountT> extends cvxy<AccountT> {
    public final cvuu<AccountT> a;
    public final Class<AccountT> b;
    public final boolean c;
    public final cwjw<AccountT> d;
    public final cwfn e;
    public final cvzg f;

    public cvya(cvuu cvuuVar, cwfn cwfnVar, cvzg cvzgVar, Class cls, boolean z, cwjw cwjwVar) {
        this.a = cvuuVar;
        this.e = cwfnVar;
        this.f = cvzgVar;
        this.b = cls;
        this.c = z;
        this.d = cwjwVar;
    }

    @Override // defpackage.cvxy
    public final cvuu<AccountT> a() {
        return this.a;
    }

    @Override // defpackage.cvxy
    public final Class<AccountT> b() {
        return this.b;
    }

    @Override // defpackage.cvxy
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.cvxy
    public final cwjw<AccountT> d() {
        return this.d;
    }

    @Override // defpackage.cvxy
    public final cwfn e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvxy) {
            cvxy cvxyVar = (cvxy) obj;
            if (this.a.equals(cvxyVar.a()) && this.e.equals(cvxyVar.e()) && this.f.equals(cvxyVar.f()) && this.b.equals(cvxyVar.b()) && this.c == cvxyVar.c() && this.d.equals(cvxyVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cvxy
    public final cvzg f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 132 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AccountManagementSpec{avatarImageLoader=");
        sb.append(valueOf);
        sb.append(", accountConverter=");
        sb.append(valueOf2);
        sb.append(", accountsModel=");
        sb.append(valueOf3);
        sb.append(", accountClass=");
        sb.append(valueOf4);
        sb.append(", allowRings=");
        sb.append(z);
        sb.append(", oneGoogleEventLogger=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
