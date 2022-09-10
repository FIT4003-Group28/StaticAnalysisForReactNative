package defpackage;
/* compiled from: PG */
/* renamed from: qav  reason: default package */
/* loaded from: classes7.dex */
final class qav extends qde {
    private final akqi a;
    private final String b;
    private final dnqh c;
    private final boolean d;
    private final bwrs<brln> e;
    private final bwrs<brlu> f;
    private final boolean g;
    private final boolean h;

    public qav(akqi akqiVar, @dzsi String str, @dzsi dnqh dnqhVar, boolean z, @dzsi bwrs<brln> bwrsVar, @dzsi bwrs<brlu> bwrsVar2, boolean z2, boolean z3) {
        this.a = akqiVar;
        this.b = str;
        this.c = dnqhVar;
        this.d = z;
        this.e = bwrsVar;
        this.f = bwrsVar2;
        this.g = z2;
        this.h = z3;
    }

    @Override // defpackage.qde
    public final akqi a() {
        return this.a;
    }

    @Override // defpackage.qde
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.qde
    @dzsi
    public final dnqh c() {
        return this.c;
    }

    @Override // defpackage.qde
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.qde
    @dzsi
    public final bwrs<brln> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        dnqh dnqhVar;
        bwrs<brln> bwrsVar;
        bwrs<brlu> bwrsVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qde) {
            qde qdeVar = (qde) obj;
            if (this.a.equals(qdeVar.a()) && ((str = this.b) != null ? str.equals(qdeVar.b()) : qdeVar.b() == null) && ((dnqhVar = this.c) != null ? dnqhVar.equals(qdeVar.c()) : qdeVar.c() == null) && this.d == qdeVar.d() && ((bwrsVar = this.e) != null ? bwrsVar.equals(qdeVar.e()) : qdeVar.e() == null) && ((bwrsVar2 = this.f) != null ? bwrsVar2.equals(qdeVar.f()) : qdeVar.f() == null) && this.g == qdeVar.g() && this.h == qdeVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qde
    @dzsi
    public final bwrs<brlu> f() {
        return this.f;
    }

    @Override // defpackage.qde
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.qde
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        dnqh dnqhVar = this.c;
        if (dnqhVar == null) {
            i = 0;
        } else {
            i = dnqhVar.bC;
            if (i == 0) {
                i = dsst.a.b(dnqhVar).c(dnqhVar);
                dnqhVar.bC = i;
            }
        }
        int i3 = (hashCode2 ^ i) * 1000003;
        int i4 = 1237;
        int i5 = (i3 ^ (true != this.d ? 1237 : 1231)) * 1000003;
        bwrs<brln> bwrsVar = this.e;
        int hashCode3 = (i5 ^ (bwrsVar == null ? 0 : bwrsVar.hashCode())) * 1000003;
        bwrs<brlu> bwrsVar2 = this.f;
        if (bwrsVar2 != null) {
            i2 = bwrsVar2.hashCode();
        }
        int i6 = (((hashCode3 ^ i2) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i4 = 1231;
        }
        return i6 ^ i4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        boolean z2 = this.g;
        boolean z3 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 196 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("StartTransitLineSpaceParams{lineFeatureId=");
        sb.append(valueOf);
        sb.append(", titleWhileLoading=");
        sb.append(str);
        sb.append(", loggingParams=");
        sb.append(valueOf2);
        sb.append(", replaceTopOfStack=");
        sb.append(z);
        sb.append(", activeSearchRequestRef=");
        sb.append(valueOf3);
        sb.append(", activeSearchResultRef=");
        sb.append(valueOf4);
        sb.append(", showSearchBar=");
        sb.append(z2);
        sb.append(", shouldPulseMap=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
