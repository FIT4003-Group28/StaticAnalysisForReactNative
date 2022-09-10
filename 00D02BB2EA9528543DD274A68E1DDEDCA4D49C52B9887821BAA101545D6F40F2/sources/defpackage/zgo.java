package defpackage;
/* compiled from: PG */
/* renamed from: zgo  reason: default package */
/* loaded from: classes7.dex */
final class zgo extends zpt {
    private final cqtd a;
    private final String b;
    private final Boolean c;
    private final CharSequence d;
    private final String e;

    public zgo(@dzsi cqtd cqtdVar, @dzsi String str, Boolean bool, CharSequence charSequence, @dzsi String str2) {
        this.a = cqtdVar;
        this.b = str;
        this.c = bool;
        this.d = charSequence;
        this.e = str2;
    }

    @Override // defpackage.zcg
    @dzsi
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.zcg
    @dzsi
    public String b() {
        return this.b;
    }

    @Override // defpackage.zcg
    public Boolean c() {
        return this.c;
    }

    @Override // defpackage.zcg
    public CharSequence d() {
        return this.d;
    }

    @Override // defpackage.zcg
    @dzsi
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zpt) {
            zpt zptVar = (zpt) obj;
            cqtd cqtdVar = this.a;
            if (cqtdVar != null ? cqtdVar.equals(zptVar.a()) : zptVar.a() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zptVar.b()) : zptVar.b() == null) {
                    if (this.c.equals(zptVar.c()) && this.d.equals(zptVar.d()) && ((str = this.e) != null ? str.equals(zptVar.e()) : zptVar.e() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        cqtd cqtdVar = this.a;
        int i = 0;
        int hashCode = ((cqtdVar == null ? 0 : cqtdVar.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 97 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(str2).length());
        sb.append("TripDescriptionItemViewModelImpl{icon=");
        sb.append(valueOf);
        sb.append(", iconDescription=");
        sb.append(str);
        sb.append(", isIconNarrow=");
        sb.append(valueOf2);
        sb.append(", text=");
        sb.append(valueOf3);
        sb.append(", textDescription=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
