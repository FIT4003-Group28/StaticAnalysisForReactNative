package defpackage;
/* compiled from: PG */
/* renamed from: bdkb  reason: default package */
/* loaded from: classes3.dex */
final class bdkb extends bdqa {
    private final String a;
    private final aeui b;
    private final bcan c;
    private final cjqm d;
    private final ddho e;
    private final ddho f;

    public bdkb(String str, aeui aeuiVar, bcan bcanVar, cjqm cjqmVar, ddho ddhoVar, ddho ddhoVar2) {
        this.a = str;
        this.b = aeuiVar;
        this.c = bcanVar;
        this.d = cjqmVar;
        this.e = ddhoVar;
        this.f = ddhoVar2;
    }

    @Override // defpackage.bdqa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bdqa
    public final aeui b() {
        return this.b;
    }

    @Override // defpackage.bdqa
    public final bcan c() {
        return this.c;
    }

    @Override // defpackage.bdqa
    public final cjqm d() {
        return this.d;
    }

    @Override // defpackage.bdqa
    public final ddho e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdqa) {
            bdqa bdqaVar = (bdqa) obj;
            if (this.a.equals(bdqaVar.a()) && this.b.equals(bdqaVar.b()) && this.c.equals(bdqaVar.c()) && this.d.equals(bdqaVar.d()) && this.e.equals(bdqaVar.e()) && this.f.equals(bdqaVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bdqa
    public final ddho f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 144 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PhotoUploadArguments{accountName=");
        sb.append(str);
        sb.append(", IAmHereState=");
        sb.append(valueOf);
        sb.append(", photoSelectionContext=");
        sb.append(valueOf2);
        sb.append(", loggedInteraction=");
        sb.append(valueOf3);
        sb.append(", genericPublishButtonVE=");
        sb.append(valueOf4);
        sb.append(", specificPublishButtonVE=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
