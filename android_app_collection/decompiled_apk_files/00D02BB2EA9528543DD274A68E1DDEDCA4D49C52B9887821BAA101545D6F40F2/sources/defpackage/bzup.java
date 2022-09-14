package defpackage;
/* compiled from: PG */
/* renamed from: bzup  reason: default package */
/* loaded from: classes4.dex */
final class bzup extends bzvp {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final dbsg<String> e;
    public final dbsg<Integer> f;
    public final dbsg<String> g;
    public final dbsg<String> h;
    public final bzve i;
    private final dlir j;

    public bzup(String str, String str2, dlir dlirVar, int i, String str3, dbsg dbsgVar, dbsg dbsgVar2, dbsg dbsgVar3, dbsg dbsgVar4, bzve bzveVar) {
        this.a = str;
        this.b = str2;
        this.j = dlirVar;
        this.c = i;
        this.d = str3;
        this.e = dbsgVar;
        this.f = dbsgVar2;
        this.g = dbsgVar3;
        this.h = dbsgVar4;
        this.i = bzveVar;
    }

    @Override // defpackage.bzvp
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bzvp
    public final String b() {
        return this.b;
    }

    @Override // defpackage.bzvp
    public final dlir c() {
        return this.j;
    }

    @Override // defpackage.bzvp
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bzvp
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzvp) {
            bzvp bzvpVar = (bzvp) obj;
            if (this.a.equals(bzvpVar.a()) && this.b.equals(bzvpVar.b()) && this.j.equals(bzvpVar.c()) && this.c == bzvpVar.d() && this.d.equals(bzvpVar.e()) && this.e.equals(bzvpVar.f()) && this.f.equals(bzvpVar.g()) && this.g.equals(bzvpVar.h()) && this.h.equals(bzvpVar.i()) && this.i.equals(bzvpVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzvp
    public final dbsg<String> f() {
        return this.e;
    }

    @Override // defpackage.bzvp
    public final dbsg<Integer> g() {
        return this.f;
    }

    @Override // defpackage.bzvp
    public final dbsg<String> h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.bzvp
    public final dbsg<String> i() {
        return this.h;
    }

    @Override // defpackage.bzvp
    public final bzve j() {
        return this.i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.j);
        int i = this.c;
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("CreationParams{title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", beginningIcon=");
        sb.append(valueOf);
        sb.append(", subtitleMaxLinesExpanded=");
        sb.append(i);
        sb.append(", placeName=");
        sb.append(str3);
        sb.append(", accountName=");
        sb.append(valueOf2);
        sb.append(", numRatingStars=");
        sb.append(valueOf3);
        sb.append(", instructionsLine1=");
        sb.append(valueOf4);
        sb.append(", instructionsLine2=");
        sb.append(valueOf5);
        sb.append(", starClickIntentFactory=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
