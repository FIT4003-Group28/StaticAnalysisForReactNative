package defpackage;
/* compiled from: PG */
/* renamed from: ajzf  reason: default package */
/* loaded from: classes2.dex */
public final class ajzf extends akah {
    public final boolean a;
    public final dcep<akaf> b;
    public final dbsg<String> c;
    public final dbsg<String> d;
    private final boolean e;

    public ajzf(boolean z, dcep<akaf> dcepVar, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, boolean z2) {
        this.a = z;
        if (dcepVar != null) {
            this.b = dcepVar;
            if (dbsgVar != null) {
                this.c = dbsgVar;
                if (dbsgVar2 != null) {
                    this.d = dbsgVar2;
                    this.e = z2;
                    return;
                }
                throw new NullPointerException("Null countryCode");
            }
            throw new NullPointerException("Null domain");
        }
        throw new NullPointerException("Null misconfiguredSettings");
    }

    @Override // defpackage.akah
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.akah
    public final dcep<akaf> b() {
        return this.b;
    }

    @Override // defpackage.akah
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.akah
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.akah
    protected final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akah) {
            akah akahVar = (akah) obj;
            if (this.a == akahVar.a() && this.b.equals(akahVar.b()) && this.c.equals(akahVar.c()) && this.d.equals(akahVar.d()) && this.e == akahVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z2 = this.e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 96 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ReportingStatus{isLoading=");
        sb.append(z);
        sb.append(", misconfiguredSettings=");
        sb.append(valueOf);
        sb.append(", domain=");
        sb.append(valueOf2);
        sb.append(", countryCode=");
        sb.append(valueOf3);
        sb.append(", isUnknown=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
