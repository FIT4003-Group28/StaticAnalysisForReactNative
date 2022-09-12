package defpackage;
/* compiled from: PG */
/* renamed from: ctys  reason: default package */
/* loaded from: classes5.dex */
class ctys extends cuhg {
    public final dbsg<cuhp> a;
    public final dbsg<dcdc<cuhl>> b;
    public final dbsg<dcdc<cuhi>> c;
    private final String d;
    private final dbsg<Boolean> e;

    public ctys(String str, dbsg<cuhp> dbsgVar, dbsg<dcdc<cuhl>> dbsgVar2, dbsg<dcdc<cuhi>> dbsgVar3, dbsg<Boolean> dbsgVar4) {
        if (str != null) {
            this.d = str;
            if (dbsgVar != null) {
                this.a = dbsgVar;
                if (dbsgVar2 != null) {
                    this.b = dbsgVar2;
                    if (dbsgVar3 != null) {
                        this.c = dbsgVar3;
                        if (dbsgVar4 != null) {
                            this.e = dbsgVar4;
                            return;
                        }
                        throw new NullPointerException("Null skipLeadingNewline");
                    }
                    throw new NullPointerException("Null formattedTextSpans");
                }
                throw new NullPointerException("Null lineStyles");
            }
            throw new NullPointerException("Null predefinedStyle");
        }
        throw new NullPointerException("Null rawText");
    }

    @Override // defpackage.cuhg
    public final String a() {
        return this.d;
    }

    @Override // defpackage.cuhg
    public final dbsg<cuhp> b() {
        return this.a;
    }

    @Override // defpackage.cuhg
    public final dbsg<dcdc<cuhl>> c() {
        return this.b;
    }

    @Override // defpackage.cuhg
    public final dbsg<dcdc<cuhi>> d() {
        return this.c;
    }

    @Override // defpackage.cuhg
    public final dbsg<Boolean> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuhg) {
            cuhg cuhgVar = (cuhg) obj;
            if (this.d.equals(cuhgVar.a()) && this.a.equals(cuhgVar.b()) && this.b.equals(cuhgVar.c()) && this.c.equals(cuhgVar.d()) && this.e.equals(cuhgVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.d;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.e);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 96 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FormattedLine{rawText=");
        sb.append(str);
        sb.append(", predefinedStyle=");
        sb.append(valueOf);
        sb.append(", lineStyles=");
        sb.append(valueOf2);
        sb.append(", formattedTextSpans=");
        sb.append(valueOf3);
        sb.append(", skipLeadingNewline=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
