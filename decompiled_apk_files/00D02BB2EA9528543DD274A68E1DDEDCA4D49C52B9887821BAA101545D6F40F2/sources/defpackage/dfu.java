package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfu  reason: default package */
/* loaded from: classes6.dex */
public final class dfu extends dfy {
    public final dfx a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public dfu(dfx dfxVar, boolean z, boolean z2, boolean z3) {
        this.a = dfxVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // defpackage.dfy
    public final dfx a() {
        return this.a;
    }

    @Override // defpackage.dfy
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.dfy
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.dfy
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.dfy
    public final dfw e() {
        return new dft(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfy) {
            dfy dfyVar = (dfy) obj;
            if (this.a.equals(dfyVar.a()) && this.b == dfyVar.b() && this.c == dfyVar.c() && this.d == dfyVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 105);
        sb.append("IndicatorControllerOptions{type=");
        sb.append(valueOf);
        sb.append(", rippleEnabled=");
        sb.append(z);
        sb.append(", snapToBottomEnabled=");
        sb.append(z2);
        sb.append(", darkModeDisabled=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
