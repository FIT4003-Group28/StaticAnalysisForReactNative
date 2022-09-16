package defpackage;
/* compiled from: PG */
/* renamed from: aaak  reason: default package */
/* loaded from: classes2.dex */
final class aaak extends aaao {
    public final String a;
    public final dpuk b;
    public final boolean c;
    public final boolean d;
    public final begk e;
    public final String f;

    public aaak(@dzsi String str, @dzsi dpuk dpukVar, boolean z, boolean z2, @dzsi begk begkVar, @dzsi String str2) {
        this.a = str;
        this.b = dpukVar;
        this.c = z;
        this.d = z2;
        this.e = begkVar;
        this.f = str2;
    }

    @Override // defpackage.aaao
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aaao
    @dzsi
    public final dpuk b() {
        return this.b;
    }

    @Override // defpackage.aaao
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.aaao
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.aaao
    @dzsi
    public final begk e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        begk begkVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaao) {
            aaao aaaoVar = (aaao) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(aaaoVar.a()) : aaaoVar.a() == null) {
                dpuk dpukVar = this.b;
                if (dpukVar != null ? dpukVar.equals(aaaoVar.b()) : aaaoVar.b() == null) {
                    if (this.c == aaaoVar.c() && this.d == aaaoVar.d() && ((begkVar = this.e) != null ? begkVar.equals(aaaoVar.e()) : aaaoVar.e() == null) && ((str = this.f) != null ? str.equals(aaaoVar.f()) : aaaoVar.f() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aaao
    @dzsi
    public final String f() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        dpuk dpukVar = this.b;
        int i2 = 1237;
        int hashCode2 = (((hashCode ^ (dpukVar == null ? 0 : dpukVar.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i2 = 1231;
        }
        int i3 = (hashCode2 ^ i2) * 1000003;
        begk begkVar = this.e;
        int hashCode3 = (i3 ^ (begkVar == null ? 0 : begkVar.hashCode())) * 1000003;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        boolean z2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String str2 = this.f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 144 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("ExperienceSheetOption{mid=");
        sb.append(str);
        sb.append(", knowledgeEntityType=");
        sb.append(valueOf);
        sb.append(", initiallyExpanded=");
        sb.append(z);
        sb.append(", fromMapClick=");
        sb.append(z2);
        sb.append(", collapedHeaderViewSupplier=");
        sb.append(valueOf2);
        sb.append(", searchOmniboxQuery=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
