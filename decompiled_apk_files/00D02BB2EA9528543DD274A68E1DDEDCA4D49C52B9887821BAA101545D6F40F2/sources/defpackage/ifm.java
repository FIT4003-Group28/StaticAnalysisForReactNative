package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ifm  reason: default package */
/* loaded from: classes.dex */
public final class ifm extends iif {
    public final int a;
    public final cqtv b;
    public final cqtv c;
    public final cqtv d;
    public final cqtv e;
    public final cqtv f;
    public final cqtv g;
    public final cqtv h;
    public final cqtv i;
    public final cqtv j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final cqtv n;
    public final cqss o;
    public final igu p;

    public ifm(int i, cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3, cqtv cqtvVar4, cqtv cqtvVar5, @dzsi cqtv cqtvVar6, cqtv cqtvVar7, cqtv cqtvVar8, cqtv cqtvVar9, boolean z, boolean z2, boolean z3, cqtv cqtvVar10, cqss cqssVar, igu iguVar) {
        this.a = i;
        this.b = cqtvVar;
        this.c = cqtvVar2;
        this.d = cqtvVar3;
        this.e = cqtvVar4;
        this.f = cqtvVar5;
        this.g = cqtvVar6;
        this.h = cqtvVar7;
        this.i = cqtvVar8;
        this.j = cqtvVar9;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = cqtvVar10;
        this.o = cqssVar;
        this.p = iguVar;
    }

    @Override // defpackage.iif
    public final int a() {
        return this.a;
    }

    @Override // defpackage.iif
    public final cqtv b() {
        return this.b;
    }

    @Override // defpackage.iif
    public final cqtv c() {
        return this.c;
    }

    @Override // defpackage.iif
    public final cqtv d() {
        return this.d;
    }

    @Override // defpackage.iif
    public final cqtv e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cqtv cqtvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iif) {
            iif iifVar = (iif) obj;
            if (this.a == iifVar.a() && this.b.equals(iifVar.b()) && this.c.equals(iifVar.c()) && this.d.equals(iifVar.d()) && this.e.equals(iifVar.e()) && this.f.equals(iifVar.f()) && ((cqtvVar = this.g) != null ? cqtvVar.equals(iifVar.g()) : iifVar.g() == null) && this.h.equals(iifVar.h()) && this.i.equals(iifVar.i()) && this.j.equals(iifVar.j()) && this.k == iifVar.k() && this.l == iifVar.l() && this.m == iifVar.m() && this.n.equals(iifVar.n()) && this.o.equals(iifVar.o()) && this.p.equals(iifVar.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.iif
    public final cqtv f() {
        return this.f;
    }

    @Override // defpackage.iif
    @dzsi
    public final cqtv g() {
        return this.g;
    }

    @Override // defpackage.iif
    public final cqtv h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a ^ 1000003) * 1000003) ^ ((cqrp) this.b).a) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((cqrp) this.e).a) * 1000003) ^ this.f.hashCode()) * 1000003;
        cqtv cqtvVar = this.g;
        int i = 1237;
        int hashCode2 = (((((((((((hashCode ^ (cqtvVar == null ? 0 : cqtvVar.hashCode())) * 1000003) ^ ((cqrp) this.h).a) * 1000003) ^ ((cqrp) this.i).a) * 1000003) ^ ((cqrp) this.j).a) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        if (true == this.m) {
            i = 1231;
        }
        return ((((((hashCode2 ^ i) * 1000003) ^ ((cqrp) this.n).a) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.iif
    public final cqtv i() {
        return this.i;
    }

    @Override // defpackage.iif
    public final cqtv j() {
        return this.j;
    }

    @Override // defpackage.iif
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.iif
    public final boolean l() {
        return this.l;
    }

    @Override // defpackage.iif
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.iif
    public final cqtv n() {
        return this.n;
    }

    @Override // defpackage.iif
    public final cqss o() {
        return this.o;
    }

    @Override // defpackage.iif
    public final igu p() {
        return this.p;
    }

    @Override // defpackage.iif
    public final iie q() {
        return new ifl(this);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        boolean z = this.k;
        boolean z2 = this.l;
        boolean z3 = this.m;
        String valueOf10 = String.valueOf(this.n);
        String valueOf11 = String.valueOf(this.o);
        String valueOf12 = String.valueOf(this.p);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 390 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
        sb.append("ModCarouselViewProperties{carouselExpandWidthThreshold=");
        sb.append(i);
        sb.append(", carouselPaddingTop=");
        sb.append(valueOf);
        sb.append(", carouselPaddingStart=");
        sb.append(valueOf2);
        sb.append(", carouselPaddingEnd=");
        sb.append(valueOf3);
        sb.append(", carouselPaddingBottom=");
        sb.append(valueOf4);
        sb.append(", itemWidthSize=");
        sb.append(valueOf5);
        sb.append(", itemHeightSize=");
        sb.append(valueOf6);
        sb.append(", itemElevation=");
        sb.append(valueOf7);
        sb.append(", itemSpacing=");
        sb.append(valueOf8);
        sb.append(", itemCornerRadius=");
        sb.append(valueOf9);
        sb.append(", enableItemSnapping=");
        sb.append(z);
        sb.append(", itemUseCompatPadding=");
        sb.append(z2);
        sb.append(", itemPreventCornerOverlap=");
        sb.append(z3);
        sb.append(", itemContentPadding=");
        sb.append(valueOf10);
        sb.append(", itemBackgroundColor=");
        sb.append(valueOf11);
        sb.append(", headerViewProperties=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }
}
