package defpackage;
/* compiled from: PG */
/* renamed from: jyl  reason: default package */
/* loaded from: classes7.dex */
final class jyl extends jyj {
    private final cjsz a;
    private final ddho b;
    private final ddho c;
    private final ddho d;
    private final ddho e;
    private final ddho f;
    private final ddho g;

    public jyl(@dzsi cjsz cjszVar, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi ddho ddhoVar3, @dzsi ddho ddhoVar4, @dzsi ddho ddhoVar5, @dzsi ddho ddhoVar6) {
        this.a = cjszVar;
        this.b = ddhoVar;
        this.c = ddhoVar2;
        this.d = ddhoVar3;
        this.e = ddhoVar4;
        this.f = ddhoVar5;
        this.g = ddhoVar6;
    }

    @Override // defpackage.jyj
    @dzsi
    public final cjsz a() {
        return this.a;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho c() {
        return this.c;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jyj) {
            jyj jyjVar = (jyj) obj;
            cjsz cjszVar = this.a;
            if (cjszVar != null ? cjszVar.equals(jyjVar.a()) : jyjVar.a() == null) {
                ddho ddhoVar = this.b;
                if (ddhoVar != null ? ddhoVar.equals(jyjVar.b()) : jyjVar.b() == null) {
                    ddho ddhoVar2 = this.c;
                    if (ddhoVar2 != null ? ddhoVar2.equals(jyjVar.c()) : jyjVar.c() == null) {
                        ddho ddhoVar3 = this.d;
                        if (ddhoVar3 != null ? ddhoVar3.equals(jyjVar.d()) : jyjVar.d() == null) {
                            ddho ddhoVar4 = this.e;
                            if (ddhoVar4 != null ? ddhoVar4.equals(jyjVar.e()) : jyjVar.e() == null) {
                                ddho ddhoVar5 = this.f;
                                if (ddhoVar5 != null ? ddhoVar5.equals(jyjVar.f()) : jyjVar.f() == null) {
                                    ddho ddhoVar6 = this.g;
                                    if (ddhoVar6 != null ? ddhoVar6.equals(jyjVar.g()) : jyjVar.g() == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho f() {
        return this.f;
    }

    @Override // defpackage.jyj
    @dzsi
    public final ddho g() {
        return this.g;
    }

    public final int hashCode() {
        cjsz cjszVar = this.a;
        int i = 0;
        int hashCode = ((cjszVar == null ? 0 : cjszVar.hashCode()) ^ 1000003) * 1000003;
        ddho ddhoVar = this.b;
        int hashCode2 = (hashCode ^ (ddhoVar == null ? 0 : ddhoVar.hashCode())) * 1000003;
        ddho ddhoVar2 = this.c;
        int hashCode3 = (hashCode2 ^ (ddhoVar2 == null ? 0 : ddhoVar2.hashCode())) * 1000003;
        ddho ddhoVar3 = this.d;
        int hashCode4 = (hashCode3 ^ (ddhoVar3 == null ? 0 : ddhoVar3.hashCode())) * 1000003;
        ddho ddhoVar4 = this.e;
        int hashCode5 = (hashCode4 ^ (ddhoVar4 == null ? 0 : ddhoVar4.hashCode())) * 1000003;
        ddho ddhoVar5 = this.f;
        int hashCode6 = (hashCode5 ^ (ddhoVar5 == null ? 0 : ddhoVar5.hashCode())) * 1000003;
        ddho ddhoVar6 = this.g;
        if (ddhoVar6 != null) {
            i = ddhoVar6.hashCode();
        }
        return hashCode6 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 182 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("AlphaJumpListVisualElementTypes{ue3Page=");
        sb.append(valueOf);
        sb.append(", backButtonVeType=");
        sb.append(valueOf2);
        sb.append(", alphaJumpButtonVeType=");
        sb.append(valueOf3);
        sb.append(", alphaJumpBackButtonVeType=");
        sb.append(valueOf4);
        sb.append(", alphaJumpKeyVeType=");
        sb.append(valueOf5);
        sb.append(", lockoutTopTextVeType=");
        sb.append(valueOf6);
        sb.append(", lockoutBottomTextVeType=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
