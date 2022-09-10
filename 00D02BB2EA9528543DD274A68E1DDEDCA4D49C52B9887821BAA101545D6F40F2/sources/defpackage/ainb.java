package defpackage;
/* compiled from: PG */
/* renamed from: ainb  reason: default package */
/* loaded from: classes2.dex */
final class ainb extends aion {
    private final aiom a;
    private final String b;
    private final String c;
    private final Boolean d;
    private final dbsg<aiol> e;
    private final dbsg<String> f;

    public ainb(aiom aiomVar, String str, String str2, Boolean bool, dbsg<aiol> dbsgVar, dbsg<String> dbsgVar2) {
        if (aiomVar != null) {
            this.a = aiomVar;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    this.d = bool;
                    this.e = dbsgVar;
                    this.f = dbsgVar2;
                    return;
                }
                throw new NullPointerException("Null actionButtonText");
            }
            throw new NullPointerException("Null warningText");
        }
        throw new NullPointerException("Null severity");
    }

    @Override // defpackage.aion
    public final aiom a() {
        return this.a;
    }

    @Override // defpackage.aion
    public final String b() {
        return this.b;
    }

    @Override // defpackage.aion
    public final String c() {
        return this.c;
    }

    @Override // defpackage.aion
    public final Boolean d() {
        return this.d;
    }

    @Override // defpackage.aion
    public final dbsg<aiol> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aion) {
            aion aionVar = (aion) obj;
            if (this.a.equals(aionVar.a()) && this.b.equals(aionVar.b()) && this.c.equals(aionVar.c()) && this.d.equals(aionVar.d()) && this.e.equals(aionVar.e()) && this.f.equals(aionVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aion
    public final dbsg<String> f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = str2.length();
        int length4 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("WarningState{severity=");
        sb.append(valueOf);
        sb.append(", warningText=");
        sb.append(str);
        sb.append(", actionButtonText=");
        sb.append(str2);
        sb.append(", isLoading=");
        sb.append(valueOf2);
        sb.append(", fixType=");
        sb.append(valueOf3);
        sb.append(", helpCenterUrl=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
