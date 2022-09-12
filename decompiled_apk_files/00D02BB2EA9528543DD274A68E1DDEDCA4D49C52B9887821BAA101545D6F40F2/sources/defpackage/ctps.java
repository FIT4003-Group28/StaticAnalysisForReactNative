package defpackage;
/* compiled from: PG */
/* renamed from: ctps  reason: default package */
/* loaded from: classes5.dex */
final class ctps extends ctqu {
    private final String a;
    private final dbsg<String> b;
    private final dbsg<String> c;
    private final dbsg<byte[]> d;
    private final String e;
    private final dbsg<ctqq> f;
    private final dcdn<String, byte[]> g;
    private final dcdc<cugf> h;
    private final dcdc<cugf> i;
    private final dbsg<cugh> j;
    private final dbsg<cufx> k;
    private final dbsg<Long> l;

    public ctps(String str, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<byte[]> dbsgVar3, String str2, dbsg<ctqq> dbsgVar4, dcdn<String, byte[]> dcdnVar, dcdc<cugf> dcdcVar, dcdc<cugf> dcdcVar2, dbsg<cugh> dbsgVar5, dbsg<cufx> dbsgVar6, dbsg<Long> dbsgVar7) {
        this.a = str;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
        this.e = str2;
        this.f = dbsgVar4;
        this.g = dcdnVar;
        this.h = dcdcVar;
        this.i = dcdcVar2;
        this.j = dbsgVar5;
        this.k = dbsgVar6;
        this.l = dbsgVar7;
    }

    @Override // defpackage.ctqu
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctqu
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // defpackage.ctqu
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // defpackage.ctqu
    public final dbsg<byte[]> d() {
        return this.d;
    }

    @Override // defpackage.ctqu
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqu) {
            ctqu ctquVar = (ctqu) obj;
            if (this.a.equals(ctquVar.a()) && this.b.equals(ctquVar.b()) && this.c.equals(ctquVar.c()) && this.d.equals(ctquVar.d()) && this.e.equals(ctquVar.e()) && this.f.equals(ctquVar.f()) && this.g.equals(ctquVar.g()) && dchl.m(this.h, ctquVar.h()) && dchl.m(this.i, ctquVar.i()) && this.j.equals(ctquVar.j()) && this.k.equals(ctquVar.k()) && this.l.equals(ctquVar.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ctqu
    public final dbsg<ctqq> f() {
        return this.f;
    }

    @Override // defpackage.ctqu
    public final dcdn<String, byte[]> g() {
        return this.g;
    }

    @Override // defpackage.ctqu
    public final dcdc<cugf> h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // defpackage.ctqu
    public final dcdc<cugf> i() {
        return this.i;
    }

    @Override // defpackage.ctqu
    public final dbsg<cugh> j() {
        return this.j;
    }

    @Override // defpackage.ctqu
    public final dbsg<cufx> k() {
        return this.k;
    }

    @Override // defpackage.ctqu
    public final dbsg<Long> l() {
        return this.l;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 193 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("ProfileInfo{name=");
        sb.append(str);
        sb.append(", a11yName=");
        sb.append(valueOf);
        sb.append(", imageUrl=");
        sb.append(valueOf2);
        sb.append(", thumbnailData=");
        sb.append(valueOf3);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", groupInfo=");
        sb.append(valueOf4);
        sb.append(", metadata=");
        sb.append(valueOf5);
        sb.append(", menuItems=");
        sb.append(valueOf6);
        sb.append(", toolbarButtons=");
        sb.append(valueOf7);
        sb.append(", lighterUiConfigurations=");
        sb.append(valueOf8);
        sb.append(", customViewContentModel=");
        sb.append(valueOf9);
        sb.append(", serverTimestampUs=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }
}
