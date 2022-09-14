package defpackage;
/* compiled from: PG */
/* renamed from: cudy  reason: default package */
/* loaded from: classes5.dex */
final class cudy extends cugq {
    private final dbsg<ctzl> a;
    private final dbsg<dspd> b;
    private final dbsg<cugd> c;
    private final dbsg<String> d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final dbsg<Integer> i;
    private final int j;

    public cudy(dbsg<ctzl> dbsgVar, dbsg<dspd> dbsgVar2, dbsg<cugd> dbsgVar3, dbsg<String> dbsgVar4, int i, boolean z, boolean z2, boolean z3, dbsg<Integer> dbsgVar5, int i2) {
        this.a = dbsgVar;
        this.b = dbsgVar2;
        this.c = dbsgVar3;
        this.d = dbsgVar4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = dbsgVar5;
        this.j = i2;
    }

    @Override // defpackage.cugq
    public final dbsg<ctzl> a() {
        return this.a;
    }

    @Override // defpackage.cugq
    @Deprecated
    public final dbsg<dspd> b() {
        return this.b;
    }

    @Override // defpackage.cugq
    public final dbsg<cugd> c() {
        return this.c;
    }

    @Override // defpackage.cugq
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // defpackage.cugq
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cugq) {
            cugq cugqVar = (cugq) obj;
            if (this.a.equals(cugqVar.a()) && this.b.equals(cugqVar.b()) && this.c.equals(cugqVar.c()) && this.d.equals(cugqVar.d()) && this.e == cugqVar.e() && this.f == cugqVar.f() && this.g == cugqVar.g() && this.h == cugqVar.h() && this.i.equals(cugqVar.i()) && this.j == cugqVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cugq
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.cugq
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.cugq
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j;
    }

    @Override // defpackage.cugq
    public final dbsg<Integer> i() {
        return this.i;
    }

    @Override // defpackage.cugq
    public final int j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        String valueOf5 = String.valueOf(this.i);
        int i2 = this.j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 233 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Overlay{dismissAction=");
        sb.append(valueOf);
        sb.append(", displayIcon=");
        sb.append(valueOf2);
        sb.append(", lighterIcon=");
        sb.append(valueOf3);
        sb.append(", displayText=");
        sb.append(valueOf4);
        sb.append(", timeToLiveSec=");
        sb.append(i);
        sb.append(", hideSnippetInConversationList=");
        sb.append(z);
        sb.append(", hideDismissButton=");
        sb.append(z2);
        sb.append(", dismissibleByTappingOutside=");
        sb.append(z3);
        sb.append(", expireTimeStamp=");
        sb.append(valueOf5);
        sb.append(", overlayStyle=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
