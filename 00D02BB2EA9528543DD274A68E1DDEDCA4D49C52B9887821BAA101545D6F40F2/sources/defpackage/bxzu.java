package defpackage;
/* compiled from: PG */
/* renamed from: bxzu  reason: default package */
/* loaded from: classes4.dex */
final class bxzu extends bxzt {
    private final String a;
    private final bxzs b;
    private final String c;
    private final String d;
    private final douj e;

    public bxzu(String str, bxzs bxzsVar, String str2, String str3, douj doujVar) {
        if (str != null) {
            this.a = str;
            if (bxzsVar != null) {
                this.b = bxzsVar;
                if (str2 != null) {
                    this.c = str2;
                    if (str3 != null) {
                        this.d = str3;
                        if (doujVar != null) {
                            this.e = doujVar;
                            return;
                        }
                        throw new NullPointerException("Null icon");
                    }
                    throw new NullPointerException("Null termsAndPolicyUrl");
                }
                throw new NullPointerException("Null name");
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null token");
    }

    @Override // defpackage.bxzt
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bxzt
    public final bxzs b() {
        return this.b;
    }

    @Override // defpackage.bxzt
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bxzt
    public final String d() {
        return this.d;
    }

    @Override // defpackage.bxzt
    public final douj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxzt) {
            bxzt bxztVar = (bxzt) obj;
            if (this.a.equals(bxztVar.a()) && this.b.equals(bxztVar.b()) && this.c.equals(bxztVar.c()) && this.d.equals(bxztVar.d()) && this.e.equals(bxztVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        douj doujVar = this.e;
        int i = doujVar.bC;
        if (i == 0) {
            i = dsst.a.b(doujVar).c(doujVar);
            doujVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = str2.length();
        StringBuilder sb = new StringBuilder(length + 69 + length2 + length3 + str3.length() + String.valueOf(valueOf2).length());
        sb.append("AteProviderConsent{token=");
        sb.append(str);
        sb.append(", status=");
        sb.append(valueOf);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", termsAndPolicyUrl=");
        sb.append(str3);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
