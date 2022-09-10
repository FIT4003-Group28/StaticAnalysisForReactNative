package defpackage;
/* compiled from: PG */
/* renamed from: axvw  reason: default package */
/* loaded from: classes3.dex */
final class axvw extends axww {
    private final dndr a;
    private final String b;
    private final boolean c;
    private final ddho d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final axuc i;
    private final akqq j;
    private final boolean k;
    private final anee l;
    private final dpyv m;

    public axvw(dndr dndrVar, String str, boolean z, @dzsi ddho ddhoVar, @dzsi String str2, boolean z2, boolean z3, boolean z4, @dzsi axuc axucVar, @dzsi akqq akqqVar, boolean z5, @dzsi anee aneeVar, @dzsi dpyv dpyvVar) {
        this.a = dndrVar;
        this.b = str;
        this.c = z;
        this.d = ddhoVar;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = axucVar;
        this.j = akqqVar;
        this.k = z5;
        this.l = aneeVar;
        this.m = dpyvVar;
    }

    @Override // defpackage.axww
    public final dndr a() {
        return this.a;
    }

    @Override // defpackage.axww
    public final String b() {
        return this.b;
    }

    @Override // defpackage.axww
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.axww
    @dzsi
    public final ddho d() {
        return this.d;
    }

    @Override // defpackage.axww
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        ddho ddhoVar;
        String str;
        axuc axucVar;
        akqq akqqVar;
        anee aneeVar;
        dpyv dpyvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof axww) {
            axww axwwVar = (axww) obj;
            if (this.a.equals(axwwVar.a()) && this.b.equals(axwwVar.b()) && this.c == axwwVar.c() && ((ddhoVar = this.d) != null ? ddhoVar.equals(axwwVar.d()) : axwwVar.d() == null) && ((str = this.e) != null ? str.equals(axwwVar.e()) : axwwVar.e() == null) && this.f == axwwVar.f() && this.g == axwwVar.g() && this.h == axwwVar.h() && ((axucVar = this.i) != null ? axucVar.equals(axwwVar.i()) : axwwVar.i() == null) && ((akqqVar = this.j) != null ? akqqVar.equals(axwwVar.j()) : axwwVar.j() == null) && this.k == axwwVar.k() && ((aneeVar = this.l) != null ? aneeVar.equals(axwwVar.l()) : axwwVar.l() == null) && ((dpyvVar = this.m) != null ? dpyvVar.equals(axwwVar.m()) : axwwVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.axww
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.axww
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.axww
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        ddho ddhoVar = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (ddhoVar == null ? 0 : ddhoVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (((((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        axuc axucVar = this.i;
        int hashCode4 = (hashCode3 ^ (axucVar == null ? 0 : axucVar.hashCode())) * 1000003;
        akqq akqqVar = this.j;
        int hashCode5 = (hashCode4 ^ (akqqVar == null ? 0 : akqqVar.hashCode())) * 1000003;
        if (true == this.k) {
            i = 1231;
        }
        int i3 = (hashCode5 ^ i) * 1000003;
        anee aneeVar = this.l;
        int hashCode6 = (i3 ^ (aneeVar == null ? 0 : aneeVar.hashCode())) * 1000003;
        dpyv dpyvVar = this.m;
        if (dpyvVar != null) {
            i2 = dpyvVar.hashCode();
        }
        return hashCode6 ^ i2;
    }

    @Override // defpackage.axww
    @dzsi
    public final axuc i() {
        return this.i;
    }

    @Override // defpackage.axww
    @dzsi
    public final akqq j() {
        return this.j;
    }

    @Override // defpackage.axww
    public final boolean k() {
        return this.k;
    }

    @Override // defpackage.axww
    @dzsi
    public final anee l() {
        return this.l;
    }

    @Override // defpackage.axww
    @dzsi
    public final dpyv m() {
        return this.m;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        boolean z = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        String valueOf3 = String.valueOf(this.i);
        String valueOf4 = String.valueOf(this.j);
        boolean z5 = this.k;
        String valueOf5 = String.valueOf(this.l);
        String valueOf6 = String.valueOf(this.m);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 286 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("EditAliasParams{aliasType=");
        sb.append(valueOf);
        sb.append(", initialQuery=");
        sb.append(str);
        sb.append(", initialQueryIsLatLng=");
        sb.append(z);
        sb.append(", veType=");
        sb.append(valueOf2);
        sb.append(", editAliasToken=");
        sb.append(str2);
        sb.append(", openPlaceSheet=");
        sb.append(z2);
        sb.append(", popBackStack=");
        sb.append(z3);
        sb.append(", skipWaaCheck=");
        sb.append(z4);
        sb.append(", aliasFlowData=");
        sb.append(valueOf3);
        sb.append(", viewportCenter=");
        sb.append(valueOf4);
        sb.append(", prepopulateWithStpResults=");
        sb.append(z5);
        sb.append(", mapPointPickerArguments=");
        sb.append(valueOf5);
        sb.append(", notificationTypeToMaybeShowOptOut=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
