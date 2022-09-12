package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bywa  reason: default package */
/* loaded from: classes4.dex */
public final class bywa extends byxs {
    public final String a;
    public final String b;
    public final String c;
    public final dbsg<String> d;
    public final dbsg<dcdc<String>> e;
    public final dbsg<String> f;
    public final ih g;
    public final String h;
    public final dbsg<String> i;
    public final dbsg<String> j;
    public final int k;

    public bywa(String str, String str2, String str3, dbsg<String> dbsgVar, dbsg<dcdc<String>> dbsgVar2, dbsg<String> dbsgVar3, ih ihVar, String str4, dbsg<String> dbsgVar4, dbsg<String> dbsgVar5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dbsgVar;
        this.e = dbsgVar2;
        this.f = dbsgVar3;
        this.g = ihVar;
        this.h = str4;
        this.i = dbsgVar4;
        this.j = dbsgVar5;
        this.k = i;
    }

    @Override // defpackage.byxs
    public final String a() {
        return this.a;
    }

    @Override // defpackage.byxs
    public final String b() {
        return this.b;
    }

    @Override // defpackage.byxs
    public final String c() {
        return this.c;
    }

    @Override // defpackage.byxs
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.byxs
    public final dbsg<dcdc<String>> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof byxs) {
            byxs byxsVar = (byxs) obj;
            if (this.a.equals(byxsVar.a()) && this.b.equals(byxsVar.b()) && this.c.equals(byxsVar.c()) && this.d.equals(byxsVar.d()) && this.e.equals(byxsVar.e()) && this.f.equals(byxsVar.f()) && this.g.equals(byxsVar.g()) && this.h.equals(byxsVar.h()) && this.i.equals(byxsVar.i()) && this.j.equals(byxsVar.j()) && this.k == byxsVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.byxs
    public final dbsg<String> f() {
        return this.f;
    }

    @Override // defpackage.byxs
    public final ih g() {
        return this.g;
    }

    @Override // defpackage.byxs
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k;
    }

    @Override // defpackage.byxs
    public final dbsg<String> i() {
        return this.i;
    }

    @Override // defpackage.byxs
    public final dbsg<String> j() {
        return this.j;
    }

    @Override // defpackage.byxs
    public final int k() {
        return this.k;
    }

    @Override // defpackage.byxs
    public final byxr l() {
        return new byvz(this);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String str4 = this.h;
        String valueOf5 = String.valueOf(this.i);
        String valueOf6 = String.valueOf(this.j);
        int i = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(valueOf4).length();
        int length8 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 187 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("SimpleNotificationData{collapsedTitle=");
        sb.append(str);
        sb.append(", collapsedText=");
        sb.append(str2);
        sb.append(", expandedTitle=");
        sb.append(str3);
        sb.append(", expandedBigText=");
        sb.append(valueOf);
        sb.append(", expandedInboxList=");
        sb.append(valueOf2);
        sb.append(", expandedInboxSummary=");
        sb.append(valueOf3);
        sb.append(", style=");
        sb.append(valueOf4);
        sb.append(", headerText=");
        sb.append(str4);
        sb.append(", ei=");
        sb.append(valueOf5);
        sb.append(", ved=");
        sb.append(valueOf6);
        sb.append(", smallIcon=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
