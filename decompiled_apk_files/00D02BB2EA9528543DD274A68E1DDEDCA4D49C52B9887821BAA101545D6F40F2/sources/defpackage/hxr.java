package defpackage;
/* compiled from: PG */
/* renamed from: hxr  reason: default package */
/* loaded from: classes6.dex */
final class hxr extends hya {
    private final cjtd a;
    private final CharSequence b;
    private final cqtv c;
    private final cqhn d;

    public hxr(@dzsi cjtd cjtdVar, @dzsi CharSequence charSequence, cqtv cqtvVar, cqhn cqhnVar) {
        this.a = cjtdVar;
        this.b = charSequence;
        this.c = cqtvVar;
        this.d = cqhnVar;
    }

    @Override // defpackage.hxy
    @dzsi
    public cjtd a() {
        return this.a;
    }

    @Override // defpackage.hya, defpackage.hxy
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.hya, defpackage.hxy
    public cqtv c() {
        return this.c;
    }

    @Override // defpackage.hya
    public final cqhn d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hya) {
            hya hyaVar = (hya) obj;
            cjtd cjtdVar = this.a;
            if (cjtdVar != null ? cjtdVar.equals(hyaVar.a()) : hyaVar.a() == null) {
                CharSequence charSequence = this.b;
                if (charSequence != null ? charSequence.equals(hyaVar.b()) : hyaVar.b() == null) {
                    if (this.c.equals(hyaVar.c()) && this.d.equals(hyaVar.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        cjtd cjtdVar = this.a;
        int i = 0;
        int hashCode = ((cjtdVar == null ? 0 : cjtdVar.hashCode()) ^ 1000003) * 1000003;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ ((cqrp) this.c).a) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 78 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ModBadgeViewModelImpl{ue3Params=");
        sb.append(valueOf);
        sb.append(", badgeText=");
        sb.append(valueOf2);
        sb.append(", badgeTextSize=");
        sb.append(valueOf3);
        sb.append(", curvularBinder=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
