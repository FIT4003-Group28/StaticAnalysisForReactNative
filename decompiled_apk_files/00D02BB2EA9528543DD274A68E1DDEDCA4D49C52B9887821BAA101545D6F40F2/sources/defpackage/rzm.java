package defpackage;
/* compiled from: PG */
/* renamed from: rzm  reason: default package */
/* loaded from: classes7.dex */
public final class rzm extends rzp {
    public final dcdc<ror> a;
    public final ror b;
    public final dcdc<ror> c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    public rzm(dcdc<ror> dcdcVar, ror rorVar, dcdc<ror> dcdcVar2, @dzsi String str, boolean z, boolean z2, boolean z3) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (rorVar != null) {
                this.b = rorVar;
                if (dcdcVar2 != null) {
                    this.c = dcdcVar2;
                    this.d = str;
                    this.e = z;
                    this.f = z2;
                    this.g = z3;
                    return;
                }
                throw new NullPointerException("Null remainingScreens");
            }
            throw new NullPointerException("Null currentScreen");
        }
        throw new NullPointerException("Null previousScreens");
    }

    @Override // defpackage.rzp
    public final dcdc<ror> a() {
        return this.a;
    }

    @Override // defpackage.rzp
    public final ror b() {
        return this.b;
    }

    @Override // defpackage.rzp
    public final dcdc<ror> c() {
        return this.c;
    }

    @Override // defpackage.rzp
    @dzsi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.rzp
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rzp) {
            rzp rzpVar = (rzp) obj;
            if (dchl.m(this.a, rzpVar.a()) && this.b.equals(rzpVar.b()) && dchl.m(this.c, rzpVar.c()) && ((str = this.d) != null ? str.equals(rzpVar.d()) : rzpVar.d() == null) && this.e == rzpVar.e() && this.f == rzpVar.f() && this.g == rzpVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rzp
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.rzp
    public final boolean g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i = 1237;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        boolean z = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 180 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("ScreenFlowState{previousScreens=");
        sb.append(valueOf);
        sb.append(", currentScreen=");
        sb.append(valueOf2);
        sb.append(", remainingScreens=");
        sb.append(valueOf3);
        sb.append(", exitCommuteSetupTag=");
        sb.append(str);
        sb.append(", hasAnyDataBeenSavedDuringThisFlow=");
        sb.append(z);
        sb.append(", exitIfNoChangesMade=");
        sb.append(z2);
        sb.append(", showSkipButton=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
